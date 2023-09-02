package com.secondapp.secondapp;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.com/");
		driver.manage().window().maximize();
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		 //driver.findElement(By.xpath("//div[@data-automation='topNav_trips']")).click();
		// driver.findElement(By.xpath("//div[@data-automation='biGQs _P.ttuOS']")).click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//e.click();
	
		//Actions act = new Actions(driver);
		
		
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
		

	        WebElement w=driver.findElement(By.xpath("//*[@id=\"lithium-root\"]/header/div/nav/div[2]/div/div[1]/div/button/span/span"));
	        w.click();
	     //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	      //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu-item-0\"]/div/span"))).click();
		 //Fluent wait
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				    .withTimeout(Duration.ofSeconds(8))
				    .pollingEvery(Duration.ofSeconds(2))
				    .withMessage("Fluent wait")
		            .ignoring(NoSuchElementException.class);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-item-0\"]/div/span"))).click();
		 
	}

}
