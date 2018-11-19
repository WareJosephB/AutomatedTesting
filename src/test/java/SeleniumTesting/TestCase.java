package SeleniumTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Websites.DemoSiteLoginPage;
import Websites.DemoSiteMakeUser;
import Websites.FlightHomepage;
import Websites.FlightResultsPage;
import Websites.ShopSiteResultsPage;
import Websites.ShopSiteSearchPage;
import Websites.StoreDemoQA;
import Websites.StoreDemoQAResults;

public class TestCase {
	private static WebDriver driver;
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testLogin() throws Exception {
		driver.get("http://thedemosite.co.uk/savedata.php");
		DemoSiteMakeUser page = PageFactory.initElements(driver, DemoSiteMakeUser.class);
		page.makeUser("Joseph", "password");

		driver.get("http://thedemosite.co.uk/login.php");
		DemoSiteLoginPage page2 = PageFactory.initElements(driver, DemoSiteLoginPage.class);
		page2.logIn("Joseph", "password");

		assertEquals("**Successful Login**", page2.getConfirmation());

	}

	@Test
	public void testDress() throws Exception {
		driver.get("http://automationpractice.com/index.php");
		ShopSiteSearchPage page = PageFactory.initElements(driver, ShopSiteSearchPage.class);
		page.search("dress");
		ShopSiteResultsPage page2 = PageFactory.initElements(driver, ShopSiteResultsPage.class);
		assertEquals(7, page2.numberOfResults());

	}

	@Test
	public void testiPod() throws Exception{
		driver.get("http://store.demoqa.com");
		StoreDemoQA page = PageFactory.initElements(driver, StoreDemoQA.class);
		page.search("ipod");
		StoreDemoQAResults page2 = PageFactory.initElements(driver, StoreDemoQAResults.class);
		assertEquals("$10.00", page2.getFirstPrice());
				
	}
	
	@Test
	public void testFlights() throws Exception{
		driver.get("https://www.phptravels.net");
		FlightHomepage page = PageFactory.initElements(driver, FlightHomepage.class);
		page.findHoliday("London");
		FlightResultsPage page2 = PageFactory.initElements(driver, FlightResultsPage.class);
		assertEquals("Rendezvous Hotels", page2.returnFirstResultName());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}