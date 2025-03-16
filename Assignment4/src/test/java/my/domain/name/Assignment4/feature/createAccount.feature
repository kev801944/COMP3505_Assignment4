Feature: Create New User Account

  Scenario: Successfully create a new account
    Given I open the browser
    And I navigate to the JPetStore registration page
    When I enter valid account details
    And I submit the form
    Then I should see an account creation confirmation message
