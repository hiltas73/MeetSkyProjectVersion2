@calendar
Feature: Calendar Module

  Background:
    Given user login with valid credentials

  @MEET-143
  Scenario: Display Daily Calendar view
    When the user clicks on Calendar Module
    And the user clicks on view options button
    When the user clicks on the "Day" option
    Then the app should display the Daily Calendar view

  @MEET-144
  Scenario: Display Weekly Calendar view
    When the user clicks on Calendar Module
    And the user clicks on view options button
    When the user clicks on the "Week" option
    Then the app should display the Weekly Calendar view

  @MEET-145
  Scenario: Display Monthly Calendar view
    When the user clicks on Calendar Module
    And the user clicks on view options button
    When the user clicks on the "Month" option
    Then the app should display the Monthly Calendar view


  Scenario Outline: Display Calendar View <viewOption>
    When the user clicks on Calendar Module
    And the user clicks on view options button
    When the user clicks on the "<viewOption>" option
    Then the app should display the "<option>" Calendar view

    Examples:
      | viewOption | option |
      | Day        | Day    |
      | Week       | Week   |
      | Month      | Month  |
