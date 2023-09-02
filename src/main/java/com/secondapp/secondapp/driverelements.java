package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverelements {
	
	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Gmail")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.navigate().forward();
	    Thread.sleep(1000);
	    driver.navigate().refresh();
	    
//	    System.out.println(driver.getTitle());
//	    System.out.println(driver.getCurrentUrl());
//	    
	    
	    String title = driver.getTitle();
	    System.out.println("The title is:"+title);
	    
	    String title1 = driver.getCurrentUrl();
	    System.out.println("The title is:"+title1);
	    
	    
	   
	}

}
