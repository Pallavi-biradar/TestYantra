package san;

import org.testng.annotations.Test;

public class TC_001 extends BaseClass {
	
	@Test
	public void order() throws InterruptedException {
		
		driver.get("https://demo.actitime.com/login.do");
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.getUsernameTextField().sendKeys("admin");
		loginPage.getPasswordTextField().sendKeys("manager");
		loginPage.getLoginButton().click();
	}

}
