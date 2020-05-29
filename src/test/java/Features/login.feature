Feature: login to alumini wipro

Scenario Outline: Successful login with user logins

Given User is on Alumini login page
When User enters "<UserName>" and "<Password>"
And User clicks on login button
Then User should see the home page

Examples:
|UserName | Password|
| 184535 | Josya@1407 |
