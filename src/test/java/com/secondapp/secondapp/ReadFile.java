package com.secondapp.secondapp;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\data1.xlsx");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(fileInputStream);
		
		Sheet s = w.getSheetAt(0);
		
//		Row r = s.getRow(1);
//		Cell c = r.getCell(0);
//		System.out.println(c);
		
		String cellValue= s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
		
		//int cValue = s.getRow(0).getCell(1).getStringCellValue();
		//System.out.println(cValue);
		
		int rows = s.getFirstRowNum();
		int col = s.getRow(0).getFirstCellNum();
		
		System.out.println(rows);
		System.out.println(col);
		
		
		int row1 = s.getLastRowNum();
		int col1 = s.getRow(1).getLastCellNum();
		
		System.out.println(row1);
		System.out.println(col1);
			
	
		w.close();
		fileInputStream.close();
		
		
		
		
		
		
		
	}

}
