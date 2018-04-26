Feature: Google for cheese

  Scenario: Find some cheese
    Given I'm on Google search page
    When I search for "Cheese"
    Then The page title should start with "Cheese"
