package StepDefinition;

import org.openqa.selenium.By;

import PageObjects.FormSubmission;
import driver.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FormSubmissionStepDefinitions extends BaseClass {
	
	@Given("user has launched the form page")
	public void user_has_launched_the_form_page() {
	    driver.get("https://sqengineer.com/practice-sites/basic-web-elements/");
	}
	
	@When("the form is visible")
	public void the_form_is_visible() {
	   String text = driver.findElement(By.xpath("//h1")).getText();
	   if(text.equalsIgnoreCase("BASIC WEB ELEMENTS")) {
		   Assert.assertTrue(true);
	   }else {
		   Assert.assertTrue(false);
	   }
	}
	
	@Given("user fills the first name")
	public void user_fills_the_first_name() {
		driver.findElement(By.id("firstName")).sendKeys("some name");
	}
	
	@Given("user fills the last name")
	public void user_fills_the_last_name() {
	   
	}
	
	@Given("user selects the gender")
	public void user_selects_the_gender() {
	   
	}
	
	@Given("user selects the checkbox")
	public void user_selects_the_checkbox() {
	  
	}
	
	@Given("user fills the first name {string}")
	public void user_fills_the_first_name(String firstName) {
		FormSubmission formsubmission = new FormSubmission(driver);
		formsubmission.enterFirstname(firstName);
	}
	
	@Given("user fills the last name {string}")
	public void user_fills_the_last_name(String lastName) {
		driver.findElement(By.id("lastName")).sendKeys(lastName);
	}
	@Given("user selects the gender {string}")
	public void user_selects_the_gender(String string) {
	  
	}
	@Given("user selects the checkbox {string}")
	public void user_selects_the_checkbox(String string) {

	}


}
