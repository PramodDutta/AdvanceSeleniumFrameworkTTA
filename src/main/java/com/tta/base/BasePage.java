package com.tta.base;

import com.tta.driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage() {

    }

    public void implicitWait() {
        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebElement presenceOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement elementToBeClickable(final By elementIdentier) {
        WebElement element = new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(elementIdentier));
        return element;
    }

    protected void enterInput(By by, String key) {
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }

    protected WebElement getElement(By key) {
        return DriverManagerTL.getDriver().findElement(key);
    }

    protected void clickElement(By by) {
        DriverManagerTL.getDriver().findElement(by).click();
    }






}
