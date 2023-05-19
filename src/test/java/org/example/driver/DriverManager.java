package org.example.driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;



    public class DriverManager {

        public static WebDriver driver;
        String browser = "chrome";
        String baseURL = "https://demo.nopcommerce.com/";

// needs to create constructor of class here
        public DriverManager(){
            PageFactory.initElements(driver,this);
        }

        public void openLocalBrowser() throws IllegalAccessException {
            switch(browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();
                    break;
                default:
                    throw new IllegalAccessException("unexpected browser");
            }
        }

        public void maximisingBrowser(){
            driver.manage().window().maximize();
        }

        public void applyImplicitWait(){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        public void closeBrowser(){
            driver.quit();
        }

        public void openURL(){
            driver.get(baseURL);
        }

        public String getURL(){
            return driver.getCurrentUrl();
        }
    }

