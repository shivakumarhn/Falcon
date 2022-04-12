Feature: Search job in Indeed home page

  Scenario: Search job with keyword
    Given User on home page
    And Enter keyword and location in input box
    When Click on find jobs button
    Then Search results should be displayed
