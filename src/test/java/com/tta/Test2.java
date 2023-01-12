package com.tta;

import com.tta.driver.DriverManagerTL;
import org.testng.annotations.Test;

public class Test2 extends BaseTest{
//    @Test
//    public void test2(){
//        DriverManager.init();
//        DriverManager.driver.get("https://bing.com");;
//    }


    @Test
    public void test2TL(){
        DriverManagerTL.getDriver().get("https://bing.com");
        System.out.println( DriverManagerTL.getDriver().getCurrentUrl());
    }
}
