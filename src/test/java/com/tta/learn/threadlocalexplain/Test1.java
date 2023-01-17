package com.tta.learn.threadlocalexplain;

import com.tta.basetest.BaseTest;
import com.tta.driver.DriverManagerTL;
import com.tta.utils.PropertyReaderOptimized;
import org.testng.annotations.Test;

public class Test1 extends BaseTest {

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
    public void test2TL() throws Exception {
//        DriverManagerTL.getDriver().get(PropertyReader.readKey("url"));
        DriverManagerTL.getDriver().get(PropertyReaderOptimized.readKeyO("url"));;
        System.out.println( DriverManagerTL.getDriver().getCurrentUrl());
    }
}
