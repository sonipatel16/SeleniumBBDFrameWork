package org.example.steps_defination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.SearchPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SearchSteps extends DriverManager {
    SearchPage searchPage = new SearchPage();
    @When("^I search for product \"([^\"]*)\"$")
    public void i_search_for_product(String expectedText) throws Throwable {
      searchPage.clickSearchBox();
    }

    @When("^I click on advance search box$")
    public void i_click_on_advance_search_box() throws Throwable {
        searchPage.clickAdvanceButton();
    }

    @When("^I click on manufacturer box and select \"([^\"]*)\"$")
    public void i_click_on_manufacturer_box_and_select(String arg1) throws Throwable {
        searchPage.myManufacturerBox();


    }
    @When("^I submit search button$")
    public void i_submit_search_button() throws Throwable {
        searchPage.tapSearchKey();
    }



        @When("^I select my item$")
    public void i_select_my_item() throws Throwable {
       // searchPage.tapSearchKey();

    }

    // @When("^I able to see the product$")
   // public void i_able_to_see_the_product() throws Throwable {



   // }

  //  @When("^I select my choice,color,size,design$")
   // public void i_select_my_choice_color_size_design() throws Throwable {
       // searchPage.selectMyRequirement(8,"white/blue","natural");

   // }

//    @When("^I click on my product$")
//    public void i_click_on_my_product() throws Throwable {
//    searchPage.selectProduct();
//    }


    @When("^I select my item \"([^\"]*)\"$")
    public void i_select_my_item(String brandName) throws Throwable {
        searchPage.selectProduct(brandName);

    }




    @When("^I select my choice \"([^\"]*)\"$")
    public void i_select_my_choice(String Size) throws Throwable {
        searchPage.selectMySize(Size);

    }

    @When("^I select my require \"([^\"]*)\"$")
    public void i_select_my_require(String Color) throws Throwable {
        searchPage.selectMyColor(Color);

    }

    @When("^I select my favourite \"([^\"]*)\"$")
    public void i_select_my_favourite(String Print) throws Throwable {
        searchPage.selectMyPrint(Print);

    }



    @When("^I select click on add to cart button$")
    public void i_select_click_on_add_to_cart_button() throws Throwable {
        searchPage.addToCart();


    }

    @Then("^I should see my item in cart$")
    public void i_should_see_my_item_in_cart() throws Throwable {
        searchPage.shoppingCart();

    }



    // @When("^I add the product to cart$")
    //public void i_add_the_product_to_cart() throws Throwable {

   // }

    @Then("^the product should be on cart$")
    public void the_product_should_be_on_cart() throws Throwable {

    }


    @Then("^I able to see some results$")
    public void i_able_to_see_some_results(String item) throws Throwable {

    }

}
