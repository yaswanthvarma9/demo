package com.secondapp.secondapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PhysicalRC {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\data1.xlsx");
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(fileInputStream);
		
		Sheet s = w.getSheetAt(0);
		
//		int row = s.getPhysicalNumberOfRows();
//        System.out.println(row);
//
//        Row r = s.getRow(0);
//        int col = r.getPhysicalNumberOfCells();
//        System.out.println(col);
		
		
//		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
//		{
//			Row r = s.getRow(i);
//			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
//			{
//				Cell c = r.getCell(j);
//				System.out.println(c);
//			}
//		}
		
		

		
		int row = s.getLastRowNum();
		int col = s.getRow(1).getLastCellNum();
		
		for(int r=0;r<=row;r++)
		{
			Row ro = s.getRow(r);
			for(int c=0;c<col;c++)
			{
				Cell ce = ro.getCell(c);
				
				switch(ce.getCellType())
				{
				case STRING: System.out.print(ce.getStringCellValue());
				 break;
				case NUMERIC: System.out.print(ce.getNumericCellValue());
				 break;
				case BOOLEAN: System.out.print(ce.getBooleanCellValue());
				 break;
				default:
					break;
				}
				System.out.print("|");
			}
			System.out.println();
		}
		
		w.close();
		fileInputStream.close();
		
		
	}

}
