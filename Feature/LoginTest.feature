Feature: Login Functionality

@validlogin @regression

Scenario: Verify product owner is able to login to cucumber application


#Given Browser should show login page of application
When User enters email id "anusmoody@gmail.com"
And User enters password "Test@123"
And User clicks on sign in button
Then User should be able to login successfully to the application


@invalidlogin @regression

Scenario Outline: Verify product owner can see error messag if wrong credentials entered in the application

#Given Browser should show login page of application
When User enters email id "<emailid>"
And User enters password "<password>"
And User clicks on sign in button
Then User should see the error message in the application

Examples:
|emailid|password|
|anusmoody@gmail.com|Test1|
|anusmoody@gmail.com|Test2|
