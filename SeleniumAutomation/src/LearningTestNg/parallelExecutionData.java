package LearningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class parallelExecutionData {
	
	@DataProvider(parallel=true)
	public Object[][] data(){
		return new Object[][]{ {"Automation Testing"},{"Selenium"},{"12466"}};
	}
	
	@Test (dataProvider="data")
	public void login(String args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
	WebDriver drive =new ChromeDriver();
	drive.manage().window().maximize();
	drive.manage().deleteAllCookies();
	drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	drive.get("https://www.google.com/");
	Thread.sleep(4000);
	drive.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(args);

}
}
