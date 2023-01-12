package com.tta;

import com.tta.driver.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    protected void setUp(){
        DriverManagerTL.init();
    }

    @AfterMethod
    protected void tearDown(){
        DriverManagerTL.down();
    }

}
