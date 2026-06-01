package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class DriverFactory {
    
    // ThreadLocal ensures thread safety for parallel execution (Question 7)
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static WebDriver initDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            tlDriver.set(new ChromeDriver());
        } else if (browser.equalsIgnoreCase("firefox")) {
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equalsIgnoreCase("edge")) {
            tlDriver.set(new EdgeDriver());
        } else {
            System.out.println("Browser not found. Defaulting to Chrome.");
            tlDriver.set(new ChromeDriver());
        }
        
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        // Selenium 4 Implicit Wait Syntax
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
        return getDriver();
    }

    // Synchronized method to get the driver safely across threads
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

    // Closes the browser and completely removes the thread memory
    public static void unloadDriver() {
        if (getDriver() != null) {
            getDriver().quit();
            tlDriver.remove();
        }
    }
}
