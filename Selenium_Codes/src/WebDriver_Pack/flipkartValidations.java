package WebDriver_Pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartValidations {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		    driver.get("https://www.flipkart.in/");
		    WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div/div/div/div[2]/div/form/div[1]/input")));
		    email.sendKeys("masiurraheman91@gmail.com");
		    driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[2]/div/form/div[3]/button")).click();
		    WebElement phoneNo=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input")));
		    phoneNo.sendKeys("9114506063");
		    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button")).click();
		    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		    
		    
		    WebElement closeBtn = wait.until(ExpectedConditions.elementToBeClickable( By.xpath("//span[text()='✕']")));
		        closeBtn.click();
		        
		        
		        
		    WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("laptop");
	        searchBox.submit();
	        
	        
	        WebElement firstProduct = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]"));

	     // Product price
	     WebElement price = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]"));

	     // Product rating
	     WebElement rating = driver.findElement(By.xpath("//*[@id=\"productRating_LSTCOMH8Z2QADYUVZN8LRHSHZ_COMH8Z2QADYUVZN8_\"]/div"));

	        System.out.println("Title: " + firstProduct.getText());
	        System.out.println("Price: " + price.getText());
	        System.out.println("Rating: " + rating.getText());
	        
	     // Locate product image
	        WebElement productImage = driver.findElement(By.xpath("//img[contains(@class,'_396cs4')]"));

	        // Click the image to open product detail page
	        productImage.click();

	        // Wait for zoom container to appear on product detail page
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement zoomContainer = wait1.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img")));

	        // zoom button working
	        boolean zoomed = zoomContainer.isDisplayed();
	        System.out.println("Image zoom working: " + zoomed);
	        
	        WebElement firstProductLink = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]")));
	            firstProductLink.click();
	        WebElement addToCartBtn = driver.findElement(By.xpath("//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[20]/div/div/div/div/div/div/div/div/div/div[1]/div/svg/path[1]"));
	        System.out.println("Add to Cart visible: " + addToCartBtn.isDisplayed());
	        
	        
	     //  Buy button visibility
	        WebElement buyBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//button[text()='Buy Now']")));
	        System.out.println("Buy button visible: " + buyBtn.isDisplayed());
	        
	        
	        
	        
	        //  Checkout button visibility in cart
	        WebElement checkoutBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//span[text()='Place Order']")));
	        System.out.println("Checkout button visible: " + checkoutBtn.isDisplayed());

	        driver.quit();
	        
	        



	}

}
