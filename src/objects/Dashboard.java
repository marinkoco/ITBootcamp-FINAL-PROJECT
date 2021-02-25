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
	
	//settings lang
	private static final String DROP_DOWN_LANGUAGE_SELECT_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	
	//settigns notif
	private static final String TICKER_NOTIFICATION_EMAIL_XPATH = "//*[@id=\"pref_pref_email\"]";
	private static final String TICKER_NOTIFICATION_SMS_XPATH = "//*[@id=\"pref_pref_sms\"]";
	private static final String TICKER_NOTIFICATION_MOB_PUSH_XPATH = "//*[@id=\"pref_pref_mobile_push\"]";
	
	//setting save bttn
	private static final String BTTN_SAVE_SETTINGS_XPATH = "//*[@id=\"_save_settings_button\"]";
	
//	//staff
//	private static final String TAB_STAFF_ADD_EMPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
//	private static final String TXT_EMPOLYEE_FNAME_XPATH = "//*[@id=\"_asf1\"]";
//	private static final String TXT_EMPOLYEE_LNAME_XPATH = "//*[@id=\"_asl1\"]";
//	private static final String TXT_EMPOLYEE_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
//	public static final String BTTN_SAVE_EMPLOYEES_XPATH = "//*[@id=\"_as_save_multiple\"]";
//	
//	private static final String BTTN_EDIT_DETAILS_EMPLOYEE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
//	private static final String TXT_CLEAR_NAME_FIELD_XPATH ="//*[@id=\"first_name\"]";
//	private static final String TXT_INPUT_NAME_FIELD_XPATH = "//*[@id=\"first_name\"]";
//	private static final String BTTN_SAVE_EDIT_EMPLOYEE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
//	public static final String GET_EMAIL_EMPLOYEE_PG_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div[1]/ul/li[5]/span[2]";
//	
//	private static final String UPLOAD_EMPLOYEE_PICT = "//*[@id=\"fileupload\"]";
	
	
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
	
	
	
//	//staff
//	public static void addEmployee(WebDriver driver) {
//		driver.findElement(By.xpath(TAB_STAFF_ADD_EMPLOYEES_XPATH)).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(TXT_EMPOLYEE_FNAME_XPATH)).sendKeys("Minoslav");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(TXT_EMPOLYEE_LNAME_XPATH)).sendKeys("Mamovic");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(TXT_EMPOLYEE_EMAIL_XPATH)).sendKeys("mamovic@bootcamp.com");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(BTTN_SAVE_EMPLOYEES_XPATH)).click();
//
//		
//	}
//	
//	public static void editEmployeeName(WebDriver driver) {
//		driver.findElement(By.linkText("Mirko Jahic")).click();//employee
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(BTTN_EDIT_DETAILS_EMPLOYEE_XPATH)).click(); //edit details
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(TXT_CLEAR_NAME_FIELD_XPATH)).clear(); //clear name field
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(TXT_INPUT_NAME_FIELD_XPATH)).sendKeys("Jaroslav"); // input new name
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(BTTN_SAVE_EDIT_EMPLOYEE_XPATH)).click(); //bttn save
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	public static void addEmployeePicture(WebDriver driver) {
//		driver.findElement(By.linkText("Janko Dzimic")).click();//employee
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.findElement(By.xpath(BTTN_EDIT_DETAILS_EMPLOYEE_XPATH)).click(); //edit details
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		WebElement UploadImg = driver.findElement(By.xpath(UPLOAD_EMPLOYEE_PICT));
//		UploadImg.sendKeys("C:\\Users\\LENOVO\\eclipse-workspace\\humanityProject\\maradona raw.jpg");
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		driver.findElement(By.xpath(BTTN_SAVE_EDIT_EMPLOYEE_XPATH)).click(); //bttn save
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	

}
