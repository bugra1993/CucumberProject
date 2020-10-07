@technology_search @amazon
Feature: multiple search in amazon

  Scenario Outline: TC05_user search in amazon
    Given user go to amazon page
    And user search "<products>"
    Then print result stats

    Examples: Products Names
      | products   |
      | camera     |
      | headphones |
      | drone      |
      | pencil     |
      | tv         |


