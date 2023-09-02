package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionTestNG {
  
  
  WebDriver driver;
  @BeforeTest
  public void intializeBrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
  }
	  @Test(timeOut=1000, expectedExceptions= {NoSuchElementException.class})
	  
	  public void test1() throws InterruptedException {
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  driver.findElement(By.id("login-button")).click();  
	  
 }
//	  @AfterTest
//	  public void teardown()
//	  {
//		  driver.close();
//	  }
	  
  }

