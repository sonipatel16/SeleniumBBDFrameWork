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

#@"FKP1"

#Scenario: Login with valid credential
# Given I am on homepage
 # When I click on login button on homepage
# And I enter valid email and password
 # Then I should see "log out button"
 #And I should see "my account button"





















