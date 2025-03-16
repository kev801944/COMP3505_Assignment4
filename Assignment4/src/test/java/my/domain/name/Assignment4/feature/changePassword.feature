Feature: Change Password

  Scenario: User changes password successfully
    Given I am logged in
    When I navigate to the account settings
    And I update the password to "NewPass123"
    Then I should see a password change confirmation message
