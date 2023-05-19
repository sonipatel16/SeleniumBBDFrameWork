package org.example.pages;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



    public class HomePage extends DriverManager {
       // @FindBy(css = ".search-box-text ui-autocomplete-input")
       // @FindBy(css = ".ico-login")
        @FindBy(css = ".ico-register")
        //public WebElement loginButton;
        //public WebElement searchButton;

        public WebElement registerButton;
        //public void clickOnSearch(){
          // searchButton.click();

        // }
       // public void clickOnLoginButton(){
       // loginButton.click();
       // }

        public void clickOnRegister(){
            registerButton.click();
            //loginButton.click();

        }
    }

