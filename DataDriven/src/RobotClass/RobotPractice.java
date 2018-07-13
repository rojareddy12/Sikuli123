package RobotClass;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class RobotPractice 
{

	   @Test
	   public void naukri() throws Exception
		{
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//*[@id=\"input_resumeParser\"]")).click();
	    Robot robo=new Robot();
	    StringSelection str=new StringSelection("C:\\Users\\cubic\\Downloads\\Online Examination System Abstract (1).docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_C);
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
         
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_C);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        
		}

}
