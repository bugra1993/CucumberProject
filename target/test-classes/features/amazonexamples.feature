Feature: Multiple Search

  @amazon
  Scenario Outline: TC07_user search in amazon(dropdown and search box)
    Given user go to "https://www.amazon.com" page
    And search dropdown "<category>"  amazon
    And search in box "<products>"  amazon
    Then print result stats from amazon page
    Examples: Test data
      | category   | products     |
      | Books      | kindle       |
      | Computers  | CPU          |
      | Automotive | phone holder |
      | Baby       | stroller     |





