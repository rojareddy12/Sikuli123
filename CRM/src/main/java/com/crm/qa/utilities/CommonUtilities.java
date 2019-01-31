package com.crm.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.CrmBase;

public class CommonUtilities extends CrmBase
{
   
	//public static  long Implicit_Wait = 20;
	//public static long Implicit_Wait=20;
	
	
	public static  void TakesScreenShotmethod(String Name) throws IOException
	{
		try
		{
		TakesScreenshot sourceFile=(TakesScreenshot)driver;
		File Fs=sourceFile.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(Fs, new File("C:\\STS\\FailedTestscrShots\\"+Name+".png"));
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		//System.out.println(Name);
	}
	
	
	public static Object[][] getDatafromExcel(String FilePath,String SheetName) throws InvalidFormatException, IOException
	{
		File fs =new File(FilePath);
		FileInputStream fis = null;
		try 
		{
			fis =new FileInputStream(fs);
		}
	    catch(Exception e)
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
		
	    Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(SheetName);
		Object[][] testdata=new Object[(sheet.getLastRowNum())][sheet.getRow(0).getLastCellNum()];
		for (int i = 1; i < sheet.getLastRowNum(); i++) 
		{
		for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) 
		{
					   
		   testdata[i][j]=sheet.getRow(i).getCell(j).toString();
	
		   System.out.println(testdata[i][j]);
		}
				
		}
		  

		return testdata;
		
	}
	
	public static void WriteStatusinExcel(String FilePath,String SheetName,String Status) throws InvalidFormatException, IOException
	{
		File fs =new File(FilePath);
		FileInputStream fis = null;
		try 
		{
			fis =new FileInputStream(fs);
		}
	    catch(Exception e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
		Workbook wb=WorkbookFactory.create(fis);
	    Sheet sheet=wb.getSheet(SheetName);
		// Object[][] testdata=new Object[(sheet.getLastRowNum())][sheet.getRow(0).getLastCellNum()];
		FileOutputStream  fos=new FileOutputStream(fs);
		sheet.getRow(0).createCell(2).setCellValue(Status); 
		wb.write(fos);
				
				
	}
}
