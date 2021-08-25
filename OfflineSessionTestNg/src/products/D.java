package products;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class D {

	@Test
	public void test1() {
		Reporter.log("from test 1",true);
	}
	
	@Test
	public void test2() {
		Reporter.log("from test 2",true);
	}
	
	@Test(dependsOnMethods="test5")
	public void test3() {
		Reporter.log("from test 3",true);
	}
	
	@Test
	public void test4() {
		Reporter.log("from test 4",true);
	}
	
	@Test
	public void test5() {
		Reporter.log("from test 5",true);
	}
}
