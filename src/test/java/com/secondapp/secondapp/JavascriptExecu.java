package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 Thread.sleep(1000);
		 
		 
		 //refresh
		 js.executeScript("location.reload()");
		 Thread.sleep(1000);
		 
		 WebElement a = driver.findElement(By.xpath("//a[@href = '/downloads']"));
		 js.executeScript("arguments[0].click();", a);
		 
		 //scroll the page 1st horizontal, 2nd Vertical
		 
		 js.executeScript("window.scrollBy(200,600)");
		
	}

}
