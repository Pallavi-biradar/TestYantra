package takingScreenshot;

import org.testng.annotations.Test;

public class TC_03Test extends BaseClass {
	
	@Test
	public void cricbuzz() {
		
		driver.get("https://www.cricbuzz.com/");
		int i = 100/0;
	}

}
