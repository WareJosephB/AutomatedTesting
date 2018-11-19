package SeleniumTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteMakeUser {

	@FindBy(name = "username")
	private WebElement userField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(name = "FormsButton2")
	private WebElement submitButton;
	
	public void enterName(String name) {
		userField.clear();
		userField.sendKeys(name);
	}
	
	public void enterPassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
	}
	
	public void submitUser() {
		submitButton.click();
	}
	
	public void makeUser(String username, String password) {
		enterName(username);
		enterPassword(password);
		submitUser();
	}
	
}
