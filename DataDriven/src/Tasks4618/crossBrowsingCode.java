package Tasks4618;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowsingCode {
	
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{
	
		if(browser.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.firefox.marionette", "D:\\Roja\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
	
		else if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver","‪D:\\Roja2\\geckodriver.exe");
	
			driver = new ChromeDriver();
		}
				
		else{
			throw new Exception("Browser is not correct");
		}
	
		
	}
	
	@Parameters({"username","password"})
	@Test
	public void testParameterWithXML(String user,String pwd) throws InterruptedException{
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.name("identifier")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	}

}
