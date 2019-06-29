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
	@FindBy(xpath="//input[@class='button special']")
	private WebElement Buynow3;

	public WebElement getBuynow3() {
		return Buynow;
	}


	@FindBy(xpath="//input[@class='button special']")
	private WebElement Buynow2;

	public WebElement getBuynow2() {
		return Buynow;
	}

}
