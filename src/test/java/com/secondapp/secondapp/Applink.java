package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Applink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           // WebDriverManager.edgedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com");
          //  driver.findElement(By.linkText("Gmail")).click();
           driver.findElement(By.partialLinkText("Ima")).click();
            
	}

}
