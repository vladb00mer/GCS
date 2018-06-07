package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
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

public class NonSpanRatesAccordeon extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'view-speculatorFullRate']")
    private WebElement speculatorFullLabel;
    
    @FindBy(xpath = "//input[@id = 'input-speculatorFullRate']")
    private WebElement speculatorFullInput;
    
    @FindBy(xpath = "//span[@id = 'view-speculatorInterMonthSpreadRate']")
    private WebElement speculatorInterMonthLabel;
    
    @FindBy(xpath = "//input[@id = 'input-speculatorInterMonthSpreadRate']")
    private WebElement speculatorInterMonthInput;
    
    @FindBy(xpath = "//span[@id = 'view-speculatorIntraMonthSpreadRate']")
    private WebElement speculatorIntraMonthLabel;
    
    @FindBy(xpath = "//input[@id = 'input-speculatorIntraMonthSpreadRate']")
    private WebElement speculatorIntraMonthInput;
    
    @FindBy(xpath = "//span[@id = 'view-speculatorSpotRate']")
    private WebElement speculatorSpotRateLabel;
    
    @FindBy(xpath = "//input[@id = 'input-speculatorSpotRate']")
    private WebElement speculatorSpotRateInput;
    
    @FindBy(xpath = "//span[@id = 'view-hedgerFullRate']")
    private WebElement hedgerFullRateLabel;
    
    @FindBy(xpath = "//input[@id = 'input-hedgerFullRate']")
    private WebElement hedgerFullRateInput;
    
    @FindBy(xpath = "//span[@id = 'view-hedgerInterMonthSpreadRate']")
    private WebElement hedgerInterMonthSpreadRateLabel;
    
    @FindBy(xpath = "//input[@id = 'input-hedgerInterMonthSpreadRate']")
    private WebElement hedgerInterMonthSpreadRateInput;
    
    @FindBy(xpath = "//span[@id = 'view-hedgerIntraMonthSpreadRate']")
    private WebElement hedgerIntraMonthSpreadRateLabel;
    
    @FindBy(xpath = "//input[@id = 'input-hedgerIntraMonthSpreadRate']")
    private WebElement hedgerIntraMonthSpreadRateInput;
    
    @FindBy(xpath = "//span[@id = 'view-hedgerSpotRate']")
    private WebElement hedgerSpotLabel;
    
    @FindBy(xpath = "//input[@id = 'input-hedgerSpotRate']")
    private WebElement hedgerSpotInput;
    
    
    public NonSpanRatesAccordeon (WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[contains(text(), 'Hedger spot')]"))));
    }
    
    public boolean setSpeculatorFull(String speculatorFull) {
        
        return setTextAreaValue(speculatorFullInput, speculatorFull);
    }
    
    public String getSpeculatorFull() {
        
        return getLabelValue(speculatorFullLabel);
    }
    
    public boolean setSpeculatorInterMonth(String speculatorInterMonth) {
        
        return setTextAreaValue(speculatorInterMonthInput, speculatorInterMonth);
    }
    
    public String getSpeculatorInterMonth() {
        
        return getLabelValue(speculatorInterMonthLabel);
    }
    
    public boolean setSpeculatorIntraMonth(String speculatorIntraMonth) {
        
        return setTextAreaValue(speculatorIntraMonthInput, speculatorIntraMonth);
    }
    
    public String getSpeculatorIntraMonth() {
        
        return getLabelValue(speculatorIntraMonthLabel);
    }
    
    public boolean setSpeculatorSpotRate(String speculatorSpotRate) {
        
        return setTextAreaValue(speculatorSpotRateInput, speculatorSpotRate);
    }
    
    public String getSpeculatorSpotRate() {
        
        return getLabelValue(speculatorSpotRateLabel);
    }
    
    public boolean setHedgerFull(String hedgerFull) {
        
        return setTextAreaValue(hedgerFullRateInput, hedgerFull);
    }
    
    public String getHedgerFull() {
        
        return getLabelValue(hedgerFullRateLabel);
    }
    
    public boolean setHedgerInterMonth(String hedgerInterMonth) {
        
        return setTextAreaValue(hedgerInterMonthSpreadRateInput, hedgerInterMonth);
    }
    
    public String getHedgerInterMonth() {
        
        return getLabelValue(hedgerInterMonthSpreadRateLabel);
    }
    
    public boolean setHedgerIntraMonth(String hedgerIntraMonth) {
        
        return setTextAreaValue(hedgerIntraMonthSpreadRateInput, hedgerIntraMonth);
    }
    
    public String getHedgerIntraMonth() {
        
        return getLabelValue(hedgerIntraMonthSpreadRateLabel);
    }
    
    public boolean setHedgerSpot(String hedgerSpot) {
        
        return setTextAreaValue(hedgerSpotInput, hedgerSpot);
    }
    
    public String getHedgerSpot() {
        
        return getLabelValue(hedgerSpotLabel);
    }
}
