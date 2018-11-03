package com.mavenit.selenium.Sept;

import com.mavenit.selenium.Sept.driver.DriverHelper;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private DriverHelper driverHelper = new DriverHelper();

    @Before
    public void setUp() {
        driverHelper.openBrowser();
        driverHelper.navigateTo(System.getProperty("url"));
        driverHelper.maxBrowser();
        driverHelper.applyImpWait();
        driverHelper.handleCookeis();
    }

    @After
    public void tearDown() {
        driverHelper.closeBrowser();
    }
}
