import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGPractice 
{

	@Test
	public void TestNG()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
}
