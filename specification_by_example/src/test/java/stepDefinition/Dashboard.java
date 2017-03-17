package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dashboard {
	@Given("^Global User is logged in$")
	public void global_User_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Given("^\"([^\"]*)\" User is logged in with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_is_logged_in_with_and(String user,String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String user1 = user;
		String username1 = username;
		String password1 = password;
	    System.out.println(user1);
	    System.out.println(username1);
	    System.out.println(password1);
	    System.out.println("This tests Scenario Outline");
	}
	
	@When("^User navigates to \"([^\"]*)\" Dashboard tab$")
	public void user_navigates_to_Dashboard_tab(String user) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String user1 = user;
		System.out.println(user1);
	}
		

	@When("^Global User navigates to Dashboard tab$")
	public void global_User_navigates_to_Dashboard_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^All buttons/links/text fields/check boxes/list box/dropdown\\(if any\\) must be functional$")
	public void all_buttons_links_text_fields_check_boxes_list_box_dropdown_if_any_must_be_functional() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^UI must not be distorted$")
	public void ui_must_not_be_distorted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Then("^Typos must not present$")
	public void typos_must_not_present() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Then("^Current/selected tab/sub tab must be highlighted/differentiated from other tabs/subtabs$")
	public void current_selected_tab_sub_tab_must_be_highlighted_differentiated_from_other_tabs_subtabs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Then("^'Intercom' chat icon displays$")
	public void intercom_chat_icon_displays() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
