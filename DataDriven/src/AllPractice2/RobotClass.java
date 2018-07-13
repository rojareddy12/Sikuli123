package AllPractice2;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RobotClass
{

	
	 @Test
	   public void naukri() throws Exception
		{
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id=\"input_resumeParser\"]")).click();
		Robot robo=new Robot();
	    //StringSelection str=new StringSelection("C:\\Users\\cubic\\Downloads\\Online Examination System Abstract (1).docx");
		//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(1000);
		//robo.mouseWheel(1000);
/*		robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_C);
	    robo.keyPress(KeyEvent.VK_CONTROL);
	    robo.keyPress(KeyEvent.VK_V);
	    robo.keyPress(KeyEvent.VK_ENTER);
	    robo.keyRelease(KeyEvent.VK_ENTER);*/
		
	/*	robo.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		driver.close();
		*/
		
	//	Reporter.log("roja started");
		
		
		
		}
}
