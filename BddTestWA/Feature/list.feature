Feature: To Test TestWebApp
@mainPage
Scenario: To check if the credintials are correct
Given WebDriver should be loaded
When User details are filled on the loginpage
Then Check if the login details are correct, goto next page.