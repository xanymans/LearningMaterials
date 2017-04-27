package StewartSeedTestCase1;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String Path = "C:\\Users\\ptula\\Documents\\Selenium\\Reports\\report-demo.html";
		extent = new ExtentReports(Path, false);
		extent
	    // .addSystemInfo("Selenium Version", "2.52")
	     .addSystemInfo("Platform", "Windows");

		return extent;
	}

}
