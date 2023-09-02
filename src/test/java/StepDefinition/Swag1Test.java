package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.secondapp.secondapp.Utility;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class Swag1Test{
		
		 WebDriver driver;
		
	   LoginFactory logFac;
		
		@Given("User on login page of SwagLabs")
		public void user_on_login_page_of_swag_labs() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		    
		}

		@When("User enters valid uname and password")
		public void user_enters_valid_uname_and_password() {
			logFac=new LoginFactory(driver);
		    logFac.swagLogs("standard_user", "secret_sauce");
		    
		}

		@When("User clicking on login")
		public void user_clicking_on_login() throws InterruptedException {
		    logFac.clickbtn();
		}

		@Then("User login successful")
		public void user_login_successful() {
		    driver.close();
		}

		@When("User enter invalid uname and invalid password")
		public void user_enter_invalid_uname_and_invalid_password() {
			logFac=new LoginFactory(driver);
			logFac.swagLogs("bash","bash123");
		}

		@Then("User login unsuccessful")
		public void user_login_unsuccessful() throws IOException {
		    Utility.Capture(driver);
		    driver.close();
		}



	

}
