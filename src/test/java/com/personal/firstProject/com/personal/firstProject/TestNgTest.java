package com.personal.firstProject.com.personal.firstProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNgTest implements ITestListener{
	String fileLocation="E:\\Java-Selenium\\UserData.xlsx";
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	Map<Object,Object> dataMap;
	Object[][] obj;

	@Test(dataProvider ="testdata")
	public void dataHandling(Map<Object,Object> map) {

		System.out.println("User data is");
		System.out.println(map.get("Username"));
		System.out.println(map.get("User ID"));
		System.out.println(map.get("Area"));
		System.out.println(map.get("PhoneNum"));
		System.out.println("----------------------");
		
	}
	
	/*@Test(priority=-1)
	public void borderexample()
	{
		System.out.println("-1 order is executed");
	}
    
   @Test(priority=0)
	public void borderexample1()
	{
		System.out.println("0 order is executed");
	}
   
   @Test(invocationCount=10)
	public void borderexample2()
	{
		System.out.println("1 order is executed");
	}
   
   @Test(priority=2)
	public void borderexample3()
	{
		System.out.println("2 order is executed");
	}*/

	@DataProvider(name="testdata")
	public Object[][] getUserData() throws Exception
	{
		fis = new FileInputStream(fileLocation);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);
		workbook.close();
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		obj = new Object[rowCount][1]; 

		for(int i=0; i <rowCount; i++)
		{
			dataMap = new HashMap<Object,Object>();
			for(int j=0; j<colCount; j++)
			{
				dataMap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
			}
			obj[i][0]= dataMap;

		}

		return obj;

	}
    @AfterMethod
	public void teardown(ITestResult result)
	{
		if(ITestResult.SUCCESS==result.getStatus())
		{
			System.out.println("Test is success");
		}
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


}
