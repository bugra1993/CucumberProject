@product_search1 @amazon
Feature: Amazon Product Search

  Scenario: TC04_user search product in amazon page
    Given user go to amazon page
    And user search "drone"
    Then print result stats
