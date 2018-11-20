package storeDemoQA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreDemoQA {

	@FindBy(xpath = "/html/body/div[2]/div/div/header/nav/form/fieldset/input[1]")
	private WebElement searchBox;
	
	public void search(String electronics) {
		searchBox.sendKeys(electronics);
		searchBox.submit();
	}
	
	
	
}
