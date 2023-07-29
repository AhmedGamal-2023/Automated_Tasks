Feature: F03_ChangePassword | users could ChangePassword

  Scenario: guest user could Change password with new data
    Given login with old data email, password
    When navigate to MyAccount Page and click Change password
    And enter password, NewPassword, ConfirmNewPassword
    And Click Change password Button
    Then Assert Change password successfully


  Scenario: guest user could login with New Password successfully
    Given user navigate to login page
    When user enter new data with email, NewPassword
    And user Click on login button
    Then user login to the system successfully by new Password