package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	@Given("^Registered user$")
	public void registered_user() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Given("^User navigates to \"([^\"]*)\" Login page$")
	public void user_navigates_to_Login_page_on(String portal) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^user scan barcode and enter PIN (\\d+)$")
	public void user_scan_barcode_and_enter_PIN(int PIN) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^user is successfully logged in$")
	public void user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}
}
