
package Tasks4618;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class ReporterLog 
{
	@Test
	public void pattern() throws InterruptedException, Exception
	{
		/*System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Screen s=new Screen();*/
       // Thread.sleep(1000);
	   /* Pattern p =new Pattern("‪‪‪‪D:\\Roja\\Images\\blockmntra.PNG");
        s.click(p);*/
		
	  /*s.find("D:\\Roja\\Images\\blockmntra.PNG");
		s.click();
        ScreenImage Im=s.capture();
        ImageIO.write(Im.getImage(), "png", new File("D:\\Roja\\Images\\blockmntra.PNG"));
        Location l=s.getCenter();
        s.wheel(l, Button.WHEEL_DOWN, 150);*/
	
		/*App.open("Notepad.exe");
		s.click();
		s.type("wyerytwdywqgdhganbsdghuiqwhdueiwd");*/
		//Reporter.log("Button Clicked");
       // driver.close();
		
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2
		System.out.println(20);
	
	
	}
	
}
