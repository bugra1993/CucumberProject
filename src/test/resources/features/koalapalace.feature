@koalapalace
Feature: Koala Palace

  Background:Koala Palace Admin Sign In
    Given user goes to koala palace admin page
    And user enter username and password
    Then user sign in

  @hotelcreate
  Scenario: TC09-user enter information and create hotel
    Given user goes to hotel create page
    And user enter code hotel create "1234"
    And user enter name hotel create "Enes Bozkurt"
    And user enter address hotel create "Australia"
    And user enter phone hotel create "0435928374"
    And user enter email hotel create "nsbzkrt@gmail.com"
    And user choose id group hotel create "Hotel Type1"
    And user clicks the save button hotel create
    Then user assert saving transaction

  @hotelroomcreate
  Scenario: TC09_user create hotel room
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create" room create page
    And user selects IDHotel drop down "Star" room create
    And user enter code "1234" room create
    And user enter name "enes" room create
    And user enter location "Australia" room create
    And user enter description "room create" room create
    And user drag price to price box
    And user selects room type drop down "Triple" room create
    And user enter max adult count "3" room create
    And user enter max children count "2" room create
    And user clicks approve button
    And user clicks save button room create
    Then user assert saving transaction room create




