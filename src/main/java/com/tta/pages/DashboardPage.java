package com.tta.pages;

import com.tta.driver.DriverManagerTL;
import com.tta.utils.WaitForHelper;
import org.openqa.selenium.By;

public class DashboardPage {

    DashboardPage(){

    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName(){
        new WaitForHelper(DriverManagerTL.getDriver()).presenceOfElement(userNameOnDashboard);
        DriverManagerTL.getDriver().findElement(userNameOnDashboard);
        return DriverManagerTL.getDriver().findElement(userNameOnDashboard).getText();
    }

}
