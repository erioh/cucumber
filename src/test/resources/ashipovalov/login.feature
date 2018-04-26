Feature: Login  and Create Project

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

    Scenario: As an Administrator I want to create new project
      Given User is on the HomePage logged as user "student" with password "luxoft"
      When User click Report Issue link
      And User fill all mandatory fields
      And User click Submit Report Button
      Then Report is submitted successfully
