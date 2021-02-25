package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HumanityHome {
	
	public static final String HUMANITY_HOME_URL = "https://www.humanity.com/";
	private static final String TRIAL_POPUP_ANNOUNCEMENT_KILL_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	private static final String TRIAL_POPUP_COOKIES_KILL_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[1]/button";
	private static final String TRIAL_BTTN_POPUP_XPATH = "/html/body/div[1]/header/div[1]/div/div/div/nav/div[2]/div/a[3]";
	private static final String TXT_TRIAL_POPUP_FULL_NAME_XPATH = "//*[@id=\"popup-form\"]/div[1]/input";
	private static final String TXT_TRIAL_POPUP_WORK_EMAIL_XPATH = "//*[@id=\"popup-form\"]/div[2]/input";
	private static final String BTTN_TRIAL_POPUP_XPATH = "/html/body/div[5]/div/div/div/div/div/div[2]/form/input";
	private static final String TXT_TRIAL_POPUP_COMPANY_NAME_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String DROP_DOWN_POPUP_INDUSTRY_SELECT_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[2]/div/div";
	private static final String DROP_DOWN_POPUP_FUNCTIONAL_ROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div";
	private static final String TXT_TRIAL_POPUP_PHONE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String TXT_TRIAL_POPUP_PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String TXT_TRIAL_POPUP_REPEAT_PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String BTTN_TRIAL_POPUP_START_SCHEDULING_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	
	
	
	private static final String TXT_TRIAL_HOME_FULL_NAME_XPATH = "//*[@id=\"top-form\"]/div/div[1]/input";
	private static final String TXT_TRIAL_HOME_WORK_EMAIL_XPATH = "/html/body/div[1]/header/div[2]/div/div/div/div/form/div/div[2]/input";
	private static final String TRIAL_BTTN_HOME_XPATH = "//*[@id=\"free-trial-link-01\"]";
	private static final String TXT_TRIAL_COMPANY_NAME_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[1]/div/div/input";
	private static final String DROP_DOWN_INDUSTRY_SELECT_XPATH = "/html/body/div/div/div/form/div[1]/div/div[2]/div/div/span";
	private static final String DROP_DOWN_FUNCTIONAL_ROLE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[3]/div/div/span";
	private static final String TXT_TRIAL_PHONE_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[4]/div/input";
	private static final String TXT_TRIAL_PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[5]/div/input";
	private static final String TXT_TRIAL_REPEAT_PASSWORD_XPATH = "//*[@id=\"root\"]/div/div/form/div[1]/div/div[6]/div/input";
	private static final String BTTN_TRIAL_START_SCHEDULING_XPATH = "//*[@id=\"root\"]/div/div/form/div[2]/span/input";
	
	private static final String BTTN_LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	private static final String TXT_USERNAME_XPATH = "//*[@id=\"email\"]";
	private static final String TXT_PASSWORD_XPATH = "//*[@id=\"password\"]";
	private static final String BTTN_LOGIN_CONFIRM_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
		
	public static void killPopups(WebDriver driver) {
		driver.findElement(By.xpath(TRIAL_POPUP_ANNOUNCEMENT_KILL_XPATH)).click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(TRIAL_POPUP_COOKIES_KILL_XPATH)).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void clickTrialPopup(WebDriver driver) {
		driver.findElement(By.xpath(TRIAL_BTTN_POPUP_XPATH)).click();
	}
	
	public static void fillTrialPopup1(WebDriver driver) {
		driver.findElement(By.xpath(TXT_TRIAL_POPUP_FULL_NAME_XPATH)).sendKeys("lili lilic");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(TXT_TRIAL_POPUP_WORK_EMAIL_XPATH)).sendKeys("lilic@bootcamp.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Dimension dimension = new Dimension(600, 600);
		driver.manage().window().setSize(dimension);
		
		driver.findElement(By.id("popup-free-trial-link")).click();
	}
	
	public static void fillTrialPopup2(WebDriver driver) {
		driver.findElement(By.xpath(TXT_TRIAL_POPUP_COMPANY_NAME_XPATH)).sendKeys("StarImport");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DROP_DOWN_POPUP_INDUSTRY_SELECT_XPATH)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DROP_DOWN_POPUP_INDUSTRY_SELECT_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(DROP_DOWN_POPUP_INDUSTRY_SELECT_XPATH)).sendKeys(Keys.ARROW_DOWN);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DROP_DOWN_POPUP_INDUSTRY_SELECT_XPATH)).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DROP_DOWN_POPUP_FUNCTIONAL_ROLE_XPATH)).click();
		driver.findElement(By.xpath(DROP_DOWN_POPUP_FUNCTIONAL_ROLE_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(DROP_DOWN_POPUP_FUNCTIONAL_ROLE_XPATH)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(TXT_TRIAL_POPUP_PHONE_XPATH)).sendKeys("0038160123654");
		driver.findElement(By.xpath(TXT_TRIAL_POPUP_PASSWORD_XPATH)).sendKeys("ivanovicCo");
		driver.findElement(By.xpath(TXT_TRIAL_POPUP_REPEAT_PASSWORD_XPATH)).sendKeys("ivanovicCo");	
		driver.findElement(By.xpath(BTTN_TRIAL_POPUP_START_SCHEDULING_XPATH)).click();
	}
	
	public static void fillTrial1(WebDriver driver) {
		driver.findElement(By.xpath(TXT_TRIAL_HOME_FULL_NAME_XPATH)).sendKeys("jono jonic");
		driver.findElement(By.xpath(TXT_TRIAL_HOME_WORK_EMAIL_XPATH)).sendKeys("jonic@bootcamp.com");
		driver.findElement(By.xpath(TRIAL_BTTN_HOME_XPATH)).click();		
	}
	
	public static void fillTrial2(WebDriver driver) {
		driver.findElement(By.xpath(TXT_TRIAL_COMPANY_NAME_XPATH)).sendKeys("StarImport");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Select dropDownSort3 = new Select(driver.findElement(By.xpath(DROP_DOWN_INDUSTRY_SELECT_XPATH)));
		//Select dropDownSort1 = new Select(driver.findElement(By.className("placeholder-select")));
		//dropDownSort3.selectByVisibleText("Retail");
		driver.findElement(By.xpath(DROP_DOWN_INDUSTRY_SELECT_XPATH)).click();
		driver.findElement(By.xpath(DROP_DOWN_INDUSTRY_SELECT_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(DROP_DOWN_INDUSTRY_SELECT_XPATH)).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(DROP_DOWN_FUNCTIONAL_ROLE_XPATH)).click();
		driver.findElement(By.xpath(DROP_DOWN_FUNCTIONAL_ROLE_XPATH)).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath(DROP_DOWN_FUNCTIONAL_ROLE_XPATH)).sendKeys(Keys.ENTER);		
		driver.findElement(By.xpath(TXT_TRIAL_PHONE_XPATH)).sendKeys("0038160123654");
		driver.findElement(By.xpath(TXT_TRIAL_PASSWORD_XPATH)).sendKeys("ivanovicCo");
		driver.findElement(By.xpath(TXT_TRIAL_REPEAT_PASSWORD_XPATH)).sendKeys("ivanovicCo");
		driver.findElement(By.xpath(BTTN_TRIAL_START_SCHEDULING_XPATH)).click();

	}
//	private static final String BTTN_LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
//	private static final String TXT_USERNAME_XPATH = "//*[@id=\"email\"]";
//	private static final String TXT_PASSWORD_XPATH = "//*[@id=\"password\"]";
//	private static final String BTTN_LOGIN_CONFIRM_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	
	public static void login(WebDriver driver) {
		driver.findElement(By.xpath(BTTN_LOGIN_XPATH)).click();
		driver.findElement(By.xpath(TXT_USERNAME_XPATH)).sendKeys("jankovic@bootcamp.com");
		driver.findElement(By.xpath(TXT_PASSWORD_XPATH)).sendKeys("Janketic");
		driver.findElement(By.xpath(BTTN_LOGIN_CONFIRM_XPATH)).click();
	}
	
}
