package listener1;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neOStoxBase.Base;
import neOStoxUtility.UtilityNew;




public class Listener extends Base implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("testcase "+result.getName()+ "is failed", true);
		try {
			UtilityNew.screenshot(driver, result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
	
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("tc is passed", true);
	}
	
	
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("tc is skipped", true);

	}	

}
