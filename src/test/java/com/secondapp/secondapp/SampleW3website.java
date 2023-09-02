package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleW3website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		driver.manage().window().maximize();
	 Thread.sleep(1000);
	 
	//driver.switchTo().frame(0);
	 driver.switchTo().frame("iframeResult");
	 WebElement e1 = driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']"));
	 e1.click();
	 //driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();
	 Thread.sleep(1000);
	 //driver.switchTo().parentFrame();
	 driver.switchTo().defaultContent();
	 System.out.println(driver.getTitle());
	 driver.findElement(By.id("runbtn")).click();
	 
		

	}

}
