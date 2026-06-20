Feature: Login with Invalid Password

Scenario: Verify login with invalid password

Given User launches the login application
When User enters valid username "student"
And User enters invalid password "incorrectPassword"
And User presses the submit button
Then Invalid password error message should be displayed
And Password error message should be "Your password is invalid!"