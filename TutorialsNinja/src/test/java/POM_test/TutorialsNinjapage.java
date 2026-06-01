package POM_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialsNinjapage {

    WebDriver driver;
    WebDriverWait wait;

    // Registration locators
    By myAccount = By.xpath("//span[text()='My Account']");
    By register = By.linkText("Register");

    By firstname = By.id("input-firstname");
    By lastname = By.id("input-lastname");
    By email = By.id("input-email");
    By phone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");

    By agree = By.name("agree");
    By continueButton = By.xpath("//input[@value='Continue']");

    // Login locators
    By login = By.linkText("Login");
    By loginButton = By.xpath("//input[@value='Login']");

    // Logout locator
    By logout = By.linkText("Logout");

    // Search locators
    By searchBox = By.name("search");

    By searchButton =
            By.xpath("//button[@class='btn btn-default btn-lg']");

    // Cart locators
    By addToCart =
            By.xpath("//span[text()='Add to Cart']");

    By cart = By.id("cart-total");

    By removeProduct =
            By.cssSelector(".btn-danger");

    // Checkout locators
    By viewCart =
            By.xpath("//strong[normalize-space()='View Cart']");

    By checkout =
            By.linkText("Checkout");



    public TutorialsNinjapage(WebDriver driver)
    {
        this.driver=driver;

        wait=new WebDriverWait(
                driver,
                Duration.ofSeconds(15));
    }



    public WebElement element(By locator)
    {
        return wait.until(
                ExpectedConditions
                .elementToBeClickable(locator));
    }



    public void registration(String fname,
                             String lname,
                             String mail,
                             String mobile,
                             String pass)
    {

        element(myAccount).click();

        element(register).click();

        element(firstname)
                .sendKeys(fname);

        element(lastname)
                .sendKeys(lname);

        element(email)
                .sendKeys(mail);

        element(phone)
                .sendKeys(mobile);

        element(password)
                .sendKeys(pass);

        element(confirmPassword)
                .sendKeys(pass);

        element(agree).click();

        element(continueButton)
                .click();
    }



    public void logout()
    {
        element(myAccount).click();

        element(logout).click();
    }



    public void login(String mail,
                      String pass)
    {

        element(myAccount).click();

        element(login).click();

        element(email)
                .sendKeys(mail);

        element(password)
                .sendKeys(pass);

        element(loginButton)
                .click();
    }



    public void searchProduct(String product)
    {

        wait.until(
                ExpectedConditions
                .visibilityOfElementLocated(searchBox));

        element(searchBox)
                .sendKeys(product);

        element(searchButton)
                .click();
    }



    public void addProduct()
    {

        element(addToCart)
                .click();
    }



    public void removeProduct()
    {
        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(15));

        try
        {
            WebElement cartElement =
                    wait.until(
                            ExpectedConditions
                            .elementToBeClickable(cart));

            ((JavascriptExecutor)driver)
                    .executeScript(
                            "arguments[0].scrollIntoView(true);",
                            cartElement);

            Thread.sleep(1000);

            ((JavascriptExecutor)driver)
                    .executeScript(
                            "arguments[0].click();",
                            cartElement);

            WebElement removeBtn =
                    wait.until(
                            ExpectedConditions
                            .elementToBeClickable(
                                    removeProduct));

            removeBtn.click();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public void addAgain(String product)
    {

        searchProduct(product);

        addProduct();
    }



    public void checkout()
    {
        WebDriverWait wait =
                new WebDriverWait(
                        driver,
                        Duration.ofSeconds(15));

        try
        {
            // Wait until cart count updates
            wait.until(
                    ExpectedConditions.textToBePresentInElementLocated(
                            cart,
                            "1 item"));

            WebElement cartElement =
                    wait.until(
                            ExpectedConditions
                            .presenceOfElementLocated(cart));

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].scrollIntoView(true);",
                            cartElement);

            wait.until(
                    ExpectedConditions
                    .elementToBeClickable(cart));

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            cartElement);

            WebElement viewCartBtn =
                    wait.until(
                            ExpectedConditions
                            .elementToBeClickable(viewCart));

            viewCartBtn.click();

            WebElement checkoutBtn =
                    wait.until(
                            ExpectedConditions
                            .elementToBeClickable(checkout));

            checkoutBtn.click();
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

