package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
WebDriver driver;
	
	public Logout(WebDriver driver )
    {
        this.driver =driver;
        
    }
	public void out()
	{
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	}

}
