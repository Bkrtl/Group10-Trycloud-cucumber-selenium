$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Talk.feature");
formatter.feature({
  "name": "Navigation Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@talk"
    }
  ]
});
formatter.scenario({
  "name": "navigate to Talk",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@talk"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the users enter user information",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the user navigates to Talk",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the url should be expected Talk url",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});