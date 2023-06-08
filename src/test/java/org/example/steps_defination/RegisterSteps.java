package org.example.steps_defination;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegisterPage;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RegisterSteps extends DriverManager {
    RegisterPage registerpage = new RegisterPage();
      @When("^I tick on female radio button$")
     public void i_tick_on_female_radio_button() throws Throwable {
      registerpage.femaleRadioButton();

     }

    @When("^I enter the valid first name \"([^\"]*)\"$")
    public void i_enter_the_valid_first_name(String firstName) throws Throwable {
       registerpage.addFirstName(firstName);
    }

    @When("^I enter the valid last name \"([^\"]*)\"$")
    public void i_enter_the_valid_last_name(String lastName) throws Throwable {
          registerpage.addLastName(lastName);

    }


    @When("^I enter my email \"([^\"]*)\"$")
    public void i_enter_my_email(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerpage.addEmailField(email);

    }

    @When("^I enter my valid password \"([^\"]*)\"$")
    public void i_enter_my_valid_password(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerpage.addPasswordField(password);
    }










    @When("^I enter the valid confirm password \"([^\"]*)\"$")
    public void i_enter_the_valid_confirm_password(String confirmPassword) throws Throwable {
          registerpage.addConfirmPassword(confirmPassword);

    }
    {

    }

  //  @When("^I enter the valid email\"([^\"]*)\"$")
   //public void i_enter_the_valid_email(String email) throws Throwable {
        // registerpage.addEmailField(email);
//
//
 //}



   @When("^I enter the valid email\"([^\"]*)\"$")
    public void i_enter_the_valid_email(String email) throws Throwable {
       //  Write code here that turns the phrase above into concrete actions
        registerpage.addEmailField(email);

    }

    @When("^I enter the valid password  \"([^\"]*)\"$")
    public void i_enter_the_valid_password(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerpage.addPasswordField(password);

    }
   @When("^I tick on male radio button$")
   public void i_tick_on_male_radio_button() throws Throwable {
     registerpage.clickMaleRadioButton();
   }

    @When("^I enter following details registration$")
    public void i_enter_following_details_registration(DataTable dataTable) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        System.out.println(data);
        System.out.println(dataTable);
        //String myFirstName = data.get(0).get("firstName");
        registerpage.enterRegistrationDetails(  data.get(0).get("firstName"),
                data.get(0).get("lastName"),
                data.get(0).get("email"),
                data.get(0).get("password"),
                data.get(0).get("confirmPassword")

        );

    }





//
//    @When("^I enter the valid password  \"([^\"]*)\"$")
//    public void i_enter_the_valid_password(String password) throws Throwable {
//          registerpage.addPasswordField(password);
//
//    }
//
//
//    @When("^I enter the valid first name$")
//    public void i_enter_the_valid_first_name(String firstName) throws Throwable {
//        registerpage.addFirstName(firstName);
//
//         }
//
//         @And("^I enter the valid last name$")
//         public void i_enter_the_valid_last_name(String lastName) throws Throwable {
//           registerpage.addLastName(lastName);
//
//         }
//
//         @And("^I enter the valid email$")
//         public void i_enter_the_valid_email(String email) throws Throwable {
//          registerpage.addEmailField(email);
//
//        }
//
//          @And("^I enter the valid password$")
//         public void i_enter_the_valid_password(String password) throws Throwable {
//         registerpage.addPasswordField(password);
//
//         }
//
//         @And("^I enter the valid confirm password$")
//         public void i_enter_the_valid_confirm_password(String confirmPassword) throws Throwable {
//          registerpage.addConfirmPassword(confirmPassword);
//
//        }

         @And("^I click on register button$")
        public void i_click_on_register_button() throws Throwable {
         registerpage.registerButton();

         }




        // }
        @Then("^I can see continue button$")
        public void i_can_see_continue_button() throws Throwable {
           registerpage.displayButton();
        }





             }








