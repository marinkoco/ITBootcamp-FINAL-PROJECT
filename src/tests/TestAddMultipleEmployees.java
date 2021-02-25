package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;
import objects.Staff;

public class TestAddMultipleEmployees {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testAddMultipleEmployees() {
		driver.manage().window().maximize();
		driver.navigate().to(Dashboard.DASHBOARD_URL); //ostaje class Dashboard
		Dashboard.loginDashboard(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.clickStaff(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Staff.TAB_STAFF_ADD_EMPLOYEES_XPATH)).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f = new File("data.xlsx");
		try {
			InputStream inp = new FileInputStream(f); 
			XSSFWorkbook wb = new XSSFWorkbook(inp); 
			Sheet sheet = wb.getSheetAt(0); 
			Row row = sheet.getRow(1);
			Cell a2 = row.getCell(0);
			Cell b2 = row.getCell(1);
			Cell c2 = row.getCell(2);
			String fname1 = a2.toString();
			String lname1 = b2.toString();
			String email1 = c2.toString();
			
			Row row2 = sheet.getRow(2);
			Cell a3 = row2.getCell(0);
			Cell b3 = row2.getCell(1);
			Cell c3 = row2.getCell(2);
			String fname2 = a3.toString();
			String lname2 = b3.toString();
			String email2 = c3.toString();
			
			Row row3 = sheet.getRow(3);
			Cell a4 = row3.getCell(0);
			Cell b4 = row3.getCell(1);
			Cell c4 = row3.getCell(2);
			String fname3 = a4.toString();
			String lname3 = b4.toString();
			String email3 = c4.toString();
			
			Row row4 = sheet.getRow(4);
			Cell a5 = row4.getCell(0);
			Cell b5 = row4.getCell(1);
			Cell c5 = row4.getCell(2);
			String fname4 = a5.toString();
			String lname4 = b5.toString();
			String email4 = c5.toString();
			
			Row row5 = sheet.getRow(5);
			Cell a6 = row5.getCell(0);
			Cell b6 = row5.getCell(1);
			Cell c6 = row5.getCell(2);
			String fname5 = a6.toString();
			String lname5 = b6.toString();
			String email5 = c6.toString();
			
			Staff.inputEmployee1(driver, fname1, lname1, email1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Staff.inputEmployee2(driver, fname2, lname2, email2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Staff.inputEmployee3(driver, fname3, lname3, email3);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Staff.inputEmployee4(driver, fname4, lname4, email4);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Staff.inputEmployee5(driver, fname5, lname5, email5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.xpath(Staff.BTTN_SAVE_EMPLOYEES_XPATH)).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Dashboard.clickStaff(driver);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement name1 = driver.findElement(By.linkText("Stephen Turner"));
			String newname1 = name1.getText();
			Assert.assertEquals(newname1, "Stephen Turner");
			
			WebElement name2 = driver.findElement(By.linkText("Phil Arnold"));
			String newname2 = name2.getText();
			Assert.assertEquals(newname2, "Phil Arnold");
			
			WebElement name3 = driver.findElement(By.linkText("Kevin Chapman"));
			String newname3 = name3.getText();
			Assert.assertEquals(newname3, "Kevin Chapman");
			
			WebElement name4 = driver.findElement(By.linkText("Lauren Terry"));
			String newname4 = name4.getText();
			Assert.assertEquals(newname4, "Lauren Terry");
			
			WebElement name5 = driver.findElement(By.linkText("Nathan MacDonald"));
			String newname5 = name5.getText();
			Assert.assertEquals(newname5, "Nathan MacDonald");
				
			wb.close();

		} catch (

		IOException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
}