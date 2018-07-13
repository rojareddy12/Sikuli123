import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTask {
	
	@Parameters({"keyC","valueC","url","username","password"})
	@Test(priority=1)
    public void login(String  keyC ,String valueC,String url,String user,String pwd) throws InterruptedException
      {
	
	       System.setProperty(keyC,valueC);
           WebDriver driver = new ChromeDriver();
           driver.get(url);
           driver.findElement(By.name("identifier")).sendKeys(user);
           driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
           Thread.sleep(1000);
           driver.findElement(By.name("password")).sendKeys(pwd);
           driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
           Thread.sleep(2000);
           driver.close();
		
		
       }

	
}
