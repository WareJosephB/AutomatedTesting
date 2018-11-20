package cucumberTesting;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import teaSite.TeaCheckout;
import teaSite.TeaHome;

public class TeaSteps {

	public static WebDriver driver = TeaTestRunner.driver;
	public static ExtentReports report = TeaTestRunner.report;
	public static ExtentTest test;
	public static int number = 1;

	@Given("^the correct web address$")
	public void the_correct_web_address() {
		test = report.startTest("Test"+String.valueOf(number));
		number++;
		driver.get("http://www.practiceselenium.com/welcome.html");
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
		TeaHome page = PageFactory.initElements(driver, TeaHome.class);
		page.menu.click();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		TeaCheckout page2 = PageFactory.initElements(driver, TeaCheckout.class);
		assertEquals("Green Tea", page2.greenTea.getText());
		assertEquals("Red Tea", page2.redTea.getText());
		assertEquals("Oolong Tea", page2.oolong.getText());
		if (page2.greenTea.getText().equals("Green Tea") && page2.redTea.getText().equals("Red Tea") && page2.oolong.getText().equals("Oolong Tea")) {
			test.log(LogStatus.PASS, "Found available products.");
		} else {
			test.log(LogStatus.FAIL, "Couldn't find products.");
		}
		report.endTest(test);
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
		TeaHome page = PageFactory.initElements(driver, TeaHome.class);
		page.checkout.click();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
		if (driver.getCurrentUrl().equals("http://www.practiceselenium.com/check-out.html")) {
			test.log(LogStatus.PASS, "Succesfully navigated to Checkout Page");
		} else {
			test.log(LogStatus.FAIL, "Did not navigate to Checkout Page");
		}
		report.endTest(test);
		assertEquals("http://www.practiceselenium.com/check-out.html", driver.getCurrentUrl());
	}

}
