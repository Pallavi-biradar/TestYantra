package lsit;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import takingScreenshot.BaseClass;

public class ITestListenerImplentation implements ITestListener {
	
	@Override		
	public void onFinish(ITestContext arg0) {		// after class			
		
	}		

	@Override		
	public void onStart(ITestContext arg0) {		 // before class			
		
	}		

	@Override		
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		
	}		

	@Override		
	public void onTestFailure(ITestResult arg0) {					
		Reporter.log("from on onTestFailure method",true);
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/"+arg0.getMethod().getMethodName()+".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {

		}
	}		

	@Override		
	public void onTestSkipped(ITestResult arg0) {					
		
	}		

	@Override		
	public void onTestStart(ITestResult arg0) {		 // beofre method			
		
	}		

	@Override		
	public void onTestSuccess(ITestResult arg0) {	// after method				
		
	}	
}
