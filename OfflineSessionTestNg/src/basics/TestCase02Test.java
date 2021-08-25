package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase02Test {

	@DataProvider(name="loginCredentials")
	public String[][] sendData() {
		String [][] sarr = {
				             {"https://demo.actitime.com","admin","manager"},
				             {"https://demo.actitime.com","trainee","trainee"}
				            };
		return sarr;
	}

	@Test(dataProvider="loginCredentials")
	public void demo(String url,String username,String password) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
}
