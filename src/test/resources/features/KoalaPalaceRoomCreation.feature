
Feature:User_creata_a_HotelRoomwith_valid_credentials

  Scenario:Testing_The_HotelRoom_Page
    Given user is on the KoalaPalace page
    And user click the log in button
    When user enter the username
    When user enter the password
    And user click the submit button
    And click Hotel Management
    And click Hotel Rooms
    And click ADD HOTELROOMS
    And Select Hotel as "WittingHotel"
    And enter the hotel "code"
    And enter the "name"
    And enter the location "location"
    And write the "Description"
    And drag and drop the "price"
    And select the "Room_Type"
    And write the adult "Max_Adult_count"
    And write the child "Max_Children_count"
    And click save button






