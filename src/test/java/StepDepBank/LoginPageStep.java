package StepDepBank;

import com.ActionsBank.LoginActions;
import com.UtilityBank.BaseBank;
import com.UtilityBank.ScreenShots;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseBank {
	
	
	LoginActions loginActions =new LoginActions();
	
	
	@Given("^Lunch the application <\"([^\"]*)\">$")
	public void lunch_the_application(String URL) throws Throwable {
		
		lunchURL(URL);
		
		ScreenShots.takeCampScreenshot(driver, "Login page");
	  
	}
	

	@When("^Enter valid user id$")
	public void enter_valid_user_id() throws Throwable {
		loginActions.Entervaliduserid();
	   
	}

	@When("^Enter valid password$")
	public void enter_valid_password() throws Throwable {
		loginActions.Entervalidpassword();
	}

	@When("^Click on login$")
	public void click_on_login() throws Throwable {
		loginActions.Clickonlogin();
	}

	@Then("^Verify the title of homepage\\.$")
	public void verify_the_title_of_homepage() throws Throwable {
		
		loginActions.Verifythetitleofhomepage();
		
		ScreenShots.takeCampScreenshot(driver, "Home page");
	}
	@When("^Enter Invalid user id$")
	public void enter_Invalid_user_id() throws Throwable {
		
		loginActions.EnterInvaliduserid();
	}

	@When("^Enter Invalid password$")
	public void enter_Invalid_password() throws Throwable {
		
		loginActions.EnterInvalidpassword();
	}

	@Then("^Verify user can not login successfully$")
	public void verify_user_can_not_login_successfully() throws Throwable {
		Thread.sleep(3000);
		loginActions.Verifyusercannotloginsuccessfully();
		
	}



}
