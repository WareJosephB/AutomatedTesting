package Websites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopSiteResultsPage {

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div[2]/h1/span[2]")
	private WebElement resultsField;
	
	public int numberOfResults() {
		return Integer.valueOf(resultsField.getText().substring(0, 1));
	}
	
}
