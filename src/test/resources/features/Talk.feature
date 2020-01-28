@Talk

  Feature: Navigate to Talk
    Scenario: Talk module
      Given the user is on the login page
      When the users enter the user information
      Then the user navigates to Talk module

     Scenario: Talk module
       Given the user logged in
       When the user clicks on Talk module
       Then the user should see New conversation

      Scenario: New conversation
        Given the user clicked on New conversation
        When the user enter an username
        Then the user shoul start a conversation
