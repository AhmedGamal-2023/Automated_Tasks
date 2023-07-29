Feature: F06_CreateEmailProduct
  @SmokeTesting
  Scenario: guest user could Create Contact Us
    Given user on HomePage login with Valid data email, password
    When user already logged, fills product on searchField and select it
    And on productPage, click on Email a friend
    And on Email a friend page, Fills FriendEmail, message
    Then Assert Your message has been sent

