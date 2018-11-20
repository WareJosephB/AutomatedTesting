package teaSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeaCheckout {

	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[14]/div/p/span/span/strong")
	public WebElement greenTea;

	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[13]/div/p/span/span/strong")
	public WebElement redTea;

	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[26]/div/p/span/span/strong")
	public WebElement oolong;

}
