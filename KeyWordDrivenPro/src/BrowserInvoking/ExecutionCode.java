package BrowserInvoking;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;


public class ExecutionCode extends excelretrivecode{
	



@Test
public  void m1() throws IOException 
	{
	XSSFSheet xs=excelretrivecode.excelcode("‪C:\\Users\\cubic\\Desktop\\fbkeyword.xlsx", "Sheet1");
	for(int i=0;i<=this.xs.getLastRowNum();i++)
	{
        String st=excelretrivecode.excelcode2(i, 0);
		if (st.equalsIgnoreCase("brosercode"))
		{
			Browser.brosercode();
		}
		else	if (st.equalsIgnoreCase("fbappInvoke"))
		{
			Browser.fbappInvoke();
		}
		else if (st.equalsIgnoreCase("fbemail"))
		{
			Browser.fbemail();
		}
		else if(st.equalsIgnoreCase("fbpass"))
		{
			Browser.fbpass();
		}
	 }
 }
}
