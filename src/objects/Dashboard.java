package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dashboard {

	public static final String DASHBOARD_URL = "https://jankotrade.humanity.com/app/dashboard/";
	private static final String USER_DASH_XPATH = "//*[@id=\"email\"]";
	private static final String PASS_DASH_XPATH = "//*[@id=\"password\"]";
	private static final String BTTN_DASH_LOGIN_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
	private static final String TAB_SHIFT_PLANNING_XPATH = "//*[@id=\"sn_schedule\"]/span/i";
	private static final String TAB_TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span/i";
	private static final String TAB_LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/i";
	private static final String TAB_TRAINING_XPATH = "//*[@id=\"sn_training\"]/span/i";
	public static final String TAB_STAFF_XPATH = "//*[@id=\"sn_staff\"]/span/i";
	private static final String TAB_AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span/i";
	private static final String TAB_PAYROLL_XPATH = "//*[@id=\"sn_payroll\"]/span/i";
	private static final String TAB_REPORTS_XPATH = "//*[@id=\"sn_reports\"]/span/i";
	private static final String TAB_SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span/i";

	private static final String DROP_DOWN_LANGUAGE_SELECT_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";

	private static final String TICKER_NOTIFICATION_EMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";
	private static final String TICKER_NOTIFICATION_SMS_XPATH = "//*[@id=\"pref_pref_sms\"]";
	private static final String TICKER_NOTIFICATION_MOB_PUSH_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";

	private static final String BTTN_SAVE_SETTINGS_XPATH = "//*[@id=\"_save_settings_button\"]";

	public static void loginDashboard(WebDriver driver) {
		driver.findElement(By.xpath(USER_DASH_XPATH)).sendKeys("jankovic@bootcamp.com");
		driver.findElement(By.xpath(PASS_DASH_XPATH)).sendKeys("Janketic");
		driver.findElement(By.xpath(BTTN_DASH_LOGIN_XPATH)).click();
	}

	public static void clickShiftPlanning(WebDriver driver) {
		driver.findElement(By.xpath(TAB_SHIFT_PLANNING_XPATH)).click();
	}

	public static void clickTimeClock(WebDriver driver) {
		driver.findElement(By.xpath(TAB_TIME_CLOCK_XPATH)).click();
	}

	public static void clickLeave(WebDriver driver) {
		driver.findElement(By.xpath(TAB_LEAVE_XPATH)).click();
	}

	public static void clickTraining(WebDriver driver) {
		driver.findElement(By.xpath(TAB_TRAINING_XPATH)).click();
	}

	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.xpath(TAB_STAFF_XPATH)).click();
	}

	public static void clickAvailability(WebDriver driver) {
		driver.findElement(By.xpath(TAB_AVAILABILITY_XPATH)).click();
	}

	public static void clickPayroll(WebDriver driver) {
		driver.findElement(By.xpath(TAB_PAYROLL_XPATH)).click();

	}

	public static void clickReports(WebDriver driver) {
		driver.findElement(By.xpath(TAB_REPORTS_XPATH)).click();
	}

	public static void clickSettings(WebDriver driver) {
		driver.findElement(By.xpath(TAB_SETTINGS_XPATH)).click();
	}

	public static void selectLanguage(WebDriver driver) {
		Select dropDownSort = new Select(driver.findElement(By.xpath(DROP_DOWN_LANGUAGE_SELECT_XPATH)));
		dropDownSort.selectByVisibleText("Serbian (machine)");
	}

	public static void tickNotificationsEmail(WebDriver driver) {
		driver.findElement(By.xpath(TICKER_NOTIFICATION_EMAIL_XPATH)).click();
	}

	public static void tickNotificationsSMS(WebDriver driver) {
		driver.findElement(By.xpath(TICKER_NOTIFICATION_SMS_XPATH)).click();
	}

	public static void tickNotificationsMobPush(WebDriver driver) {
		driver.findElement(By.xpath(TICKER_NOTIFICATION_MOB_PUSH_XPATH)).click();
	}

	public static void clickSaveSettings(WebDriver driver) {
		driver.findElement(By.xpath(BTTN_SAVE_SETTINGS_XPATH)).click();
	}

}
