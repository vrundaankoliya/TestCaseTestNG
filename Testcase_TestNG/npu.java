package HW5A;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HW5A {

	public static WebDriver driver;
	public static String baseURL1;
	public String baseURL2;
	static String username;
	static String password;
	
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Test
	public void test() throws Exception {

		try{
			
			FileInputStream file = new FileInputStream(new File("C:\Users\Vrunda Ankoliya\workspace\testeng\HW5A.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			username = sheet.getRow(1).getCell(0).getStringCellValue();
			password = sheet.getRow(1).getCell(1).getStringCellValue();
			
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("lst-ib")).clear();
			driver.findElement(By.id("lst-ib")).sendKeys("NPU");
			driver.findElement(By.name("btnG")).click();
				Thread.sleep(3000);
			driver.findElement(By.linkText("Northwestern Polytechnic University")).click();
				Thread.sleep(3000);
			driver.findElement(By.linkText("Student Log-In")).click();
				Thread.sleep(3000);
			driver.findElement(By.id("Username")).clear();
			driver.findElement(By.id("Username")).sendKeys(username);
			driver.findElement(By.id("Password")).clear();
		    driver.findElement(By.id("Password")).sendKeys("password");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				Thread.sleep(2000);
			
			
		}catch (FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch (IOException ioe){
			ioe.printStackTrace();
		}
	}

	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	public void sleep(int seconds){
		try{
			Thread.sleep(seconds * 1000);
		}catch (InterruptedException e){
			
		}
	}
}

