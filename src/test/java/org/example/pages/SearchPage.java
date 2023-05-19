package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverManager {
@FindBy(id = "small-searchterms")
    WebElement searchBox;
@FindBy(className = "button-1")
WebElement searchButton;
    public void clickSearchBox() {
        searchBox.click();
        searchBox.sendKeys("shoes");

        searchButton.click();
    }

}
