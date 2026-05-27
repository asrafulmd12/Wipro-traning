package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep {
	WebDriver driver;
	static String email =
            "john" + System.currentTimeMillis() + "@gmail.com";
	static String password = "Test@123";
	@Given("registration page should be open in default browser")
	public void registration_page_should_be_open_in_default_browser() {
		 driver=new ChromeDriver();

		  driver.manage().window().maximize();

		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("click on firstname field and add first name")
	public void click_on_firstname_field_and_add_first_name() {
		driver.findElement(
		        By.id("input-firstname"))
		        .sendKeys("John");
	}

	@And("then click on last name field and add last name")
	public void then_click_on_last_name_field_and_add_last_name() {
		driver.findElement(
		        By.id("input-lastname"))
		        .sendKeys("David");
	}

	@And("then click on email field and add email id")
	public void then_click_on_email_field_and_add_email_id() {
		driver.findElement(
		        By.id("input-email"))
		        .sendKeys(email);
	}

	@And("then click on telephone field and add telephone number")
	public void then_click_on_telephone_field_and_add_telephone_number() {
		driver.findElement(
		        By.id("input-telephone"))
		        .sendKeys("9876543210");
	}

	@And("then click on password field and type a passowrd")
	public void then_click_on_password_field_and_type_a_passowrd() {
		driver.findElement(
		        By.id("input-password"))
		        .sendKeys(password);
	}

	@And("then click on password confirm field and retype passowrd")
	public void then_click_on_password_confirm_field_and_retype_passowrd() {
		driver.findElement(
		        By.id("input-confirm"))
		        .sendKeys(password);
	}

	@And("then click on agree checkbox field and click on the checkbox")
	public void then_click_on_agree_checkbox_field_and_click_on_the_checkbox() {
		driver.findElement(
		        By.name("agree"))
		        .click();
	}

	@And("now click on continue button")
	public void now_click_on_continue_button() {
		driver.findElement(
		        By.xpath("//input[@value='Continue']"))
		        .click();
	}

	@Then("registration will be successful")
	public void registration_will_be_successful() {
		 System.out.println("Registration successful");
	}



}
