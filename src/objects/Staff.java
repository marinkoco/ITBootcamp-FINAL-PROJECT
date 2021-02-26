package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Staff {
	
		public static final String TAB_STAFF_ADD_EMPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
		private static final String TXT_EMPLOYEE_FNAME_XPATH = "//*[@id=\"_asf1\"]";
		private static final String TXT_EMPLOYEE_LNAME_XPATH = "//*[@id=\"_asl1\"]";
		private static final String TXT_EMPLOYEE_EMAIL_XPATH = "//*[@id=\"_ase1\"]";
		public static final String BTTN_SAVE_EMPLOYEES_XPATH = "//*[@id=\"_as_save_multiple\"]";
		
		private static final String BTTN_EDIT_DETAILS_EMPLOYEE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
		private static final String TXT_CLEAR_NAME_FIELD_XPATH ="//*[@id=\"first_name\"]";
		private static final String TXT_INPUT_NAME_FIELD_XPATH = "//*[@id=\"first_name\"]";
		private static final String BTTN_SAVE_EDIT_EMPLOYEE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
		public static final String GET_EMAIL_EMPLOYEE_PG_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div[1]/ul/li[5]/span[2]";
		
		private static final String UPLOAD_EMPLOYEE_PICT = "//*[@id=\"fileupload\"]";
		
		private static final String TXT_EMPLOYEE_2_FNAME_XPATH = "//*[@id=\"_asf2\"]";
		private static final String TXT_EMPLOYEE_2_LNAME_XPATH = "//*[@id=\"_asl2\"]";
		private static final String TXT_EMPLOYEE_2_EMAIL_XPATH = "//*[@id=\"_ase2\"]";
		
		private static final String TXT_EMPLOYEE_3_FNAME_XPATH = "//*[@id=\"_asf3\"]";
		private static final String TXT_EMPLOYEE_3_LNAME_XPATH = "//*[@id=\"_asl3\"]";
		private static final String TXT_EMPLOYEE_3_EMAIL_XPATH = "//*[@id=\"_ase3\"]";
		
		private static final String TXT_EMPLOYEE_4_FNAME_XPATH = "//*[@id=\"_asf4\"]";
		private static final String TXT_EMPLOYEE_4_LNAME_XPATH = "//*[@id=\"_asl4\"]";
		private static final String TXT_EMPLOYEE_4_EMAIL_XPATH = "//*[@id=\"_ase4\"]";
		
		private static final String TXT_EMPLOYEE_5_FNAME_XPATH = "//*[@id=\"_asf5\"]";
		private static final String TXT_EMPLOYEE_5_LNAME_XPATH = "//*[@id=\"_asl5\"]";
		private static final String TXT_EMPLOYEE_5_EMAIL_XPATH = "//*[@id=\"_ase5\"]";
		
		private static final String BTTN_ADMIN_ACCOUNT_EXPAND_XPATH = "//*[@id=\"wrap_us_menu\"]/i";
		private static final String BTTN_ADMIN_PROFILE_XPATH = "//*[@id=\"userm\"]/div/a[1]";
		private static final String BTTN_EDIT_ADMIN_DETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
		private static final String TXT_ADMIN_NICKNAME_XPATH = "//*[@id=\"nick_name\"]";
		private static final String TICKER_ADMIN_PHONE_VISIBILITY_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[10]/td[2]/input[2]";
		private static final String BTTN_ADMIN_SAVE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
			
		//staff
		public static void addEmployee(WebDriver driver) {
			driver.findElement(By.xpath(TAB_STAFF_ADD_EMPLOYEES_XPATH)).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_FNAME_XPATH)).sendKeys("Minoslav");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_LNAME_XPATH)).sendKeys("Mamovic");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_EMAIL_XPATH)).sendKeys("mamovic@bootcamp.com");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(BTTN_SAVE_EMPLOYEES_XPATH)).click();

			
		}
		
		public static void editEmployeeName(WebDriver driver) {
			driver.findElement(By.linkText("Mirko Jahic")).click();//employee
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(BTTN_EDIT_DETAILS_EMPLOYEE_XPATH)).click(); //edit details
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_CLEAR_NAME_FIELD_XPATH)).clear(); //clear name field
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_INPUT_NAME_FIELD_XPATH)).sendKeys("Jaroslav"); // input new name
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(BTTN_SAVE_EDIT_EMPLOYEE_XPATH)).click(); //bttn save
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void addEmployeePicture(WebDriver driver) {
			driver.findElement(By.linkText("Janko Dzimic")).click();//employee
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(BTTN_EDIT_DETAILS_EMPLOYEE_XPATH)).click(); //edit details
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			WebElement UploadImg = driver.findElement(By.xpath(UPLOAD_EMPLOYEE_PICT));
			UploadImg.sendKeys("C:\\Users\\LENOVO\\eclipse-workspace\\humanityProject\\maradona raw.jpg");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			driver.findElement(By.xpath(BTTN_SAVE_EDIT_EMPLOYEE_XPATH)).click(); //bttn save
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void inputEmployee1(WebDriver driver, String fname, String lname, String email) {
			driver.findElement(By.xpath(TXT_EMPLOYEE_FNAME_XPATH)).sendKeys(fname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_LNAME_XPATH)).sendKeys(lname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_EMAIL_XPATH)).sendKeys(email);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void inputEmployee2(WebDriver driver, String fname, String lname, String email) {
			driver.findElement(By.xpath(TXT_EMPLOYEE_2_FNAME_XPATH)).sendKeys(fname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_2_LNAME_XPATH)).sendKeys(lname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_2_EMAIL_XPATH)).sendKeys(email);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void inputEmployee3(WebDriver driver, String fname, String lname, String email) {
			driver.findElement(By.xpath(TXT_EMPLOYEE_3_FNAME_XPATH)).sendKeys(fname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_3_LNAME_XPATH)).sendKeys(lname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_3_EMAIL_XPATH)).sendKeys(email);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void inputEmployee4(WebDriver driver, String fname, String lname, String email) {
			driver.findElement(By.xpath(TXT_EMPLOYEE_4_FNAME_XPATH)).sendKeys(fname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_4_LNAME_XPATH)).sendKeys(lname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_4_EMAIL_XPATH)).sendKeys(email);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void inputEmployee5(WebDriver driver, String fname, String lname, String email) {
			driver.findElement(By.xpath(TXT_EMPLOYEE_5_FNAME_XPATH)).sendKeys(fname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_5_LNAME_XPATH)).sendKeys(lname);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_EMPLOYEE_5_EMAIL_XPATH)).sendKeys(email);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void navigateToAdminProfile(WebDriver driver) {
			driver.findElement(By.xpath(BTTN_ADMIN_ACCOUNT_EXPAND_XPATH)).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(BTTN_ADMIN_PROFILE_XPATH)).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public static void editAdminDetails(WebDriver driver) {
			driver.findElement(By.xpath(BTTN_EDIT_ADMIN_DETAILS_XPATH)).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TXT_ADMIN_NICKNAME_XPATH)).sendKeys("Maradona");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(TICKER_ADMIN_PHONE_VISIBILITY_XPATH)).click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath(BTTN_ADMIN_SAVE_XPATH)).click();
			
		}
		
}
