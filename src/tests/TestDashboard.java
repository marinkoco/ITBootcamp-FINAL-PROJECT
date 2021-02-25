package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;

public class TestDashboard {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testDashboardTabs() {
		driver.manage().window().maximize();
		driver.navigate().to(Dashboard.DASHBOARD_URL);
		Dashboard.loginDashboard(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.clickShiftPlanning(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual1 = driver.getTitle();
		String expected1 = "ShiftPlanning - Humanity";
		Assert.assertEquals(actual1, expected1);
		
		Dashboard.clickTimeClock(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual2 = driver.getTitle();
		String expected2 = "Timeclock - Overview - Humanity";
		Assert.assertEquals(actual2, expected2);
		
		Dashboard.clickLeave(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual3 = driver.getTitle();
		String expected3 = "Leave - Vacation - Humanity";
		Assert.assertEquals(actual3, expected3);
		
		Dashboard.clickTraining(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual4 = driver.getTitle();
		String expected4 = "Training - Overview - Humanity";
		Assert.assertEquals(actual4, expected4);
		
		Dashboard.clickStaff(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual5 = driver.getTitle();
		String expected5 = "Staff - List - Humanity";
		Assert.assertEquals(actual5, expected5);
		
		
		Dashboard.clickSettings(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual9 = driver.getTitle();
		String expected9 = "Settings - Manage Settings - Humanity";
		Assert.assertEquals(actual9, expected9);
		
		Dashboard.clickReports(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual8 = driver.getTitle();
		String expected8 = "Reports - Reports Home - Humanity";
		Assert.assertEquals(actual8, expected8);
		
		Dashboard.clickPayroll(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual7 = driver.getTitle();
		String expected7 = "Payroll - Scheduled-hours - Humanity";
		Assert.assertEquals(actual7, expected7);
		
		Dashboard.clickAvailability(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual6 = driver.getTitle();
		String expected6 = "Humanity";
		Assert.assertEquals(actual6, expected6);
		
		
	}
	

}
