@dbupdate
Feature: Hotel Data Update

  Scenario: user update hotel's data
    Given user dbutils ile veritabanina baglanir
    And kullanici id degeri "1" olan verinin "ContactNameSurname" bilgisini "Enes Batch" ile gunceller
