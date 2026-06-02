package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setup()
    {
    	ChromeOptions options = new ChromeOptions();

    	options.addArguments("--headless=new");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");

    	driver = new ChromeDriver(options);
        driver.manage()
              .window()
              .maximize();

        driver.manage()
              .timeouts()
              .implicitlyWait(
                      Duration.ofSeconds(10));

        driver.get(
                "https://tutorialsninja.com/demo/");
    }

    @After
    public void close()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }
}