package org.example;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager dm = new DriverManager();
    @Before
    public void setUp() throws IllegalAccessException {
        dm.openLocalBrowser();
        dm.maximisingBrowser();
        dm.openURL();
        dm.applyImplicitWait();
    }
    @After
    public void tearDown() {
        dm.closeBrowser();
    }
}
