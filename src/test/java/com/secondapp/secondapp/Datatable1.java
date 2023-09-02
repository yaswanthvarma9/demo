package com.secondapp.secondapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datatable1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\data.xls");
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		
//		Workbook w = new HSSFWorkbook();
//		
//		Sheet s = w.createSheet();
//		
//		s.createRow(0);
//		s.getRow(0).createCell(0).setCellValue("Hello");
//		s.getRow(0).createCell(1).setCellValue("capg");
//		
//		s.createRow(1);
//		s.getRow(1).createCell(0).setCellValue("VB");
//		s.getRow(1).createCell(1).setCellValue("bash");
//		
//		w.write(fileOutputStream);
//		w.close();
		
		
//    File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\data1.xlsx");
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//		
//		Workbook w = new XSSFWorkbook();
//		
//		Sheet s = w.createSheet();
//		
//		s.createRow(0);
//		s.getRow(0).createCell(0).setCellValue("Hello");
//		s.getRow(0).createCell(1).setCellValue("capg");
//		
//		s.createRow(1);
//		s.getRow(1).createCell(0).setCellValue("VB");
//		s.getRow(1).createCell(1).setCellValue("bash");
//		
//		Sheet s1 =w.createSheet("Testing Data");
//		
//		s1.createRow(0);
//		s1.getRow(0).createCell(0).setCellValue("Bashwini");
//		s1.getRow(0).createCell(1).setCellValue("Shilpa");
//		
//		w.write(fileOutputStream);
//		w.close();
//			
		 File file = new File("C:\\Users\\VBASHWIN\\eclipse-workspace\\secondapp\\ExcelData\\swaglogdata.xlsx");
			
			FileOutputStream fileoutputStream = new FileOutputStream(file);
			
			Workbook w = new XSSFWorkbook();
			Sheet s = w.createSheet();
			
			s.createRow(0);
			s.getRow(0).createCell(0).setCellValue("standard_user");
			s.getRow(0).createCell(1).setCellValue("secret_sauce");
			
			w.write(fileoutputStream);
			w.close();
			
//			s.createRow(1);
//			s.getRow(1).createCell(0).setCellValue("VB");
//			s.getRow(1).createCell(1).setCellValue("bash");
			
		

	}

}
