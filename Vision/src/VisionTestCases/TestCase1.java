package VisionTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import StewartSeed.WaitTypes;

public class TestCase1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		String path = "C:\\Eclipse Workspace\\Vision\\src\\VisionTestCases\\test.properties";
		Properties property = new Properties();
		FileInputStream fs = new FileInputStream(path);
		
		property.load(fs);
		//System.out.println(property.getProperty("userID"));
		
		WebDriver driver;
		WaitTypes wt;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wt = new WaitTypes(driver);
		
		driver.get(property.getProperty("url"));
		
	//********************LOGGING IN******************************************************************************
		
		//driver.findElement(By.xpath("//div[@id='login_fields']/table/tbody/tr[2]/td[3]/input")).sendKeys(property.getProperty("userID"));
		driver.findElement(By.xpath("//div[@id='login_fields']//input[contains(@name,'pf.username')]")).sendKeys(property.getProperty("userID"));
		driver.findElement(By.cssSelector("#login_fields > table > tbody > tr:nth-child(3) > td:nth-child(3) > input[type='password']")).sendKeys(property.getProperty("password"));;
		//driver.findElement(By.xpath("//div[@id='login_fields']/table/tbody/tr[4]/td[2]/button")).click();
		driver.findElement(By.xpath("//div[@id='login_fields']//button[text()='Log On']")).click();
		driver.findElement(By.xpath("//div[@id='nav_tbl']//a[text()='Customers & Orders']")).click();
		Thread.sleep(4000);
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		//WebElement dropdown1 = wt.waitForElement(By.id("dealerList"), 5);
		//Select dropdown = new Select (driver.findElement(By.id("dealerList")));
		//dropdown.selectByValue("3260700");
		//driver.findElement(By.xpath("//a[@id='LogoffLink']/span/span")).click();
		//a[@id="LogoffLink"]/span/span
		//div[@id="action_bar_1_5row"]/div/table/tbody/tr[1]/td[8]/input
		//select[@id="viewList"]
		//*[@id="viewList"]
		
		driver.switchTo().frame("isolatedWorkArea");
		Select dropdown = new Select (driver.findElement(By.id("dealerList")));
		dropdown.selectByValue("3260700");
		
		driver.findElement(By.xpath("//div[@id='action_bar_1_5row']/div/table/tbody/tr[1]/td[8]/input")).click();

	}

}

//div[@id = 'radio-btn-example']//radio[contains(@text,'BMW']