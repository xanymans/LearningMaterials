package SeleniumTest;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBoxes {

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
		//WebElement bmwRadioBtn = driver.findElement(By.xpath("//div[@id = 'radio-btn-example']//input[contains(@name,'cars') and contains(text(),'BMW')]"));
		//bmwRadioBtn.click();
		boolean isChecked = false;
		List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		int size = radiobuttons.size();
		System.out.println("Size of the list:" + size);
		for (int i=0; i<size; i++) {
			isChecked = radiobuttons.get(i).isSelected();
			
			if (!isChecked) {
				radiobuttons.get(i).click();
				Thread.sleep(2000);
			}
			
		}
		
		boolean isSelected = false;
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[contains(@type,'checkbox') and contains(@name,'cars')]"));
		int sizes = checkboxes.size();
		System.out.println("Size of the checkboxes:" + sizes);
		
		for (int i = 0; i<sizes; i++) {
			isSelected = checkboxes.get(i).isSelected();
			
			if (!isSelected) {
				checkboxes.get(i).click();
				Thread.sleep(2000);
			}
		}
		
		//while (String i == )
		
		Thread.sleep(2000);
	}
	
	

	@After
	public void tearDown() throws Exception {
	}



}
