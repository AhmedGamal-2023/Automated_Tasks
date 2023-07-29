Feature: F11_Create Add Products To Compare Page

  Scenario: guest user could Add Products To Compare Page
    Given Search on product1 "Apple MacBook Pro 13-inch" on searchField
    When in ProductPage, Click on Add to Compare List
    And Search on product2 "Asus N551JK-XO076H Laptop" on searchField
    And in ProductPage, Click on Add to Compare List and navigate to it
    Then Assert Display "Apple MacBook Pro 13-inch" ,"Asus N551JK-XO076H Laptop"