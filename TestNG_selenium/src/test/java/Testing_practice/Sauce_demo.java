package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Sauce_demo {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {

        // Create Chrome options FIRST
        ChromeOptions options = new ChromeOptions();

        HashMap<String, Object> prefs = new HashMap<>();

        // Disable Chrome password manager
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);

        // Disable save password popup
        options.addArguments("--disable-save-password-bubble");

        // Optional extra settings
        options.addArguments("--incognito");
        options.addArguments("--disable-notifications");

        // Start browser with options
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
    }

    @Test(groups="Smoke")
    public void login() throws InterruptedException {
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();
        Thread.sleep(4000);
    }

    @Test(groups="Smoke",
            dependsOnMethods="login")
    public void filter_by_price_low_high() throws InterruptedException {

        WebElement fil = driver.findElement(
                By.className("product_sort_container"));

        fil.click();

        fil.sendKeys(Keys.ARROW_DOWN);
        fil.sendKeys(Keys.ARROW_DOWN);
        fil.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
    }

    @Test(groups="Smoke",
            dependsOnMethods="filter_by_price_low_high")
    public void add_to_cart() throws InterruptedException {

        driver.findElement(
                By.id("add-to-cart-sauce-labs-onesie"))
                .click();
        Thread.sleep(3000);
    }

    @Test(groups="Smoke",
            dependsOnMethods="add_to_cart")
    public void product_details() throws InterruptedException {

        driver.findElement(
                By.className("shopping_cart_link"))
                .click();
        Thread.sleep(2000);
    }

    @Test(groups="Regression",
    		dependsOnMethods="product_details")
    public void checkout() {

        driver.findElement(By.id("checkout"))
                .click();

        driver.findElement(By.id("first-name"))
                .sendKeys("MD");

        driver.findElement(By.id("last-name"))
                .sendKeys("Asraful");

        driver.findElement(By.id("postal-code"))
                .sendKeys("256418");

        driver.findElement(By.id("continue"))
                .click();
    }

    @Test(groups="Regression",
    		dependsOnMethods="checkout")
    public void back_to_home_page() throws InterruptedException {

        driver.findElement(By.id("finish"))
                .click();

        driver.findElement(By.id("back-to-products"))
                .click();

        Thread.sleep(1000);
    }
    @Test(groups="Regression",
    		dependsOnMethods="back_to_home_page")
    public void remove_from_cart() {
    	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    	driver.findElement(By.className("shopping_cart_link")).click();
    	driver.findElement(By.id("remove-sauce-labs-backpack")).click();
    	driver.findElement(By.xpath("//button[@id='continue-shopping']")).click();
    	
    	
    	
    }

    @Test(groups="Smoke",
            dependsOnMethods="remove_from_cart")
    public void logout() throws InterruptedException {

        driver.findElement(
                By.id("react-burger-menu-btn"))
                .click();

        Thread.sleep(1000);

        driver.findElement(
                By.id("logout_sidebar_link"))
                .click();

        Thread.sleep(1000);
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {

        System.out.println("Successfully done");

        driver.quit();
    }
}