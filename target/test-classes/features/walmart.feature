Feature: Walmart Search

  @walmart
  Scenario Outline: TC08_user search in walmart page
    Given user go to "https://www.walmart.com/" walmart page
    And search "<products>" in walmart page
    Then print result stats from walmart page
    Examples: Test Data
      | products   |
      | calculator |
      | watch      |
      | flower     |