package Tasks4618;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class ExcellOperations 
{
@Test
 public void Excell() throws IOException, Exception
 {
	 
	
	 
	System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://accounts.google.com");
	 File f =new File("C:\\Users\\cubic\\Desktop\\read.xlsx");
	 FileInputStream fis=new FileInputStream(f);
     XSSFWorkbook wb =new XSSFWorkbook(fis);
     XSSFSheet ws=wb.getSheet("Sheet1");
     try
     {
	 for(int i=1;i<=ws.getLastRowNum();i++)
	 {
		 
		
		 for(int j=0;j<=1;j++)
		 {
		 XSSFCell xc=ws.getRow(i).getCell(j);
		 
		 if(xc.getCellType()==XSSFCell.CELL_TYPE_STRING)
		 {
			  
			    
			    if(ws.getRow(i).getCell(j)==ws.getRow(i).getCell(0))
			    {
			    	
		        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(xc.getStringCellValue());
		        
		        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
			    }
			    else
			    {
			    	
		        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(xc.getStringCellValue());
	            driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
		        System.out.println(driver.getTitle());
			    }
			    
				String Actual=driver.getTitle();
	         	String Exp="Sign in - Google Accounts";
	         	if(Actual.equals(Exp))
	         	{
	     	
	     		Thread.sleep(2000);
	     		ws.getRow(1).createCell(2).setCellValue("pass");
	     		FileOutputStream fos=new FileOutputStream(f);
	     		wb.write(fos);
	            fos.close();
	         	}
	         	else
	         	{
		     		Thread.sleep(2000);
		     	
		     		ws.getRow(1).createCell(2).setCellValue("fail");
		     		FileOutputStream fos=new FileOutputStream(f);
		     		wb.write(fos);
		            fos.close();
		         	}
	         
		 }
		   else
		      {
	             double d=	xc.getNumericCellValue();
	             String s=String.valueOf((int)d);
	             System.out.println(s);
	             if(ws.getRow(i).getCell(j)==ws.getRow(i).getCell(0))
				    {
	             driver.findElement(By.name("//*[@id=\"identifierId\"]")).sendKeys(s);
			     driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
				    }
	             else    
				    {
	             driver.findElement(By.name("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(s);
	             driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
	             System.out.println(driver.getTitle());
				    }
	             
	         	String Actual=driver.getTitle();
	         	String Exp="Sign in - Google Accounts";
	         	if(Actual.equals(Exp))
	         	{
	     	
	     		ws.getRow(1).createCell(2).setCellValue("pass");
	     		FileOutputStream fos=new FileOutputStream(f);
	     		wb.write(fos);
	            fos.close();
	         	}
	         	else
	         	{
		     	  ws.getRow(1).createCell(2).setCellValue("fail");
		     	  FileOutputStream fos=new FileOutputStream(f);
		     	  wb.write(fos);
		          fos.close();
		        }
	         	
		      }
		 }
		 System.out.println("143+++");
		 driver.get("https://accounts.google.com");
	 }

	 
     }
     catch(Exception E)
     
     {
    	 System.err.println(E);
    	 driver.close();
     }
    		 
    	
 }
}
