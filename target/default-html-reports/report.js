$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FileAll.feature");
formatter.feature({
  "name": "file page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "File Page(Tile:Files - Trycloud)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
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
  "name": "the users enter the user information",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_users_enter_the_user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get title as expected",
  "keyword": "And "
});
formatter.match({
  "location": "FileStepDef.the_user_should_get_title_as_expected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be click the icon",
  "keyword": "And "
});
formatter.match({
  "location": "FileStepDef.the_user_should_be_click_the_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should create new folder",
  "keyword": "Then "
});
formatter.match({
  "location": "FileStepDef.the_user_should_create_new_folder()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "File Upload",
  "description": "",
  "keyword": "Scenario",
  "tags": [
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
  "name": "the users enter the user information",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefs.the_users_enter_the_user_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be click the icon",
  "keyword": "And "
});
formatter.match({
  "location": "FileStepDef.the_user_should_be_click_the_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should upload the file",
  "keyword": "Then "
});
formatter.match({
  "location": "FileStepDef.the_user_should_upload_the_file()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});