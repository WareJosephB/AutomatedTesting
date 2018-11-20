package cucumberTesting;

import java.util.Stack;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class StackSteps {

	public Stack<String> stack;
	
	public String global;

	@Before // Making sure it's cucumber @Before not JUnit
	public void makeStack() {
		stack = new Stack<String>();
	}

	@Given("^an empty stack$")
	public void an_empty_stack() throws Throwable {
		while (stack.size() != 0) {
			stack.remove(0);
		}
	}

	@When("^I push an item into the stack$")
	public void i_push_an_item_into_the_stack() throws Throwable {
		String item = "Hello";
		stack.push(item);
	}

	@Then("^the stack contains one item$")
	public void the_stack_contains_one_item() throws Throwable {
		assertEquals(1, stack.size());
	}

	@When("^I push another item into the stack$")
	public void i_push_another_item_into_the_stack() throws Throwable {
		String item2 = "World";
		stack.push(item2);
	}

	@Then("^the stack contains two items$")
	public void the_stack_contains_two_items() throws Throwable {
		assertEquals(2, stack.size());
		;
	}

	@When("^I pop from the stack$")
	public void i_pop_from_the_stack() throws Throwable {
		global = stack.pop();
	}

	@Then("^I get the same item back$")
	public void i_get_the_same_item_back() throws Throwable {
		assertEquals("Hello", global);
	}

	@Given("^a stack with (\\d+) items$")
	public void a_stack_with_items(int arg1) throws Throwable {
		while (stack.size() > arg1) {
			stack.remove(stack.size());
		}
		while (stack.size() < arg1) {
			stack.push("Padding");
		}

	}

}
