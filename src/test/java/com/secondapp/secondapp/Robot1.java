package com.secondapp.secondapp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Robot robo1 = new Robot();
		
		robo1.keyPress(KeyEvent.VK_DOWN);
		
		robo1.keyPress(KeyEvent.VK_TAB);
		
		robo1.keyPress(KeyEvent.VK_TAB);
		
		robo1.keyPress(KeyEvent.VK_TAB);
		
		robo1.keyPress(KeyEvent.VK_ENTER);
		
		WebElement a =  driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
	       String text = a.getText();
	       System.out.println(text);
		
		
		

	}

}
