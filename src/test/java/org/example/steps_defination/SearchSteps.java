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
    @When("^I able to see the product$")
    public void i_able_to_see_the_product() throws Throwable {


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
