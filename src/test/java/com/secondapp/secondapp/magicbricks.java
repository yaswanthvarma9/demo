package com.secondapp.secondapp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class magicbricks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		String parenthandle = driver.getWindowHandle();
		System.out.println("Parent window" + parenthandle);
		WebElement a =driver.findElement(By.xpath("//a[@id='buyheading']"));
		act.moveToElement(a).build().perform();
		driver.findElement(By.xpath("//a[@ href='https://www.magicbricks.com/ready-to-move-flats-in-mumbai-pppfs' ]")).click();
		Thread.sleep(1000);
		//driver.switchTo().window(parenthandle);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		for(String h : handles)
		{
			System.out.println(h);
       	}
		
		
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		

	}

}
