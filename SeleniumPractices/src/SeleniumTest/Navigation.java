package SeleniumTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	String url = "https://letskodeit.teachable.com/p/practice";
	WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		String newUrl = driver.getCurrentUrl();
		System.out.println("Current Url:" + newUrl);
		
		if (url == newUrl) {
			System.out.println("Url Matches");
		}
		
		else {
			System.out.println("Url does not match");
		}
		
		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		
		newUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + newUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		newUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + newUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate Forward");
		newUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + newUrl);
		
		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(newUrl);
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.quit();
	}



}
