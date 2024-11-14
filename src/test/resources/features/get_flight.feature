Feature: Flight consultation
  As an aircraft administrator, I want to be able to consult the direct flights registered in the system to be able to review existing flights and availability.

  Scenario Outline: Existing flight information
    Given I am an administrator and can use the system
    When I visit the flight page
    Then I can see the list of flights with it flightId
    | flightId       |
    | departureCity  |
    | flightPrice    |

    Examples:
      | detail         |
      | flightId       |
      | departureCity  |
      | flightPrice    |
