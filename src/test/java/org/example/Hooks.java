package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager dm = new DriverManager();
    @Before
    public void setUp() throws IllegalAccessException {
        dm.openLocalBrowser();
       // dm.openHeadlessBrowser();
        dm.maximisingBrowser();
        dm.openURL();
        dm.applyImplicitWait();
    }
    @After
    public void tearDown() {
        dm.closeBrowser();
    }
    @After
    public void tearDown(Scenario scenario){
        DriverManager driverManager;
        if(scenario.isFailed()){
            dm.takeScreenshot(scenario);
        }
        dm.closeBrowser();
    }
}
