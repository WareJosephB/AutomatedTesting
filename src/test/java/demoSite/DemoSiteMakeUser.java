package demoSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteMakeUser {

	@FindBy(name = "username")
	private WebElement userField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(name = "FormsButton2")
	private WebElement submitButton;
	
	private void enterName(String name) {
		userField.clear();
		userField.sendKeys(name);
	}
	
	private void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	private void submitUser() {
		submitButton.click();
	}
	
	public void makeUser(String username, String password) {
		enterName(username);
		enterPassword(password);
		submitUser();
	}
	
}
