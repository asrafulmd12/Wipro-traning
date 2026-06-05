package Testing_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Register {
	WebDriver driver;
	@DataProvider(name="data")
	  public Object[][] dp1() {
	    return new Object[][] {
	      //validate login page
	    	{"ksjd","dsidi","ddug@gmail.com","ishua908","ishua908"},
	    	{"msdj","ckd","dkdl@gmail.com","isj876","isj876"},
	    	{"kds","jfhd","kjfjf@gmail.com","djd456","djd456"},
	    	{"kvgh","gfd","bhrge@gmail.com","rfrdf153","rfrdf153"},
	    	{"vdf","sdd","jtth@gmail.com","hiti321","hiti321"}
	    };
	  }
	

  @Test(dataProvider = "data")
  public void f(String firstname, String lastname, String emailid, String pass, String cnfpass ) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demowebshop.tricentis.com/register/");
	  driver.findElement(By.id("gender-male")).click();
	  WebElement fname = driver.findElement(By.id("FirstName"));
	  fname.sendKeys(firstname);
	  WebElement lname = driver.findElement(By.id("LastName"));
	  lname.sendKeys(lastname);
	  WebElement email = driver.findElement(By.id("Email"));
	  email.sendKeys(emailid);
	  WebElement pword = driver.findElement(By.id("Password"));
	  pword.sendKeys(pass);
	  WebElement cpword = driver.findElement(By.id("ConfirmPassword"));
	  cpword.sendKeys(cnfpass);
	  
	  driver.findElement(By.id("register-button")).click();
	  Thread.sleep(2000);
	  driver.close();	  
  }
}
