package Testing_practice;
 
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
 
public class Tira_beauty {
	WebDriver driver;

  @BeforeTest

   public void beforeTest() {
	  driver = new ChromeDriver();

      driver.manage().window().maximize();

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.get("https://www.flipkart.com/");

   }

  @Test

  public void registration() {
	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[2]/div[2]/div/div/div/div/a/span")).click();
      
	 driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9876543210");
    
	 System.out.println("Registration initiated");

  }

  @Test

  public void login() {

  }

  @Test

  public void multiple_search() {

	  //beauty product

	  //lipstick

	  //lip balm

  }

  @Test

  public void add_to_cart() {

  }

  @Test

  public void product_details() {

  }

  @Test

  public void delete_cart_item() {

  }

  @Test

  public void change_Address() {

  }

  @Test

  public void Change_name() {

  }
 
  @AfterTest

  public void afterTest() {

  }
 
}

 
