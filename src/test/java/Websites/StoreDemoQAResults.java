package Websites;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoreDemoQAResults {

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/p[2]/span")
	private WebElement firstResultPrice;
	
	public String getFirstPrice() {
		return firstResultPrice.getText();
	}
}
