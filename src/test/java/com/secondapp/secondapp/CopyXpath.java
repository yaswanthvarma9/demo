package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyXpath {
	
	public static void main(String[] args) {

		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		
		WebElement l = driver.findElement(By.xpath("//img[@src='https://b.zmtcdn.com/data/dish_images/d5ab931... .png'])"));
		System.out.println(l.isDisplayed());
		l.isEnabled();
		l.isSelected();
		
}
}
