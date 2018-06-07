package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */

public class ReportableLevelsAccordeon extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'view-repLevelsFuturesBought']")
    private WebElement futuresBoughtLabel;
    
    @FindBy(xpath = "//input[@id = 'input-repLevelsFuturesBought']")
    private WebElement futuresBoughtInput;
        
    @FindBy(xpath = "//span[@id = 'view-repLevelsFuturesSold']")
    private WebElement futuresSoldLabel;
    
    @FindBy(xpath = "//input[@id = 'input-repLevelsFuturesSold']")
    private WebElement futuresSoldInput;
    
    @FindBy(xpath = "//span[@id = 'view-repLevelsFuturesUncovered']")
    private WebElement futuresUncoveredLabel;
    
    @FindBy(xpath = "//input[@id = 'input-repLevelsFuturesUncovered']")
    private WebElement futuresUncoveredInput;
    
    @FindBy(xpath = "//span[@id = 'view-repLevelsOptionsBought']")
    private WebElement optionsBoughtLabel;
    
    @FindBy(xpath = "//input[@id = 'input-repLevelsOptionsBought']")
    private WebElement optionsBoughtInput;
    
    @FindBy(xpath = "//span[@id = 'view-repLevelsOptionsSold']")
    private WebElement optionsSoldLabel;
    
    @FindBy(xpath = "//input[@id = 'input-repLevelsOptionsSold']")
    private WebElement optionsSoldInput;
    
    @FindBy(xpath = "//span[@id = 'view-repLevelsOptionsUncovered']")
    private WebElement optionsUncoveredLabel;
    
    @FindBy(xpath = "//input[@id = 'input-repLevelsOptionsUncovered']")
    private WebElement optionsUncoveredInput;
    
    
    public ReportableLevelsAccordeon (WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean setFuturesBought(String futuresBought) {
        
        return setTextAreaValue(futuresBoughtInput, futuresBought);
    }
    
    public String getFuturesBought() {
        
        return getLabelValue(futuresBoughtLabel);
    }
    
    public boolean setFuturesSold(String futuresSold) {
        
        return setTextAreaValue(futuresSoldInput, futuresSold);
    }
    
    public String getFuturesSold() {
        
        return getLabelValue(futuresSoldLabel);
    }
    
    public boolean setFuturesUncovered(String futuresUncovered) {
        
        return setTextAreaValue(futuresUncoveredInput, futuresUncovered);
    }
    
    public String getFuturesUncovered() {
        
        return getLabelValue(futuresUncoveredLabel);
    }
    
    public boolean setOptionsBought(String optionsBought) {
        
        return setTextAreaValue(optionsBoughtInput, optionsBought);
    }
    
    public String getOptionsBought() {
        
        return getLabelValue(optionsBoughtLabel);
    }
    
    public boolean setOptionsSold(String optionsSold) {
        
        return setTextAreaValue(optionsSoldInput, optionsSold);
    }
    
    public String getOptionsSold() {
        
        return getLabelValue(optionsSoldLabel);
    }
    
    public boolean setOptionsUncovered(String optionsUncovered) {
        
        return setTextAreaValue(optionsUncoveredInput, optionsUncovered);
    }
    
    public String getOptionsUncovered() {
        
        return getLabelValue(optionsUncoveredLabel);
    }
}
