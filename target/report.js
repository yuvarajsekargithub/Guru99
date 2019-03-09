$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/YUVARAJ/eclipse-workspace/SeleniumProject/Task/src/test/resources/Feature/HomePage.feature");
formatter.feature({
  "name": "GuruTelecom",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "HomePage Scenerio",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The User should be in Payment page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.the_User_should_be_in_Payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should select the quantity",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.the_user_should_select_the_quantity()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDef.Common.clickButton(Common.java:21)\r\n\tat stepDef.HomePageStep.the_user_should_select_the_quantity(HomePageStep.java:19)\r\n\tat ✽.The user should select the quantity(C:/Users/YUVARAJ/eclipse-workspace/SeleniumProject/Task/src/test/resources/Feature/HomePage.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "The user should click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageStep.the_user_should_click_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user should go for Payment Process",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.the_user_should_go_for_Payment_Process()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});