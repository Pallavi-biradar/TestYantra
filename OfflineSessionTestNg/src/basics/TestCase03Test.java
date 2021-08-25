package basics;

import org.testng.annotations.Test;

public class TestCase03Test {

	@Test(dataProviderClass=TestCase02Test.class,dataProvider="loginCredentials")
	public void sample(String a,String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
