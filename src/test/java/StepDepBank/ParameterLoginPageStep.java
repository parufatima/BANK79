package StepDepBank;

import com.ActionsBank.LoginActions;
import com.UtilityBank.BaseBank;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterLoginPageStep extends BaseBank {

	LoginActions loginActions = new LoginActions();

	@When("^Enter user id <value>$")
	public void enter_user_id_value() throws Throwable {
		
	}

	@When("^Enter user EgEgUtE$")
	public void enter_user_EgEgUtE() throws Throwable {

	}

	@Then("^I verify the success$")
	public void i_verify_the_success() throws Throwable {
		
	}

	@Then("^I verify the Fail$")
	public void i_verify_the_Fail() throws Throwable {
		
	}

	@When("^Enter user abc(\\d+)$")
	public void enter_user_abc(int arg1) throws Throwable {
		
	}

	@When("^Enter user Max(\\d+)$")
	public void enter_user_Max(int arg1) throws Throwable {
		
	}

}
