package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Actions act = new Actions(driver);
		
		
		WebElement uname = driver.findElement(By.id("user-name"));
		uname.click();
		act.moveToElement(uname).sendKeys("standard_user").build().perform();
		
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.click();
		act.moveToElement(pwd).sendKeys("secret_sauce").build().perform();
		
		
		WebElement login = driver.findElement(By.id("login-button"));
		act.moveToElement(login).click().build().perform();
		
		
		

	}

}
