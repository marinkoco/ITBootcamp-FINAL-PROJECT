package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Dashboard;

public class TestSettings {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void testSettingsTickerAndLanguage() throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to(Dashboard.DASHBOARD_URL);
		Dashboard.loginDashboard(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.clickSettings(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.tickNotificationsEmail(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.tickNotificationsSMS(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.tickNotificationsMobPush(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.clickSaveSettings(driver);
		
		Thread.sleep(800);
		
		WebElement confirmation2 = driver.findElement(By.id("_status"));
		Assert.assertTrue(confirmation2.isDisplayed());
		
		Dashboard.selectLanguage(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Dashboard.clickSaveSettings(driver);
		
		Thread.sleep(800);
		
		WebElement confirmation = driver.findElement(By.id("_status"));
		Assert.assertTrue(confirmation.isDisplayed());
			
	}
	
}
