package Cucumber2024Automation.StepDefintion;

import org.junit.Assert;

import Cucumber2024Automation.PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends LoginPage {
	
	
	@Before
	//@Given("Browser should show login page of application")
	
	public void browser_should_show_login_page_of_application() {
	  
		launchApplication("Chrome");
		implicitTime(3);
		clickLoginButton();
	}


@When("User enters email id {string}")
public void user_enters_email_id(String emailId) {
 
	enterEmailId(emailId);
}

@When("User enters password {string}")
public void user_enters_password(String pwd) {
	
	enterPassword(pwd);
 
}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() throws InterruptedException {
	   
		clickSignInButton();
		
		}

	@Then("User should be able to login successfully to the application")
	public void user_should_be_able_to_login_successfully_to_the_application() {
		
		String actualText = captureAllProjectText();
		String expectedText = "All projects";

		Assert.assertEquals(actualText, expectedText);
		
	  
	}

	@Then("User should see the error message in the application")
	public void user_should_see_the_error_message_in_the_application() {
		
		String actualText = captureInvalidText();
		String expectedText = "Invalid email or password.";

		Assert.assertEquals(actualText, expectedText);
		
	    
	}
	
	@After
	public void close_browser() {
		closeBrowser();
	}
	

}
