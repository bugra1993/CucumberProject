Feature: Google Search

  Scenario: TC01_users search in google
    #comment line
    Given user go to google page
    And search techproeducation
    Then check the page title
