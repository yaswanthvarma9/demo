package com.secondapp.secondapp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShapp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
//	
//	TakesScreenshot ts =(TakesScreenshot)driver;
//	File file = ts.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(file, new File("./Screenshots/image.png"));
	
	Utility.Capture(driver);
//	driver.findElement(By.id("login-button")).click();
//	Utils.CaptureScreen(driver, "image2");
//	driver.close();
		
		
	}

}
