Feature: Submit Form in Home Page

Scenario: User Submits the form successfully
Given User is in the Home Page
When User Scrolls down to the form section
And user enters name
And User enters email
And User clicks on submit button
Then User should see the confirmation Title