Feature: F09_F10_Add Product To Wishlist

  Scenario: guest user could Add Product To Wishlist Page
    Given user Search on product "Apple MacBook Pro 13-inch" on searchField
    When in ProductPage, Click on Add to Wishlist
    And Click on Wishlist icon to navigate it
    Then assert display product "Apple MacBook Pro 13-inch" in WishlistPage
    When click on remove
    And click on Update Wishlist
    Then Assert display message "The wishlist is empty!"