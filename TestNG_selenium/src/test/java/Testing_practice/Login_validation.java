package Testing_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Login_validation {
	WebDriver driver;
	@DataProvider(name="data")
	  public Object[][] dp1() {
	    return new Object[][] {
	      //validate login page
	    	{"standard_user","secret_sauce"},
	    	{"invalid","secret_sauce"},
	    	{"standard_user","2654"},
	    	{"invalid","invalid"}
	    };
	  }
	

  @Test(dataProvider = "data")
  public void f(String username1, String password1) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  WebElement user = driver.findElement(By.id("user-name"));
	  user.sendKeys(username1);
	  WebElement pass = driver.findElement(By.id("password"));
	  pass.sendKeys(password1);
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  driver.close();	  
  }

  }  

//assignment1
//validate search
// use assert for search button clickable
// iphmr, 578695, !@#$%^&, shadgjhsa766543, (product name, brand name
//rating, price based,discount, )

//assignment2
// register 5 users using data provider
