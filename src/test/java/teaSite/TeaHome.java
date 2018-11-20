package teaSite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TeaHome implements WebPage{

	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[13]/div/ul/li[3]/a")
	public WebElement menu;
	
	@FindBy(xpath = "/html/body/div/div/div[1]/div/div[13]/div/ul/li[5]/a")
	public WebElement checkout;
	
}
