package takingScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	
	public static WebDriver driver ;
	
	@BeforeMethod(alwaysRun=true)
	public void loginToApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod(alwaysRun=true)
	public void logoutOfApp(ITestResult result) {
		if(result.getStatus()==2) {
			TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
			File tempFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./errorshots/"+result.getMethod().getMethodName()+".png");
			try {
				FileUtils.copyFile(tempFile, destFile);
			} catch (IOException e) {
 
			}
		}
		
	}
	
	@AfterClass(alwaysRun=true)
	public void closeTheSession() {
		driver.quit();
	}
}
