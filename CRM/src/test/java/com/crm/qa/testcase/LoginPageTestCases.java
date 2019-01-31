package com.crm.qa.testcase;

 import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.qa.base.CrmBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utilities.CommonUtilities;

import comcrm.qa.Listeners.FailedTestCaseScreenShot;


@Listeners(FailedTestCaseScreenShot.class)
public class LoginPageTestCases extends CrmBase
{
	
	
	  public static LoginPage lgnpageobj;
	  public LoginPageTestCases()
	  {
		super();
	  }
    
	
	  @BeforeMethod 
	  public void setup() throws Exception
	  { 
		 CrmBase.browserInitialization();
	     lgnpageobj=new LoginPage(); 
	  }
	  
	  
	  @DataProvider
	  public Object[][] getTestData() throws InvalidFormatException, IOException
	  {
		  
		  
		  Object testdata[][]=CommonUtilities.getDatafromExcel("C:\\Users\\Madhusudana Reddy\\Desktop\\crmtestdata.xlsx","LoginPage");
		  //System.out.println(testdata[0][0]);
		  return testdata;
		  
	  }
	  
	//@Test(retryAnalyzer=comcrm.qa.Listeners.RetryAnalyser.class) 
	
	  @Test(dataProvider="getTestData") 
	  public void Login(String Usename,String  pwd) throws Exception 
	  { 
	 //  CommonUtilities.WriteStatusinExcel("C:\\Users\\Madhusudana Reddy\\Desktop\\crmtestdata.xlsx" ,"LoginPage","pass");
		  Thread.sleep(2000);
		  
	   lgnpageobj.Login("8897500930","roja@123"); 
	   System.out.println("rojareddypyata");
	   Thread.sleep(2000);
	   }
	 	 
	  
	  
	  

	  @AfterMethod
	  public void Quit() throws InterruptedException
	  {
		  Thread.sleep(5000);
		//  driver.quit();
	  }
	/*
	 * public static void main(String[] args) throws Exception { CrmBase crm=new
	 * CrmBase(); crm.browserInitialization();
	 * 
	 * lgnpageobj=new LoginPage(); //System.out.println("minnu reddy123");
	 * lgnpageobj.Login(prop.getProperty("usename"), prop.getProperty("pwd"));
	 * Thread.sleep(2000);
	 * 
	 * }
	 */	
	/*
	 * public static void main(String[] args) { System.out.println("Roja"); }
	 */
}