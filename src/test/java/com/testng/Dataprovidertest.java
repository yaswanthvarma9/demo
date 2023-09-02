package com.testng;

import org.openqa.selenium.By;

//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovidertest {
  
  WebDriver driver;
  @Test
  public void intializeBrowser() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
  }
	  @Test(dataProvider = "loginData")
	 
	  public void test1(String user,String pwd) throws InterruptedException {
	  //System.out.println("thread id:" +Thread.currentThread().getId());
	  driver.findElement(By.id("user-name")).sendKeys(user);
	  Thread.sleep(1000);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  Thread.sleep(1000);
	  driver.findElement(By.id("login-button")).click();  
	  Thread.sleep(1000);
	  Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed());
	  
	  }
	  
	  
	  @DataProvider(parallel=false)
	  public Object[][] loginData()
	  {
		  Object[][] data = new Object[1][2];
		  
		  data[0][0]="standard_user";
		  data[0][1]="secret_sauce";
	  
	  
		  
//	  data[1][0]="problem_user";
//		  data[1][1]="secret_sauce";
//	  
//	  data[2][0]="locked_out_user";
//	  data[2][1]="secret_sauce";
		  
		  return data;
		  
	  }
	  
}
