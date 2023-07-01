package LearningTestNg;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;

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

public class annotations {

     @DataProvider(name="Testing")
     	public  static Object[][] name (Method s){
    	 Object[][] subject = null;
    	 if(s.getName().equals("test1")) {
    		  subject= new Object[3][4];
    		 subject[0][0] ="thivakar";
        	 subject[0][1] ="deivendren";
        	 subject[0][2] =12;
        	 subject[0][3] ="testing Engineer";
        	 
        	 subject[1][0] ="manickam";
        	 subject[1][1] ="alagarsamy";
        	 subject[1][2] =28;
        	 subject[1][3] ="Dsp";
        	 
        	 subject[2][0] ="rohith";
        	 subject[2][1] ="vadivel";
        	 subject[2][2] =04;
        	 subject[2][3] ="Railways";
        	 	return subject;
    	 }
    	 if(s.getName().equals("test2")) {
              subject =new Object[2][2];
         	 subject[0][0] ="thivakar";
         	 subject[0][1] ="basketball";
         	 
         	 subject[1][0] ="manickam";
         	 subject[1][1] ="business";
       
         	 	return subject;
    	 }
		return null; 
     }  	 	  
}