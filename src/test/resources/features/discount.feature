@Discount
Feature: Discount

  Scenario: Verify the discount of 20% on
    Given I navigate to Best Sellers section
    When I hover over the "Printed Chiffon Dress" item
    Then for a old price of "$20.50" should show a "-20%" discount