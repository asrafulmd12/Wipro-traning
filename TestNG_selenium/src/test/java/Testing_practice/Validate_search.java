package Testing_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class Validate_search {
	WebDriver driver;
	@DataProvider(name="search")
	  public Object[][] dp1() {
	    return new Object[][] {
	    	{"imphr"},
	    	{"578695"},
	    	{"!@#$%^&"},
	    	{"shadgjhsa766543"},
	    	{"laptop"},
	    	{"dell"},
	    	{"4 star"},
	    	{"under 50000"},
	    	{"30% off"}
	    };
	  }
	

  @Test(dataProvider = "search")
  public void search1(String searching ) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(2000);
	  WebElement sb = driver.findElement(By.id("twotabsearchtextbox"));
	  sb.sendKeys(searching);
	  Thread.sleep(2000);
	  WebElement sbutton = driver.findElement(By.id("nav-search-submit-button"));
	  Assert.assertTrue(sbutton.isEnabled());
	  sbutton.click();
	  Thread.sleep(3000);
	  System.out.println("Searched Product : " + searching);
	  driver.close();
  }
} 
