package com.testng;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NewTest {
  @Test
  public void firstMethod() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  
	  String expectedtitle ="Google";
	  String actualtitle = driver.getTitle();
	//  Assert.assertEquals(actualtitle,expectedtitle, "Title mismatched");
	  
	  String expurl = "www.google.com";
	  String acturl = driver.getCurrentUrl();
	  Assert.assertEquals(acturl,expurl,"Url went wrong");
	  
//	  SoftAssert soft = new SoftAssert();
//	  soft.assertEquals(acturl,expurl,"url not same");
//	  soft.assertAll();
  }
}
