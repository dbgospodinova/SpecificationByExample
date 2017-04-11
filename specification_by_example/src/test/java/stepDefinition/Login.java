package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	@Given("^Registered user$")
	public void registered_user() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^user navigates to \"([^\"]*)\" Login page$")
	public void user_navigates_to_Login_page_on(String portal) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user scan barcode, press button Agree$")
	public void user_scan_barcode_press_button_Agree() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}
	
	@And("^enter PIN (\\d+)$")
	public void enter_PIN(int PIN) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^user is successfully logged in$")
	public void user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}
}
