package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HumanityHome;

public class Testlogin {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testLogin() {
		driver.manage().window().maximize();
		driver.navigate().to(HumanityHome.HUMANITY_HOME_URL);
		HumanityHome.killPopups(driver);
		HumanityHome.login(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actual = driver.getCurrentUrl();
		String expected = "https://jankotrade.humanity.com/app/dashboard/";
		Assert.assertEquals(actual, expected);

	}

}
