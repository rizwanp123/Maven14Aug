Feature: Form Submission

	Background:
		Given user has launched the form page
		When the form is visible

	Scenario: Submitting a form with valid values
		Given user fills the first name
		And user fills the last name
		And user selects the gender
		And user selects the checkbox
		
	Scenario Outline: Submitting a form with dynamic values
		Given user fills the first name "<firstName>"
		And user fills the last name "<lastName>"
		And user selects the gender "<gender>"
		* user selects the checkbox "<Checkbox>"
		
		Examples:
			| firstName  | lastName     | gender| Checkbox |
			| Rizwan     | my last name | Male  |  India   |
			| Sreemanth  | my last      | Male  | Working  |