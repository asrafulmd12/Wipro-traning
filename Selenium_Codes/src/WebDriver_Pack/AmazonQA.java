package WebDriver_Pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonQA {
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();

	        // Explicit wait for search box
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement search = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
	        );

	        search.sendKeys("Mobiles");

	        WebElement sbtn = driver.findElement(By.id("nav-search-submit-button"));
	        sbtn.click();
	        
	        
	        //ScreenShot
	    	
//			TakesScreenshot sc1=(TakesScreenshot)driver;
//			File sc=sc1.getScreenshotAs(OutputType.FILE);
//			File dest=new File("Amazon1.png");
//			FileHandler.copy(sc, dest);

	      //  driver.quit();
			
			//filter by Brand
	        
			driver.findElement(By.xpath("//*[@id=\"p_123/46655\"]/span/a/span")).click();
			WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Samsung Galaxy')]")));
	        
	       
	        
	        
	        
	        
			
//			TakesScreenshot sc2=(TakesScreenshot)driver;
//			File sc02=sc2.getScreenshotAs(OutputType.FILE);
//			File dest1=new File("Amazon2.png");
//			FileHandler.copy(sc02, dest1);
			
			
			//filter by ram
			driver.findElement(By.xpath("//*[@id=\"p_n_g-1003495121111/44897288031\"]/span/a/div/label/i")).click();
			WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Samsung Galaxy')]")));
			
			
			
//			TakesScreenshot sc3=(TakesScreenshot)driver;
//			File sc03=sc3.getScreenshotAs(OutputType.FILE);
//			File dest2=new File("Amazon3.png");
//			FileHandler.copy(sc03, dest2);
			
			
			//filter by price
			driver.findElement(By.xpath("//*[@id=\\\"p_36/dynamic-picker-0\\\"]/span/a/span")).click();
			WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(15));
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\\\\\"p_36/dynamic-picker-0\\\\\\\"]/span/a/span")));
			
			
			
			
			TakesScreenshot sc4=(TakesScreenshot)driver;
			File sc04=sc4.getScreenshotAs(OutputType.FILE);
			File dest3=new File("Amazon4.png");
			FileHandler.copy(sc04, dest3);
			
			// filter by discount
			
			
			driver.findElement(By.xpath("//*[@id=\"p_n_pct-off-with-tax/2665399031\"]/span/a/span")).click();
		
		}
}
