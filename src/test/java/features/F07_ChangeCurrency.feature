Feature: F07_Create Change Currency

  Scenario: guest user could Create Change Currency of product
    Given Change Currency form Dollar to Euro
    When fills product on searchField and select it
    Then Assert price Contain "€"