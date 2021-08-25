package lsit;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListenerImplentation2 implements ITestListener {

	public static WebDriver driver;
	
	@Override		
	public void onFinish(ITestContext arg0) {		// after class			
		Reporter.log("from on finish method",true);
		driver.close();
	}		

	@Override		
	public void onStart(ITestContext arg0) {		 // before class			
		Reporter.log("from on start method",true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}		

	@Override		
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
		Reporter.log("from on onTestFailedButWithinSuccessPercentage method",true);
	}		

	@Override		
	public void onTestFailure(ITestResult arg0) {					
		Reporter.log("from on onTestFailure method",true);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/"+arg0.getMethod().getMethodName()+".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {

		}
	}		

	@Override		
	public void onTestSkipped(ITestResult arg0) {					
		Reporter.log("from on onTestSkipped method",true);
	}		

	@Override		
	public void onTestStart(ITestResult arg0) {		 // beofre method			
		Reporter.log("from on onTestStart method",true);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}		

	@Override		
	public void onTestSuccess(ITestResult arg0) {	// after method				
		Reporter.log("from on onTestSuccess method",true);
		driver.findElement(By.id("logoutLink")).click();
	}	
}
