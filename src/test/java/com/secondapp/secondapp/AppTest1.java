package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest1 {

	public static void main(String[] args) throws InterruptedException{
     /*   System.setProperty("webdriver.edge.driver","C:\\drivers\\msedgedriver.exe");
        WebDriver test1= new EdgeDriver();
        test1.get("https://www.redbus.in/");
        test1.manage().window().maximize();
        //test1.close();*/
        
//       System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.saucedemo.com/");
//        driver.manage().window().maximize();
       // driver.close();
		
//		WebDriverManager.chromedriver().setup();
//
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		WebElement a =driver.findElement(By.id("user-name"));
//		a.sendKeys("standard_user");
//		Thread.sleep(2000);
//		
//		
//		WebElement b =driver.findElement(By.name("password"));
//		a.sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		
//		WebElement c =driver.findElement(By.id("login-button"));
//		c.click();
//		
		//driver.close();
		
		   driver.findElement(By.name("user-name")).sendKeys("standard_user");
	        
	        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        
        driver.findElement(By.id("login-button")).click();
//	        
        
	}

}
