package pageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPF {
	WebDriver driver;
	LoginFactory log;
	HomepagePF hp;
	
  @Test
  public void verifyswag() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com");
	  driver.manage().window().maximize();
	  
	  log = new LoginFactory(driver);
	  hp= new HomepagePF(driver);
	  //log.swaglog("standard_user","secret_sauce");
	  
	  log.clickbtn();
	// hp.filter1();
	 // hp.addtocart();
  }
}
