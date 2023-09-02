package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
//		
//		driver.findElement(By.id("alertButton")).click();
//		String text =driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
	
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(5000);
//		String text1 =driver.switchTo().alert().getText();
//	System.out.println(text1);
//		driver.switchTo().alert().accept();
	
//		driver.findElement(By.id("confirmButton")).click();
//		String text2 =driver.switchTo().alert().getText();
//		System.out.println(text2);
//		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();
	
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("Bashwini");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		String text3 = driver.findElement(By.id("promptResult")).getText();
     	System.out.println(text3);
	
		//driver.switchTo().alert().accept();
		
		
	}

}
