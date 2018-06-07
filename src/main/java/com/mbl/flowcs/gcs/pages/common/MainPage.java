package com.mbl.flowcs.gcs.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author VMurashov
 */
public class MainPage extends GcsGemsPage {

    @FindBy(xpath = "")
    private WebElement userNameField;

    @FindBy(xpath = "")
    private WebElement logOutButton;

    public MainPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(userNameField));
    }

    public boolean isAuthorised() {

        try {

            return userNameField.isDisplayed();

        } catch (Exception ex) {

            throw ex;

        } finally {

            closeWebDriver();
        }
    }

    public void doLogout() {

        try {

            userNameField.click();
            new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(logOutButton));
            logOutButton.click();

        } catch (Exception ex) {

            throw ex;

        } finally {

            closeWebDriver();
        }
    }
}
