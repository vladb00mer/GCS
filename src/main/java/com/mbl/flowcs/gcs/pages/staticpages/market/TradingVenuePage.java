package com.mbl.flowcs.gcs.pages.staticpages.market;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TradingVenuePage extends GcsGemsPage {

    // Main selector
    @FindBy(id = "dropdown-categories-selector")
    private WebElement tradingVenueSelector;


    // Toolbar buttons
    @FindBy(id = "icon-add")
    private WebElement newTradingVenueButton;

    @FindBy(id = "icon-close")
    private WebElement tradingVenueCloseButton;

    @FindBy(id = "icon-open-account")
    private WebElement tradingVenueOpenButton;

    @FindBy(id = "icon-status")
    private WebElement tradingVenueStatusIcon;

    @FindBy(id = "button-revert-Save")
    private WebElement tradingVenueSaveButton;

    @FindBy(id = "button-revert-Reject")
    private WebElement tradingVenueRejectButton;

    @FindBy(id = "button-revert-Authorise")
    private WebElement tradingVenueAuthoriseButton;

    @FindBy(id = "button-revert-Revert")
    private WebElement tradingVenueRevertButton;


    // Input fields
    @FindBy(id = "input-tradingVenue")
    private WebElement tradingVenueCode;

    @FindBy(id = "input-name")
    private WebElement tradingVenueName;

    @FindBy(id = "dropdown-localOsFlag")
    private WebElement tradingVenueLocalOverseas;

    @FindBy(id = "checkbox-averagePrice")
    private WebElement tradingVenuAveragePrice;

    @FindBy(id = "checkbox-tassFlag")
    private WebElement tradingVenueTassFlag;

    @FindBy(id = "checkbox-onlineInputFlag")
    private WebElement tradingVenueOnlineInputFlag;

    @FindBy(id = "dropdown-feeCalcFlag")
    private WebElement tradingVenueFeeCalcFlag;

    @FindBy(id = "checkbox-stacsIncludesGst")
    private WebElement tradingVenueStacsIncludesGst;


    public TradingVenuePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(tradingVenueSelector));
    }



    public boolean setTradingVenue(String tradingVenue) {
        return setDropDownWithSearch(tradingVenueSelector, tradingVenue);
    }

}
