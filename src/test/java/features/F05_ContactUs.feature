Feature: F05_Create Contact Us
  @SmokeTesting
  Scenario: guest user could Create Contact Us
    Given user on Home Page scroll to bottom
    When user click on contact Us to navigate it
    And user fills name,email,Enquiry
    And Click on Submit Button
    Then Your enquiry has been successfully sent to the store owner.
