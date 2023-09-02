package com.secondapp.secondapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Robot robo1 = new Robot();
		Thread.sleep(1000);
		robo1.keyPress(KeyEvent.VK_DOWN);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		
//		robo1.keyPress(KeyEvent.VK_CONTROL);
//		robo1.keyPress(KeyEvent.VK_A);
//		robo1.keyRelease(KeyEvent.VK_CONTROL);
//		robo1.keyRelease(KeyEvent.VK_A);
//		
//		robo1.keyPress(KeyEvent.VK_CONTROL);
//		robo1.keyPress(KeyEvent.VK_C);
//		robo1.keyRelease(KeyEvent.VK_CONTROL);
//		robo1.keyRelease(KeyEvent.VK_C);
//		
//		
//		robo1.keyPress(KeyEvent.VK_TAB);
//		
//		robo1.keyPress(KeyEvent.VK_CONTROL);
//		robo1.keyPress(KeyEvent.VK_V);
//		robo1.keyRelease(KeyEvent.VK_CONTROL);
//		robo1.keyRelease(KeyEvent.VK_V);
		

		//robo1.keyPress(KeyEvent.VK_TAB);
		
		robo1.keyPress(KeyEvent.VK_ENTER);
		

		
		
		
		
	}

}
