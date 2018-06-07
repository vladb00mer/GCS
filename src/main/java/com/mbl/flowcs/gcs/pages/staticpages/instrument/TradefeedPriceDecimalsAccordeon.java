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

public class TradefeedPriceDecimalsAccordeon extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'view-tradefeedPriceDecimalStrike']")
    private WebElement strikeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-tradefeedPriceDecimalStrike']")
    private WebElement strikeInput;
    
    @FindBy(xpath = "//span[@id = 'view-tradefeedPriceDecimalFutureTradePrice']")
    private WebElement futureTradePriceLabel;
    
    @FindBy(xpath = "//input[@id = 'input-tradefeedPriceDecimalFutureTradePrice']")
    private WebElement futureTradePriceInput;
    
    @FindBy(xpath = "//span[@id = 'view-tradefeedPriceDecimalOptionPremium']")
    private WebElement decimalOptionPremiumLabel;
    
    @FindBy(xpath = "//input[@id = 'input-tradefeedPriceDecimalOptionPremium']")
    private WebElement decimalOptionPremiumInput;
    
    
    public TradefeedPriceDecimalsAccordeon(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean setStrike(String strike) {
        
        return setTextAreaValue(strikeInput, strike);
    }
    
    public String getStrike() {
        
        return getLabelValue(strikeLabel);
    }
    
    public boolean setFutureTradePrice(String futureTradePrice) {
        
        return setTextAreaValue(futureTradePriceInput, futureTradePrice);
    }
    
    public String getFutureTradePrice() {
        
        return getLabelValue(futureTradePriceLabel);
    }
    
    public boolean setOptionPremium(String optionPremium) {
        
        return setTextAreaValue(decimalOptionPremiumInput, optionPremium);
    }
    
    public String getOptionPremium() {
        
        return getLabelValue(decimalOptionPremiumLabel);
    }    
}
