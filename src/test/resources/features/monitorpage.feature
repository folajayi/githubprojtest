Feature:Product search functionality
  As a user of Amazon website
  I want to add monitor to cart and be sure the correct monitor price is the subtotal in cart

  Background:
    Given  I am on Amazon website

    Scenario: Validate product page price is identical cart price and cart subtotal
      And I type "Monitor" in the search field
      And I select the first item on the list
      When I Add to Cart
      And I open Cart from the top-left
      Then The price should be identical price on the product page
      And  The subtotal should be identical to price on the product page