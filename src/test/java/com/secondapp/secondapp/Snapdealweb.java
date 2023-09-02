package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdealweb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("inputValEnter")).sendKeys("Wall Stickers");
		 driver.findElement(By.className("searchTextSpan")).click();
		 driver.findElement(By.xpath("//p[@title='HOMETALES 3D Wall Stickers Dolphins Underwater Cave Sticker ( 50 x 70 cms )']")).click();
	    // driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();
	  driver.findElement(By.xpath("//div[@id='pincode-check-bttn']")).click();
		 
		

	}

}
