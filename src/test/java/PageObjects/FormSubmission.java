package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormSubmission {
	// This is an example of page object model class
	WebDriver driver;
	
	@FindBy(id = "firstName")
	private WebElement firstNameField;
	
	@FindBy(id = "lastName")
	private WebElement lastNameField;

	public FormSubmission(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterFirstname(String firstName) {
		firstNameField.sendKeys(firstName);
	}
	
	public void enterLastname(String lastName) {
		lastNameField.sendKeys(lastName);
	}

}
