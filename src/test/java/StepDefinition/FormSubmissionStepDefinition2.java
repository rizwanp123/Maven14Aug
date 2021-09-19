package StepDefinition;

import PageObjects.FormSubmission;
import driver.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FormSubmissionStepDefinition2 extends BaseClass {
	@Given("user fills the first name with page factory")
	public void user_fills_the_first_name_with_page_factory() {
		FormSubmission formsubmission = new FormSubmission(driver);
		formsubmission.enterFirstname("my first name");
	}
	
	@Then("user fills the last name with page factory")
	public void user_fills_the_last_name_with_page_factory() {
		FormSubmission formsubmission = new FormSubmission(driver);
		formsubmission.enterLastname("my last name");
	}
	
	@Given("user selects the gender with page factory")
	public void user_selects_the_gender_with_page_factory() {
	    
	}
	
	@Given("user selects the checkbox with page factory")
	public void user_selects_the_checkbox_with_page_factory() {
	    
	}

}
