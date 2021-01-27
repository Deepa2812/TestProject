Feature: To Test Google Search functionality

  Scenario: Validate google search button
    Given Browser is open
    And User is on Google Search page
    When User enters a text in Search
    And clicks on Google search button
    Then User is navigated to the search results page
