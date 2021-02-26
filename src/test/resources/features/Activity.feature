Feature: As a user, I should be able to see listed items under Activity module ordered by newest to oldest

  @MEET-136
  Scenario: Display all listed items under Activity module
    Given user login with valid credentials
    When the user click on "Activity" module
    Then the user should see all activity list



