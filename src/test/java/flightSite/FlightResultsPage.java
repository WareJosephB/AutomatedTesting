package flightSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightResultsPage {

	@FindBy(xpath = "/html/body/div[5]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[2]/div/h4/a/b")
	private WebElement firstResultName;
	
	public String returnFirstResultName() {
		return firstResultName.getText();
	}
	
}
