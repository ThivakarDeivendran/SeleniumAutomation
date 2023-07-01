package LearningTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	public static ThreadLocal<WebDriver> dr =new ThreadLocal<WebDriver>();
	
	
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		dr.set(driver);
		dr.get().manage().window().maximize();
		dr.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test
	public void intialProcessMethod1() throws InterruptedException {

		dr.get().get("https://www.google.com/");
		dr.get().findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(1000);
		dr.get().findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(1000);
	}
	@Test
	public void intialProcessMethod2() throws InterruptedException {
		dr.get().get("https://www.google.com/");
		dr.get().findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(2000);
		dr.get().findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void intialProcessMethod3() throws InterruptedException {
		dr.get().get("https://www.google.com/");
		dr.get().findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(1000);
		dr.get().findElement(By.xpath("(//a[contains(text(),'Overview')])[1]")).click();
		Thread.sleep(1000);
	}
	@AfterMethod
	public void logoff() {
		dr.get().close();
		dr.set(null);
	}
	
	/*@DataProvider(parallel =true)
	public Object[][] testdata(){
		return new Object[][]{{"selenium"},{"automation Testing"},{"youtube"}};	
}	
	@Test(dataProvider="testdata")
	public void googleMethod(String args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys(args);
	Thread.sleep(4000);
	driver.close();
	}
	/*
	 * public static ThreadLocal<WebDriver> webdrivelocal = new ThreadLocal<WebDriver>();
	
	 public void setDriver(WebDriver drive) {
		 webdrivelocal.set(drive);
	 }
	 public WebDriver getDriver() {
		 return webdrivelocal.get();
	 }
	@BeforeMethod
	public void loginProcess() {
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver drive =new ChromeDriver();
		setDriver(drive);
		 getDriver().manage().window().maximize();
		 getDriver().manage().deleteAllCookies();
		 getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void logoutProcess() {
		getDriver().quit();
		webdrivelocal.set(null);
	}
	@Test 
	public void methodProcess() throws InterruptedException {
		getDriver().get("https://www.google.com/");
		getDriver().findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(4000);
		getDriver().findElement(By.xpath("//*[@class='gb_Sd gb_2d']/div/div/ul/li/a")).click();
		Thread.sleep(4000);
	}
	@Test 
	public void methodProcess2() throws InterruptedException {
		getDriver().get("https://www.google.com/");
		getDriver().findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(4000);
		getDriver().findElement(By.xpath("//*[@class='gb_Sd gb_2d']/div/div/ul/li/a")).click();
		Thread.sleep(4000);
	}
	@Test 
	public void methodProcess3() throws InterruptedException {
		getDriver().get("https://www.google.com/");
		getDriver().findElement(By.xpath("//div[@class='KxwPGc iTjxkf']/a[1]")).click();
		Thread.sleep(4000);
		getDriver().findElement(By.xpath("//*[@class='gb_Sd gb_2d']/div/div/ul/li/a")).click();
		Thread.sleep(4000);
	}
	 */


}
