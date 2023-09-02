package StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.LoginFactory;

public class SwagLoginTest {
	
	WebDriver driver ;
	LoginFactory logFac;
	
	@Given("User should be on  login page of Swag Lab")
	public void user_should_be_on_login_page_of_swag_lab() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	    
	}
	@When("User enter uname and pass fields")
	public void user_enter_uname_and_pass_fields(io.cucumber.datatable.DataTable dataTable)
	{
		logFac=new LoginFactory(driver);
	    List<List<String>> cell1 = dataTable.cells();
	     logFac.swagu(cell1.get(0).get(0));
	     logFac.swagp(cell1.get(0).get(1));
	}

	@When("User clicks  login button")
	public void user_clicks_login_button() throws InterruptedException {
		logFac.clickbtn();
	    
	}

	@Then("Login successful")
	public void login_successful() {
		//Assert.assertEquals(false,false);
		//Utility.Capture(driver);
	    
	}



}
