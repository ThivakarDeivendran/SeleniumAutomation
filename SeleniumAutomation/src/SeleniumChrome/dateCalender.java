package SeleniumChrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dateCalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\User\\Document\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.tripadvisor.in/CheapFlightsHome");
		driver.findElement(By.xpath("//input[@class ='query origWithLabel']")).clear();
		driver.findElement(By.xpath("//input[@class ='query origWithLabel']")).sendKeys("Sydney");
		driver.findElement(By.xpath("//input[@class ='query origWithLabel']")).click();
		driver.findElement(By.xpath("//input[@class ='query destWithLabel']")).sendKeys("Singapore");
		driver.findElement(By.xpath("//input[@class ='query destWithLabel']")).click();
		driver.findElement(By.xpath("//span[@class ='ui_icon calendar pickerType']")).click();
		String date = "03-Jan2021";
		String splitter[]= date.split("-");
		String day =splitter[0];
		String month = splitter[1];
		//System.out.println(day);
		//System.out.println(month);
		WebElement shiftto =driver.findElement(By.xpath("//*[@id=\"Monikers\"]"));
		driver.switchTo().frame(shiftto);
		WebElement sys=driver.findElement(By.xpath("/html/body/span/div[@class='body_text']/div/div"));
		System.out.println(sys.getText());
		
		//driver.findElement(By.xpath("//span[@data-date='2021-0-3']")).click();
		//driver.findElement(By.xpath("//span[@data-date='2021-0-22']")).click();
		//List<WebElement> days =driver.findElements(By.xpath("//*[@class='rsdc-day-labels']"));
		//System.out.println(days.size());
		//WebElement check1 =driver.findElement(By.xpath("//*[@class='rsdc-month-title']"));
		//System.out.println(check1.getAttribute(month));
		//driver.findElement(By.xpath("//span[@class ='submit_text']")).click();
		
		//driver.findElement(By.xpath("//*[@class='rsdc-body']/div")).click();
		//List<WebElement> check =driver.findElements(By.xpath("//*[@class ='rsdc-month-title']"));
		//for(int i=0;i<check.size();i++) {
			//System.out.println(check.get(i).getText());
		//}
		
		//List <WebElement> days=driver.findElements(By.xpath("//div[@class='body_text']/div/div[2]/div[3]/span/span [@class ='rsdc-cell rsdc-day']"));
		//for(int i=0;i<days.size();i++) {
			//System.out.println(days.get(i).getText());
		//}
	}
}
