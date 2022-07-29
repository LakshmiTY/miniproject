package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	private static void writedata() throws IOException {

		File f = new File("D:\\Project\\Data driven\\Datasheet.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("data").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("data").getRow(0).createCell(1).setCellValue("password");
//		wb.getSheet("data").createRow(0).createCell(0).setCellValue("mobile");
//		wb.getSheet("data").getRow(1).createCell(1).setCellValue("9985366885");
		wb.getSheet("data").createRow(1).createCell(0).setCellValue("lakshmi");
		wb.getSheet("data").getRow(2).createCell(2).setCellValue("lakshmi@11234");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("write sucessfully");
		wb.close();

	}
	
	
	
	public static void main(String[] args) throws IOException {
		writedata();
	}
	
	
}
