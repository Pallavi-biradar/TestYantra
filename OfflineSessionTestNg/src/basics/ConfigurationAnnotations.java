package basics;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@Test
	public void test() {
		Reporter.log("from test case",true);
	}
	
	@Test
	public void abcd() {
		Reporter.log("from test abcd",true);
	}
	
	@BeforeSuite(alwaysRun=true)
	public void forDataBaseConnection() {
		Reporter.log("from before suite",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("from before test",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("from before classs",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("from before Method",true);
	}
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("from after suite",true);
	}
	
	@AfterTest
	public void afterTest() {
		Reporter.log("from after test",true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("from after classs",true);
	}
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("from after Method",true);
	}
}
