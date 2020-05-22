Feature: Search

  Scenario Outline: Searching in google using a few texts
    Given Acessing "<page>" page
    When Insert texts to the field
      | Monika Błaszczyk | dfsgdg |
    Examples:
      | page                      |
      | https://www.google.com/   |
      |  https://www.google.com/  |


