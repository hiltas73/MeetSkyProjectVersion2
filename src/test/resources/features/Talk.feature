@SmokeTalk
Feature:

	Background:
		#@MEET-174
		Given user login with valid credentials
		

	#*US:*
	#
	#*As a user, I should be able to create a new conversation, add participant, start and leave call under Talk modüle*
	#
	#*AC:*
	#
	#*Display all conversation list under Talk module*
	#
	#*User can create a new conversation*
	#
	#*User can add any selected participant to any conversation*
	#
	#*User can start a call with any participant and leave the call*
	# 
	@MEET-175 @MEET-173
	Scenario: Display all conversation list under Talk module
		When the user click on "talk" module
		Then the user should see all conversation list under Talk module	

	#*US:*
	#
	#*As a user, I should be able to create a new conversation, add participant, start and leave call under Talk modüle*
	#
	#*AC:*
	#
	#*Display all conversation list under Talk module*
	#
	#*User can create a new conversation*
	#
	#*User can add any selected participant to any conversation*
	#
	#*User can start a call with any participant and leave the call*
	# 
	@MEET-176 @MEET-173
	Scenario: User can create a new conversation
		When the user click on "talk" module
		Then the user should be able to create "conversation" conversation	

	#*US:*
	#
	#*As a user, I should be able to create a new conversation, add participant, start and leave call under Talk modüle*
	#
	#*AC:*
	#
	#*Display all conversation list under Talk module*
	#
	#*User can create a new conversation*
	#
	#*User can add any selected participant to any conversation*
	#
	#*User can start a call with any participant and leave the call*
	# 
	@MEET-177 @MEET-173
	Scenario: User can add any selected participant to any conversation
		When the user click on "talk" module
		Then the user should be able to add any selected participant to any conversation	

	#*US:*
	#
	#*As a user, I should be able to create a new conversation, add participant, start and leave call under Talk modüle*
	#
	#*AC:*
	#
	#*Display all conversation list under Talk module*
	#
	#*User can create a new conversation*
	#
	#*User can add any selected participant to any conversation*
	#
	#*User can start a call with any participant and leave the call*
	# 
	@MEET-178 @MEET-173
	Scenario: User can start a call with any participant and leave the call
		When the user click on "talk" module
		Then the user should be able to start a call with any participant and leave the call