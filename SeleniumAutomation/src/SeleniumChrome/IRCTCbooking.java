package SeleniumChrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTCbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Firefox.driver", "D:\\User\\Document\\Drivers\\geckodriver.exe");
				//+ "New folder\\chromedriver.exe");
		WebDriver irctc =new FirefoxDriver();
		irctc.manage().deleteAllCookies();
		irctc.manage().window().maximize();
		irctc.navigate().to("https://www.irctc.co.in/nget/train-search");
		irctc.findElement(By.xpath("//button[@class ='btn btn-primary']")).click();
		//irctc.switchTo().alert().accept();
		irctc.findElement(By.xpath("//*[@class='ng-tns-c58-8 ui-autocomplete ui-widget']/input")).sendKeys("MDU");
		Thread.sleep(2000);
		irctc.findElement(By.xpath("//*[@class='ng-tns-c58-8 ui-autocomplete ui-widget']/input")).sendKeys(Keys.TAB);
		irctc.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys("MAS");
		Thread.sleep(2000);
		irctc.findElement(By.xpath("//*[@id=\"destination\"]/span/input")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		
		irctc.findElement(By.xpath("//*[@class='ng-tns-c59-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		
		List<WebElement> month =irctc.findElements(By.xpath("//*[@class='ui-datepicker-title ng-tns-c59-10']/span"));
		System.out.println(month.size());
		
		System.out.println("check1");
		 String span1 = null; 
		 String span2 =null; 
		 for(int i=0;i<month.size();i++) {
		 month.get(i).getText(); 
		 //System.out.println(month.get(i).getText());
		 span1=month.get(0).getText(); 
		 span2=month.get(1).getText();
		  //System.out.println(span1);
		 // System.out.println(span2);
		 }
			
			//if(span1.equals("February")  && span2.equals("2021")) {
				List<WebElement>  days =irctc.findElements(By.xpath("//*[@class='ng-tns-c59-10']/tr/td"));
				//*[@class='ng-tns-c59-10']/tr/td/span
				//*[@class='ng-tns-c59-10']/tr/td/a
				System.out.println(days.size());
				for (int j=0;j<days.size();j++) {
					System.out.println(days.get(j).getText());
					if(days.get(j).getText().equalsIgnoreCase("21")) {
							days.get(j).click();
					}
						else {
							irctc.findElement(By.xpath("//*[@class='ui-datepicker-next ui-corner-all ng-tns-c59-10 ng-star-inserted']/span")).click();
						}
				}


			System.out.println("check2");
			Thread.sleep(2000);
		
		
		irctc.findElement(By.xpath("//*[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c66-11']/span")).click();
		List<WebElement> allclasses =irctc.findElements(By.xpath("//*[@class='ui-dropdown-items-wrapper ng-tns-c66-11']/ul/p-dropdownitem"));
		System.out.println(allclasses.size());
		
		for(int i=0;i<allclasses.size();i++) {
			String coaches=allclasses.get(i).getText();
			//System.out.println(coaches);
			if(coaches.equalsIgnoreCase("Sleeper (SL)")) {
				allclasses.get(i).click();
			}
		}
		
		irctc.findElement(By.xpath("//*[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c66-12']/span")).click();
		List<WebElement> category=irctc.findElements(By.xpath("//*[@class='ui-dropdown-items-wrapper ng-tns-c66-12']/ul/p-dropdownitem"));
		System.out.println(category.size());
		for (int i=0;i<category.size();i++) {
			String perference=category.get(i).getText();
			//System.out.println(perference);
			if(perference.equalsIgnoreCase("LADIES")) {
				category.get(i).click();
			}
		}
		
			irctc.findElement(By.xpath("//*[@class='search_btn train_Search']")).click();
			
	}
}
