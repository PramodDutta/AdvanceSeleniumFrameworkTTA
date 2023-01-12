package com.tta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

public class DriverManagerTL {

    private static WebDriver driver;
    private static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static void setDriver(WebDriver driverRef){
        dr.set(driverRef);
    }

    public static WebDriver getDriver(){
        return dr.get();
    }

    public static void unload(){
        dr.remove();
    }

    public static void init() {
        if (Objects.isNull(driver)){
            driver = new ChromeDriver();
            setDriver(driver);
        }
    }

    public static void down() {
        if (Objects.nonNull(driver)) {
            getDriver().quit();
            unload();
        }
    }
}
