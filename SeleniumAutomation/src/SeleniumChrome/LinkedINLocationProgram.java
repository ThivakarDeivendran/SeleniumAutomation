package SeleniumChrome;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedINLocationProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver locationDriver = new ChromeDriver();
		locationDriver.manage().window().maximize();
		locationDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		locationDriver.get("https://www.selenium.dev/downloads/");
		WebElement findElement = locationDriver.findElement(By.xpath("//h1[.='Downloads']"));
		Point location = findElement.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x+"       "+y);

	}

}
