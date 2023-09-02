package com.testng;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	WebDriver driver;
	
	@Parameters("browser")
  @BeforeClass
  public void intibrowser(String browser) {
	  
	  
	if(browser.equalsIgnoreCase("Edge"))
	  {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  }
	  else if(browser.equalsIgnoreCase("Chrome"))
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }
	  driver.get("https://www.google.com");
  }
  @Test
  public void imageopt() {
	  
	driver.findElement(By.linkText("Images")).click();
	System.out.println("Thread id"+Thread.currentThread().getId());
  
  }
}
