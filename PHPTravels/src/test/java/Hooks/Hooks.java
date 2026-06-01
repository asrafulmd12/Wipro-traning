package Hooks;

import base.DriverFactory; // Reusing DriverFactory provided in initial step
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class Hooks {
    private WebDriver driver;
    private static Properties prop;

    @Before
    public void setUp() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/testdata/config.properties");
        prop.load(fis);
        
        String browserName = prop.getProperty("browser");
        driver = DriverFactory.initDriver(browserName);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotName = scenario.getName().replaceAll(" ", "_") + "_" + timestamp;
            try {
                File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File destinationPath = new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + ".png");
                
                // Ensure directory exists
                destinationPath.getParentFile().mkdirs();
                Files.copy(sourcePath.toPath(), destinationPath.toPath());
                
                // Attach to Extent Report ecosystem
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", screenshotName);
            } catch (IOException e) {
                System.err.println("Exception captured while generating failure snapshot: " + e.getMessage());
            }
        }
        DriverFactory.unloadDriver();
    }
    
    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}