@search_product @amazon
Feature: Amazon Search

  Background: Methods run before
    Given user go to amazon page

  @amazonsearchheadphones
  Scenario:TC02_user search in amazon
    And search headphones word
    Then print result stats

  @amazonsearchcamera
  Scenario: TC03_user search in amazon
    And user search camera
    Then print result stats



