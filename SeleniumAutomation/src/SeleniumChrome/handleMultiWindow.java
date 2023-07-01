package SeleniumChrome;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMultiWindow {
     static WebDriver driver;
      
	public static void main(String[] args) throws InterruptedException {
		  driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("http://demo.automationtesting.in/Windows.html");
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 driver.findElement(By.xpath("//a[@target='_blank']/button")).click();
		 Thread.sleep(3000);
		switchToWindow();
		 /*Set<String> windows = driver.getWindowHandles();
			System.out.println(windows.size());
			Iterator<String> check = windows.iterator();
		 String check1 = check.next();
		 String check2 = check.next();
		 driver.switchTo().window(check2);*/
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}
	public static void switchToWindow() {
		String check1 =null;
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator<String> check = windows.iterator();
		for(int i=0;i<windows.size();i++) {
				check1 =check.next();
		}
		driver.switchTo().window(check1);
	}

}
