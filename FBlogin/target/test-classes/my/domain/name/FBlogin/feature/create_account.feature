Feature: User Registration
  A new user should be able to create an account in JPetStore.

  Scenario: Successfully create a new account
    Given I open the browser
    And I navigate to the JPetStore registration page
    When I enter a new username "testUser123"
    And I enter a password "testPass123" and confirm it as "testPass123"
    And I enter personal details:
      | First Name | Last Name | Email                | Phone       |
      | Michael    | Tandyo    | michael@example.com | 1234567890  |
    And I enter address details:
      | Address1       | Address2 | City   | State | Zip    | Country |
      | 123 Street NW  | Apt 4    | Calgary | AB    | T2X 0L3 | Canada  |
    And I submit the registration form
    Then My account should be created successfully
