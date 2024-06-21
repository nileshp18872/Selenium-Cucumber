$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/datadriven.feature");
formatter.feature({
  "name": "Feature to test Login Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "user is on login pagee",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click login buttonn",
  "keyword": "And "
});
formatter.step({
  "name": "user will move to home pagee",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "beta1-18nov@yopmail.com",
        "Sit@1234"
      ]
    },
    {
      "cells": [
        "beta2-18nov@yopmail.com",
        "Sit@1234"
      ]
    },
    {
      "cells": [
        "beta3-18nov@yopmail.com",
        "Sit@1234"
      ]
    },
    {
      "cells": [
        "beta4-18nov@yopmail.com",
        "Sit@1234"
      ]
    },
    {
      "cells": [
        "beta5-18nov@yopmail.com",
        "Sit@1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    },
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "user is on login pagee",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter beta1-18nov@yopmail.com and Sit@1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttonn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will move to home pagee",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_will_move_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    },
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "user is on login pagee",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter beta2-18nov@yopmail.com and Sit@1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttonn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will move to home pagee",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_will_move_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    },
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "user is on login pagee",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter beta3-18nov@yopmail.com and Sit@1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttonn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will move to home pagee",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_will_move_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    },
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "user is on login pagee",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter beta4-18nov@yopmail.com and Sit@1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttonn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will move to home pagee",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_will_move_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check Login sucessfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test3"
    },
    {
      "name": "@test3"
    }
  ]
});
formatter.step({
  "name": "user is on login pagee",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter beta5-18nov@yopmail.com and Sit@1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_enter_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login buttonn",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will move to home pagee",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.datadrivenSteps.user_will_move_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});