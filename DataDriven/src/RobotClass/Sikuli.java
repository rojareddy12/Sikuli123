package RobotClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli 
{
	@Test
	public void naukri() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Screen s=new Screen();
	    Pattern p =new Pattern("‪‪D:\\Roja\\Images\\mynthra.PNG");
	    Thread.sleep(1000);
	    s.click(p);
		
	}

}

