Feature: Login functionality
Scenario: Login with correct credentials
Given user should be on login page
When user enters username as "Admin"
And user enters password as "admin123"
And user clicks on login button
Then user should redirect to Dashboard