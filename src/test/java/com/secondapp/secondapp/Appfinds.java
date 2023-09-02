package com.secondapp.secondapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appfinds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //WebDriverManager.edgedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.rediff.com/");
    driver.manage().window().maximize();
    
    
    Actions act = new Actions(driver);
    WebElement a = driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]"));
   // act.moveToElement(a).doubleClick().build().perform();
   // act.doubleClick(a).build().perform();
    
   // act.moveToElement(a).contextClick().build().perform();
    act.contextClick(a).build().perform();
    
    
	}

}
