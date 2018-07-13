import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTaskagain 
{
	@Parameters({"keyf","valuef","url","username","password"})
	@Test(priority=1)
	public void parameter(String keyf ,String valuef ,String url,String user,String pwd) throws InterruptedException
	{
		   System.setProperty(keyf,valuef);
		   WebDriver driver = new FirefoxDriver();
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
