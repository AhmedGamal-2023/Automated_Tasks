Feature: F12_Create Product Checkout

  Scenario: guest user could Create Product Checkout
    Given SearchOn product "HP Envy 6-1180ca 15.6-Inch Sleekbook" on searchField
    When clear, type amount of number "5" and Click on Add to Cart
    And navigate To Shopping Cart
    And Assert numbers of Quantity "5", Scroll To Click on CheckOut
    And log as user have account by email, password
    And fills Checkout Required Information "Egypt" country,"HWAFJJDDJDN" city,"65 ramy street" address,"12345" zip,"85321484513" phoneNumber
    Then assert "Your order has been successfully processed!"