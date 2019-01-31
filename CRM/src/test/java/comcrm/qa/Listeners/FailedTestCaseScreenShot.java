package comcrm.qa.Listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.crm.qa.utilities.CommonUtilities;

public class FailedTestCaseScreenShot implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
	
		try {
			
			//System.out.println("Bujji1");
			CommonUtilities.TakesScreenShotmethod(result.getMethod().getMethodName());
			//System.out.println("Bujji2");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		//
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
