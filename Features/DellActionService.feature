Feature: Dell action

  Background: 
    Given user visits Dell homepage

  Scenario: 
    When user go to service dropdown menu and able to see View All Service
    Then user redirects to view all service

  Scenario: 
    When user navigates to Support dropdown menu and able to see Support Home option
    Then user redirects to Support Home  page

  Scenario: 
    When user navigates to Deals dropdown menu and able to see View All Deals option
    Then user redirects to View All Deals page
