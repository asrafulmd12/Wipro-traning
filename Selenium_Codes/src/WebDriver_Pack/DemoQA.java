package WebDriver_Pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DemoQA {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		

		
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("Bruce");
		
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("Wayne");
		
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("wayne123@gmail.com");
		
		driver.findElement(By.id("gender-radio-1")).click();
		
		WebElement num=driver.findElement(By.id("userNumber"));
		num.sendKeys("0000000000");
		//driver.quit();
		
		
		// Date Of birth
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement yr=driver.findElement(By.className("react-datepicker__year-select"));
		Select s1=new Select(yr);
		s1.selectByIndex(102);
		
		WebElement mt=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
		Select s2=new Select(mt);
		s2.selectByValue("7");
		
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[4]/div[4]")).click();
		
		
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("Com");
		sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);
		
		sub.sendKeys("Math");
		sub.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("hobbies-checkbox-1")).click();
		
		// file uploading 
		
		WebElement img=driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\masiu\\OneDrive\\Pictures\\20250331.jpg");
		
		WebElement addres=driver.findElement(By.id("currentAddress"));
		addres.sendKeys("Jajpur");
		
		WebElement state=driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("N");
		state.sendKeys(Keys.ENTER);
		
		WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("D");
		city.sendKeys(Keys.ENTER);
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("submit")).click();
		
		
		
		//screenshot
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		File sc=tc.getScreenshotAs(OutputType.FILE);
		File dest=new File("DemoQAForm.png");
		FileHandler.copy(sc, dest);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-1000)");
		js.executeScript("window.scrollBy(100,0)");
		//scroll by(x,y) ->
		
		
		
		
		
		
		
	}

}
