package com.tta.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class DriverManagerTL {

    //private static WebDriver driver;
    //private static WebDriver driver; // Fix
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

    public static void init() throws MalformedURLException {
        if (Objects.isNull(DriverManagerTL.getDriver())){
            //WebDriver driver = new ChromeDriver();
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setCapability("enableVNC", true);
            cap.setCapability("enableVideo" ,true);
            cap.setCapability("videoName","test1-video.mp4");
            WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
            setDriver(driver);
        }
    }

    public static void down() {
        if (Objects.nonNull(DriverManagerTL.getDriver())) {
            getDriver().quit();
            unload();
        }
    }
}
