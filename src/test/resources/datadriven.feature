@test3
Feature: Feature to test Login Functionality

  @test3
  Scenario Outline: Check Login sucessfull with valid credentials
    Given user is on login pagee
    When user enter <username> and <password>
    And user click login buttonn
    Then user will move to home pagee

    Examples: 
      | username                | password |
      | beta1-18nov@yopmail.com | Sit@1234 |
      | beta2-18nov@yopmail.com | Sit@1234 |
      | beta3-18nov@yopmail.com | Sit@1234 |
      | beta4-18nov@yopmail.com | Sit@1234 |
      | beta5-18nov@yopmail.com | Sit@1234 |
