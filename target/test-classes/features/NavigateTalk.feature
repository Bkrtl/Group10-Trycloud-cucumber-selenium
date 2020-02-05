@Talk
  Feature: Navigate to Talk module


    Background:

      Given the user is on the login page
      And the users enter the user information
      When the user navigates to Talk
      Then the url should be expected Talk url

    Scenario: The user should be able to start a conversation
      When the user clicks on new conversation
      And the user types "Employee100" and clicks
      Then the messages "You created the conversation" "You added Employee100" should be displayed

    Scenario: The user should be able to delete a conversation
      When the user clicks on the three dots next to the first conversation
      And clicks on delete conversation from the dropdown
      Then the number of conversations should be one less
