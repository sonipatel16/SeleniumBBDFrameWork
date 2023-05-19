
Feature: registration feature
As a user
I want to add registration functionality
So  that customer  can use it

@Test2
Scenario:Validating personal details on registration page
  Given I am on homepage
  When I click on register button on home page
  And I tick on female radio button
 # And I can see text "Your Personal Details"
  And I enter the valid first name
  And I enter the valid last name
  And I enter the valid email
  And I enter the valid password
  And I enter the valid confirm password
  And I click on register button
  #And I submit the register tab on register page
  Then I can see continue button




