Feature: Registration user could register to the site
  @SmokeTesting
  Scenario: user could register entering valid data
    Given user navigate to Register page
    When user fills  FirstName, LastName, email, password, confirmPassword
    And user clicks register button
    Then success message is displayed