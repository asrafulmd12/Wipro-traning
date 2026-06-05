Feature: verify Login user function
Scenario Outline: verify login page first 
Given login page should be open in default tab 
When click on username field and type valid user username <username1>
And then click on password button and type valid password <password1>
And now click on submit buttons <status>
Then login successfully and redirects to home page
Examples:
|username1|password1|status|
|username|password|success|
|skdkjkd|password|fail|
|username|skckkldkc|fail|
|skjcjakfofk|cbjacjc|fail|
