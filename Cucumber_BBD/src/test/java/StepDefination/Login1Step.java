package StepDefination;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
 
import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
 
public class Login1Step {

	WebDriver driver;

	@Given("login page should be open in default tab")
	public void login_page_should_be_open_in_default_tab() {
		 driver=new ChromeDriver();

		  driver.manage().window().maximize();

		  driver.get("http://zero.webappsecurity.com/login.html");
	}

	@When("^click on username field and type valid user username (.*)$")
	public void click_on_username_field_and_type_valid_user_username_username1(String username1) {
	    WebElement user = driver.findElement(By.id("user_login"));
	    user.sendKeys(username1);
	    System.out.println("Username is="+username1);
	}

	@And("^then click on password button and type valid password (.*)$")
	public void then_click_on_password_button_and_type_valid_password_password1(String password1) {
		WebElement pass = driver.findElement(By.id("user_password"));
	    pass.sendKeys(password1);
	    System.out.println("Password is="+password1);
	}

	@And("^now click on submit buttons (.*)$")
	public void now_click_on_submit_buttons_Status(String Status) {
	    driver.findElement(By.name("submit")).click();
	    System.out.println("Test Case Status ="+Status);
	    System.out.println("**************************************************************");
	}

	@Then("login successfully and redirects to home page")
	public void login_successfully_and_redirects_to_home_page() {
//	    System.out.println("Login successfully done");
	    driver.quit();
	}

}