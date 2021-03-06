package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HumanityHome;

public class TestTrialHome {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\ChromeDriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testTrial() {
		driver.manage().window().maximize();
		driver.navigate().to(HumanityHome.HUMANITY_HOME_URL);
		HumanityHome.killPopups(driver);
		HumanityHome.fillTrial1(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HumanityHome.fillTrial2(driver);

		String actual = driver.getCurrentUrl();
		String expected = "https://www.humanity.com/wizard-setup2/";
		Assert.assertEquals(actual, expected);

	}

}
