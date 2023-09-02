package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.switchTo().defaultContent();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Kurti for women");
		 driver.findElement(By.id("nav-search-submit-button")).click();
		 driver.findElement(By.id("icp-nav-flyout")).click();
		//WebElement e = driver.findElement(By.)
			//	e.getAttribute("value");
		
	
	  
		
		
	}

}
