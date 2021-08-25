package products;

import org.testng.Reporter;
import org.testng.annotations.Test;
/***
 * 
 * @author Sudeshna
 *
 */
public class TC_01Test {

	@Test
	public void createProduct() {
		
		//pre conditions
		
		
		//Step1:navigate to application
//		driver.get();
		boolean bool = true;
		if(bool) {
			Reporter.log("login page is display",true);
		} else {
			Reporter.log("login page is not display",true);
		}
		
		//Step2:login to application
		
		
	}
}
