package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLog {

    //DRIVER 
    WebDriver driver;
    //CLASS CALL
    LogPage logPage;
    Homepage homePage;
    Logout lg;

    @Test
    public void testLog() throws InterruptedException
    {
        //CALL THE BROWSER
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        //USE THE METHODS IN CLASS
       logPage = new LogPage(driver);
       logPage.typeUser();
       logPage.typePass();
       logPage.clickLogin();
       
       homePage =new Homepage(driver);
       
       
       homePage.filter();
       homePage.addtocart();
      homePage.checkout();
      
      lg = new Logout(driver);
      lg.out();
       
    }

 

}