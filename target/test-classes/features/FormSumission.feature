@form @simpleForm
Feature: Form Submission

	Background:
		Given user has launched the form page
		When the form is visible
		
	#Cucumber tags
	@validForm @form @regression
	Scenario: Submitting a form with valid values
		Given user fills the first name
		And user fills the last name
		And user selects the gender
		And user selects the checkbox
		
	@validDynamicForm @ignore @form @regression
	Scenario Outline: Submitting a form with dynamic values
		Given user fills the first name "<firstName>"
		And user fills the last name "<lastName>"
		And user selects the gender "<Gender>"
		* user selects the checkbox "<Checkbox>"
		
		Examples:
			| firstName  | lastName     | Gender| Checkbox |
#			@example1
			| Rizwan     | my last name | Male  |  India   |
#			@example2 @ignore
			| Sreemanth  | my last      | Male  | Working  |
			
	
	@validFormWithPageFactory
	Scenario: Submitting a form with valid values with page factory
		Given user fills the first name with page factory
		And user fills the last name with page factory
		And user selects the gender with page factory
		And user selects the checkbox with page factory