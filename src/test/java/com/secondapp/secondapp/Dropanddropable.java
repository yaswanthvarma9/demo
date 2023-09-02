package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropanddropable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:/jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source,destination).perform();
		
		if(destination.getText().matches("Dropped!"))
		{
			System.out.println("Successfully Dropped");
		}
		Thread.sleep(1000);
		
		
		
	}

}
