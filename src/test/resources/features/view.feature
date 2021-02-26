Feature: the user should be able to change folder view
@MEET-126
  Scenario: the view of folder is changed by Name
  Given user login with valid credentials
  Given the user click on "Files" module
    When the user clicks on "Name"
    Then the folder view should be changed by Name

@MEET-127
  Scenario: the view of folder is changed by Size
    Given user login with valid credentials
    Given the user click on "Files" module
    When the user clicks on "Size"
    Then the folder view should be changed by Size

  @MEET-147
  Scenario: the view of folder is changed by Size
    Given user login with valid credentials
    Given the user click on "Files" module
    When the user clicks on "Modified"
    Then the folder view should be changed by Modified