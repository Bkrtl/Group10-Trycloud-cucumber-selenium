$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NavigateTalk.feature");
formatter.feature({
  "name": "Navigate to Talk module",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Talk"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enter the user information",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_users_enter_the_user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to Talk",
  "keyword": "When "
});
formatter.match({
  "location": "TalkSteptDefs.the_user_navigates_to_Talk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the url should be expected Talk url",
  "keyword": "Then "
});
formatter.match({
  "location": "TalkSteptDefs.the_url_should_be_expected_Talk_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should be able to start a conversation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Talk"
    }
  ]
});
formatter.step({
  "name": "the user clicks on new conversation",
  "keyword": "When "
});
formatter.match({
  "location": "TalkSteptDefs.the_user_clicks_on_new_conversation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user types \"Employee100\" and clicks",
  "keyword": "And "
});
formatter.match({
  "location": "TalkSteptDefs.the_user_types_and_clicks(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the messages \"You created the conversation\" \"You added Employee100\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TalkSteptDefs.the_messages_should_be_displayed(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the users enter the user information",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefs.the_users_enter_the_user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to Talk",
  "keyword": "When "
});
formatter.match({
  "location": "TalkSteptDefs.the_user_navigates_to_Talk()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the url should be expected Talk url",
  "keyword": "Then "
});
formatter.match({
  "location": "TalkSteptDefs.the_url_should_be_expected_Talk_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should be able to delete a conversation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Talk"
    }
  ]
});
formatter.step({
  "name": "the user clicks on the three dots next to the first conversation",
  "keyword": "When "
});
formatter.match({
  "location": "TalkSteptDefs.the_user_clicks_on_the_three_dots_next_to_the_first_conversation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on delete conversation from the dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "TalkSteptDefs.clicks_on_delete_conversation_from_the_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the number of conversations should be one less",
  "keyword": "Then "
});
formatter.match({
  "location": "TalkSteptDefs.the_number_of_conversations_should_be_one_less()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});