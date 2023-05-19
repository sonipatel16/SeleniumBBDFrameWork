package org.example.steps_defination;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegisterPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RegisterSteps extends DriverManager {
    RegisterPage registerpage = new RegisterPage();
      @When("^I tick on female radio button$")
     public void i_tick_on_female_radio_button() throws Throwable {
      registerpage.femaleRadioButton();

     }
    @When("^I enter the valid first name$")
    public void i_enter_the_valid_first_name() throws Throwable {
        registerpage.addFirstName();

         }

         @And("^I enter the valid last name$")
         public void i_enter_the_valid_last_name() throws Throwable {
           registerpage.addLastName();

         }

         @And("^I enter the valid email$")
         public void i_enter_the_valid_email() throws Throwable {
          registerpage.addEmailField();

        }

          @And("^I enter the valid password$")
         public void i_enter_the_valid_password() throws Throwable {
         registerpage.addPasswordField();

         }

         @And("^I enter the valid confirm password$")
         public void i_enter_the_valid_confirm_password() throws Throwable {
          registerpage.addConfirmPassword();

        }

         @And("^I click on register button$")
        public void i_click_on_register_button() throws Throwable {
         registerpage.registerButton();

         }


        //  @When("^I can see text \"([^\"]*)\"$")
        //  public void i_can_see_text(String expectedText) throws Throwable {
        //  String actualText = registerpage.getPersonalDetail();
        //  assertEquals(expectedText, actualText);

        //  String expectedText1 = expectedText;
        // registerpage.getPersonalDetail();
        // }
        // @When("^I enter my all details on register page$")
        // public void i_enter_my_all_details_on_register_page(String expectedText) throws Throwable {
        //  String actualText = registerpage.setFirstName();
        // assertEquals(expectedText,actualText);
        // String actualText1 = registerpage.setLastName();
        //assertEquals(expectedText,actualText1);
        // String actualText2 = registerpage.setEmailField();
        // assertEquals(expectedText,actualText2);
        // String actualText3 = registerpage.setPasswordField();
        // assertEquals(expectedText,actualText3);
        // String actualText4 = registerpage.setConfirmPassword();
        // assertEquals(expectedText,actualText4);


        // }
        @Then("^I can see continue button$")
        public void i_can_see_continue_button() throws Throwable {
           registerpage.displayButton();
        }


    // @Then("^I can see continue button$") {
           //  public void i_can_see_continue_button
            // (String arg1) throws Throwable {
              //   registerpage.displayButton();


             }

             //@When("^I can see enter your personal details register page$")
             // public void i_can_see_enter_your_personal_details_register_page() throws Throwable {
             // Write code here that turns the phrase above into concrete actions
             //throw new PendingException();
             // }

             // @Then("^I can see text that \"you are registered$")
             // public void i_can_see_text_that_you_are_registered() throws Throwable {
             // String actualText = registerpage.getRegisterText();
             // assertEquals(expectedText, actualText);

             //String expectedText1 = expectedText;
             // Write code here that turns the phrase above into concrete actions

             // }
             // @Then("^I can see continue button$")
             // public void i_can_see_continue_button() throws Throwable {
             // String myURL = getURL();
             // assertThat(myURL, containsString(expectedText));
             // Write code here that turns the phrase above into concrete actions

             //  }


//}
        // }