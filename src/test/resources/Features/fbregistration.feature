Feature: To validate the facebook registration

  @smoke
  Scenario: To validate the new account using credentials
    Given user has to be in login page
    But user has to click new account
    When user has to enter firstname
      | firstname | Greens |
    When user has to enter lastname
      | Tech       |
      | Technology |
    When user has to enter email or mobile
      | mobileoremail    |
      |       8667300000 |
      | Greens@gmail.com |
    When user has to enter password
      | Greens12345 |
    When user has to select date of birth
    When user has to click gender
    And user has to click signup
    Then user enters the homepage
