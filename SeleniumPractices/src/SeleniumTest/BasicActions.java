package SeleniumTest;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActions {
	
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
	public void test() {
		driver.get(url);
		driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
		System.out.println("Log in");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		driver.findElement(By.id("user_password")).sendKeys("test");
		driver.findElement(By.id("user_email")).clear();
	
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
