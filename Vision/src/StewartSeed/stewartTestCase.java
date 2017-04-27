/*package StewartSeed;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import StewartSeed.WaitTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class stewartTestCase {
StewartTestCaseFactory searchPage;
private WebDriver driver;
WaitTypes wt;


	@Before
	public void setUp() throws Exception {
		String path = "C:\\Eclipse Workspace\\Vision\\src\\StewartSeed\\test.properties";
		Properties property = new Properties();
		FileInputStream fs = new FileInputStream(path);
		property.load(fs);
		
		wt = new WaitTypes(driver);
		
		//private static final Logger log = LogManager.getLogger(Logging.class.getName());
		//static Logger log = Logger.getLogger(stewartTestCase.class);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
		
		searchPage = new StewartTestCaseFactory(driver);
		driver.get(property.getProperty("url"));		
	}

	@Test
	public void test() {
		searchPage.setUsername("office.person");
		searchPage.setPassword("Test_123");
		searchPage.clickLogin();
		Assert.assertTrue(searchPage.getLoginTitle().toLowerCase().contains("office person"));
		searchPage.clickCustomerOrderTab();
	
		//searchPage.gobutton = wt.waitForElement(By.xpath("//div[@id='action_bar_1_5row']//input[@type='button']"), 5);
		//searchPage.clickGo();
		
	}
		
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
*/