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
public class AuthorisationPage extends GcsGemsPage {

    @FindBy(xpath = "")
    private WebElement loginField;

    @FindBy(xpath = "")
    private WebElement passwordField;

    @FindBy(xpath = "")
    private WebElement confirmButton;

    public AuthorisationPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(loginField));
    }

    public MainPage doAuthorise(String login, String password) {

        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        confirmButton.click();

        return new MainPage();
    }
}
