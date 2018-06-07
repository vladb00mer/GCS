package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author vmurashov
 */

public class DecimalsAccordeon extends GcsGemsPage {
    
    @FindBy(xpath = "//input[@id = 'input-decimalInPrice']")
    private WebElement noDecimalsInPrice;
    
    @FindBy(xpath = "//span[@id = 'view-decimalInPrice']")
    private WebElement noDecimalsInPriceLabel;
    
    @FindBy(xpath = "//input[@id = 'input-averagePricingDecimals']")
    private WebElement noDecimalsForAveragePricing;
    
    @FindBy(xpath = "//span[@id = 'view-averagePricingDecimals']")
    private WebElement noDecimalsForAveragePricingLabel;
    
    @FindBy(xpath = "//input[@id = 'input-decimalsInLotSize']")
    private WebElement noDecimalsInLotSize;
    
    @FindBy(xpath = "//span[@id = 'view-decimalsInLotSize']")
    private WebElement noDecimalsInLotSizeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-tradeQtyDecimals']")
    private WebElement tradeQuantityDecimals;
    
    @FindBy(xpath = "//span[@id = 'view-tradeQtyDecimals']")
    private WebElement tradeQuantityDecimalsLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-decimalsForExchangeFeeFlag']/div/div[2]")
    private WebElement extendedDecimalsForExchangeFeeRates;
    
    @FindBy(xpath = "//input[@id = 'input-decimalsForExchangeFee']")
    private WebElement extendedDecimalsForExchangeFeeRatesInput;
    
    @FindBy(xpath = "//span[@id = 'view-decimalsForExchangeFee']")
    private WebElement extendedDecimalsForExchangeFeeRatesLabel;
    
    
    public DecimalsAccordeon(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(DecimalsAccordeon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean setNoDecimalsInPrice(String price) {
        
        return setTextAreaValue(noDecimalsInPrice, price);
    }
    
    public String getNoDecimalsInPrice() {
        
        return getLabelValue(noDecimalsInPriceLabel);
    }
    
    public boolean setNoDecimalsForAveragePricing(String pricing) {
        
        return setTextAreaValue(noDecimalsForAveragePricing, pricing);
    }
    
    public String getNoDecimalsForAveragePricing() {
        
        return getLabelValue(noDecimalsForAveragePricingLabel);
    }
    
    public boolean setNoDecimalsInLotSize(String size) {
        
        return setTextAreaValue(noDecimalsInLotSize, size);
    }
    
    public String getNoDecimalsInLotSize() {
        
        return getLabelValue(noDecimalsInLotSizeLabel);
    }
    
    public boolean setTradeQuantityDecimals(String decimals) {
        
        return setTextAreaValue(tradeQuantityDecimals, decimals);
    }
    
    public String getTradeQuantityDecimals() {
        
        return getLabelValue(tradeQuantityDecimalsLabel);
    }
    
    public boolean setExtendedDecimalsForExchangeFeeRates(String exchange) {
        
        clickOnElement(extendedDecimalsForExchangeFeeRates);
        setTextAreaValue(extendedDecimalsForExchangeFeeRatesInput, exchange);
        return clickConfirmYes();
    }
    
    public String getExtendedDecimalsForExchangeFeeRates() {
        
        return getLabelValue(extendedDecimalsForExchangeFeeRatesLabel);
    }
}
