package com.secondapp.secondapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class cssselection {
	
	public static void main(String args[])
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		List<WebElement> e = driver.findElements(By.tagName("input"));
		System.out.println(e.size());
		
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details/");
		driver.manage().window().maximize();
		
		List<WebElement> e1 = driver.findElements(By.id("select[name='DOB_Day4bce788c'])"));
		System.out.println(e1.size());
		
		
		

}
}
