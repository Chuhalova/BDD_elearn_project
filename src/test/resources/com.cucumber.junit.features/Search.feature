Feature: As a user I want to get an ability to use the search

  Scenario Outline: User checks search input
    Given the user opens Cucumber website
    When the user clicks on search input
    And user enter "<query>" in search input
    And user clicks on blog filter
    And User opens the first source with "<article name>"
    Then User checks that page with the title "<article name>" has opened
    Examples:
      | query     | article name                 |
      | Announces | Announcing cucumber-electron |


