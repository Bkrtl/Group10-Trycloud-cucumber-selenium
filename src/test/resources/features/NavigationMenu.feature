@navigate
Feature: Navigation Menu
@wip
  Scenario: navigate to Gallery
    Given the user is on the login page
    And the users enter user information
    When the user navigates to Gallery
    Then the url should be expected Gallery url

