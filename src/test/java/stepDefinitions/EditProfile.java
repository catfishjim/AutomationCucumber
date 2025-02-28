package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import java.util.List;


public class EditProfile { 
	
	WebDriver driver;
	
	@Given("User has navigated to hugo landing page")
	public void User_has_navigated_to_hugo_landing_page() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-border-white header_btn-header__ZVBM7')][normalize-space()='Log In']"));
		
	}
	
	@When("User clicks the landing login button")
	public void user_clicks_the_landing_login_button() {
		driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-border-white header_btn-header__ZVBM7')][normalize-space()='Log In']")).click();
		
	}

	@And("User enters a valid email entry {string}")
	public void User_enters_a_valid_email_entry(String email) {		
		driver.findElement(By.id("1-email")).sendKeys(email);

	}

	@And("User enters a valid password entry {string}")
	public void user_enters_a_valid_password_entry(String password) {
		driver.findElement(By.xpath("//input[@placeholder='your password']")).sendKeys(password);
	}
	
	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//span[@class='auth0-label-submit']")).click();
	}
	
	@Then("User is successfully logged into hugo")
	public void user_is_successfully_logged_into_hugo() {
		driver.findElement(By.xpath("/html//header[@id='hugo-header']//button[@type='button']//strong[.='Hi, James']")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Logout')]")).click();
		
	}

	@And("User clicks my profile")
	public void user_clicks_my_profile() {
		driver.findElement(By.xpath("//a[normalize-space()='My Profile']")).click();
	}
	
	@And("User opens basic info modal")
	public void user_opens_basic_info_modal() {
		driver.findElement(By.xpath("//div[@class='StyledBox-sc-13pk1d4-0 deExzV']//*[name()='svg']")).click();
	}
	
	@And("User enters the following into the correct fields")
	public void user_enters_the_following_into_the_correct_fields(DataTable dataTable) {

		 List<List<String>> basicInfo = dataTable.asLists(String.class);
	        String phone = basicInfo.get(0).get(1);
	       // String passWord = signUpForm.get(0).get(1);
	      //  driver.findElement(By.name("username")).sendKeys(userName);
	       // driver.findElement(By.name("password")).sendKeys(passWord);
	       // driver.findElement(By.xpath("//*[@class='oxd-form']/div[3]/button"))
		
	        driver.findElement(By.xpath("//input[@placeholder='(xxx) xxx-xxxx']")).clear();
		    driver.findElement(By.xpath("//input[@placeholder='(xxx) xxx-xxxx']")).sendKeys(phone);
	
	 
	}

	@And("User clicks Save")
	public void user_clicks_save() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("Profile has been edited")
	public void profile_has_been_edited() {
	 
	}	
	

}
