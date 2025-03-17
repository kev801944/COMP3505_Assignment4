Feature: Change Password
  A user should be able to successfully change their password in JPetStore.

  Scenario: Successfully update password
    Given I open the browser
    And I navigate to the JPetStore homepage
    When I log in with username "testUser123" and password "testPass123"
    And I navigate to the account settings
    And I update the password to "newPass456"
    And I confirm the password as "newPass456"
    And I submit the password change form
    Then My password should be updated successfully
