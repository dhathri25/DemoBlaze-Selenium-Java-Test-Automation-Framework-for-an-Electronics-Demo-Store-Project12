
package com.srm.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

import com.srm.utils.*;

public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config;

    @BeforeMethod
    public void setup(ITestContext context) {
    	

        config = new ConfigReader();
        driver = DriverFactory.initDriver(config.getBrowser());
        driver.get(config.getUrl());

        context.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}