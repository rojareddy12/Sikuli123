package comcrm.qa.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer
{

	int count=0;
	int RetryLimit=3;
	
	public boolean retry(ITestResult result) {
	
		if(count<RetryLimit)
		{
			count++;
			return true;
		
		}
		return false;
	}

}
