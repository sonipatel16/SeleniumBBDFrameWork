package org.example.pages;
import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
   public class LoginPage extends DriverManager {
       // @FindBy(css = ".ico-logout")
       // WebElement loginTab;
        @FindBy(id = "Email")
        WebElement validEmail;
        @FindBy(id = "Password")
        WebElement validPassword;
        @FindBy(css =  ".login-button")
        WebElement clickTab;
        @FindBy(css = ".ico-account")
        WebElement myAccountTab;

       @FindBy(xpath = "//div[@class=\"center-1\"]/div/div/h1")
       WebElement welcomeText;
       public void enterEmail(){
           validEmail.click();
           validEmail.sendKeys("sonipatel16@gmail.com");
       }
       public void enterPassword(){
           validPassword.click();
           validPassword.sendKeys("Falguni08@");

       }
       public void loginButtonClick(){
           clickTab.click();
       }
       public void checkMyAccount(){
           myAccountTab.isDisplayed();
       }

       public String getWelcomeText() {
           String actualText = welcomeText.getText();     ///Welcome Sign in!
          return actualText;
       }

       public void clickOnLoginButton() {
           waitForElementVisibility(clickTab,20,"element is not visible");
           clickTab.click();



       }

   }