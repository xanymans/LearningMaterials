package StewartSeedTestCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MultipleTabPageFactory {

	ExtentTest test;
	WebDriver driver = null;

	public MultipleTabPageFactory(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

	public void clickOnCustomerOrderTab() {
		WebElement customerOrderTab = driver
				.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Customers & Orders']"));
		customerOrderTab.click();
		test.log(LogStatus.INFO, "Clicked on Customer Order Tab");
	}

	public void clickOnCustomerOrderTabGoButton() {
		driver.switchTo().frame("isolatedWorkArea");
		WebElement customerOrderTabGO = driver
				.findElement(By.xpath("//div[@id='action_bar_1_5row']/div/table/tbody/tr[1]/td[8]/input"));
		customerOrderTabGO.click();
		driver.switchTo().defaultContent();
		test.log(LogStatus.INFO, "Clicked on Go button");
	}

	public boolean verifyCustomerOrderTitle() {
		String customerOrderTitle = "Customers & Orders - SAP NetWeaver Portal";
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.INFO, "Validation of Customer Order Title");
		// return getPageTitle().contains(welcomeTitle);
		try {
			if (customerOrderTitle.contains(title)) {
				test.log(LogStatus.PASS, "Validation of Customer Page Title Successful");
				return true;
			}

			else {
				test.log(LogStatus.FAIL, "Validation of Customer Page Title Not Successful");
			}
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	public boolean searchCustomerField() {
		driver.switchTo().frame("isolatedWorkArea");

		try {
			WebElement customerField = driver.findElement(By.id("searchCriteriaName"));
			if (customerField.isDisplayed()) {
				return true;
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			test.log(LogStatus.FAIL, "Validation Not Successful");
			return false;
		}
		//driver.switchTo().defaultContent();
		return false;
	}

	public void clickOnDealerOrderTab() {
		driver.switchTo().defaultContent();
		try {
			WebElement dealerOrderTab = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Dealer Order']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(dealerOrderTab).perform();
			if (dealerOrderTab.isDisplayed()) {
				dealerOrderTab.click();
				test.log(LogStatus.INFO, "Clicked on Dealer Order Tab button");
			}
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			test.log(LogStatus.INFO, "Unable to click on Dealer Order Tab button");
		}
	}

	public void clickOnDealerOrderTabGoButton() {
		driver.switchTo().frame("isolatedWorkArea");
		WebElement dealerOrderTabGO = driver
				.findElement(By.xpath("//div[@id='action_bar_1row']/table/tbody/tr/td[7]/input"));
		dealerOrderTabGO.click();
		driver.switchTo().defaultContent();
		test.log(LogStatus.INFO, "Clicked on Go button");
	}

	public boolean verifyDealerOrderTitle() {
		String dealerOrderTitle = "Dealer Order - SAP NetWeaver Portal";
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.INFO, "Validation of Customer Order Title");
		// return getPageTitle().contains(welcomeTitle);
		try {
			if (dealerOrderTitle.contains(title)) {
				test.log(LogStatus.PASS, "Validation of Page Title Successful");
				return true;
			}

			else {
				test.log(LogStatus.FAIL, "Validation of Page Title Not Successful");
			}
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	public void clickOnInventoryTab() {
		driver.switchTo().defaultContent();
		WebElement inventoryTab = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Inventory']"));
		inventoryTab.click();
		test.log(LogStatus.INFO, "Clicked on inventory Tab button");
	}

	public void clickOnInventoryTabGoButton() {
		driver.switchTo().frame("isolatedWorkArea");
		WebElement inventoryTabGO = driver
				.findElement(By.xpath("//div[@id='action_bar_lft_3row']/table/tbody/tr[3]/td[5]/input"));
		inventoryTabGO.click();
		driver.switchTo().defaultContent();
		test.log(LogStatus.INFO, "Clicked on Go button");
	}

	public boolean verifyInventoryTitle() {
		String inventoryTitle = "Inventory - SAP NetWeaver Portal";
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.INFO, "Validation of Customer Order Title");
		// return getPageTitle().contains(welcomeTitle);
		try {
			if (inventoryTitle.contains(title)) {
				test.log(LogStatus.PASS, "Validation of Page Title Successful");
				return true;
			}

			else {
				test.log(LogStatus.FAIL, "Validation of Page Title Not Successful");
			}
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	public void clickOnReportTab() {
		WebElement reportsTab = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Reports']"));
		reportsTab.click();
		test.log(LogStatus.INFO, "Clicked on Reports Tab button");
	}

	public boolean verifyReportsTitle() {
		String reportsTitle = "Reports - SAP NetWeaver Portal";
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.INFO, "Validation of Reports Title");
		// return getPageTitle().contains(welcomeTitle);
		try {
			if (reportsTitle.contains(title)) {
				test.log(LogStatus.PASS, "Validation of Page Title Successful");
				return true;
			}

			else {
				test.log(LogStatus.FAIL, "Validation of Page Title Not Successful");
			}
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	public void clickOnAdditionalToolsTab() {
		WebElement additionalToolsTab = driver
				.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Additional Tools']"));
		additionalToolsTab.click();
		test.log(LogStatus.INFO, "Clicked on Additional Tools Tab button");
	}

	public void clickOnadditionalToolsTabGoButton() {
		driver.switchTo().frame("isolatedWorkArea");
		WebElement additionalToolsTabGO = driver
				.findElement(By.xpath("//div[@id='action_bar_1_5row']/table/tbody/tr[1]/td[8]/input"));
		additionalToolsTabGO.click();
		driver.switchTo().defaultContent();
		test.log(LogStatus.INFO, "Clicked on Go button");
	}

	public boolean verifyAdditionalToolsTitle() {
		String additionalToolsTitle = "Additional Tools - SAP NetWeaver Portal";
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.INFO, "Validation of Additional Tools Title");
		// return getPageTitle().contains(welcomeTitle);
		try {
			if (additionalToolsTitle.contains(title)) {
				test.log(LogStatus.PASS, "Validation of Page Title Successful");
				return true;
			}

			else {
				test.log(LogStatus.FAIL, "Validation of Page Title Not Successful");
			}
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}
	
	public void clickOnBillPayTab() {
		WebElement billPayTab = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Bill Pay']"));
		billPayTab.click();
		test.log(LogStatus.INFO, "Clicked on Bills Pay Tab button");
	}
	
	public boolean isTesxtPresent() {
		driver.switchTo().frame("isolatedWorkArea");
		String text1 = "Stewart Seeds Bill Pay";
		String pagetext = driver.findElement(By.xpath("//div[@id='main_content']/h1[1]")).getText();
				//div[@id='main_content']/h1[1]
		try {
			if (pagetext.contentEquals(text1)) {
				test.log(LogStatus.PASS, "Validation of Page Text Successful");
				return true;
			}
			else {
				test.log(LogStatus.FAIL, "Validation of Page Text Not Successful");
			}
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}

	public void clickOnAdminTab() {
		driver.switchTo().defaultContent();
		WebElement adminTab = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Admin']"));
		adminTab.click();
		test.log(LogStatus.INFO, "Clicked on Admin Tab button");
	}
	
	public boolean verifyAdminTitle() {
		String adminTitle = "Admin - SAP NetWeaver Portal";
		String title = driver.getTitle();
		System.out.println(title);
		test.log(LogStatus.INFO, "Validation of Admin Title");
		// return getPageTitle().contains(welcomeTitle);
		try {
			if (adminTitle.contains(title)) {
				test.log(LogStatus.PASS, "Validation of Page Title Successful");
				return true;
			}

			else {
				test.log(LogStatus.FAIL, "Validation of Page Title Not Successful");
			}
		}

		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}
	
	
	public void clickOnLogOffButton() {
		WebElement logoffButton = driver.findElement(By.xpath("//a[@id='LogoffLink']/span/span"));
		logoffButton.click();
		test.log(LogStatus.INFO, "Clicked on Log OFF");
	}

}
