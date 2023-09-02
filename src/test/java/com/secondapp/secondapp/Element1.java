package com.secondapp.secondapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

      /*  WebElement a=driver.findElement(By.id("user-name"));
        a.sendKeys("standard_user");
        Thread.sleep(1000);

        WebElement b=driver.findElement(By.name("password"));
        b.sendKeys("secret_sauce");
        Thread.sleep(1000);

        WebElement c=driver.findElement(By.id("login-button"));
        c.click();*/
//        
//        driver.findElement(By.name("user-name")).sendKeys("standard_user");
//        
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        
//        driver.findElement(By.id("login-button")).click();
//        
        
	}

}
