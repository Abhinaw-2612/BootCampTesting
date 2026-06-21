Feature: Login Functionality

Scenario: Successful Login with Valid Credentials
Given User opens the login page
When User enters username "student"
And User enters password "Password123"
And User clicks on Submit button
Then User should be redirected to the success page
And URL should contain "practicetestautomation.com/logged-in-successfully/"
And Success message should contain "Congratulations"
And Log out button should be displayed