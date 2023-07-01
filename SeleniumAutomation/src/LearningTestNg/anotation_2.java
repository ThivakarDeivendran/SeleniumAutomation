package LearningTestNg;

import java.util.Base64;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;



//@Listeners(LearningTestNg.Listenersclass.class)
public class anotation_2 {
	@Test(retryAnalyzer = RetryAnalyserClass.class)
     public void banana() {
    	 System.out.println("TestNg Process_2");
     }
    @Test
    public void dog() {
    	System.out.println("TestNg Process_4");
    	throw new SkipException("i will skip the test case");
     }	
    @Test(groups = {"TestingMethod"})
    public void apple_dup() {
   	 System.out.println("apple_dup");
   	Assert.assertEquals(0.3, 0.33);
    }
    @Test(groups= {"AutomationMethod"})
    public void god_dup() {
   	 System.out.println("god_dup");
    }
    @Test(retryAnalyzer = LearningTestNg.RetryAnalyserClass.class)
    public void cat_dup() {
   	 System.out.println("catdup");
   	 Assert.assertFalse(true);
    }   
    //@Parameters("Password")
    //@Test (priority =4)
    public void deCodePassword (String Password) {
    	System.out.println(new String ( Base64.getDecoder().decode(Password.getBytes())));
    }
}

