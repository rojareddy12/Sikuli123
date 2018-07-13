package Tasks4618;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesTask
{
    @Test
	public void frame() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Roja\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///D:/Roja/framestask/HtmlTask1/WebContent/frames.html");
	List<WebElement> list=driver.findElements(By.tagName("frame"));
	System.out.println("No of Frames: "+list.size());
	//driver.switchTo().frame(2);
	
	//driver.findElement(By.xpath("/html/body/form/input[3]")).click();

    int i=0;
	while(i<list.size())
	 {
		
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
	     driver.switchTo().frame(i);
	     try
			{
	 	 driver.findElement(By.xpath("//html/body/form/input[3]")).click();
	 	
		 if(driver.findElement(By.xpath("//html/body/form/input[3]")).isSelected())
	       {
               System.out.println("The element is found in : " + i+ " Frame");
	       }
          else	    
           {
		        System.out.println("The element is not  found in : " + i + " Frame");
		   }
		 }
		 catch(Exception e)
	     {
			 System.out.println("Element is not found in :  " + i + " Frame");
		 }
		
		i++;
     
	  }
	

	 driver.switchTo().defaultContent();
	
	System.out.println("Moved to the first frame");
	Thread.sleep(1000);

}
	
}
