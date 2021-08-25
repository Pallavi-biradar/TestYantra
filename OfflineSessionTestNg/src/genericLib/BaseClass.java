package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import elementRepository.HomePage;
import elementRepository.LoginPage;

public class BaseClass {

	
	public static WebDriver driver ;
	public HomePage homePage ;
	
	@BeforeClass
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
	}
	
	@BeforeMethod
	public void loginToApp(@Optional("admin") String username, @Optional("manager") String password) {
		LoginPage loginPage = new LoginPage(driver);
		homePage = loginPage.login(username, password);
	}
	
	@AfterMethod
	public void logoutOfApp() {
		homePage.logOut();
	}
	
	@AfterClass
	public void closeTheSession() {
		driver.quit();
	}
}