package SeleniumChrome;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class FirstAutomationChrome {

	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.Firefox.driver", "D:\\User\\Document\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement a =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	     driver.switchTo().frame(a);
		WebElement web = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement web1 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		System.out.println(web.getText());
		System.out.println(web1.getText());
		
		//driver.switchTo().defaultContent();
		//WebElement side = driver.findElement(By.cssSelector("#sidebar > aside:nth-child(1) > h3"));
		//System.out.println(side.getText());

		Actions ele1= new Actions(driver);
		//ele.moveToElement(web).dragAndDropBy(web, 75, 75).build().perform();
		
		ele1.moveToElement(web).dragAndDrop(web, web1).build().perform();
		
		//driver.quit();	*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
		WebDriver drive =new ChromeDriver();
		drive.manage().window().maximize();
		drive.manage().deleteAllCookies();
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		drive.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		drive.findElement(By.id("promtButton")).click();
		Alert alertmessage=  drive.switchTo().alert();
		
		System.out.println(alertmessage.getText());
		alertmessage.sendKeys("Testing");
		System.out.println("TEsting ");
	
	}

}
