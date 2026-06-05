package WebDriver_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		String expectedTitle="Selenium Download";
		String actualTitle=driver.getTitle();
		System.out.println("Expected Title is "+expectedTitle);
		System.out.println("Actual Title is "+actualTitle);
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Title validation pass");
		}
		else
		{
			System.out.println("Title validation fails");
		}
		
	}

}
