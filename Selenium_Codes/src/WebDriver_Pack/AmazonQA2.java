package WebDriver_Pack;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AmazonQA2 {
	
	    public static void main(String[] args) throws InterruptedException, IOException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();

	        // Single wait object reused everywhere
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	        // Search box
	        WebElement search = wait.until(
	            ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox"))
	        );
	        search.sendKeys("Mobiles");
	        driver.findElement(By.id("nav-search-submit-button")).click();

	        // Filter by Brand (Samsung)
	        WebElement samsungFilter = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Samsung']"))
	        );
	        samsungFilter.click();

	        // Wait for Samsung product results
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.cssSelector("h2.a-size-mini span")
	        ));

	        // Screenshot after Samsung filter
	        takeScreenshot(driver, "Amazon2.png");

	        // Filter by RAM (example: 4 GB)
	        WebElement ramFilter = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='4 GB']"))
	        );
	        ramFilter.click();

	        // Wait for updated product results
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.cssSelector("h2.a-size-mini span")
	        ));

	        // Screenshot after RAM filter
	        takeScreenshot(driver, "Amazon3.png");

	        driver.quit();
	    }

	    // Reusable screenshot method
	    private static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
	        TakesScreenshot sc = (TakesScreenshot) driver;
	        File src = sc.getScreenshotAs(OutputType.FILE);
	        File dest = new File(fileName);
	        FileHandler.copy(src, dest);
	    }

}
