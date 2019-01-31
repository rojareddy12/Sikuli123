package com.crm.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.CrmBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTestCases extends CrmBase
{
	public static LoginPage lgnpageobj;
	
	public static HomePage hmpageonj;
	
	
	  @BeforeMethod 
	  public void setup() throws Exception
	  { 
		 CrmBase.browserInitialization();
	     lgnpageobj=new LoginPage(); 
	     lgnpageobj.Login("8897500930","roja@123");
	     hmpageonj=new HomePage();
	  }
	  @Test
	  public void callingallthemethods() throws Exception
	  {
		hmpageonj.clickonShoby();
		//hmpageonj.clickonTvApp();
		hmpageonj.clickontvlink();
		  hmpageonj.clickononida();
		  hmpageonj.switchingtowindow();
		 // hmpageonj.Serachbutton("onida Tv");
	  }
	
	  @AfterMethod()
	  public void Quit() throws Exception
	  {
		Thread.sleep(5000);
		
	  }
	  
}
