package SeleniumChrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class differentBrowser {
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.navigate().to("https://www.rediff.com/");
		driver.findElement(By.xpath("//*[@id ='signin_info']/a[@title ='Create Rediffmail Account']")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Thivakar Deivendran");
		driver.findElement(By.cssSelector("#tblcrtac > tbody > tr:nth-child(7) > td:nth-child(3) > input[type=text]:nth-child(1)")).sendKeys("dthivakar123");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("Thivakar12!@");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("Thivakar12!@");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.cssSelector("#mobno")).sendKeys("8098530644");
	    
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).click();
			//List<WebElement> day =drop .findElements(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]/option"));
			List<WebElement> day =driver.findElements(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]/option"));
			System.out.println(day.size());
			String list;
			for (int i=0;i<day.size();i++) {
				list =day.get(i).getAttribute("value");
				//System.out.println(list);
				
				if(list.equals("28")) {
					day.get(i).click();
				}
			}
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")).click();
			List<WebElement> month =driver.findElements(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]/option"));
			System.out.println(month.size());
			String list2;
			for (int j=0;j<month.size();j++) {
				list2 =month.get(j).getText();
				//System.out.println(list2);
					
				if(list2.equals("SEP")) {
					month.get(j).click();
				}
			}
	 
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")).click();
			List<WebElement> year =driver.findElements(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]/option"));
			System.out.println(year.size());
			String list3;
			for (int j=0;j<year.size();j++) {
				list3 =year.get(j).getText();
				//System.out.println(list3);
				
				if(list3.equals("1995")) {
					year.get(j).click();
				}
			}
		 driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")).click();
			List <WebElement> city =driver.findElements(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select/option"));
			System.out.println(city.size());
				String list4;
				for (int j=0;j<city.size();j++) {
					list4 =city.get(j).getText();
					//System.out.println(list4);
					
					if(list4.equals("Chennai")) {
						city.get(j).click();
					}
				}
	}
}
