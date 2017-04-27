package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lst-ib
		
		String url = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys(Keys.ENTER);
		
		System.out.println("Test Passed");
	}

}
////*[@id="lst-ib"]
////*[@id="_fZl"]/span/svg

//#displayed-text
//#name
//#product
////*[@id="login_fields"]///button

//table[@id="product"]//td[text()='Python Programming Language']//following-sibling::td

//div[@id="cgrid2_1489095694420"]//td[text()='73566 Willie Trail']//following-sibling::td[3]

//*[@id="bmwradio"]
//div[@id = 'radio-btn-example']