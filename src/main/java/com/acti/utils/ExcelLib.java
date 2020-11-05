package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {
	static XSSFWorkbook wb;

	public ExcelLib(String xlpath) {
		try {
			File file = new File(xlpath);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int getRowCount(int sheetnum) {
		return wb.getSheetAt(sheetnum).getLastRowNum() + 1;
	}

	public static String getdata(int sheetnum, int row, int col) {
		return wb.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
	}
}
