package Testing_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Cross_browser {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
	  }
  @Test
  public void Chrome() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
  }
  @Test
  public void Edge() {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.selenium.dev/");
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
