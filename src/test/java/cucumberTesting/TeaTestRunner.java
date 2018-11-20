package cucumberTesting;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.relevantcodes.extentreports.ExtentReports;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Tea.feature")
public class TeaTestRunner {
public static WebDriver driver;
public static ExtentReports report = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\seleniumTesting\\src\\test\\java\\teaReport.html", true);

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
		driver.quit();
		report.flush();
	}
}
