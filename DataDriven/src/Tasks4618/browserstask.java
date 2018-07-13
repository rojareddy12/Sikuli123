package Tasks4618;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class browserstask 
{
    @Test(priority=1)
	public void browser1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		try
		{
		//driver.findElement(By.xpath("//*[@id=\"nav-your-amazon\"]")).click();
        String actual="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String expe=driver.getTitle();
		System.out.println(expe);
		if (actual.equals(expe))
		{
			System.out.println("Element found in Amazon App");
		}
		else
		{
			System.out.println("Element Not found in Amazon App");
		}
		
		}
		catch(Exception e)
	
		{
			System.out.println("there is no element in this Amazon App");
		}
		
		Thread.sleep(1000);
		driver.close();
	}
    
	
	@Test(priority=1)
    public void browser2() throws InterruptedException
    {
		System.setProperty("webdriver.firefox.marionette","‪D:\\Roja2\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		try
		{
	
		String actual="Amazon Sign n";
		String expe=driver.getTitle();
		if (actual.equals(expe))
		{
			System.out.println("Element found in Facebook App");
		}
		else
		{
			System.out.println("Element is  Not found in Facebook App");
		}
		
		}
		catch(Exception e)
	
		{
			System.out.println("Finding element is not present in facebook app");
		}
		
		Thread.sleep(1000);
		driver.close();
    }
	
	
}
