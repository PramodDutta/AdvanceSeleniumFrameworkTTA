package com.tta.basetest;

import com.tta.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class BaseTest {

    @BeforeMethod
    protected void setUp() throws MalformedURLException {
        DriverManagerTL.init();
    }

    @AfterMethod
    protected void tearDown(){
        DriverManagerTL.down();
    }

}
