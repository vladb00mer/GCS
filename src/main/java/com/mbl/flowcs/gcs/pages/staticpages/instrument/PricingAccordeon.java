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

public class PricingAccordeon extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'view-futuresMinPriceFluctuation']")
    private WebElement futuresMinPriceFluctuationLabel;
    
    @FindBy(xpath = "//input[@id = 'input-futuresMinPriceFluctuation']")
    private WebElement futuresMinPriceFluctuationInput;
    
    @FindBy(xpath = "//span[@id = 'view-futuresTickBase']")
    private WebElement futuresTickBaseLabel;
    
    @FindBy(xpath = "//input[@id = 'input-futuresTickBase']")
    private WebElement futuresTickBaseInput;
    
    @FindBy(xpath = "//span[@id = 'view-futuresTickValue']")
    private WebElement futuresTickValueLabel;
    
    @FindBy(xpath = "//input[@id = 'input-futuresTickValue']")
    private WebElement futuresTickValueInput;
    
    @FindBy(xpath = "//span[@id = 'view-futuresPriceVarAllowed']")
    private WebElement futuresPriceVarianceAllowedLabel;
    
    @FindBy(xpath = "//input[@id = 'input-futuresPriceVarAllowed']")
    private WebElement futuresPriceVarianceAllowedInput;
    
    @FindBy(xpath = "//span[@id = 'view-priceInversion']")
    private WebElement priceInversionLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-priceInversion']/div/div[2]")
    private WebElement priceInversionCheckBox;
    
    @FindBy(xpath = "//span[@id = 'view-couponRate']")
    private WebElement couponRateLabel;
    
    @FindBy(xpath = "//input[@id = 'input-couponRate']")
    private WebElement couponRateInput;
    
    @FindBy(xpath = "//span[@id = 'view-daysInYear']")
    private WebElement daysInYearLabel;
    
    @FindBy(xpath = "//input[@id = 'input-daysInYear']")
    private WebElement daysInYearInput;
    
    @FindBy(xpath = "//span[@id = 'view-daysInTerm']")
    private WebElement daysInTermLabel;
    
    @FindBy(xpath = "//input[@id = 'input-daysInTerm']")
    private WebElement daysInTermInput;
    
    @FindBy(xpath = "//span[@id = 'view-optionsMinPriceFluctuation']")
    private WebElement optionsMinPriceFluctuationLabel;
    
    @FindBy(xpath = "//input[@id = 'input-optionsMinPriceFluctuation']")
    private WebElement optionsMinPriceFluctuationInput;
    
    @FindBy(xpath = "//span[@id = 'view-optionsTickBase']")
    private WebElement optionsTickBaseLabel;
    
    @FindBy(xpath = "//input[@id = 'input-optionsTickBase']")
    private WebElement optionsTickBaseInput;
    
    @FindBy(xpath = "//span[@id = 'view-optionsTickValue']")
    private WebElement optionsTickValueLabel;
    
    @FindBy(xpath = "//input[@id = 'input-optionsTickValue']")
    private WebElement optionsTickValueInput;
    
    @FindBy(xpath = "//span[@id = 'view-optionsPriceVarAllowed']")
    private WebElement optionsPriceVarianceAllowedLabel;
    
    @FindBy(xpath = "//input[@id = 'input-optionsPriceVarAllowed']")
    private WebElement optionsPriceVarianceAllowedInput;
    
    @FindBy(xpath = "//span[@id = 'view-contractCalcMethod']")
    private WebElement contractValCalcMethodLabel;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-contractCalcMethod']")
    private WebElement contractValCalcMethodInput;
    
    @FindBy(xpath = "//span[@id = 'view-yearsNumber']")
    private WebElement noOfYearsLabel;
    
    @FindBy(xpath = "//input[@id = 'input-yearsNumber']")
    private WebElement noOfYearsInput;
    
    @FindBy(xpath = "//span[@id = 'view-termsPerYear']")
    private WebElement termsPerYearLabel;
    
    @FindBy(xpath = "//input[@id = 'input-termsPerYear']")
    private WebElement termsPerYearInput;
    
    
    public PricingAccordeon(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PricingAccordeon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean setFuturesMinPriceFluctuation(String futuresMinPriceFluctuation) {
        
        return setTextAreaValue(futuresMinPriceFluctuationInput, futuresMinPriceFluctuation);
    }
    
    public String getFuturesMinPriceFluctuation() {
        
        return getLabelValue(futuresMinPriceFluctuationLabel);
    }
    
    public boolean setFuturesTickBase(String futuresTickBase) {
        
        return setTextAreaValue(futuresTickBaseInput, futuresTickBase);
    }
    
    public String getFuturesTickBase() {
        
        return getLabelValue(futuresTickBaseLabel);
    }
    
    public boolean setFuturesTickValue(String futuresTickValue) {
        
        return setTextAreaValue(futuresTickValueInput, futuresTickValue);
    }
    
    public String getFuturesTickValue() {
        
        return getLabelValue(futuresTickValueLabel);
    }
    
    public boolean setFuturesPriceVarianceAllowed(String futuresPriceVarianceAllowed) {
        
        return setTextAreaValue(futuresPriceVarianceAllowedInput, futuresPriceVarianceAllowed);
    }
    
    public String getFuturesPriceVarianceAllowed() {
        
        return getLabelValue(futuresPriceVarianceAllowedLabel);
    }
    
    public boolean setPriceInversion() {
        
        return clickOnElement(priceInversionCheckBox);
    }
    
    public boolean getPriceInversion() {
        
        return getCheckBoxLabelValue(priceInversionLabel);
    }
    
    public boolean setCouponRate(String couponRate) {
        
        return setTextAreaValue(couponRateInput, couponRate);
    }
    
    public String getCouponRate() {
        
        return getLabelValue(couponRateLabel);
    }
    
    public boolean setDaysInYear(String daysInYear) {
        
        return setTextAreaValue(daysInYearInput, daysInYear);
    }
    
    public String getDaysInYear() {
        
        return getLabelValue(daysInYearLabel);
    }
    
    public boolean setDaysInTerm(String daysInTerm) {
        
        return setTextAreaValue(daysInTermInput, daysInTerm);
    }
    
    public String getDaysInTerm() {
        
        return getLabelValue(daysInTermLabel);
    }
    
    public boolean setOptionsMinPriceFluctuation(String optionsMinPriceFluctuation) {
        
        return setTextAreaValue(optionsMinPriceFluctuationInput, optionsMinPriceFluctuation);
    }
    
    public String getOptionsMinPriceFluctuation() {
        
        return getLabelValue(optionsMinPriceFluctuationLabel);
    }
    
    public boolean setOptionsTickBase(String optionsTickBase) {
        
        return setTextAreaValue(optionsTickBaseInput, optionsTickBase);
    }
    
    public String getOptionsTickBase() {
        
        return getLabelValue(optionsTickBaseLabel);
    }
    
    public boolean setOptionsTickValue(String optionsTickValue) {
        
        return setTextAreaValue(optionsTickValueInput, optionsTickValue);
    }
    
    public String getOptionsTickValue() {
        
        return getLabelValue(optionsTickValueLabel);
    }
    
    public boolean setOptionsPriceVarianceAllowed(String optionsPriceVarianceAllowed) {
        
        return setTextAreaValue(optionsPriceVarianceAllowedInput, optionsPriceVarianceAllowed);
    }
    
    public String getOptionsPriceVarianceAllowed() {
        
        return getLabelValue(optionsPriceVarianceAllowedLabel);
    }
    
    public boolean setContractValCalcMethod(String contractValCalcMethod) {
        
        return setDropDownWithSearchDIV(contractValCalcMethodInput, contractValCalcMethod);
    }
    
    public String getContractValCalcMethod() {
        
        return getLabelValue(contractValCalcMethodLabel);
    }
    
    public boolean setNoOfYears(String noOfYears) {
        
        return setTextAreaValue(noOfYearsInput, noOfYears);
    }
    
    public String getNoOfYears() {
        
        return getLabelValue(noOfYearsLabel);
    }
    
    public boolean setTermsPerYear(String termsPerYear) {
        
        return setTextAreaValue(termsPerYearInput, termsPerYear);
    }
    
    public String getTermsPerYear() {
        
        return getLabelValue(termsPerYearLabel);
    }
}
