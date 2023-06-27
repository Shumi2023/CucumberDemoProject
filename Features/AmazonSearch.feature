Feature: Validate Amazon search

  Scenario Outline: Validate Amazon search
    Given user visit amazon homepage
    When user type "<productname>" and click search icon
    Then User should able to see the expected product

    Examples: 
      | productname      |
      | iphone 12 promax |
