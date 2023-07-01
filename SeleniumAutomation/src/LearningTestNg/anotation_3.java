package LearningTestNg;

	import static org.testng.Assert.assertEquals;

import java.lang.annotation.Annotation;

import org.testng.Assert;
	import org.testng.SkipException;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class anotation_3 {
		
	     @Test(dataProviderClass=annotations.class,dataProvider="Testing")
	     public void test1(String first,String second,int third,String fourth) {
	    	 System.out.println(first);
	    	 System.out.println(second);
	    	 System.out.println(third);
	    	 System.out.println(fourth);
	     }
	     @Test(dataProviderClass=annotations.class,dataProvider="Testing")
	     public void test2(String first,String second) {
	    	 System.out.println(first);
	    	 System.out.println(second);
	     }

}
