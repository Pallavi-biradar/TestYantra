package takingScreenshot;

import org.testng.annotations.Test;

public class TC_01Test extends BaseClass {
	
	@Test
	public void swiggy() {
		driver.get("https://www.swiggy.com/");
	}

}
