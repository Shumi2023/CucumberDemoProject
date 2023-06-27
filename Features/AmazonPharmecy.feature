Feature: Validate Amazon Pharmacy Homepage


  Scenario: Validating Amazon Pharmacy Homepage
    Given user visit to the Amazon homepage
    When user click to Amazon Pharmachy tab
    Then user should be redirected to the Amazon Pharmacy page
