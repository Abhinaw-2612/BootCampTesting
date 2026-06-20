Feature: Login with Invalid Username

Scenario: Verify login with invalid username

Given User navigates to the login page
When User enters invalid username "incorrectUser"
And User enters valid password "Password123"
And User clicks the login button
Then Invalid username error message should be displayed
And Error message should be "Your username is invalid!"