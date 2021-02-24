Feature: Talk module funtions

	#*As a user, I should be able to create a new conversation, add participant, start and leave call under Talk module*

		Background:
		    Given user login with valid credentials
	@MEET-138
		Scenario: Display all conversation list under Talk module
		    When the user click on "talk" module
		    Then the user should see all conversation list under Talk module