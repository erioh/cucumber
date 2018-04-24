Feature: Shout

  Scenario: Listener is within range
    Given Lucy is 35 meters from Shon
    When Shon says "free begets at Shon's"
    Then Lucy should hear Shon's message
