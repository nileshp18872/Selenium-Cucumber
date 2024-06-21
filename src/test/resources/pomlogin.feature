@pomtest3
Feature: Feature to test POMLogin Functionality

  @pomtest3
  Scenario Outline: Check POMLogin sucessfull with valid credentials
    Given user is on login pageee
    When usr enter <username> and <password>
    And user click login buttonnn
    Then user will move to home pageee

    Examples: 
      | username                | password |
      | beta1-18nov@yopmail.com | Sit@1234 |
      | beta2-18nov@yopmail.com | Sit@1234 |
      