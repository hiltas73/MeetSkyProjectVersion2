Feature: 

	#AC:
	#Display Profile name and status menu
	#
	#User can change online status
	@MEET-133
	Scenario Outline: Display Profile Name And Change Status Menu
		
		    Given user login with valid credentials
		    When the user click on Profile
		    Then the profile name should be employee_username
		    When the user click on Status
		    Then "Online status" should be displayed
		    And click on "<statusOption>"
		    Then click close
		    When the user click on Profile
		    Then the status should be "<statusView>"
		
		    Examples:
		      | statusOption | statusView     |
		      | online       | Online         |
		      | away         | Away           |
		      | dnd          | Do not disturb |
		      | invisible    | Invisible      |
		
		    