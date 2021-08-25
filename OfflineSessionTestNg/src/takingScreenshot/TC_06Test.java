package takingScreenshot;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(lsit.ITestListenerImplentation.class)
public class TC_06Test extends BaseClass {
	
	int count = 0 ;
	
	@Test(retryAnalyzer=lsit.IRetryAnalyzerImplementation.class)
	public void tinder1() {
		driver.get("https://www.tinder.com/");	
	}

}
