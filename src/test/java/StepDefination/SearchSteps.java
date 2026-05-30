package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class SearchSteps {
	WebDriver driver;
	@And("go to search tab add inputs and click on search button")
	public void go_to_search_tab_add_inputs_and_click_on_search_button() {
                driver = new ChromeDriver();
                driver.manage().window().maximize();

      		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		        driver.findElement(By.name("search"))
		              .sendKeys("iMac");

		        driver.findElement(
		        By.xpath("//button[@class='btn btn-default btn-lg']"))
		        .click();
	}

	@Then("search funtionality will be successful and related products will be displayed")
	public void search_funtionality_will_be_successful_and_related_products_will_be_displayed() {
		System.out.println("Search completed");
	}




}
