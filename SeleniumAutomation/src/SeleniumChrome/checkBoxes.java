package SeleniumChrome;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> list =driver.findElements(By.xpath("//div [@ class ='display'][1] /input[@type ='checkbox']"));
		System.out.println(list.size());
		for(int i =0;i<list.size();i++) {
			String value = list.get(i).getAttribute("value");
			System.out.println(value);
			System.out.println(list.get(i).isSelected());
			if (value.equals("basketball") || value.equals("football")) {
				list.get(i).click();
			}
		}
		for(int i =0;i<list.size();i++) {
			String value1 = list.get(i).getAttribute("value");
			System.out.println(value1);
			System.out.println(list.get(i).isSelected());
		}
		Thread.sleep(5000);
		//driver.close();
	}

}
