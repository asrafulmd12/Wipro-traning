package StepDefination;

import java.time.Duration;
import Hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import POM_test.TutorialsNinjapage;

import io.cucumber.java.en.*;


public class TutorialsNinjaSteps {

    WebDriver driver;

    TutorialsNinjapage page;


    @Given("user launches Tutorials Ninja website")
    public void user_launches_website()
    {
        driver = Hooks.driver;

        page = new TutorialsNinjapage(driver);
    }



    @When("^user registers a new account with (.*) (.*) (.*) (.*) (.*)$")
    public void registration(String firstname,
                             String lastname,
                             String email,
                             String phone,
                             String password)
    {

        page.registration(
                firstname,
                lastname,
                email,
                phone,
                password);

        Assert.assertTrue(
                driver.getPageSource()
                .contains("Your Account Has Been Created"));

        System.out.println(
                "Registration successful");
    }



    @And("user logs out")
    public void logout()
    {
        page.logout();

        Assert.assertTrue(
                driver.getTitle()
                .contains("Account Logout"));

        System.out.println(
                "Logout successful");
    }



    @And("^user logs in with (.*) (.*)$")
    public void login(String email,
                      String password)
    {

        page.login(email,password);

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.linkText("Edit your account information")));

        Assert.assertTrue(
                driver.findElement(
                        By.linkText(
                        "Edit your account information"))
                        .isDisplayed());

        System.out.println(
                "Login successful");
    }


    @And("^user searches for product (.*)$")
    public void search(String product)
    {

        page.searchProduct(product);

        Assert.assertTrue(
                driver.getPageSource()
                .contains(product));

        System.out.println(
                "Search completed");
    }



    @And("user adds product to cart")
    public void addProduct()
    {
        page.addProduct();

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".alert-success")));

        Assert.assertTrue(
                driver.findElement(
                        By.cssSelector(".alert-success"))
                        .isDisplayed());

        System.out.println(
                "Product added");
    }



    @And("user removes product from cart")
    public void removeProduct() throws InterruptedException
    {

        page.removeProduct();

        System.out.println(
                "Product removed");
    }



    @And("^user adds product again (.*)$")
    public void addAgain(String product)
    {
        driver.get(
                "https://tutorialsninja.com/demo/");

        page.addAgain(product);

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector(".alert-success")));

        Assert.assertTrue(
                driver.findElement(
                        By.cssSelector(".alert-success"))
                        .isDisplayed());

        System.out.println(
                "Added again");
    }

    @And("user proceeds to checkout")
    public void checkout()
    {
        page.checkout();

        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(15));

        wait.until(
                ExpectedConditions.urlContains(
                        "checkout"));

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("checkout"));

        System.out.println(
                "Checkout completed");
    }

    @And("order should be confirmed")
    public void confirmOrder()
    {
        System.out.println(
                "Order confirmed");
    }


    @Then("user logs out from application")
    public void closeApplication()
    {
        page.logout();

        System.out.println(
                "Logout successful");
    }

}