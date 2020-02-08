
Feature: Navigation Menu

  Background:
    Given the user is on the login page
    When the users enter the user information

@wip
  Scenario:  DashboardPage -> access Gallery
    When the user navigates on Dashboard - Gallery
    Then the URL should be expected Gallery URL
@wip
  Scenario: Gallery page Uploading Pictures
    When the user press the gallery button
    And the user should choose upload button
    Then the user should choose pictures from his own PC

  @wip
  Scenario: Manage pictures in Gallery
    When the user press the gallery button
    Then the user should manage a picture "Close"

 #@wip
#Feature: Gallery Page
#Scenario:  access Gallery
#Given the user is on the login page
#When the users enter the user information
#Then the URL should be expected Gallery URL
