package bestbuy.oma;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resource.BaseUtil;

public class Listener extends BaseUtil implements ITestListener {
	
	ExtentReports extent = getReportObject();
	ExtentTest test;
		
	@Override
	public void onTestStart(ITestResult result) {
		String testcaseName=result.getMethod().getMethodName();
		test = extent.createTest(testcaseName) ;		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "TEST IS PASSED");		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		String testcaseName=result.getMethod().getMethodName();
		try {
			//driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());			
			String strFilePath = screenShotCapture(testcaseName);	
			test.addScreenCaptureFromPath(strFilePath, testcaseName);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}



	@Override
	public void onTestSkipped(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
	extent.flush();
		
	}

}
