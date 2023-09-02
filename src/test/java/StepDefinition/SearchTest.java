package StepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.ReddiffFactory;

public class SearchTest {
         
	 WebDriver driver;
     ReddiffFactory redd;

	
	
	@Given("user is on the Home page of Reddiff website")
	public void user_is_on_the_home_page_of_reddiff_website() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		   
	    
	}

	@When("User enter keyword to search")
	public void user_enter_keyword_to_search(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		redd=new ReddiffFactory(driver);
		List<String> cells = dataTable.asList(String.class);
	     redd.searchtext(cells.get(1));
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
	    
		redd.clickicon();
	
	}

	@Then("Search should be successful")
	public void search_should_be_successful() {
	    driver.close();
	}



}




