package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Actions act = new Actions(driver);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		act.sendKeys(Keys.TAB).build().perform();
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
