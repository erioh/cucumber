  Feature: Login
    Scenario: Valid scenario
      Given User is on the Login page
      When I enter "student" into Username field
      And I enter "luxoft" into Password field
      And Push button "Login"
      Then User is logged in as "student"