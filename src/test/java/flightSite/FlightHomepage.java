package flightSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightHomepage {

	@FindBy(xpath = "/html/body/div[17]/div/input")
	private WebElement locationSearch;

	@FindBy(name = "checkin")
	private WebElement checkindates;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[27]")
	private WebElement twentyNinthNovember;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[30]")
	private WebElement firstDecember;

	@FindBy(xpath = "//*[@id=\"travellersInput\"]")
	private WebElement numberTravellers;

	@FindBy(xpath = "//*[@id=\"adultInput\"]")
	private WebElement numberAdults;
	
	@FindBy(xpath = "/html/body/div[5]/section/div[2]/div/div/div[2]/div/div[1]/form/div[5]/button")
	private WebElement submitButton;

	private void chooseLocation(String location) {
		locationSearch.sendKeys(location);
	}

	private void chooseDates() {
		checkindates.click();
		twentyNinthNovember.click();
		firstDecember.click();
	}

	private void makeThreeAdultsGo() {
		numberTravellers.click();
		numberAdults.sendKeys("3");
	}
	
	public void findHoliday(String location) {
		chooseLocation(location);
		chooseDates();
		makeThreeAdultsGo();
		submitButton.click();
	}
	
}
