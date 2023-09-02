package com.secondapp.secondapp;

import java.io.IOException;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentRepoTest {
	
	WebDriver driver;
	ExtentTest testt;
	ExtentReports report;
	
	
	
	@Test
	
	public void verifyTitle()
	{
		report=new ExtentReports("C:\\Report\\LogReport.html");
		testt = report.startTest("VerifyBlogTitle");
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		testt.log(LogStatus.INFO,"Browser started");
		
		driver.get("https://www.saucedemo.com/");
		
		testt.log(LogStatus.INFO,"Application is up & running");
		driver.manage().window().maximize();
		
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("wagLabs"));
		
		testt.log(LogStatus.PASS,"Title verified");
		//testt.log(LogStatus.FAIL,"Title failed");
		
		
		
		
		
		
	}
	
	//ItestResult is a listener is for pass,fail and skip

	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
     	if(result.getStatus()==ITestResult.FAILURE)
		{
			String screen =Utils1.CaptureScreen(driver,result.getName());
			String image = testt.addScreenCapture(screen);
			testt.log(LogStatus.FAIL,"Title verification failed",image);
		}
     	report.endTest(testt);
		report.flush();
		driver.get("C:\\Report\\LogReport.html");
	
		
	}

	
	
	

}
