package WebDriver_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		driver.findElement(By.id("Layer_1")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
