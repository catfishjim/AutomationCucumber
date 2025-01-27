package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import factory.DriverFactory;

public class MyHooks {
	WebDriver driver;

	@Before 
	public void setup() {
		
		DriverFactory.initializeBrowser("chrome");
		driver = DriverFactory.getDriver();
	   // driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hugobyrgp.com/");
	}
	
	@After
	public void teardown() {
		driver.quit();
	
	}

}
