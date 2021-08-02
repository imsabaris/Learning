Feature: To validate facebook functionality

  Scenario: To validate login with invalidate username and password
    Given user need to be in login page
    When user enters username and password
    And user clicks login button
    Then user reenters in login page
