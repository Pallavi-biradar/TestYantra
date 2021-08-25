package products;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {

	@DataProvider(parallel=true)
	public String[][] inputData() {
		return new String[][] {
								{"https://www.youtube.com/","password"},
								{"https://www.selenium.dev/","manager"},
								{"https://github.com/","trainee"}
							};
	}
	
	@Test(dataProvider="inputData",dependsOnMethods= {"demo"})
	public void sample(String a,String b) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(a);
		driver.close();
	}
	
	@Test
	public void demo() {
		int a = 100/0;
	}
	
	
}
