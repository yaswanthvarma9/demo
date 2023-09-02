package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSexec1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		
		WebElement uname= driver.findElement(By.id("user-name"));
		js.executeScript("arguments[0].setAttribute('value','standard_user');",uname);
		

		WebElement pwd= driver.findElement(By.id("password"));
		js.executeScript("arguments[1].setAttribute('value','secret_sauce');",pwd);
		
		driver.findElement(By.id("login-button")).click();
		
		
		Object obj =js.executeScript("return arguments[0].getAttribute('value')",uname);
		String s =(String)obj;
		System.out.println(s);
		
		Object obj1 = js.executeScript("return arguments[1].getAttribute('value')", pwd);
		String s1 =(String)obj1;
		System.out.println(s1);
		
		
		
	}

}
