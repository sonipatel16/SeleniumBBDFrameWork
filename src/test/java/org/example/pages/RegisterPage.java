package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends DriverManager {
    //@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")
    // @FindBy(xpath = "//div[@class=\"fieldset\"]/div/strong")
    // WebElement registerPageTitle;
     @FindBy(id ="gender-female")
     WebElement femaleRadioButton;
    // WebElement
    @FindBy(id = "gender-male")
    WebElement maleRadioButton;

    // @FindBy(xpath = "//div[@class=\"result\"]")

    @FindBy(id = "FirstName")
    WebElement firstNameField;

     @FindBy(id = "LastName")
     WebElement lastNameField;

      @FindBy(id = "Email")
      WebElement emailField;

     @FindBy(id = "Password")
     WebElement passwordField;
     @FindBy(id = "ConfirmPassword")
     WebElement confirmPasswordField;
    @FindBy(xpath = "//button[@name=\"register-button\"]")

     WebElement clickRegisterButton;


     @FindBy(css=  ".button-1")
     WebElement continueButton;

    // public void clickButton(){
    // continueButton.click();
    // }
    public void femaleRadioButton(){
     femaleRadioButton.click();

    }
    public  void clickMaleRadioButton(){
        maleRadioButton.click();
    }


    // public String getPersonalDetail(){
    // String actualText =  registerPageTitle.getText();
    // System.out.println(actualText);
    //  return actualText;

    //  }
    public void enterRegistrationDetails(String firstName ,String lastName, String email ,String password ,String confirmPassword){
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
        emailField.clear();
        emailField.sendKeys(email);
        passwordField.clear();
        passwordField.sendKeys(password);
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(confirmPassword);

    }

    public void addFirstName(String firstName) {
      firstNameField.clear();
      firstNameField.sendKeys(firstName);
        // String actualText = firstName.getText();
        // return actualText;


         }

        public void addLastName(String lastName) {

           lastNameField.clear();
           lastNameField.sendKeys(lastName);
            // String actualText = lastName.getText();
            // return actualText;
            }

            public void addEmailField (String email) {
               emailField.clear();
               emailField.sendKeys(email);
                // String actualText = emailField.getText();
                //  return actualText;
            }

            public void addPasswordField (String password) {
               passwordField.clear();
               passwordField.sendKeys(password);
                // String actualText = passwordField.getText();
                //  return actualText;
            }

            public void addConfirmPassword (String confirmPassword) {
              confirmPasswordField.clear();
              confirmPasswordField.sendKeys(confirmPassword);

                //String actualText = confirmPassword.getText();
                //  return actualText;
            }
            public void registerButton(){
        clickRegisterButton.click();
       // waitForElementVisibility(clickRegisterButton,20,"element is not visible");
            }
            public void displayButton () {
                continueButton.isDisplayed();
            }
            // public String getRegisterText() {
            // String actualText = registerPageTitle.getText();
            // return actualText;

              }
//}
