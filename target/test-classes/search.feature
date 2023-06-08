@Test3

Feature: search feature
  As a user
  I want to  search product
  So that i can see results

  @Test3
  Scenario Outline: search for product

    Given I am on homepage
    When I search for product "shoes"
    #And I able to see the product
    And I click on advance search box
    And I click on manufacturer box and select "Nike"
    And I submit search button
    And I select my item
   # And I select my require "<Size>"
   #And I select my choice "<Color>"
   # And I select my favourite "<Print>"
   # And I select click on add to cart button
   # Then I should see my item in cart

 Examples:
   |  | Size | Color      | Print   |  |
   |  | 8    | White/Blue | Natural |  |


