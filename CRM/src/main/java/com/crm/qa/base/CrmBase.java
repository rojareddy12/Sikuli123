package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.utilities.CommonUtilities;

public class CrmBase 
{
	public static WebDriver driver;
	public static Properties prop;

	public CrmBase()
	{
		try
		{
	    prop=new Properties();
	    FileInputStream fis =new FileInputStream("C:\\STS\\CRM\\src\\main\\java\\com\\crm\\qa\\configuration\\crm.properties");
		prop.load(fis);	 

	    }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
		System.out.println("Property file error");
	}
	}
	
	
	public static void browserInitialization()
	{
		//String BrowserName=prop.getProperty("broswer");
		System.setProperty("webdriver.chrome.driver", "E:\\STS Ofz\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("url"));
	    
		 
	}
	
	/*
	 * public static void main(String[] args) { CrmBase crm =new CrmBase();
	 * crm.browserInitialization(); }
	 */	 
}
