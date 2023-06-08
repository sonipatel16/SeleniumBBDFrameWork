package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverManager {
    @FindBy(id = "small-searchterms")
    WebElement searchBox;
    @FindBy(className = "button-1")
    WebElement searchButton;
    @FindBy(className = "product-title")
    WebElement selectItem;

    @FindBy(id = "advs")
    WebElement advanceSearch;
    @FindBy(id= "mid")
    WebElement manufecturerBox;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[1]/form/div[2]/button]")
    WebElement submitSearchTab;
   // @FindBy(xpath =" /html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")
   // WebElement nikeShoes;

    @FindBy(id = "id=\"product_attribute_label_6\"")
    WebElement selectSize;
    @FindBy(xpath = "//select[@id='product_attribute_7']")
    WebElement selectColor;
    @FindBy(xpath = "//li[@class='selected-value']")
    WebElement selectPrint;
    @FindBy(id = "add-to-cart-button-24")
    WebElement addingToCart;
    @FindBy(className = "ico-cart")
    WebElement myItemInBasket;

    public void clickSearchBox() {
        searchBox.click();
        searchBox.sendKeys("shoes");


        searchButton.click();
       // waitForElementVisibility();
    }
    //public void selectProduct(){
       // waitForElementVisibility(nikeShoes,20,"element is not visible");
       // nikeShoes.click();

   // }
    public void clickAdvanceButton(){
        advanceSearch.click();
    }
    public void myManufacturerBox(){
        manufecturerBox.sendKeys("Nike");
        manufecturerBox.click();
    }
    public void tapSearchKey(){
        submitSearchTab.click();
    }
    public void selectProduct(String brandName){
        selectItem.isSelected();
        selectItem.sendKeys(brandName);
    }

    public void selectMySize(String Size) {
        selectSize.isSelected();
        selectSize.sendKeys(Size);

    }

    public void selectMyColor(String Color) {
        selectColor.sendKeys(Color);
        selectColor.isSelected();
    }
    public void selectMyPrint(String Print){
        selectPrint.isSelected();
        selectPrint.sendKeys(Print);

    }

    public void addToCart() {
        addingToCart.click();
    }

    public void shoppingCart() {
        myItemInBasket.isDisplayed();
    }

}
