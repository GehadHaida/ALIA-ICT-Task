Feature: Add New Reservation
  As a user, I want to add a new reservation so that I can manage bookings effectively.

  Scenario: Add a new reservation successfully
    Given User open Nazeel Staging and log in with a valid username, password and access code
    When User click Later on the User Verification popup
    And User open the Reservation page from the left-hand menu
    And User click on Add Reservation
    And User select Business or Work from Visit Purpose and Booking.com from Reservation Source
    And User choose a unit by clicking "Select Unit Now" and confirming
    And User select the room available and confirm
    And User choose a guest by entering Guest ID 123456789 and confirming
    Then Validate that the reservation was created successfully