package org.example.pages;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



    public class HomePage extends DriverManager {
        // @FindBy(css = ".search-box-text ui-autocomplete-input")

        @FindBy(css = ".ico-register")
        public WebElement registerButton;
       // @FindBy(css = ".ico-login")
       // public WebElement loginElement;
        //public WebElement searchButton;


        //public void clickOnSearch(){
        // searchButton.click();

        // }
       // public void clickOnLoginElement() {
           // loginElement.click();
          //  waitUntilElementIsClickable(loginElement);

            // WebElement loginButtonElement;
            //  waitForElementVisibility(loginButtonElement, 20, "Element is not visible");
            //  loginButtonElement.click();
            // }

            public void clickOnRegister () {
                registerButton.click();
                waitUntilElementIsClickable(registerButton);
                //loginButton.click();


            }
        }
