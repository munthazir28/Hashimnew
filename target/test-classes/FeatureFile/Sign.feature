Feature: To validate Create Account Functionality in Facebook Application 

Scenario: To validate Create Account by using invalid username and password and gmail and DOB   
Given user facebook signin page
When user enter invalid username and invalid password and invalid gmail and invalid DOB  
And user click signin button
Then user should be in invalid credential page
