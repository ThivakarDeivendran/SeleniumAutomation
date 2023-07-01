package SeleniumChrome;

import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class passwordEncode {
	
	//static void basketball() {
		//System.out.println("method successfully");
	//}

	//static void testing() {
		//System.out.println("testing Engineer");
	//}
	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\User\\Document\\Drivers\\chromedriver.exe"); WebDriver driver =new
		 * ChromeDriver(); driver.manage().window().maximize();
		 * driver.manage().deleteAllCookies();
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//*[@name='login']")).sendKeys(
		 * "dthivakar12@rediffmail.com");
		 */
		// String password2 ="QmFza2V0YmFsbDEh";
		// String decodePasswd =new
		// String(Base64.getDecoder().decode(password2.getBytes()));
		// driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys(decodePasswd);
		// driver.findElement(By.xpath("//*[@type='submit']")).click();
		// passwordEncode d = new passwordEncode();
		// d.basketball();
		// d.testing();
		/*
		 * String password ="Basketball1!"; String encodePasswd = new
		 * String(Base64.getEncoder().encode(password.getBytes()));
		 * System.out.println(encodePasswd);
		 */
		// driver.navigate().to("https://imgbb.com/upload");
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//*[@id=\"anywhere-upload\"]/div[1]/div[1]/div/div[1]/span")).click();
		// Thread.sleep(8000);
		// Runtime.getRuntime().exec("D:\\User\\Document\\AutoIT Scripts\\Upload
		// Image.exe");
		// Thread.sleep(8000);
		// driver.findElement(By.xpath("//*[@id=\"anywhere-upload-queue\"]/li/div[7]/span")).click();
		
		
		String password ="Thivakar12!@";
		String passwordencodevalue =new String (Base64.getEncoder().encodeToString(password.getBytes()));
		System.out.println(passwordencodevalue);
		//String encodePassword ="VGhpdmFrYXIxMiFA";
		System.out.println(new String (Base64.getDecoder().decode(passwordencodevalue.getBytes())));
		 
	}

}





