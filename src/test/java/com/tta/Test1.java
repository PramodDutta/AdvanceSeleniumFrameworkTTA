package com.tta;

import org.testng.annotations.Test;

public class Test1 extends BaseTest{

//
//    @Test
//    public void test1(){
//        DriverManager.init();
//        DriverManager.driver.get("https://google.com");;
//    }

    @Test
    public void test1TL(){
        DriverManagerTL.getDriver().get("https://google.com");;
        System.out.println( DriverManagerTL.getDriver().getCurrentUrl());
    }

    @Test
    public void test2TL(){
        DriverManagerTL.getDriver().get("https://duckduckgo.com");;
        System.out.println( DriverManagerTL.getDriver().getCurrentUrl());
    }
}
