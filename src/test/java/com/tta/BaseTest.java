package com.tta;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        DriverManagerTL.init();
    }

    @AfterMethod
    public void tearDown(){
        DriverManagerTL.down();
    }

}
