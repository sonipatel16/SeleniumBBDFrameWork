package org.example.steps_defination;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

    public class LoginSteps extends DriverManager {

        LoginPage loginPage = new LoginPage();
        @When("^I enter the  my  valid email id$")
        public void i_enter_the_my_valid_email_id() throws Throwable {
         loginPage.enterEmail();
        }

        @When("^I enter the my valid password$")
        public void i_enter_the_my_valid_password() throws Throwable {
            loginPage.enterPassword();

        }

        @When("^I click on the log in tab$")
        public void i_click_on_the_log_in_tab() throws Throwable {
            loginPage.loginButtonClick();

        }

        @Then("^I should see \"([^\"]*)\" in header$")
        public void i_should_see_in_header(String arg1) throws Throwable {
            loginPage.checkMyAccount();

        }



        //  @When("^I enter valid email and password$")
      //  public void i_enter_valid_email_and_password(String expectedText) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
          //  String myURL = getURL();
          //  assertThat(myURL,containsString(expectedText));
           // throw new PendingException();
       // }

        @Then("^I should see \"([^\"]*)\" text$")
        public void i_should_see_text(String expectedText) throws Throwable {
            String actualText = loginPage.getWelcomeText();
            assertEquals(expectedText,actualText);

        }
       @Then("^I should see \"([^\"]*)\"$")
        public void i_should_see(String expectedText) throws Throwable {
            // Write code here that turns the phrase above into concrete actions

          String actualText = loginPage.getWelcomeText();
           assertEquals(expectedText,actualText);
           String expectedText1 = expectedText;
           // throw new PendingException();









          // String expectedText1 = expectedText;


             }
             @Then("^the URL should contain \"([^\"]*)\"$")
          public void the_URL_should_contain (String expectedText) throws Throwable {
                 String myURL = getURL();
                assertThat(myURL, containsString(expectedText));
             }


         }
   // }
