@ebay
Feature: search in ebay

  Scenario Outline: TC06_user search in Ebay
    Given user go to "https://www.ebay.com/"
    And search "<products>"
    Then print result stats on ebay

    Examples: Product Names
      | products |
      | car      |
      | camera   |
      | TV       |


