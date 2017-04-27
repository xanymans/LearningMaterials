package StewartSeedTestCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class loginPageFactory {

	ExtentTest test;
	WebDriver driver = null;

	public loginPageFactory(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}
	
	
	public void fillUsername(String usrnme) {
		WebElement username = driver.findElement(By.name("pf.username"));
		username.sendKeys(usrnme);
		test.log(LogStatus.INFO, "Enter username");
	}
	
	public void fillPassword(String pwd) {
		WebElement password = driver.findElement(By.name("pf.pass"));
		password.sendKeys(pwd);
		test.log(LogStatus.INFO, "Enter password");
	}
	
	public void clickOnLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//div[@id='login_fields']//button[text()='Log On']"));
		loginButton.click();
		test.log(LogStatus.INFO, "Clicked on login button");
	}
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public boolean verifypageTitle() {
		String welcomeTitle = "Home - SAP NetWeaver Portal";
		test.log(LogStatus.INFO, "Validation of Home Page Title");
		//return getPageTitle().contains(welcomeTitle);
		try {
			if (welcomeTitle.contains("Home - SAP NetWeaver Portal")) {
				test.log(LogStatus.PASS, "Validation of Home Page Title Successful");
				return true;
			}
		
			else {
				test.log(LogStatus.FAIL, "Validation of Home Page Title Not Successful");
			}	
		}
			
		catch (NoSuchElementException e) {
				System.out.println(e.getMessage());
				return false;
		}
			return false;
	}
	
	public boolean isWelcomeUsernamePresent() {
		String welcomeUsername;
		try {
			welcomeUsername = driver.findElement(By.xpath("//div[@id='hdr_user']/table/tbody/tr/td")).getText();
			if (welcomeUsername.toLowerCase().contains("office person")) {
				return true;
			}
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}
	
	public void login(String usrnme, String pwd) {
		fillUsername(usrnme);
		fillPassword(pwd);
		clickOnLoginButton();
		
	}
	

}

