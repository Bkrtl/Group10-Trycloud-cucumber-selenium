
@activity
Feature:	Navigate	to	Activity

  Background:
    Given the user is on the login page
    When the users enter the user information
    When the	user	navigates to	Activity

  Scenario:	All activities
    When the	user	clicks	on	All activities
    Then the	All activities page	should	be	displayed

  Scenario:	By you
    When the	user	clicks	on	By you
    Then the	By you page	should	be	displayed

  Scenario:	By others
    When the	user	clicks	on	By others
    Then the	By others page	should	be	displayed

  Scenario:	Favorites
    When the	user	clicks	on	Favorites
    Then the	Favorites page	should	be	displayed

  Scenario:	File changes
    When the	user	clicks	on	File changes
    Then the	File changes page	should	be	displayed

  Scenario:	Security
    When the	user	clicks	on	Security
    Then the	Security page	should	be	displayed

  Scenario:	File shares
    When the	user	clicks	on	File shares
    Then the	File shares page	should	be	displayed

  Scenario:	Calendar
    When the	user	clicks	on	Calendar
    Then the	Calendar page	should	be	displayed

  Scenario:	Todos
    When the	user	clicks	on	Todos
    Then the	Todos page	should	be	displayed

  Scenario:	Comments
    When the	user	clicks	on	Comments
    Then the	Comments page	should	be	displayed

  Scenario:	Deck
    When the	user	clicks	on	Deck
    Then the	Deck page	should	be	displayed