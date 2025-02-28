package stepDefinitions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

@When("User clicks on the book a demo button")
public void user_clicks_on_the_book_a_demo_button() {
	driver.findElement(By.xpath("//button[contains(@class,'btn-default btn-white')]")).click();
}

@Then("Demo modal is displayed")
public void demo_modal_is_displayed() {
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//i18n-string[@data-key='emailForm.header']"));
 
}

@And("Start booking button is disabled")
public void start_booking_button_is_disabled() {
	//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//i18n-string[normalize-space()='Start booking']"));
	driver.findElement(By.xpath("//button[@aria-disabled='true']"));
	String disabledAttribute = driver.findElement(By.xpath("//button[contains(@class, 'uiButton')]")).getAttribute("aria-disabled");
	Assert.assertEquals(disabledAttribute, "true", "mismatch");
	
    WebElement buttoninfo = driver.findElement(By.xpath("//button[contains(@class, 'uiButton')]"));
    System.out.println("status:- "+ buttoninfo.getAttribute("aria-disabled"));
  
}

@And("User enters valid email address {string}")
public void user_enters_valid_email_address(String email)  {
	//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//i18n-string[normalize-space()='Start booking']"));
	driver.findElement(By.xpath("//input[@id='UIFormControl-1']")).sendKeys(email);;

}

@Then("Start booking button is enabled")
public void start_booking_button_is_enabled() {
	//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//i18n-string[normalize-space()='Start booking']"));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//button[@aria-disabled='false']"));
	String disabledAttribute = driver.findElement(By.xpath("//button[contains(@class, 'uiButton')]")).getAttribute("aria-disabled");
	Assert.assertEquals(disabledAttribute, "false", "mismatch");
	
    WebElement buttoninfo = driver.findElement(By.xpath("//button[contains(@class, 'uiButton')]"));
    System.out.println("status:- "+ buttoninfo.getAttribute("aria-disabled"));
  
}
@And("User closes demo modal")
public void user_closes_demo_modal() {
	//driver.switchTo().frame(0);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//button[@id='foo']")).click();
	//driver.findElement(By.xpath("//button[@id='foo']//*[name()='svg']//*[name()='path' and contains(@fill,'none')]")).click();
	//button[@id='foo']//*[name()='svg']//*[name()='path' and contains(@fill,'none')]
}

}