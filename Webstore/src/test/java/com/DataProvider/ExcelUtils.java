package com.DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath) {
		try {
			//String filePath = "C:\ExcelSheet\Excel Sheet.xlsx"; 
			File file = new File(excelPath); 
			FileInputStream fis = new FileInputStream(file); 
			//XSSFWorkbook wb = new XSSFWorkbook(fis); 
			
			wb = new XSSFWorkbook(fis);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getRowCount() {
		try {
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+ rowCount);
			wb.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static String getCellData(String sheetName, int rowNum, int colNum) {	
		String  cellData = null ;
		try {
			cellData = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
			//cellData = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();
			wb.close();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;		
	}
	
	public static String getCellDataString(String sheetName, int rowNum, int colNum) {	
		String  cellData = null ;
		try {
			//String  cellData = sheet.getRow(rowNum).getCell(colNum).toString();
			cellData = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();			
			wb.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;		
	}
	
	public static double getCellDataNumber(String sheetName, int rowNum, int colNum) {	
		double cellData = 0;
		try {
			//String  cellData = sheet.getRow(rowNum).getCell(colNum).toString();
			 cellData = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getNumericCellValue();		
			 wb.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;
	}
	
}
