Feature: Validate Amazon Registry Homepage

  Scenario: Validating Amazon Registry Homepage
    Given user visit to Amazon homepage
    When user click to Amazon Registry tab
    Then user should be redirected to the Amazon Registry page
