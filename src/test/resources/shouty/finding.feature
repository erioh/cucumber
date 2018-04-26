Feature: Google for cheese

  Scenario Outline: Find some cheese
    Given I'm on Google search page
    When I search for "<test>"
    Then The page title should start with "test"
    Examples:
      | test |
      | test |
      | test |
