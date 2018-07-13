package AllPractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class seleniumPrac
{
@Test
	public void method() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	  //driver.findElement(By.xpath("/html/body")).click();
		/*Screen s=new Screen();
		Pattern p = new Pattern ("img path/path").similar( (float) 0.7);
		if (s.exists(p , 7) != null) {
		Match match = s.getLastMatch();;
		//s.click();		
		Thread.sleep(1000);
		driver.close();*/
	/*	
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-wishlist\"]/span[2]")).click();
		
		
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		//exe.executeScript("window.scrollBy(0,5000)");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/table/tbody/tr/td[3]/ul/li[1]/a"));
		exe.executeScript("arguments[0].scrollIntoView(true);", ele);
		System.out.println(ele.getText());
		Thread.sleep(4000);
		//driver.close();
*/		
		
	
		  // Go to URL
	      driver.get("http://www.facebook.com/");

	      // Maximize Window
	      driver.manage().window().maximize();

	      // get the reference for Web Element Email
	      WebElement userName = driver.findElement(By.id("email"));

	      // Handling Multiple Actions
	      Actions act = new Actions(driver);
	      Action seriesOfActions = act.moveToElement(userName).click().keyDown(Keys.SHIFT)
	            .sendKeys("hello").keyUp(Keys.SHIFT).doubleClick().contextClick().build();
	      seriesOfActions.perform();

	      // Closing current driver window
	      // 
	      driver.close();
	      
	      
	      /*TakesScreenshot ts=(TakesScreenshot)driver;
	      File fs =ts.getScreenshotAs(OutputType.FILE);
	     
	      File fs1=new File("D:\\Roja\\Images\\NewFile.PNG");
	      FileUtils.copyFile(fs, fs1);*/
		  
	}
	
	
}
