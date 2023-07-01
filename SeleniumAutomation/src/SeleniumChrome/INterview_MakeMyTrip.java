package SeleniumChrome;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class INterview_MakeMyTrip{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver makeMyTrip =new ChromeDriver();
		makeMyTrip.manage().window().maximize();
		makeMyTrip.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		makeMyTrip.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		makeMyTrip.findElement(By.xpath("//*[@class='makeFlex font12']/li[2]/div/a")).click();
		Thread.sleep(2000);
		makeMyTrip.findElement(By.xpath("//*[contains(@id,'hsw_search_button')]")).click();
		JavascriptExecutor scrolToBooking =(JavascriptExecutor) makeMyTrip;
		scrolToBooking.executeScript("window.scrollBy(0,600)", "");
		//*[@id='STAR_CATEGORY']/ul/li/
		makeMyTrip.findElement(By.xpath("(//*[@id='STAR_CATEGORY']/ul/li/span)[1]")).click();
		Thread.sleep(5000);
		String expectedValue =makeMyTrip.findElement(By.xpath("(//span[@id='hlistpg_hotel_star_rating'])[1]")).getAttribute("data-content");
		String actual ="5";
		org.testng.Assert.assertEquals(actual, expectedValue);
		System.out.println("Hotel having 5 stars");
		Thread.sleep(3000);
		makeMyTrip.findElement(By.xpath("(//span[@id='hlistpg_hotel_star_rating'])[1]")).click();
		
	}

}
