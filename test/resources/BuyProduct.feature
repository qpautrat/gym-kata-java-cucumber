Feature: Buying products

  Scenario: Buying products when enough stock
    Given 10 products in stock
    When 5 products are bought
    Then 5 products remain in stock