Feature: I as admin want to create aircrafts to be used by flights
  Scenario: Missing form validation
    Given Open the aircraft page
    And I am an admin
    When I send the form with missing inputs
    Then I get a message error