Feature: User Login
  Users should be able to log in with valid credentials.

  Scenario: Successfully log into JPetStore
    Given I open the browser
    And I navigate to the JPetStore login page
    When I enter username "j2ee" and password "j2ee"
    And I click the login button
    Then I should be logged in successfully
