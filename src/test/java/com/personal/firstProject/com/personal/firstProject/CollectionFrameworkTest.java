package com.personal.firstProject.com.personal.firstProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CollectionFrameworkTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("E:\\Java-Selenium\\TestData\\UserData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheetAt(0);
		int totalrows = sheet.getLastRowNum()+1;
		int totalcols = sheet.getRow(0).getLastCellNum();
		Map<Object, Object> map = new HashMap<Object,Object>();
		Object[][] obj = new Object[totalrows][1];
			
		for(int i=1; i <totalrows; i++)
		{
			for(int j=0; j<totalcols; j++)
			{
				String keyCell = sheet.getRow(0).getCell(j).getStringCellValue();
				//System.out.println(sheet.getRow(i).getCell(j).getCellType());
				if((sheet.getRow(i).getCell(j).getCellType())== CellType.STRING)
				{
					 String valueCell = sheet.getRow(i).getCell(j).getStringCellValue();
 					//System.out.println("Cell data is"+ sheet.getRow(i).getCell(j).getStringCellValue());
 					map.put(keyCell, valueCell);
				}
				else
				{
					double valueCell = sheet.getRow(i).getCell(j).getNumericCellValue();
					//System.out.println("Cell data is"+ sheet.getRow(i).getCell(j).getNumericCellValue());
					map.put(keyCell, valueCell);
				}
			}
			obj[i][0]= map;
			System.out.println(obj[i][0]);
		}
		
	

	}

}
