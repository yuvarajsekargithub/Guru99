package Respositry;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(name="quantity")
private WebElement select_Quantity;

	public WebElement getSelect_Quantity() {
		return select_Quantity;
	}
	
	
	
	@FindBy(xpath="//input[@class='button special']")
	private WebElement Buynow;

	public WebElement getBuynow() {
		return Buynow;
	}
	
}
