package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		 driver.get("http://register.rediff.com/register/register.php?FormName=user_details/");
         WebElement e= driver.findElement(By.cssSelector("select[name = 'country16e5c6bf']>option:first-of-type"));
        
         
        
       

	}

}
