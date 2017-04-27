package StewartSeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StewartTestCaseFactory {

	public static WebElement element = null;
	public static String elm_title=null; 
	private static final Logger log = LogManager.getLogger(StewartTestCaseFactory.class.getName());
	
	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.name("pf.username"));
		log.info("Username text box element found");
		return element;
	}
	
	public static void fillUsername(WebDriver driver, String usrnme) {
		element = username(driver);
		element.sendKeys(usrnme);
		log.info("Enter username as " + usrnme);
	}
	
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.name("pf.pass"));
		log.info("Password text box element found");
		return element;
	}
	
	public static void fillPassword(WebDriver driver, String pwd) {
		element = password(driver);
		element.sendKeys(pwd);
		log.info("Enter password as " + pwd);
	}

	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='login_fields']//button[text()='Log On']"));
		return element;
	}

	
	public static void clickOnLoginButton(WebDriver driver) {
		element = loginButton(driver);
		element.click();
	}
	
	public static WebElement homeUsername(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='hdr_user']/table/tbody/tr/td"));
		return element;
	}
	
	
	public static WebElement getloginusername(WebDriver driver){
		element = homeUsername(driver);
		element.getText();
		return element;
	}
	
	public static WebElement customerOrderTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Customers & Orders']"));
		return element;
	}

	
	public static void clickOnCustomerOrderTab(WebDriver driver) {
		element = customerOrderTab(driver);
		element.click();
		log.info("Navigate to Customers tab");
	}
	
	public static WebElement customerOrderTabGO(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.xpath("//div[@id='action_bar_1_5row']/div/table/tbody/tr[1]/td[8]/input"));
		return element;
	}

	
	public static void clickOnCustomerOrderTabGoButton(WebDriver driver) {
		element = customerOrderTabGO(driver);
		element.click();
		driver.switchTo().defaultContent();
		log.info("Click on Go");
	}
	
	public static WebElement searchCustomerTextfield(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.id("searchCriteriaName"));
		driver.switchTo().defaultContent();
		return element;
	}
	
	public static String titleText(WebDriver driver, String text) {
		elm_title= driver.getTitle();
		return elm_title;
	}
	
	public static WebElement dealerOrderTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Dealer Order']"));
		return element;
	}

	
	public static void clickOnDealerOrderTab(WebDriver driver) {
		element = dealerOrderTab(driver);
		element.click();
		log.info("Navigate to Dealers tab");
	}	
	
	public static WebElement dealerOrderTabGO(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.xpath("//div[@id='action_bar_1row']/table/tbody/tr/td[7]/input"));
		return element;
	
	}

	
	public static void clickOnDealerOrderTabGoButton(WebDriver driver) {
		element = dealerOrderTabGO(driver);
		element.click();
		driver.switchTo().defaultContent();
		log.info("Click Go");
	}
	
	public static WebElement inventoryTabGO(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.xpath("//div[@id='action_bar_lft_3row']/table/tbody/tr[3]/td[5]/input"));
		return element;
	
	}

	
	public static void clickOnInventoryTabGoButton(WebDriver driver) {
		element = inventoryTabGO(driver);
		element.click();
		driver.switchTo().defaultContent();
		log.info("Click Go");
	}
	
	public static WebElement inventoryTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Inventory']"));
		return element;
	}

	
	public static void clickOnInventoryTab(WebDriver driver) {
		element = inventoryTab(driver);
		element.click();
		log.info("Navigate to Inventory tab");
	}	
	
	public static WebElement reportsTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Reports']"));
		return element;
	}

	
	public static void clickOnReportTab(WebDriver driver) {
		element = reportsTab(driver);
		element.click();
		log.info("Navigate to Reports tab");
	}
	
	
	public static WebElement additionalToolsTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Additional Tools']"));
		return element;
	}

	
	public static void clickOnAdditionalToolsTab(WebDriver driver) {
		element = additionalToolsTab(driver);
		element.click();
		log.info("Navigate to Additional Tools tab");
	}	
	
	public static WebElement additionalToolsTabGO(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.xpath("//div[@id='action_bar_1_5row']/table/tbody/tr[1]/td[8]/input"));
		return element;
	}

	
	public static void clickOnadditionalToolsTabGoButton(WebDriver driver) {
		element = additionalToolsTabGO(driver);
		element.click();
		driver.switchTo().defaultContent();
		log.info("Click Go");
	}
	
	public static WebElement billPayTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Bill Pay']"));
		return element;
	}

	
	public static void clickOnBillPayTab(WebDriver driver) {
		element = billPayTab(driver);
		element.click();
		log.info("Navigate to Bill Pay tab");
	}	
	
	public static WebElement adminTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Admin']"));
		return element;
	}

	
	public static void clickOnAdminTab(WebDriver driver) {
		element = adminTab(driver);
		element.click();
		log.info("Navigate to Admin tab");
	}	
	
	public static WebElement adminTabGO(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.xpath("//form[@id='usersFormId']/table/tbody/tr/td[6]/input"));
		return element;
		
	}

	
	public static void clickOnAdminTabGoButton(WebDriver driver) {
		element = adminTabGO(driver);
		element.click();
		driver.switchTo().defaultContent();
		log.info("Click Go");
	}
	
	public static WebElement helpTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Help']"));
		return element;
	}

	
	public static void clickOnHelpTab(WebDriver driver) {
		element = helpTab(driver);
		element.click();
		log.info("Navigate to Help tab");
	}	
	
	public static WebElement helpTabGO(WebDriver driver) {
		driver.switchTo().frame("isolatedWorkArea");
		element = driver.findElement(By.xpath("//div[@id='action_bar_lft_1row']/table/tbody/tr/td[3]/input"));
		return element;
		
	}

	
	public static void clickOnHelpTabGoButton(WebDriver driver) {
		element = helpTabGO(driver);
		element.click();
		driver.switchTo().defaultContent();
		log.info("Click Go");
	}
	
	public static WebElement publisherTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Publisher']"));
		return element;
	}

	
	public static void clickOnPublisherTab(WebDriver driver) {
		element = publisherTab(driver);
		element.click();
		log.info("Navigate to Publishers tab");
	}	
	
	public static WebElement logoffButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='LogoffLink']/span/span"));
		return element;
	}

	
	public static void clickOnLogOffButton(WebDriver driver) {
		element = logoffButton(driver);
		element.click();
	}
	
	
	public static WebElement originTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-origin"));
		log.info("Origin text box element found");
		return element;
	}
	
	/**
	 * Fill origin city in origin text box
	 * @param driver
	 * @param origin
	 */
	public static void fillOriginTextBox(WebDriver driver, String origin) {
		element = originTextBox(driver);
		element.sendKeys(origin);
		log.info("Enter origin city as " + origin);
	}

	/**
	 * Returns the flight destination text box element
	 * @param driver
	 * @return
	 */
	public static WebElement destinationTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-destination"));
		log.info("Destination text box element found");
		return element;
	}
	
	/**
	 * Fill destination city in destination text box
	 * @param driver
	 * @param origin
	 */
	public static void fillDestinationTextBox(WebDriver driver, String destination) {
		element = destinationTextBox(driver);
		element.sendKeys(destination);
		log.info("Enter destination city as " + destination);
	}

	/**
	 * Returns the departure date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement departureDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}

	/**
	 * Returns the return date text box element
	 * @param driver
	 * @return
	 */
	public static WebElement returnDateTextBox(WebDriver driver) {
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}

	/**
	 * Returns the search button box element
	 * @param driver
	 * @return
	 */
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.id("search-button"));
		return element;
	}

	/**
	 * Click on search button
	 * @param driver
	 */
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
	/**
	 * Navigate to flights tab
	 * @param driver
	 */
	public static void navigateToFlightsTab(WebDriver driver) {
		driver.findElement(By.id("header-history")).click();
		element = driver.findElement(By.id("tab-flight-tab"));
		element.click();

	}
	
}


/*private WebDriver driver;

@FindBy(name="pf.username")
WebElement username;

@FindBy(name="pf.pass")
WebElement password;

@FindBy(xpath="//div[@id='login_fields']//button[text()='Log On']")
WebElement loginbutton;

@FindBy(xpath="//div[@id='hdr_user']/table/tbody/tr/td")
WebElement usernametext;
	
@FindBy(xpath="//div[@id='nav_tbl']//a[text()='Customers & Orders']")
WebElement customerOrderTab;

@FindBy(xpath="//div[@id='action_bar_1_5row']//input[@type='button']")
WebElement gobutton;
//*[@id="action_bar_1_5row"]/div/table/tbody/tr[1]/td[8]/input
//#action_bar_1_5row > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > input[type="button"]

@FindBy(id="flight-returning")
WebElement returnDate;

public StewartTestCaseFactory(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void setUsername(String userid) {
	username.sendKeys(userid);
}

public void setPassword(String pwd) {
	password.sendKeys(pwd);
}

public void clickLogin() {
	loginbutton.click();
}

public String getLoginTitle() {
	return usernametext.getText();
	
}
public void clickCustomerOrderTab() {
	customerOrderTab.click();
}

public void clickGo() {
	gobutton.click();
}*/
