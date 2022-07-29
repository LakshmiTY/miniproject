package com.Data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	private static void read_Particular_Data() throws IOException {
		File f = new File("C:\\Users\\91778\\eclipse-workspace\\Mavennew\\Excel\\Datasheet.xlsx");

		FileInputStream fis = new FileInputStream(f); // here read so get data from input

		Workbook wb = new XSSFWorkbook(fis); // here workbook have to closed because it is private

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		Cell cell = row.getCell(0);

		CellType celltype = cell.getCellType();

		if (celltype.equals(celltype.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (celltype.equals(celltype.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			System.out.println(data);

		}
wb.close();
	}

	public static void main(String[] args) throws IOException {
		read_Particular_Data();

	}

}
