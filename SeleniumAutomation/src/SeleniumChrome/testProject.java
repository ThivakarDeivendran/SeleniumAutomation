package SeleniumChrome;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testProject {

	public static void main(String[] args) throws Throwable{
		//fileInput();
		//userID();
		//stringSplitFunctionMethod();
//		System.setProperty("webdriver.chrome.driver", "D:\\User\\Document\\Drivers\\chromedriver.exe");
//		WebDriver drive =new ChromeDriver();
//		drive.manage().window().maximize();
//		drive.manage().deleteAllCookies();
//		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		drive.get("https://imgbb.com/");
//		Thread.sleep(3000);
//		drive.findElement(By.xpath("//*[@class='home-buttons']/a")).click();
//		Thread.sleep(3000);
		/*WebDriverWait wait= new WebDriverWait(drive, 15);
		//wait.until(ExpectedConditions.)
		Runtime.getRuntime().exec("D:\\User\\Document\\AutoIT Scripts\\UploadImage_2.exe");// by autoIT*/

		/*drive.get("https://www.facebook.com");///for selenium class
		Thread.sleep(3000);
		drive.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("fdknfknd");
		drive.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		Thread.sleep(3000);
		drive.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(1000);
		TakesScreenshot screenshot = (TakesScreenshot) drive;
		File originFile = screenshot.getScreenshotAs(OutputType.FILE);
		String screenshotname = "Screenshot"+System.currentTimeMillis()+".png"; 
		File filepath =new File ("D:\\User\\Document\\Eclipse_workspace\\SeleniumAutomation\\ScreenShotFiles\\"+screenshotname);
		FileUtils.copyFile(originFile, filepath);*/	

		/////////////////////////WindowHandles
//		drive.get("https://demoqa.com/browser-windows");
//		Thread.sleep(3000);
//		String Window1 = drive.getWindowHandle();
//		System.out.println(Window1);
//		drive.findElement(By.xpath("//button[@id='tabButton']")).click();
//		
//		Set<String> windowHandles = drive.getWindowHandles();
//		Iterator  allwindow =windowHandles.iterator();
//		while(allwindow.hasNext()) {
//			String childwindow =(String) allwindow.next();
//			if(!Window1.equalsIgnoreCase(childwindow)) {
//				drive.switchTo().window(childwindow);
//				System.out.println("jbjdbkfnkjdnkf");
//				System.out.println(drive.getCurrentUrl());
//			}
//		}
		/*Set<String>windowTab=drive.getWindowHandles();
		 Iterator<String> booking =windowTab.iterator();
		 String nextScreen =booking.next();
		 String nextScreenModule = booking.next();
		 drive.switchTo().window(nextScreenModule);
		 System.out.println(drive.getCurrentUrl());*/
		//Actions action = new Actions(drive);
		//WebElement mouseAction = drive.findElement(By.xpath("(//*[contains(text(),'Resources')])[1]"));
		//action.moveToElement(mouseAction).build().perform();
		
		//WebElement document = drive.findElement(By.xpath("(//*[contains(text(),'Documentation')])[3]"));
		//action.doubleClick(document).build().perform();
		
		
		/*Set<String> windowHandles = drive.getWindowHandles();
		for (String TotalWindow : windowHandles) {
			System.out.println(TotalWindow);
		}*/
	}
	public static void fileInput() throws IOException {
		File f = new File("C:\\Users\\user\\Desktop\\TestFile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		Cell cellValueType = wbook.getSheetAt(0).getRow(0).getCell(0);
		if(cellValueType.equals(CellType.STRING)) {
			System.out.println(cellValueType.getStringCellValue());
		}else if(cellValueType.equals(CellType.NUMERIC)) {
			System.out.println(cellValueType.getNumericCellValue());
		}	
		
	}
	static void userID() throws IOException {
		File excel = new File("C:\\Users\\user\\Desktop\\TestFile.xlsx");
		FileInputStream fis = new FileInputStream(excel);
		XSSFWorkbook UserID = new XSSFWorkbook(fis);
		//int sheetSize = UserID.getNumberOfSheets();
			 XSSFSheet sheetAt = UserID.getSheetAt(0);
			System.out.println(sheetAt.getRow(0).getCell(0).getStringCellValue());
	}
	public static void stringSplitFunctionMethod() {
		String input ="This is TCS company Interview";
		String[] inputArray = input.split(" ");
	    System.out.print("Output String  : "+ inputArray[1]+ "   "+ inputArray[4]);
	}
	
}
