$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "Feature to test Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will move to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_will_move_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});