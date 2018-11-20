package shopSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopSiteSearchPage {
	
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")
	private WebElement searchField;

	public void search(String clothing) {
		searchField.sendKeys("Dress");
		searchField.submit();
	}
	
}
