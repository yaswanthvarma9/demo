package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//Actions act = new Actions(driver);
		driver.findElement(By.tagName("//a[@href='allclasses-frame.html']")).click();
			
		//WebElement cli = driver.findElement(By.tagName("//a[@href='allclasses-frame.html']"));
			//act.moveToElement(cli).click().build().perform();
			
           // WebElement c = driver.findElement(By.tagName("//h2[title='packages']"));
			//WebElement cli1 = driver.findElement(By.tagName("//a[@href='org/openqa/selenium/package-frame.html']"));
			//act.moveToElement(cli1).click().build().perform();
			
			
			

	}

}
