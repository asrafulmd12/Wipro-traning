Feature: Tutorials Ninja Automation
@Smoke
Scenario Outline: Complete purchase flow

Given user launches Tutorials Ninja website
# When user registers a new account with <firstname> <lastname> <email> <phone> <password>
# And user logs out
And user logs in with <email> <password>
And user searches for product <product1>
And user adds product to cart
And user removes product from cart
And user adds product again <product1>
And user proceeds to checkout
And order should be confirmed
Then user logs out from application

Examples:
|firstname|lastname|email|phone|password|product1|
|Md|Asraful|asraful123@gmail.com|9876543210|Test@123|iMac|

