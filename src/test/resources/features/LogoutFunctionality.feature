Feature: As a user, I should be able to log out

  @MEET-139
  Scenario: Display personal info under Profile settings
    Given user login with valid credentials
    When the user click on Profile Settings
    And the user should see all profile settings list
      | Invisible |
      | Settings  |
      | Help      |
      | Log out   |

  @MEET-141
  Scenario: User can log out
    Given user login with valid credentials
    When the user click on Profile Settings
    Then the user should be able to logout
