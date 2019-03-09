package stepDef;

import Respositry.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep {
	
	@Given("The User should be in Payment page")
	public void the_User_should_be_in_Payment_page() {
	Hook.driver.get("http://demo.guru99.com/payment-gateway/index.php");   
	}

	@When("The user should select the quantity")
	public void the_user_should_select_the_quantity() throws InterruptedException {
		HomePage h= new HomePage();
		   Common c = new Common();
        c.clickButton(h.getSelect_Quantity());
		  c.sendkey(h.getSelect_Quantity(), "1");
	
	}

	
	@When("The user should click submit button")
	public void the_user_should_click_submit_button() {
		HomePage h= new HomePage();
		   Common c = new Common();
		c.clickButton(h.getBuynow());
		   
	}
	
	@Then("The user should go for Payment Process")
	public void the_user_should_go_for_Payment_Process() {
	
	}



}
