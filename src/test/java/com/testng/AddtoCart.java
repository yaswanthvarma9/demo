package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {
	WebDriver driver;
	  @BeforeTest
  public void first() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  }
        @Test
	    public void test1() {
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  driver.findElement(By.id("login-button")).click();  
		  
	  }
        @AfterTest
        public void test2()
        {
        	driver.findElement(By.id("item_4_title_link")).click();
        	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        	driver.findElement(By.id("checkout")).click();
        }
  }

