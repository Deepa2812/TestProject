Feature: Feature to test liogin functionality

  Scenario: Check Login is successful with valid credentials
    Given User is on login page
    When User enters valid username and password
    And clicks on login button
    Then User is navigated to the home page

  
