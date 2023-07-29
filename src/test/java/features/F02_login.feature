Feature: F02_Login | users could login with authorised accounts
  @SmokeTesting
  Scenario: guest user could login with valid data successfully
    Given user go to login page
    When user enter valid data with email , password
    And user press on login button
    Then user login to the system successfully