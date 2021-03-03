Feature: Talk module funtions

	#*As a user, I should be able to create a new conversation, add participant, start and leave call under Talk module*

		Background:
		    Given user login with valid credentials
	@MEET-13
		Scenario: Display all conversation list under Talk module
		    When the user click on "talk" module
		    Then the user should see all conversation list under Talk module

		Scenario: User can create a new conversation
			When the user click on "talk" module
			Then the user should be able to create "conversation" conversation
	@MEET
	Scenario: User can add any selected participant to any conversation
		When the user click on "talk" module
		Then the user should be able to add any selected participant to any conversation



	@MEET-Onder
	Scenario: User can start a call with any participant and leave the call
		When the user click on "talk" module
		Then the user should be able to start a call with any participant and leave the call

