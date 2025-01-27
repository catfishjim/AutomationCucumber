package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo {
	
	WebDriver driver;
	
	@Given("User has navigated to landing page")
	public void User_has_navigated_to_landing_page() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-border-white header_btn-header__ZVBM7')][normalize-space()='Log In']"));
		
	}

@When("User clicks on the Book a Demo button")
public void user_clicks_on_the_book_a_demo_button() {
	driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-white')]")).click();
}

@Then("Demo modal is displayed")
public void demo_modal_is_displayed() {
 
}

}