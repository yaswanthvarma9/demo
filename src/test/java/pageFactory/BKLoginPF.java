package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BKLoginPF {
	 WebDriver driver;
	 BKLogin log;
	
  @Test
  public void verifyLog() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.burgerking.in/");
	  driver.manage().window().maximize();
	  
	  log = new BKLogin(driver);
	  log.BKlog("9676179030");
	  
	 
  }
}
