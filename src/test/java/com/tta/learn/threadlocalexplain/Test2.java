package com.tta.learn.threadlocalexplain;

import com.tta.basetest.BaseTest;
import com.tta.driver.DriverManagerTL;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class Test2 extends BaseTest {
//    @Test
//    public void test2(){
//        DriverManager.init();
//        DriverManager.driver.get("https://bing.com");;
//    }


    @Test
    public void test2TL(){
        DriverManagerTL.getDriver().get("https://bing.com");
        Assertions.assertThat(DriverManagerTL.getDriver().getCurrentUrl().toString())
                .isNotBlank()
                .isNotNull()
                .contains("bing");
//        System.out.println( DriverManagerTL.getDriver().getCurrentUrl());
    }
}
