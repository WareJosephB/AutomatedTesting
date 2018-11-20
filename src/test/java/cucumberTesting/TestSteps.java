package cucumberTesting;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	@Given("^that given works$")
	public void that_given_works() {
		System.out.println("Given");
	}

	@Given("^that given-and works$")
	public void that_given_and_works() {
		System.out.println("And Given");
	}

	@When("^I import this feature file$")
	public void i_import_this_feature_file() {
		System.out.println("When");
		;
	}

	@Then("^I should see multiple givens$")
	public void i_should_see_multiple_givens() {
		System.out.println("Then");
		;
	}

	@When("^the previous feature file$")
	public void the_previous_feature_file() {
		System.out.println("And When");
		;
	}

	@Then("^I should see this all work$")
	public void i_should_see_this_all_work() {
		System.out.println("Then2");
		;
	}

	@Then("^I should see this too$")
	public void i_should_see_this_too() {
		System.out.println("And Then");
	}

}
