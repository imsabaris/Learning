Feature: To validate facebook functionality with multiple entries

  Scenario Outline: To validate login with invalidate multiple username and password
    Given user need to be in fblogin page 
    When user enters "<username>" and "<password>"
    And user clicks fblogin button
    Then user reenters in fblogin page

    Examples: 
      | username   | password |
      | java@123   | java     |
      | Greens@123 | Greens   |
