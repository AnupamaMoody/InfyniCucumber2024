Feature: Login Functionality

@validlogin @regression

Scenario: Verify product owner is able to login to cucumber application


#Given Browser should show login page of application
When User enters email id "anusmoody@gmail.com"
And User enters password "Test@123"
And User clicks on sign in button
Then User should be able to login successfully to the application