@talk
Feature: Navigation Menu
  @wip
  Scenario: navigate to Talk
    Given the user is on the login page
    And the users enter user information
    When the user navigates to Talk
    Then the url should be expected Talk url

   Scenario: New conversation
     Given the user pressed Talk module
     And the user pressed New conversation
     When the user enter a username
     Then the user should start a conversation
