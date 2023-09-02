package com.Pages;


   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 

public class LogPage {

    WebDriver driver ;

    //ELEMENTS
    By uname = By.id("user-name");
    By pwd = By.id("password");
    By logBtn = By.cssSelector("#login-button");

    //CONSTRUCTOR
    //to avoid confusion
    //will be called in other class
    public LogPage(WebDriver driver )
    {
        this.driver =driver;
    }

    //METHODS FOR EACH ELEMENT
    public void typeUser()
    {
        driver.findElement(uname).sendKeys("standard_user");
    }

    public void typePass()
    {
        driver.findElement(pwd).sendKeys("secret_sauce");
    }

    public void clickLogin()
    {
        driver.findElement(logBtn).click();
    }



 

}
