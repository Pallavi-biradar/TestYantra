package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test01 {    //testng class
	
	/*@Test
	public void sample1() {
		Reporter.log("from sample1",true);
	}*/
	
	@Test(timeOut=20000)
	public void Ample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Thread.sleep(2000);
		driver.close();
		Reporter.log("from ample",true);
//		int a = 100/0;
		
	}
	
	/*@Test(dependsOnMethods= {"sample1"})
	public void demo() {
		Reporter.log("from demo",true);
	}
	
	@Test(dependsOnMethods="sample1")
	public void demo1() {
		Reporter.log("from demo1",true);
	}*/
	
	/*@Test()
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		Thread.sleep(2000);
		driver.close();
		Reporter.log("from demo",true);
	}*/
	
	
	/*
	@Test
	public void classSample() {
		Reporter.log("from abcd",true);
	}*/
}
