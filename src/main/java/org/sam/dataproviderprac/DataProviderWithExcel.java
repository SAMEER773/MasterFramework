package org.sam.dataproviderprac;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	
	@Test(dataProvider = "excel")
	public void test1(String username ,String password , String fname , String lname) { //if there is a less number of data is excel we go by this approach
		System.out.println();
	}
	
	@Test(dataProvider = "excel1")
	public void test2(Map<String,String>map) {
		System.out.println(map);
	}
	
	
	@DataProvider(name = "excel")
	public Object[][] readDataFromExcel() throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/ExcelSheet/testData.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbbok = new XSSFWorkbook(file);
		XSSFSheet sheet = workbbok.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[lastRowNum][lastCellNum];
		
		for(int i=1; i<=lastRowNum; i++) {
			
			for (int j=0; j<lastCellNum; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
		
	}
	
	@DataProvider(name = "excel1")
	public Object[] readDataFromExcel1() throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/ExcelSheet/testData.xlsx");
		
		XSSFWorkbook workbbok = new XSSFWorkbook(file);
		XSSFSheet sheet = workbbok.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		Object[] data=new Object[lastRowNum];
		Map<String , String> map;
		
		for(int i=1; i<=lastRowNum; i++) {
			
			map=new HashMap<String, String>();
			
			for (int j=0; j<lastCellNum; j++) {
				
				String key=sheet.getRow(0).getCell(j).getStringCellValue();
				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-1]=map;
			}
			
		}
		return data;
	}
		

}
