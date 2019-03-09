package stepDef;

import org.openqa.selenium.WebElement;

import Respositry.HomePage;

public class Common extends HomePage{
	
	public void selectItem( String data) {
		HomePage ho= new HomePage();	

   WebElement select_Quantity2 = ho.getSelect_Quantity();
   select_Quantity2.sendKeys(data);
}
	public void sendkey(WebElement element , String data) {
		element.sendKeys(data);

	}

	public void clickButton(WebElement element) {
		element.click();

	}
}
