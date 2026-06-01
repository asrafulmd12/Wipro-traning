package WebDriver_Pack;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoQA2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("John Doe");
		 Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("johndoe@gmail.com");
		 Thread.sleep(2000);
		
		
		WebElement phone=driver.findElement(By.id("phone"));
		phone.sendKeys("0000000000");
		 Thread.sleep(2000);
		

		WebElement addres=driver.findElement(By.id("textarea"));
		addres.sendKeys("Bhubaneswar");
		 Thread.sleep(2000);
		
		//gender
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]/label")).click();
		 Thread.sleep(2000);
		//days
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[3]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[5]/label")).click();
		
		WebElement country=driver.findElement(By.id("country"));
		Select s1=new Select(country);
		s1.selectByValue("india");
		 Thread.sleep(2000);
		
		
		WebElement color=driver.findElement(By.id("colors"));
		Select s2=new Select(color);
		s2.selectByValue("white");
		 Thread.sleep(2000);
		
		WebElement animal=driver.findElement(By.id("animals"));
		Select s3=new Select(animal);
		s3.selectByValue("lion");
		 Thread.sleep(2000);
		WebElement date1=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		date1.click();
		date1.sendKeys("01/25/2026");
		date1.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);

		
		
		WebElement date2=driver.findElement(By.id("txtDate"));
		date2.click();
		//date2.clear();
		date2.sendKeys("30/11/2025");
		date2.sendKeys(Keys.ENTER);
		
		 Thread.sleep(2000);
		

		
		driver.findElement(By.id("start-date")).sendKeys("01-06-2026");
		driver.findElement(By.id("end-date")).sendKeys("15-06-2026");
		driver.findElement(By.className("submit-btn")).click();
		 Thread.sleep(2000);
		
		
		WebElement img=driver.findElement(By.id("singleFileInput"));
		img.sendKeys("C:\\Users\\masiu\\OneDrive\\Pictures\\Screenshots 1\\2025-12-29.png");
		 Thread.sleep(2000);

		WebElement imgs=driver.findElement(By.id("multipleFilesInput"));
		imgs.sendKeys("C:\\Users\\masiu\\OneDrive\\Pictures\\Screenshots 1\\2025-12-29.png");
		imgs.sendKeys("C:\\Users\\masiu\\OneDrive\\Pictures\\Screenshots 1\\2025-09-15 (1).png");
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).click();
		
		
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		
		driver.findElement(By.id("promptBtn")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Welcome Duniya");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(3000);
		
		
		//Pop up Window
		driver.findElement(By.id("PopUp")).click();
		Thread.sleep(3000);
		String orgwind= driver.getWindowHandle();
		Set<String> windows =driver.getWindowHandles();
	//	System.out.println("Total Windows: "+windows.size());

		for (String w :windows) {
		if(!w.equals(orgwind))
		{
		driver.switchTo().window(w);
		driver.close();
		} 
	}
		driver.switchTo().window(orgwind);
		
		
		
		
		 WebElement doubleClk=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
	        Thread.sleep(2000);
	        Actions ac=new Actions(driver);
	        ac.doubleClick(doubleClk).perform();
	        Thread.sleep(2000);
	        
	        
	        WebElement drg=driver.findElement(By.id("draggable"));
	        WebElement drp=driver.findElement(By.id("droppable"));
	        Actions ac1=new Actions(driver);
	        Thread.sleep(2000);
	        ac1.dragAndDrop(drg, drp).perform();
	        Thread.sleep(2000);

		WebElement slider=driver.findElement(By.id("slider-range"));
		Actions ac2=new Actions(driver);
		 Thread.sleep(2000);
	        ac2.dragAndDropBy(slider, 0, 50).perform();
	        Thread.sleep(2000);
	        
		
		
		
		
		
	}
	


}
