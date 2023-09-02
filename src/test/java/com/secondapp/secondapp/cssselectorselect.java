package com.secondapp.secondapp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class cssselectorselect {
	
	public static void main(String args[])
	{
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		
		WebElement e = driver.findElement(By.cssSelector("#cars"));
	
		Select s = new Select(e);
		
		boolean b = s.isMultiple();
		System.out.println(b);
		
		List<WebElement> opt =s.getOptions();
		System.out.println(opt.size());
		for(WebElement e2: opt)
		{
			String t = e2.getText();
			System.out.println(t);
		}
		System.out.println("first selected");
		s.selectByIndex(2);
		s.selectByValue("saab");
		WebElement d = s.getFirstSelectedOption();
		String first =d.getAttribute("value");
		System.out.println(first);
		
		
		List<WebElement> all = s.getAllSelectedOptions();
		System.out.println(all.size());
		
		s.deselectAll();
		List<WebElement> all1 = s.getAllSelectedOptions();
		System.out.println(all1.size());
		
//		s.selectByIndex(2);
//		s.selectByValue("volvo");
//		s.selectByVisibleText("Audi");
//		
//		
//    s.deselectByIndex(2);
//	s.deselectByValue("volvo");
//	s.deselectByVisibleText("Audi");
		
		
		
	}

}
