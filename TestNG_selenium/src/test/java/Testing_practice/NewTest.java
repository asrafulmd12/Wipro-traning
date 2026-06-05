package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void browsersetup() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @Test(priority = 1)
    public void unit1() {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("name")))
                .sendKeys("Vaishali");

        driver.findElement(By.id("email"))
                .sendKeys("test@gmail.com");

        driver.findElement(By.id("phone"))
                .sendKeys("9876543210");

        driver.findElement(By.id("textarea"))
                .sendKeys("Pune");

        driver.findElement(By.id("female")).click();

        driver.findElement(By.id("monday")).click();
    }

    @Test(priority = 2)
    public void unit2() {

        Select country = new Select(
                driver.findElement(By.id("country")));

        country.selectByVisibleText("India");

        driver.findElement(By.id("datepicker"))
                .sendKeys("19/05/2026");
    }

    @AfterTest
    public void afterTest() {

        System.out.println("Successfully done");

        driver.quit();
    }
}