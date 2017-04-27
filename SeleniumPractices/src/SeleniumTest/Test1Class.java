package SeleniumTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1Class {

	public static void main(String[] args) {
		String url = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installer\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
	}

}
