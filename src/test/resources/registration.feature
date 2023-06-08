Feature: registration feature
  As a user
  I want to add registration functionality
  So  that customer  can use it

  @Test

  Scenario:Validating personal details on registration page
    Given I am on homepage
    When I click on register button on home page
    And I tick on female radio button
 # And I can see text "Your Personal Details"
    And I enter the valid first name "falguni"
    And I enter the valid last name "Patel"
    And I enter my email "bhoomisuthar@gmail.com"
    And I enter my valid password "Falguni08@"
    And I enter the valid confirm password "Falguni08@"
    And I click on register button
  #And I submit the register tab on register page
    Then I can see continue button


  @Test2
  Scenario Outline:Validating  multiple  details on registration page
    Given I am on homepage
    When I click on register button on home page
    And I tick on female radio button
 # And I can see text "Your Personal Details"
    And I enter the valid first name "<firstName>"
    And I enter the valid last name "<lastName>"
    And I enter the valid email"<email>"
    And I enter the valid password  "<password>"
    And I enter the valid confirm password "<confirmPassword>"
    And I click on register button
  #And I submit the register tab on register page
    Then I can see continue button
    Examples:
      | firstName | lastName | email                    | password  | confirmPassword |
      | ketan     | kumar    | meeraamin02@gmail.com    | Ishan16@  | Ishan16@        |
      | ishan     | Patel    | falgunipatel10@gmail.com | Sonali08@ | Sonali08@       |

@Test10
  Scenario Outline: Validating registration details with data table

    Given I am on homepage
    When I click on register button on home page
    And I tick on male radio button
    And I enter following details registration
      | firstName     | lastName     | email     | password     | confirmPassword     |
      | <myFirstName> | <myLastName> | <myEmail> | <myPassword> | <myConfirmPassword> |


#  And I enter the valid first name "falguni"
#  And I enter the valid last name "Patel"
#  And I enter the valid email "ketsoni29@gmail.com"
#  And I enter the valid password "Falguni08@"
#  And I enter the valid confirm password "Falguni08@"
    And I click on register button
    Then I can see continue button

    Examples:

      | myFirstName | myLastName | myEmail                | myPassword   | myConfirmPassword |
      | atul        | Amin       | sheenaamin20@gmail.com | Jaishri9@    | Jaishri9@         |
      | pankaj      | Patel      | shivucute13@gmail.com  | Omushiv8@    | Omushiv8@         |
      | sameer      | roy        | samrow80@gmail.com     | Luckyyou509@ | Luckyyou509@      |
      | hiren       | Amin       | diphir899@gmail.com    | Kianson04@   | Kianson04@        |
      | hrishan     |Patel       |hrishiish45@gmail.com   |Goodday16@    |Goodday16@         |



