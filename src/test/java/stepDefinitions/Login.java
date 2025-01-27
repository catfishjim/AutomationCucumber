package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;	
	
	@Given("User has navigated to the landing page")
	public void User_has_navigated_to_the_landing_page() {
		driver = DriverFactory.getDriver();	
	}

	@When("User clicks landing login button")
	public void user_clicks_landing_login_button() {
		driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-border-white header_btn-header__ZVBM7')][normalize-space()='Log In']")).click();
		
	}

	@And("User enters a valid email {string}")
	public void User_enters_a_valid_email(String email) {
		
		driver.findElement(By.id("1-email")).sendKeys(email);

	}

	@And("User enters a valid password {string}")
	public void user_enters_a_valid_password(String password) {
		driver.findElement(By.xpath("//input[@placeholder='your password']")).sendKeys(password);
	}
	
	@And("User clicks login button")
	public void user_clicks_login_button() {

		driver.findElement(By.xpath("//span[@class='auth0-label-submit']")).click();
	}
	

	@Then("User is successfully logged in")
	public void user_is_successfully_logged_in() {
		driver.findElement(By.xpath("/html//header[@id='hugo-header']//button[@type='button']//strong[.='Hi, James']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
		
	}

	@And("User enters an invalid email {string}")
	public void user_enters_an_invalid_email(String email) {
		
		driver.findElement(By.id("1-email")).sendKeys(email);
	}

	@And("User enters an invalid password {string}")
	public void user_enters_an_invalid_password(String password){
		driver.findElement(By.xpath("//input[@placeholder='your password']")).sendKeys(password);
	}

	@Then("User receives an Error message")
	public void user_receives_an_error_message() {
		
		driver.findElement(By.xpath("//div[@class='auth0-lock-error-invalid-hint']"));

	}

	@Then("User is not logged in")
	public void user_is_not_logged_in() {
		driver.findElement(By.xpath("//span[contains(text(),'Wrong email or password.')]"));
	
	}

	@And("User does not enter email address")
	public void user_does_not_enter_email_address() {

	}

	@And("User does not enter password")
	public void user_does_not_enter_password() {

	}

	@Then("User is given blank message")
	public void user_is_given_blank_message() {
		driver.findElement(By.xpath("//div[@id='auth0-lock-error-msg-password']//div[@class='auth0-lock-error-invalid-hint']"));
		
	}
}