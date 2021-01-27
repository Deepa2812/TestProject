package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("User is on login page")
	public void verify_login() {
		System.out.println("inside step 1");
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("inside step 2");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step 3");
		
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside step 4");
		
	}

}
