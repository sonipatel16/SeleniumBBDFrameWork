package org.example.steps_defination;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.RegisterPage;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;

public class HomeSteps extends DriverManager {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    //LoginPage loginPage = new LoginPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        String myURL = getURL();
        assertThat(myURL, is(endsWith("nopcommerce.com/")));
    }
     @When("^I click on register button on home page$")
     public void i_click_on_register_button_on_home_page() throws Throwable {
      homePage.clickOnRegister();

      }


    // @When("^I can see the text \"([^\"]*)\"$")
    // public void i_can_see_the_text(String expectedText) throws Throwable {
    //  String actualText5 = registerPage.getPersonalDetail();
    // System.out.println(actualText5);
    // registerPage.getPersonalDetail();

    // }


    //  @When("^I click on register button on home page$")
    // public void i_click_on_register_button_on_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // homePage.clickOnRegister();

    //  }

   // @When("^I click on login link button on homepage$")
   // public void i_click_on_login_link_button_on_homepage() throws Throwable {
       // homePage.loginElement.click();
    }

   // @When("^I click on login button on homepage$")
   // public void i_click_on_login_button_on_homepage() throws Throwable {
    //    homePage.loginElement.click();
   // }
//}

