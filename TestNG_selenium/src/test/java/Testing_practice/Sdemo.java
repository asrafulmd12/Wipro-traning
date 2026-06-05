package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sdemo {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void beforeTest() {

        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {

        POM_impl page = new POM_impl(driver);
        page.login();

        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void add_to_cart() throws InterruptedException {

        POM_impl page = new POM_impl(driver);

        page.open_add_to_cart();

        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void checkout() throws InterruptedException {

        POM_impl page = new POM_impl(driver);

        page.checkout();

        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void place_Order() throws InterruptedException {

        POM_impl page = new POM_impl(driver);

        page.place_order();

        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest() {

        driver.quit();
    }
}