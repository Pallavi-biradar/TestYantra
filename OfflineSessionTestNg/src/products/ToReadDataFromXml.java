package products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToReadDataFromXml {

	public WebDriver driver;
	
	@Parameters({"browserName","url","username","password"})
	@Test
	public void readData(String bName,@Optional("https://demo.actitime.com/login.do") String urldata, 
			@Optional("trainee")String uname, 
			@Optional("trainee")String pname) {
		
		if(bName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		driver.get(urldata);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.name("pwd")).sendKeys(pname);
	}
}
