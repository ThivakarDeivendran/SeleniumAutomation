package LearningTestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserClass implements IRetryAnalyzer{
	private int count =0;
	private static final int maxCount =3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(count <maxCount) {
			count++;
			return true;
		}
		return false;
	}
}
