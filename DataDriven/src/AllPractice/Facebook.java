package AllPractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class Facebook {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin");
		driver.findElement(By.name("unm")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin321");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/form/div/div[3]/button")).click();
		String title=driver.getTitle();
		System.out.println(title);
	
	}
	}
		