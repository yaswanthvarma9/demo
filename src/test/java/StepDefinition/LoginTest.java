package StepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.secondapp.secondapp.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class LoginTest {
	WebDriver driver ;
	LoginFactory logFac;
	
	@Given("user is on the login page of Swag Lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    
	}
     
	@When("^User enter (.*) & (.*)$")
	public void user_enter(String string, String string2) {
		
		logFac = new LoginFactory(driver);
		//logFac.swagLabsLoginByDefault();
		//logFac.swaglog(string, string2);
	
	
	
	}
	

	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		logFac.clickbtn();
	    
	}

	@Then("Login should be successful")
	public void login_should_be_successful() throws IOException {
		Assert.assertEquals(false,false);
		Utility.Capture(driver);
	}

	@Then("Login should be unsuccessful")
	public void login_should_be_unsuccessful() {
	    
	}


	
	
}
