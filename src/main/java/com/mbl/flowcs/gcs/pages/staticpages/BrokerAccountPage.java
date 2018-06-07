package com.mbl.flowcs.gcs.pages.staticpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;

/**
 *
 * @author VMurashov
 */
public class BrokerAccountPage extends GcsGemsPage {

    @FindBy(xpath = "")
    private WebElement brokerNameField;

    public BrokerAccountPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(brokerNameField));
    }

    public String getAccountName() {

        return getLabelValue(brokerNameField);
    }
}
