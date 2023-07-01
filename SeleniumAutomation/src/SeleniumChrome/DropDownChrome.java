package SeleniumChrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownChrome {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Thivakar");
	    driver.findElement(By.name("lastname")).sendKeys("Deivendran");
	    driver.findElement(By.name("reg_email__")).sendKeys("dthivakar123@gmail.com");
	    driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("dthivakar123@gmail.com");
	    //driver.findElement(By.xpath("//*[@id=\"u_0_v\"]")).sendKeys("dthivakar1@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Thivakar12!@");
	    
	    WebElement day= driver.findElement(By.xpath("//*[@id=\"day\"]"));
	   List<WebElement> drop =day.findElements(By.tagName("option"));
	  // System.out.println(drop.size());
	   
	   
	   String element; 
	   for(int i=0;i<drop.size();i++) {
		   element= drop.get(i).getAttribute("value");
		   
		   if(element.equals("28")) {
			   drop.get(i).click();
		   }
		   
		   
	   }
	   
	   WebElement month= driver.findElement(By.xpath("//*[@id=\"month\"]"));
	   List<WebElement> drop2 =month.findElements(By.tagName("option"));
	  // System.out.println(drop2.size());
	   
	   
	 String element2;
	   for(int i=0;i<drop2.size();i++) {
		   element2= drop2.get(i).getText();
		   
		    //WebElement element2= month.findElement(By.linkText("Sep"));
		   if (element2.equals("Sep")) {
			   drop2.get(i).click();
		   }
		
		   }
		   
	   WebElement year= driver.findElement(By.xpath("//*[@id=\"year\"]"));
	   List<WebElement> drop3 =year.findElements(By.tagName("option"));
	  // System.out.println(drop3.size());
	   
	   
	   String element3; 
	   for(int i=0;i<drop3.size();i++) {
		   element3= drop3.get(i).getAttribute("value");
		   
		   if(element3.equals("1995")) {
			   drop3.get(i).click();
		   }
		   
		   
	   }
	   
	 
	   driver.findElement(By.xpath("//*[@name='sex'][@value ='2']")).click();
	   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
