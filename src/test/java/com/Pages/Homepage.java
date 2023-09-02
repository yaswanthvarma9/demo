package com.Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver )
    {
        this.driver =driver;
        
    }
	public void filter() throws InterruptedException
	{
		WebElement e = driver.findElement(By.cssSelector(".product_sort_container"));
		Select s = new Select(e);
		Thread.sleep(2000);
		s.selectByValue("za");
	}
	 public void addtocart() throws InterruptedException
	    {
	        
	       
	        Thread.sleep(2000);
        	driver.findElement(By.id("item_3_title_link")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.id("back-to-products")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.id("item_4_title_link")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        	Thread.sleep(2000);
        	
	    }
	 public void checkout() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
     	
	 }
			 
	

}
