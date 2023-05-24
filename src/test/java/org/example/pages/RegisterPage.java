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

    // @FindBy(xpath = "//div[@class=\"result\"]")

    @FindBy(id = "FirstName")
    WebElement firstName;

     @FindBy(id = "LastName")
     WebElement lastName;

      @FindBy(id = "Email")
      WebElement emailField;

     @FindBy(id = "Password")
     WebElement passwordField;
     @FindBy(id = "ConfirmPassword")
     WebElement confirmPassword;
     @FindBy(id = "register-button")
     WebElement clickRegisterButton;


     @FindBy(css= ".button-1 ")
     WebElement continueButton;

    // public void clickButton(){
    // continueButton.click();
    // }
    public void femaleRadioButton(){
     femaleRadioButton.click();

    }


    // public String getPersonalDetail(){
    // String actualText =  registerPageTitle.getText();
    // System.out.println(actualText);
    //  return actualText;

    //  }

    public void addFirstName() {
        firstName.click();
        firstName.sendKeys("falguni");
        // String actualText = firstName.getText();
        // return actualText;


         }

        public void addLastName() {

            lastName.click();
            lastName.sendKeys("Patel");
            // String actualText = lastName.getText();
            // return actualText;
            }

            public void addEmailField () {
                emailField.click();
                emailField.sendKeys("falgunipatel@gmail.com");
                // String actualText = emailField.getText();
                //  return actualText;
            }

            public void addPasswordField () {
                passwordField.click();
                passwordField.sendKeys("Falguni08@");
                // String actualText = passwordField.getText();
                //  return actualText;
            }

            public void addConfirmPassword () {
                confirmPassword.click();
                confirmPassword.sendKeys("Falguni08@");

                //String actualText = confirmPassword.getText();
                //  return actualText;
            }
            public void registerButton(){
        clickRegisterButton.click();
        waitForElementVisibility(clickRegisterButton,20,"element is not visible");
            }
            public void displayButton () {
                continueButton.isDisplayed();
            }
            // public String getRegisterText() {
            // String actualText = registerPageTitle.getText();
            // return actualText;

              }
//}
