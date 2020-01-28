$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/NavigationMenu.feature");
formatter.feature({
  "name": "Navigation Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.scenario({
  "name": "navigate to Gallery",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@navigate"
    },
    {
      "name": "@wip"
    }
  ]
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
  "name": "the users enter user information",
  "keyword": "And "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_users_enter_user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to Gallery",
  "keyword": "When "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_user_navigates_to_Gallery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the url should be expected Gallery url",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationMenuStepDefs.the_url_should_be_expected_Gallery_url()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});