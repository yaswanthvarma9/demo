package com.secondapp.secondapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabssample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//       File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\data2.xlsx");
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		
//		Workbook w = new XSSFWorkbook();
//		
//		Sheet s = w.createSheet();
//		
//		s.createRow(0);
//		s.getRow(0).createCell(0).setCellValue("standard_user");
//		s.getRow(0).createCell(1).setCellValue("secret_sauce");
//		
		 File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\data2.xlsx");
	
       FileInputStream fileInputStream = new FileInputStream(file);
		
		Workbook w= new XSSFWorkbook(fileInputStream);

		Sheet s = w.getSheetAt(0);
		
	 
		String cellValue= s.getRow(0).getCell(0).getStringCellValue();
		String cellValue1= s.getRow(0).getCell(1).getStringCellValue();
	

		
		WebElement e1 =driver.findElement(By.id("user-name"));
		WebElement e2 =driver.findElement(By.id("password"));
		e1.sendKeys(cellValue);
		e2.sendKeys(cellValue1);
	    
		driver.findElement(By.id("login-button")).click();
		
		w.close();
		fileInputStream.close();

	}

}
