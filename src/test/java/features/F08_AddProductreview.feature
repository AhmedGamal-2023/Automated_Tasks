Feature: F08_Add Product review

  Scenario: guest user could Create Contact Us
    Given user on HomePage, login with Valid data email, password
    When User Search on Product on searchField and select it
    And on productPage, click on Add Review
    And on ProductReview Page, Fills title, text
    Then Assert "Product review is successfully added."
