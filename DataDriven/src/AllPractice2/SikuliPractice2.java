package AllPractice2;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.annotations.Test;

public class SikuliPractice2
{
	
	
	   @Test
       public void sikuli() throws Exception
	   {
	      System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver(); 
	      driver.get("https://www.facebook.com/");
	      driver.manage().window().maximize();
	      Screen s =new Screen();
	      Pattern p= new Pattern("D:\\Roja2\\loginfacebk.PNG");
	      s.click(p);
	      //ScreenImage img =s.capture();
	      //ImageIO.write(img.getImage(),"PNG",new File("D:\\Roja2\\loginfacebk2.PNG"));
	      Location l=s.getCenter();
	      s.wheel(l, Button.WHEEL_DOWN, 150);
	      
	      
	      
	   }
}
