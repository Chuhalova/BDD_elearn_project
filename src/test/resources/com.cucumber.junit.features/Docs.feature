Feature: As a user I want to get an ability to use Docs pages

  Scenario: Docs section should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "Installation" item
    Then there are 10 items in the lest-side menu
    And left-site menu contains the following links
      | Installation |
      | Guides       |
      | Professional Services |
      | Cucumber     |
      | Behaviour-Driven Development  |
      | Community    |
      | Sponsors     |
      | Tools        |
      | Terminology  |
