import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class jqueryTask 
{
	@Test
	 public void Draggable()
	 {
		System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();;
	  
	    WebElement elm=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
	    Actions action =new Actions(driver);
	    action.dragAndDrop(elm,driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).build().perform();
	    
	    
		
	 }

}
