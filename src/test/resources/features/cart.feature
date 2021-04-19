Feature: Add product to cart
  @smoke
  Scenario: User add product to cart and verify name and price

    Given I open Home Page
    When I type "Apple iPhone XR 128GB" into search field
    And I click search button
    And I click add product to cart button
    And I open Cart Page
    Then The name of product should be "Смартфон Apple iPhone XR 128GB (черный)"
    And The price of product should be "2 286,00 руб"
