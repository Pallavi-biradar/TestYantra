package lsit;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerImplementation implements IRetryAnalyzer {

	public static int count = 0;
	int retry = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<retry) {
			System.out.println("Retrying for "+count+" time");
			count++;
			return true;
		}
		return false;
	}

}
