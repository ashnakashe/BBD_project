
@login
Feature: JBK Offline application

@jbk
Scenario Outline: login test

Given user should be on login page
When user enter "<uName>" and "<pass>"
Then user should be on home page

Examples:
|uName                 |pass  |
|kiran@gmail.com       |123456|
|ashnakashe17@gmail.com|741258|
|gautam@gmail.com      |963258|


Scenario: logo test

Given user should be on login page
Then user should see JBK logo
