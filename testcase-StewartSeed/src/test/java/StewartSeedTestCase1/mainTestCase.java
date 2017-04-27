package StewartSeedTestCase1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class mainTestCase {
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	loginPageFactory loginpf;
	MultipleTabPageFactory mtp;

	@BeforeClass
	public void beforeMethod() {
		baseUrl = "http://eservices-t.stewartseeds.com";
		report = ExtentFactory.getInstance();
		test = report.startTest("Stewart Seed Test Case");
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		loginpf = new loginPageFactory(driver, test);
		mtp = new MultipleTabPageFactory(driver, test);
		test.log(LogStatus.INFO, "Browser Started");

		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web Application Opened");

	}

	
	@Test(priority = 0)
	public void login() throws InterruptedException {
		loginpf.login("office.person", "Test_123");

		Thread.sleep(3000);

		boolean result = loginpf.verifypageTitle();

		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Title Text");

		// Assert.assertTrue(loginpf.verifypageTitle(), "Home Page title does
		// not match");
		// test.log(LogStatus.PASS, "Verified Welcome Text");

		boolean result1 = loginpf.isWelcomeUsernamePresent();

		Assert.assertTrue(result1);
		test.log(LogStatus.PASS, "Verified Welcome Username");
	}

	@Test(priority = 1)
	public void navigatingTabs() throws InterruptedException {
		mtp.clickOnCustomerOrderTab();
		mtp.clickOnCustomerOrderTabGoButton();
		Thread.sleep(3000);

		boolean result2 = mtp.verifyCustomerOrderTitle();
		Assert.assertTrue(result2);
		test.log(LogStatus.PASS, "Verified Customer Order Title Text");

		boolean result3 = mtp.searchCustomerField();
		Assert.assertTrue(result3);
		test.log(LogStatus.PASS, "Verified Search Customer Field is displayed");
		// **********************************************************************************************************//

		Thread.sleep(6000);
		mtp.clickOnDealerOrderTab();
		mtp.clickOnDealerOrderTabGoButton();

		boolean result4 = mtp.verifyDealerOrderTitle();
		Assert.assertTrue(result4);
		test.log(LogStatus.PASS, "Verified Dealer Order Title Text");
		Thread.sleep(4000);
		// **********************************************************************************************************//

		mtp.clickOnInventoryTab();
		mtp.clickOnInventoryTabGoButton();
		Thread.sleep(4000);

		boolean result5 = mtp.verifyInventoryTitle();
		Assert.assertTrue(result5);
		test.log(LogStatus.PASS, "Verified Inventory Title Text");
		// **********************************************************************************************************//

		mtp.clickOnReportTab();
		Thread.sleep(2000);

		boolean result6 = mtp.verifyReportsTitle();
		Assert.assertTrue(result6);
		test.log(LogStatus.PASS, "Verified Reports Title Text");
		// **********************************************************************************************************//

		mtp.clickOnAdditionalToolsTab();
		mtp.clickOnadditionalToolsTabGoButton();
		Thread.sleep(3000);

		boolean result7 = mtp.verifyAdditionalToolsTitle();
		Assert.assertTrue(result7);
		test.log(LogStatus.PASS, "Verified Reports Title Text");
		// **********************************************************************************************************//
		
		mtp.clickOnBillPayTab();
		
		boolean result8 = mtp.isTesxtPresent();
		Assert.assertTrue(result8);
		test.log(LogStatus.PASS, "Verified Page Text");
		// **********************************************************************************************************//
		
		mtp.clickOnAdminTab();
		
		boolean result9 = mtp.verifyAdminTitle();
		Assert.assertTrue(result9);
		test.log(LogStatus.PASS, "Verified Page Title Text");
		

	}

	@Test(priority = 2)
	public void logoff() throws InterruptedException {
		mtp.clickOnLogOffButton();
	}

	@AfterClass
	public void afterMethod() {
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
