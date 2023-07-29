Feature: F09_Move Hover Menu

  Scenario: guest user could Move Hover Computer Menu
    Given hover on Computers and click on Notebooks
    When on Notebooks Page
    Then Assert Current Url "https://demo.nopcommerce.com/notebooks"
    And Assert PageTitle "Notebooks"