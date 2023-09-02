package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexec2demoqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		WebElement fname= driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].setAttribute('value','Vangala');",fname);
		

		WebElement lname= driver.findElement(By.id("lastName"));
		js.executeScript("arguments[0].setAttribute('value','Bashwini');",lname);
	}

}
