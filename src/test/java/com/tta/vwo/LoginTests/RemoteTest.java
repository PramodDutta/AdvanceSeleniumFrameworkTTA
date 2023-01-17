package com.tta.vwo.LoginTests;

import com.google.common.util.concurrent.Uninterruptibles;
import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RemoteTest {


    @Test
    public void test1() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setCapability("enableVNC", true);
        cap.setCapability("enableVideo" ,true);
        cap.setCapability("videoName","test1-video.mp4");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        driver.quit();
    }
}
