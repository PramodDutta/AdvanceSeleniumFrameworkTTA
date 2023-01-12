package com.tta.pages;


import com.tta.driver.DriverManagerTL;
import com.tta.utils.PropertyReaderOptimized;
import org.openqa.selenium.By;

public class LoginPage {

    public LoginPage(){

    }
    // Page Locators
    By username = By.id("login-username" );
    By password = By.id("login-password" );
    By signButton = By.id("js-login-btn" );

    // Page Actions

    public LoginPage loginToVWO() throws Exception {
        DriverManagerTL.getDriver().findElement(username).sendKeys( PropertyReaderOptimized.readKeyO("username"));
        DriverManagerTL.getDriver().findElement(password).sendKeys( PropertyReaderOptimized.readKeyO("password"));
        DriverManagerTL.getDriver().findElement(signButton).click();
        return this;
    }

    public DashboardPage afterLogin(){
        return new DashboardPage();
    }





}
