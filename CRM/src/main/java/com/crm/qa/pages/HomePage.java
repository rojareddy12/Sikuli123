package com.crm.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.CrmBase;

public class HomePage extends CrmBase
{

	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]/span[1]")
	WebElement ShopBy;
	
	@FindBy(xpath="//span[text()='TV, Appliances, Electronics']")
	
	WebElement TvApp;
	
	@FindBy(xpath="//a[text()='Televisions']")
	WebElement clickontv;
	
	@FindBy(xpath="//img[@onload='window.uet && uet.call && uet(\"cf\");' and @alt='Onida 40 FHD Smart']")
	WebElement onidatvbook;
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchbutton;
	
	
	@FindBy(xpath="//*[@id=\"buy-now-button\"]")
	 WebElement buynow;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	Actions action =new Actions(driver);

	public void clickonShoby() throws Exception
	{
		//Thread.sleep(5000);
		action.moveToElement(ShopBy).click().build().perform();
		
		//ShopBy.click();
	}
	
	public void clickonTvApp()
	{
		action.moveToElement(TvApp).build().perform();
	}
	
	public void clickontvlink()
	{
		//action.moveToElement(clickontv).click().build().perform();
		clickontv.click();
	}
	
	public void Serachbutton(String Tvs)
	{
		searchbutton.sendKeys(Tvs);
	}
	
	public void clickononida() throws Exception
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", onidatvbook);
		Thread.sleep(5000);
		onidatvbook.click();
	}
	
	public void switchingtowindow() throws Exception
	{
		/*
		 * Set s=driver.getWindowHandles(); System.out.println( s.size());
		 * 
		 * Iterator i=s.iterator(); i.next(); i.next();
		 */   
		
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		       		          }
		       }
	
		   
		   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", buynow);
			Thread.sleep(5000);
			buynow.click(); 
}
}
