package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;

public class TC_01Test extends BaseClass{

	@Test
	public void createReports() {
		homePage.getReportsLink().click();
	}
	
}
