package LearningTestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners extends TestListenerAdapter{
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test case pass");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test case fail");
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test case Skipped");
	}
		
}

