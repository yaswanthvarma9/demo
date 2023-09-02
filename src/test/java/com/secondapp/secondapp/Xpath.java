package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
//         driver.get("https://opensource-demo.orangehrmlive.com/");
//         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//         driver.findElement(By.xpath("//button[@type='submit']")).click();
         driver.get("https://www.saucedemo.com/");
         driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		
		
	}

}
