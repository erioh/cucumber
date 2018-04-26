Feature: Shout

  Background:
    Given Hello World

  @smoke
  @ext-smoke
  Scenario: Listener is within range
    Given Lucy is 35 meters from Shon
    When Shon says "free begets at Shon's"
    Then Lucy should hear Shon's message

  @ext-smoke
  Scenario Outline: Listener is within range
    Given Lucy is <distance> meters from Shon
    When Shon says <message>
    Then Lucy should hear Shon's message
    Examples:
      | distance | message     |
      | 150      | "Hello"     |
      | 111      | "world"     |
      | 22       | "Aleksandr" |

  Scenario: Listener is within range
    Given Lucy is 35 meters from Shon
    When Shon says "free begets at Shon's"
    Then Lucy should hear Shon's message

  Scenario: Existing user Verification
    Given user is displayed login screen
    Then we verify following user exists
      | Name    | Email            |
      | Shankar | sgarg@email.com  |
      | Shankar | sgarg2@email.com |
      | Ram     | ram@email.com    |
      | Sham    | sham@email.org   |

  Scenario: Existing user Verification
    Given user is displayed login screen
    Then we verify following user exists2
      | Name  | Alex            | Alex2         | Alex3         |
      | Email | sgarg@email.com | email2@mm.com | email3@mm.com |

  Scenario: Get date
    Given My Birthday is on "29-12-1986"