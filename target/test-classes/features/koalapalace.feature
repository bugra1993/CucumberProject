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
  Scenario: TC010_user create hotel room
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

  @hotelroomreservationcreate
  Scenario: TC11_user create hotel room reservation
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert saving transaction room reservation


  @hotelroomreservationcreate
  @hotelroomreservationnegativetests
  @hotelroomreservationnegativetest1
  Scenario: TC12_user create room reservation without choosing IDUser
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    #And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest2
  Scenario: TC13_user create room reservation without choosing IDHotel
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    #And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest3
  Scenario: TC14_user create room reservation without choosing price
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    #And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest4
  Scenario: TC15_user create room reservation without choosing date start
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    #And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest5
  Scenario: TC16_user create room reservation without choosing date end
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    #And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest6
  Scenario: TC17_user create room reservation without choosing adult count
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
   #And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest7
  Scenario: TC18_user create room reservation without choosing child count
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    #And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest8
  Scenario: TC19_user create room reservation without choosing name and surname
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    #And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest9
  Scenario: TC20_user create room reservation without choosing phone
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    #And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest10
  Scenario: TC21_user create room reservation without choosing email
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/20/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    #And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario

  @hotelroomreservationcreate @hotelroomreservationnegativetests @hotelroomreservationnegativetest11
  Scenario: TC21_user create room reservation start date begin after the date end
    Given user go to "http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create" room reservation page
    And user select IDUser from first dropdown "manager2" room reservation
    And user select IDUser from second dropdown "Moon" room reservation
    And user enter to "250" price box room reservation
    And user choose date from date start "10/14/2020" room reservation
    And user choose date from date end "10/7/2020" room reservation
    And user enter Adult count "2" room reservation
    And user enter Child count "1" room reservation
    And user enter name and surname "enes bozkurt" room reservation
    And user enter contact phone "1234567788" room reservation
    And user enter email address "nsbzkrt@gmailc.om" room reservation
    And user enter notes to box "queen bed" room reservation
    And user clicks approve button room reservation
    And user clicks is paid button room reservation
    And user clicks save button room reservation
    Then user assert negative scenario









