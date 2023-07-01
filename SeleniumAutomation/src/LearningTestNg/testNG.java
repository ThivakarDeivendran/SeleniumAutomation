package LearningTestNg;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNG {
	
	WebDriver chrome;
	int Selectvalue ;
	
	@Test(priority =1)
	public void testlogin() {
		System.setProperty("webdriver.Firefox.driver", "D:\\User\\Document\\Drivers\\geckodriver.exe");
		 chrome = new FirefoxDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@Test (priority =2)
	public void login() {
		chrome.navigate().to("https://istqb.patshala.com/");
		chrome.findElement(By.xpath("//div[@ id='collapse1']/div/div[4]/a")).click();
		chrome.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
		
	}
	@Test(priority =4)
	public void patshala() {
		String Selectvalue ="100";
		List<WebElement>  showEntries=chrome.findElements(By.xpath("//div [@class='col-sm-6']/div/label/select/option"));
		int totalcount =showEntries.size();
		System.out.println(totalcount);
		for(int i=0;i<=totalcount;i++) {
			String finalnumber =showEntries.get(i).getText();
			if(finalnumber.equals(Selectvalue)) {
				showEntries.get(i).click();
			}
				
		}
	}
		/*@Test (priority =3)
		//public void UserChoice() {
			Scanner value =new Scanner(System.in);
			System.out.println("Enter the showEntries:");
			String SelectValue =value.next();
			System.out.println("ShowEntries"+ SelectValue);
			
		}*/
		
		
	}
	


