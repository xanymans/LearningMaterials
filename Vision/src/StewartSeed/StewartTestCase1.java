package StewartSeed;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.*;

public class StewartTestCase1 {
	private WebDriver driver;
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(StewartTestCase1.class.getName());
	//ExtentReports report;
	//ExtentTest test;

  
  @BeforeMethod
  public void beforeMethod() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//test.log(LogStatus.INFO, "Browser Started");
		baseUrl = "http://eservices-t.stewartseeds.com";
		//report = new ExtentReports("//Users//atomar//Desktop//logintest.html");
		//test = report.startTest("Verify Welcome Text");
		
		driver.manage().window().maximize();
		//test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);	
		//test.log(LogStatus.INFO, "Web Application Opened");
		
  }
  
  
  @Parameters( { "username", "password" } )
  @Test
  public void login(String username, String password) throws InterruptedException {
	  
		StewartTestCaseFactory.fillUsername(driver, username);
		StewartTestCaseFactory.fillPassword(driver, password);
		StewartTestCaseFactory.clickOnLoginButton(driver);
		Thread.sleep(2000);
		//*************************************************************//
		String homeTitle = driver.getTitle();
		Reporter.log("The actual string is " + homeTitle, true);
		Assert.assertEquals(homeTitle, "Home - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		Assert.assertTrue(StewartTestCaseFactory.homeUsername(driver).isDisplayed());
		Reporter.log("Verifying login username", true);
		log.info("Login Username Validation Passed");
		//*************************************************************//
	    StewartTestCaseFactory.clickOnCustomerOrderTab(driver);
	    Thread.sleep(2000);
	    StewartTestCaseFactory.clickOnCustomerOrderTabGoButton(driver);
	    Reporter.log("Customer Order Tab Clicked Successfully", true);
	    Thread.sleep(4000);
	    //*************************************************************//
		String customerOrderTitle = driver.getTitle();
		Reporter.log("The actual string is " + customerOrderTitle, true);
		Assert.assertEquals(customerOrderTitle, "Customers & Orders - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		String customerTitle = null;
		
		try {
			customerTitle = driver.getTitle();
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(customerTitle != null);
		//String customerOrderTitle = driver.getTitle();
		//Reporter.log("The actual string is " + customerOrderTitle, true);
		//Assert.assertEquals(customerOrderTitle, "Customers & Orders - SAP NetWeaver Portal");
		//Reporter.log("Verifying the actual string with expected value", true);
		//Reporter.log("");
		//log.info("Title Validation Passed");
		//*************************************************************//
		//Assert.assertTrue(StewartTestCaseFactory.searchCustomerTextfield(driver).isEnabled());
		//Reporter.log("Verifying the search Criteria field is displayed", true);
		//log.info("Search Customer field Validation Passed");
		//*************************************************************//
	 	StewartTestCaseFactory.clickOnDealerOrderTab(driver);
	 	Thread.sleep(2000);
	 	StewartTestCaseFactory.clickOnDealerOrderTabGoButton(driver);
	 	Reporter.log("Dealer Order Tab Clicked Successfully", true);
	 	Thread.sleep(4000);
	 	//*************************************************************//
		String dealerOrderTitle = driver.getTitle();
		Reporter.log("The actual string is " + dealerOrderTitle, true);
		Assert.assertEquals(dealerOrderTitle, "Dealer Order - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		StewartTestCaseFactory.clickOnInventoryTab(driver);
		Thread.sleep(2000);
		StewartTestCaseFactory.clickOnInventoryTabGoButton(driver);
		Reporter.log("Inventory Tab Clicked Successfully", true);
		Thread.sleep(4000);
		//*************************************************************//
		String inventoryTitle = driver.getTitle();
		Reporter.log("The actual string is " + inventoryTitle, true);
		Assert.assertEquals(inventoryTitle, "Inventory - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		StewartTestCaseFactory.clickOnReportTab(driver);
		Reporter.log("Report Tab Clicked Successfully", true);
		Thread.sleep(2000);
		//*************************************************************//
		String reportTitle = driver.getTitle();
		Reporter.log("The actual string is " + reportTitle, true);
		Assert.assertEquals(reportTitle, "Reports - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		StewartTestCaseFactory.clickOnAdditionalToolsTab(driver);
		Thread.sleep(2000);
		StewartTestCaseFactory.clickOnadditionalToolsTabGoButton(driver);
		Reporter.log("Additional Tools Tab Clicked Successfully", true);
		Thread.sleep(4000);
		//*************************************************************//
		String additionalToolsTitle = driver.getTitle();
		Reporter.log("The actual string is " + additionalToolsTitle, true);
		Assert.assertEquals(additionalToolsTitle, "Additional Tools - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		StewartTestCaseFactory.clickOnBillPayTab(driver);
		Reporter.log("Bill Pay Tab Clicked Successfully", true);
		Thread.sleep(2000);
		//*************************************************************//
		String billPayTitle = driver.getTitle();
		Reporter.log("The actual string is " + billPayTitle, true);
		Assert.assertEquals(billPayTitle, "Home - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		StewartTestCaseFactory.clickOnAdminTab(driver);
		Thread.sleep(2000);
		//*************************************************************//
		String adminTitle = driver.getTitle();
		Reporter.log("The actual string is " + adminTitle, true);
		Assert.assertEquals(adminTitle, "Admin - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
		log.info("Title Validation Passed");
		//*************************************************************//
		StewartTestCaseFactory.clickOnAdminTabGoButton(driver);
		Reporter.log("Admin Tab Clicked Successfully", true);
		Thread.sleep(4000);
		//*************************************************************//
		StewartTestCaseFactory.clickOnHelpTab(driver);
		Thread.sleep(2000);
		StewartTestCaseFactory.clickOnHelpTabGoButton(driver);
		Reporter.log("Help Tab Clicked Successfully", true);
		Thread.sleep(4000);
		//*************************************************************//
		StewartTestCaseFactory.clickOnPublisherTab(driver);
		Reporter.log("Publisher Tab Clicked Successfully", true);
		Thread.sleep(4000);
		//*************************************************************//
		StewartTestCaseFactory.clickOnLogOffButton(driver);
		//Assert.assertTrue(StewartTestCaseFactory.getloginusername(driver).contains("office person"));
		
  }

  
	

/* 
  public void verifyHomeTitle() {
		String actualString = driver.getTitle();
		Reporter.log("The actual string is " + actualString, true);
		Assert.assertEquals(actualString, "Home - SAP NetWeaver Portal");
		Reporter.log("Verifying the actual string with expected value", true);
		Reporter.log("");
  }
		
// @Test(priority = 2)
  public void clickonDifferentTabs() {
	    StewartTestCaseFactory.clickOnCustomerOrderTab(driver);
	 	StewartTestCaseFactory.clickOnDealerOrderTab(driver);
		StewartTestCaseFactory.clickOnInventoryTab(driver);
		StewartTestCaseFactory.clickOnReportTab(driver);
		StewartTestCaseFactory.clickOnAdditionalToolsTab(driver);
		StewartTestCaseFactory.clickOnBillPayTab(driver);
		StewartTestCaseFactory.clickOnAdminTab(driver);
		StewartTestCaseFactory.clickOnHelpTab(driver);
		StewartTestCaseFactory.clickOnPublisherTab(driver);
		StewartTestCaseFactory.clickOnLogOffButton(driver);
		//Assert.assertTrue(StewartTestCaseFactory.titleText(driver,"Customers & Orders - SAP NetWeaver Portal").toLowerCase().contains("Customers & Orders - SAP NetWeaver Portal"));
 }		
		
		*/
  
  
  
  @AfterMethod
  public void afterMethod() {
  }

}
