Feature:   Verify Registration functionality
Scenario:  verify user is able to register
Given registration page should be open in default browser
When click on firstname field and add first name
And then click on last name field and add last name
And then click on email field and add email id
And then click on telephone field and add telephone number
And then click on password field and type a passowrd 
And then click on password confirm field and retype passowrd
And then click on agree checkbox field and click on the checkbox 
And now click on continue button 
Then registration will be successful 


