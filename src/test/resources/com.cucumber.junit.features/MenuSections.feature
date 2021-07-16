Feature: As a user I want to get an ability to use menu

  Scenario Outline: Docs section should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "<title>" item
    Then page with title "<title>" is displayed
    Examples:
      | title          |
      | Gherkin Syntax |
      | Installation   |


