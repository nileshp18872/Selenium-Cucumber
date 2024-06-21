@test2feature
Feature: Feature to test Signup Functionality

@test2
  Scenario: Open URL and cletate Account with Valid datas
    Given user is on Registration page and click Create Account
    When user enter invalid data on the page
    | Fields                 | Values                  |
    | Company Name           | Tridhya222 Tech Ltd.    |
    | Password               | Sit@1234                |
    | Contact Person         | Nilesh Panchal          |
    | Post Code              | 380 009                 |
    | Email Id               | nilesh2.p@tridhyatech.com|  
    | Street Address         | Bopal, Ahmedabad        |
    | Job Title              | QA Manager              |
    | Company Industry       | Computer Industry       |
    | No of EMP              | 21-50                   |
    | Joining Code           | TR0002                  |
    | Your Partner           | MARTIN                  |
   And user click Continue button
   Then the user registration should be successful
