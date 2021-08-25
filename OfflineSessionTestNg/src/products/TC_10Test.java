package products;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import lsit.ITestListenerImplentation;

@Listeners(lsit.ITestListenerImplentation.class)
public class TC_10Test {

	@Test
	public void createAccount() {
		System.out.println("from demo method");
//		ITestListenerImplentation.driver.findElement(By.xpath("//div[text()='Reports']")).click();
		int a = 100/0;
	}
}
