package WebDriver_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Handle {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); driver.get("https://demoqa.com/buttons");

		//Double click

		WebElement dc=driver.findElement(By.id("doubleClickBtn")); Thread.sleep(2000);

		Actions ac = new Actions(driver);

		ac.doubleClick(dc).perform(); Thread.sleep(2000);

		//Right click

		WebElement rc=driver.findElement(By.id("rightClickBtn")); Thread.sleep(2000);

		ac.contextClick(rc).perform(); Thread.sleep(2000);

		//dynamic click

		WebElement dcc=driver.findElement(By.xpath("(//button[@class=\"btn btn-primary\"])[3]"));

		Thread.sleep(2000);

		ac.moveToElement(dcc).click().perform();

		Thread.sleep(2000);

		driver.close();
	}

}
