package basics;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_01Test extends BaseClass{

	@Test
	public void createAccount() {
		driver.findElement(By.xpath("//div[text()='Reports']")).click();
	}
}
