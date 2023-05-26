package org.sam.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.sam.constant.FrameworkConstant;

public class ExcelUtility {
	static FileInputStream file;
	static XSSFWorkbook workbook;

	public static Object[] excelUtility() {

		try {
			file = new FileInputStream(FrameworkConstant.excelFilePath());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {

			e.printStackTrace();
		}

		XSSFSheet sheet = workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();

		Object[] obj = new Object[lastRowNum];
		Map<String, String> map;

		for (int i = 1; i <= lastRowNum; i++) {
			map = new HashMap<String, String>();
			for (int j = 0; j < lastCellNum; j++) {

				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				obj[i - 1] = map;
			}

		}
		return obj;
	}

}
