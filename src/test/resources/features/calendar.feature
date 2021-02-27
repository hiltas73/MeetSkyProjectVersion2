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

  @MEET-155
    Scenario: Create a new Calendar Event
      When the user click on "Calendar" module
      And the user clicks on the New Event Button
      And the user enters the Event Title as "release day"
      And the user enters "28/02/2021 at 11:00 AM" as from date and enters "28/02/2021 at 12:00 AM" as toDate
      When the user clicks on the Save button
      And the user clicks on view options button
      And the user clicks on the "Month" option
      Then user should see new Event Icon and Event Title as "release day" on the 28 day on Monthly Calendar


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
