Feature: Login

  Scenario: Valid scenario
    Given User is on the Login page
    When User enter "student" into Username field
    And User enter "luxoft" into Password field
    And Push Login button
    Then User is logged in as "student"

  Scenario Outline: Invalid login
    Given User is on the Login page
    When User enter "<username>" into Username field
    And User enter "<password>" into Password field
    And Push Login button
    Then Error message appears
    Examples:
      | username | password |
      | Tolik    | qwerty   |
      |          | password |
      | student  |          |
      | user     | luxoft   |
      |          |          |
      | q        | q        |
      | !        | @        |
