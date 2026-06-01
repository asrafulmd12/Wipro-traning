package POM_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialsNinjapage {

    WebDriver driver;
    WebDriverWait wait;

    // Registration locators
    By myAccount = By.cssSelector("a[title='My Account']");
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
    By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");

    // Cart locators
    By addToCart = By.xpath("(//button[contains(@onclick,'cart.add')])[1]");
    By cart = By.id("cart-total");
    By removeProduct = By.cssSelector(".btn-danger");

    // Checkout locators
    By viewCart = By.xpath("//strong[normalize-space()='View Cart']");
    By checkout = By.linkText("Checkout");

    public TutorialsNinjapage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(30));
    }

    public WebElement element(By locator) {

        wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    public void registration(String fname,
                             String lname,
                             String mail,
                             String mobile,
                             String pass) {

        element(myAccount).click();
        element(register).click();

        element(firstname).sendKeys(fname);
        element(lastname).sendKeys(lname);
        element(email).sendKeys(mail);
        element(phone).sendKeys(mobile);
        element(password).sendKeys(pass);
        element(confirmPassword).sendKeys(pass);

        element(agree).click();
        element(continueButton).click();
    }

    public void logout() {

        element(myAccount).click();
        element(logout).click();
    }

    public void login(String mail,
                      String pass) {

        WebElement account =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                myAccount));

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].click();",
                        account);

        element(login).click();

        element(email).sendKeys(mail);
        element(password).sendKeys(pass);

        element(loginButton).click();

        System.out.println("Login successful");
    }

    public void searchProduct(String product) {

        WebElement search =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                searchBox));

        search.clear();
        search.sendKeys(product);

        element(searchButton).click();

        System.out.println(
                "Current URL : " + driver.getCurrentUrl());

        System.out.println(
                "Page Title : " + driver.getTitle());

        System.out.println(
                "Searching Product : " + product);
    }

    public void addProduct() {

        try {

            WebElement addCartBtn =
                    wait.until(
                            ExpectedConditions.elementToBeClickable(
                                    addToCart));

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].scrollIntoView({block:'center'});",
                            addCartBtn);

            Thread.sleep(2000);

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            addCartBtn);

            System.out.println("Product added to cart");

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Unable to click Add To Cart");
        }
    }

    public void removeProduct() {

        try {

            WebElement cartElement =
                    wait.until(
                            ExpectedConditions.elementToBeClickable(cart));

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", cartElement);

            Thread.sleep(2000);

            WebElement removeBtn =
                    wait.until(
                            ExpectedConditions.visibilityOfElementLocated(
                                    removeProduct));

            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", removeBtn);

            wait.until(
                    ExpectedConditions.invisibilityOf(removeBtn));

            System.out.println("Product removed");

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Unable to remove product");
        }
    }

    public void addAgain(String product) {

        searchProduct(product);

        addProduct();

        System.out.println("Added again");
    }

    public void checkout() {

        try {

            // Click cart
            WebElement cartElement =
                    wait.until(
                            ExpectedConditions.elementToBeClickable(
                                    cart));

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            cartElement);

            // Wait for dropdown to appear
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            viewCart));

            // Re-locate View Cart before clicking
            WebElement viewCartBtn =
                    driver.findElement(viewCart);

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            viewCartBtn);

            // Wait for cart page
            wait.until(
                    ExpectedConditions.urlContains(
                            "checkout/cart"));

            // Re-locate Checkout button
            WebElement checkoutBtn =
                    wait.until(
                            ExpectedConditions.elementToBeClickable(
                                    checkout));

            ((JavascriptExecutor) driver)
                    .executeScript(
                            "arguments[0].click();",
                            checkoutBtn);

            // Wait for checkout page
            wait.until(
                    ExpectedConditions.urlContains(
                            "checkout"));

            System.out.println(
                    "Checkout completed");

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Checkout failed");
        }
    }
}