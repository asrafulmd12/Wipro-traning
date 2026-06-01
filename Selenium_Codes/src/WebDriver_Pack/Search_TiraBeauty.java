package WebDriver_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_TiraBeauty {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tirabeauty.com/");
		Thread.sleep(200);
		driver.findElement(By.id("search")).sendKeys("facewash");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
	}


}
