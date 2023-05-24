@Test1
Feature: login feature
  As a user
  I want to add login functionality
  So that customer can use it

  @Test1
  Scenario: Validating sign in text on login page
    Given I am on homepage
    When I click on login button on homepage
    Then I should see "Welcome, Please Sign In!" text
    And the URL should contain "/login"

  @Test5
  Scenario: Validating my credential
    Given I am on homepage
    When I click on login link button on homepage
    And I enter the  my  valid email id
    And I enter the my valid password
    And I click on the log in tab
    Then I should see "my account button" in header






















