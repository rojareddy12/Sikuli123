package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.CrmBase;

public class LoginPage extends CrmBase

{
	
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement password;

	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement ContinueBtn;
	

	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement Loginbtn;
	
	//String actualtitle=driver.getTitle();
	
	
	public LoginPage() throws Exception
	{
		//Thread.sleep(5000);
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public String ValidationTitle()
	{
		
		return driver.getTitle();
	}
	
	public HomePage  Login(String EmailValue,String pwdValue) throws Exception
	{
		
		//Thread.sleep(5000);
		email.sendKeys(EmailValue);
		ContinueBtn.click();
		password.sendKeys(pwdValue);
		
		Loginbtn.click();
		return new HomePage();
		
	}
	
}
