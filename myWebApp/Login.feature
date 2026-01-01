Feature: Login Test
Scenario Outline: Login Test
Given User on the login page
When User enters "<username>" and "<password>"
And Click on the submit button
Then "<result>" should be displayed
Examples:
|	username	    |	password	|	result		           |
|	 student	    |	Password123	|	Logged In Successfully |
|	incorrectUser	|	Password123	|   Test Login             |
|	 student	    |	incorrectPassword	| Test Login       |