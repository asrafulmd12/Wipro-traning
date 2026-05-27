package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class POM_impl {
	WebDriver driver;
	By user = By.id("user-name");
	By pass = By.id("password");
	By sbutton = By.id("login-button");
	By addtocart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By opencart = By.xpath("//a[@class='shopping_cart_link']");
	By checkoutbutton = By.id("checkout");
	By fname = By.id("first-name");
	By lname = By.id("last-name");
	By pin = By.id("postal-code");
	By placeorder = By.id("continue");
    public POM_impl(WebDriver driver){
    	this.driver = driver;
    }
    public void login() {
    	driver.findElement(user).click();
    	driver.findElement(user).sendKeys("standard_user");;
    	driver.findElement(pass).click();
    	driver.findElement(pass).sendKeys("secret_sauce");
    	driver.findElement(sbutton).click();
    	
    }
    public void open_add_to_cart() {
    	driver.findElement(addtocart).click();
    	driver.findElement(opencart).click();
    }
    public void checkout() {
    	driver.findElement(checkoutbutton).click();
    	
    }
    public void place_order() {
    	driver.findElement(fname).click();
    	driver.findElement(fname).sendKeys("MD");
    	driver.findElement(lname).click();
    	driver.findElement(lname).sendKeys("ASRAFUL");
    	driver.findElement(pin).click();
    	driver.findElement(pin).sendKeys("245356");
    	driver.findElement(placeorder).click();
    }
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
