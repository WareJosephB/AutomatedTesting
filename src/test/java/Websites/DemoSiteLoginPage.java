package Websites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoSiteLoginPage {

	@FindBy(name = "username")
	private WebElement userField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(name = "FormsButton2")
	private WebElement submitButton;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement confirmation;
	
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
	
	public void logIn(String username, String password) {
		enterName(username);
		enterPassword(password);
		submitUser();
	}
	
	public String getConfirmation() {
		return confirmation.getText();
	}
	
}
