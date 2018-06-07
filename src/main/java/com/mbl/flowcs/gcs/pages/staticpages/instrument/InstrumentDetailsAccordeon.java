package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */

public class InstrumentDetailsAccordeon extends GcsGemsPage {

    @FindBy(xpath = "//input[@id = 'input-code']")
    private WebElement instrumentCodeInput;
    
    @FindBy(xpath = "//span[@id = 'view-code']")
    private WebElement instrumentCode;

    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement nameInput;
    
    @FindBy(xpath = "//span[@id = 'view-name']")
    private WebElement nameLabel;

    @FindBy(xpath = "//input[@id = 'input-nameContinued']")
    private WebElement nameContinuedInput;
    
    @FindBy(xpath = "//span[@id = 'view-nameContinued']")
    private WebElement nameContinuedLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-market']/div/label")
    private WebElement marketInput;
    
    @FindBy(xpath = "//span[@id = 'view-market']")
    private WebElement marketLabel;

    @FindBy(xpath = "//input[@id = 'input-lotSize']")
    private WebElement lotSizeInput;
    
    @FindBy(xpath = "//span[@id = 'view-lotSize']")
    private WebElement lotSizeLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-currency']/div/label")
    private WebElement settlementCurrencyInput;
    
    @FindBy(xpath = "//span[@id = 'view-currency']")
    private WebElement settlementCurrencyLabel;

    @FindBy(xpath = "//input[@id = 'input-unit']")
    private WebElement unitOfMeasureInput;
    
    @FindBy(xpath = "//span[@id = 'view-unit']")
    private WebElement unitOfMeasureInputLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-type']/div/label")
    private WebElement instrumentTypeInput;
    
    @FindBy(xpath = "//span[@id = 'view-type']")
    private WebElement instrumentTypeLabel;

    @FindBy(xpath = "//input[@id = 'auto-complete-futuresInstrumentForOptions']")
    private WebElement underlyingFuturesInstrumentForOptionsInput;
    
    @FindBy(xpath = "//span[@id = 'view-futuresInstrumentForOptions']")
    private WebElement underlyingFuturesInstrumentForOptionsLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-optionExerciseStyle']/div/label")
    private WebElement optionsExerciseStyleInput;
    
    @FindBy(xpath = "//span[@id = 'view-optionsExerciseStyle']")
    private WebElement optionsExerciseStyleLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-opremiumSettlementTiming']/div/label")
    private WebElement optionsPremiumSettlementTimeInput;
    
    @FindBy(xpath = "//span[@id = 'view-opremiumSettlementTiming']")
    private WebElement optionsPremiumSettlementTimeLabel;

    @FindBy(xpath = "//input[@id = 'input-daysToMandatorySettlement']")
    private WebElement daysToMandatorySettlementInput;
    
    @FindBy(xpath = "//span[@id = 'view-daysToMandatorySettlement']")
    private WebElement daysToMandatorySettlementLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-usDesignation']/div/label")
    private WebElement usDesignationInput;
    
    @FindBy(xpath = "//span[@id = 'view-usDesignation']")
    private WebElement usDesignationLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-chargeProductType']/div/label")
    private WebElement changeProductTypeInput;
    
    @FindBy(xpath = "//span[@id = 'view-chargeProductType']")
    private WebElement changeProductTypeLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-cdpUnderProduct']/div/label")
    private WebElement cdpUnderlyingProductCodeInput;
    
    @FindBy(xpath = "//span[@id = 'view-cdpUnderProduct']")
    private WebElement cdpUnderlyingProductCodeLabel;

    @FindBy(xpath = "//input[@id = 'input-aggregationCode']")
    private WebElement aggregationCodeInput;
    
    @FindBy(xpath = "//span[@id = 'view-aggregationCode']")
    private WebElement aggregationCodeLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-baselMRCProductGroup']/div/label")
    private WebElement baselMRCProductGroupInput;
    
    @FindBy(xpath = "//span[@id = 'view-baselMRCProductGroup']")
    private WebElement baselMRCProductGroupLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-tradingAllowed']/div/div[2]")
    private WebElement tradingAllowedInput;
    
    @FindBy(xpath = "//span[@id = 'view-tradingAllowed']")
    private WebElement tradingAllowedLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-overnightOptions']/div/div[2]")
    private WebElement overnightOptionsInput;
    
    @FindBy(xpath = "//span[@id = 'view-overnightOptions']")
    private WebElement overnightOptionsLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-deliveryMonth']/div/div[2]")
    private WebElement promptDateDeliveryMonthInput;
    
    @FindBy(xpath = "//span[@id = 'view-deliveryMonth']")
    private WebElement promptDateDeliveryMonthLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-deliverable']/div/div[2]")
    private WebElement deliverableInput;
    
    @FindBy(xpath = "//span[@id = 'view-deliverable']")
    private WebElement deliverableLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-optionsOnly']/div/div[2]")
    private WebElement optionsOnlyInput;
    
    @FindBy(xpath = "//span[@id = 'view-optionsOnly']")
    private WebElement optionsOnlyLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-cashSettledOption']/div/div[2]")
    private WebElement cashSettledOptionInput;
    
    @FindBy(xpath = "//span[@id = 'view-cashSettledOption']")
    private WebElement cashSettledOptionLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-monthRequired']/div/div[2]")
    private WebElement delExpMonthRequiredInput;
    
    @FindBy(xpath = "//span[@id = 'view-monthRequired']")
    private WebElement delExpMonthRequiredLabel;

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-weekendDates']/div/div[2]")
    private WebElement weekendPromptDatesInput;
    
    @FindBy(xpath = "//span[@id = 'view-weekendDates']")
    private WebElement weekendPromptDatesLabel;

    @FindBy(xpath = "//input[@id = 'input-combinedCmdCode']")
    private WebElement combinedInstrumentCodeInput;
    
    @FindBy(xpath = "//span[@id = 'view-combinedCmdCode']")
    private WebElement combinedInstrumentCodeLabel;
    

    public InstrumentDetailsAccordeon(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InstrumentDetailsAccordeon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getInstrumentCode() {

        return getLabelValue(instrumentCode);
    }

    public boolean setInstrumentCode(String code) {

        return setTextAreaValue(instrumentCodeInput, code);
    }
    
    public String getName() {

        return getLabelValue(nameLabel);
    }

    public boolean setName(String newName) {

        return setTextAreaValue(nameInput, newName);
    }

    public String getNameContinued() {

        return getLabelValue(nameContinuedLabel);
    }

    public boolean setNameContinued(String newNameContinued) {

        return setTextAreaValue(nameContinuedInput, newNameContinued);
    }

    public String getMarket() {

        return getDropDownValue(marketLabel);
    }

    public boolean setMarket(String newMarket) {

        return setDropDown(marketInput, newMarket);
    }

    public String getLotSize() {

        return getLabelValue(lotSizeLabel);
    }

    public boolean setLotSize(String newSize) {

        return setTextAreaValue(lotSizeInput, newSize);
    }

    public String getSettlementCurrency() {

        return getDropDownValue(settlementCurrencyLabel);
    }

    public boolean setSettlementCurrency(String newCurrency) {

        return setDropDownWithSearchDIV(settlementCurrencyInput, newCurrency);
    }

    public String getUnitOfMeasure() {

        return getLabelValue(unitOfMeasureInputLabel);
    }

    public boolean setUnitOfMeasure(String newUnit) {

        return setTextAreaValue(unitOfMeasureInput, newUnit);
    }

    public String getInstrumentType() {

        return getDropDownValue(instrumentTypeLabel);
    }

    public boolean setInstrumentType(String newInstrument) {

        return setDropDown(instrumentTypeInput, newInstrument);
    }

    public String getUnderlyingFuturesInstrumentForOptions() {

        return getLabelValue(underlyingFuturesInstrumentForOptionsLabel);
    }

    public boolean setUnderlyingFuturesInstrumentForOptions(String newInstrument) {

        return setTextAreaValue(underlyingFuturesInstrumentForOptionsInput, newInstrument);
    }

    public String getOptionExerciseStyle() {

        return getDropDownValue(optionsExerciseStyleLabel);
    }

    public boolean setOptionExerciseStyle(String newStyle) {

        return setDropDown(optionsExerciseStyleInput, newStyle);
    }

    public String getOptionsPremiumSettTiming() {

        return getLabelValue(optionsPremiumSettlementTimeLabel);
    }

    public boolean setOptionsPremiumSettTiming(String newTiming) {

        return setDropDown(optionsPremiumSettlementTimeInput, newTiming);
    }

    public String getDaysToMandatorySettlement() {

        return getLabelValue(daysToMandatorySettlementLabel);
    }

    public boolean setDaysToMandatorySettlement(String newDays) {

        return setTextAreaValue(daysToMandatorySettlementInput, newDays);
    }

    public String getUsDesignation() {

        return getDropDownValue(usDesignationLabel);
    }

    public boolean setUsDesignation(String newDesignation) {

        return setDropDown(usDesignationInput, newDesignation);
    }

    public String getChargeProductType() {

        return getDropDownValue(changeProductTypeLabel);
    }

    public boolean setChargeProductType(String newCharge) {

        return setDropDown(changeProductTypeInput, newCharge);
    }

    public String getCdpUnderlyingProductCode() {

        return getDropDownValue(cdpUnderlyingProductCodeLabel);
    }

    public boolean setCdpUnderlyingProductCode(String newCode) {

        return setDropDown(cdpUnderlyingProductCodeInput, newCode);
    }

    public String getAggregationCode() {

        return getLabelValue(aggregationCodeLabel);
    }

    public boolean setAggregationCode(String newCode) {

        return setTextAreaValue(aggregationCodeInput, newCode);
    }

    public String getBaselMrcProductGroup() {

        return getDropDownValue(baselMRCProductGroupLabel);
    }

    public boolean setBaselMrcProductGroup(String newGroup) {

        return setDropDown(baselMRCProductGroupInput, newGroup);
    }

    public boolean getTradingAllowed() {

        return getCheckBoxLabelValue(tradingAllowedLabel);
    }

    public boolean setTradingAllowed() {

        return clickOnElement(tradingAllowedInput);
    }

    public boolean getOvernightOptions() {

        return getCheckBoxLabelValue(overnightOptionsLabel);
    }

    public boolean setOvernightOptions() {

        return clickOnElement(overnightOptionsInput);
    }

    public boolean getPromptDateDeliveryMonth() {

        return getCheckBoxLabelValue(promptDateDeliveryMonthLabel);
    }

    public boolean setPromptDateDeliveryMonth() {

        return clickOnElement(promptDateDeliveryMonthInput);
    }

    public boolean getDeliverable() {

        return getCheckBoxLabelValue(deliverableLabel);
    }

    public boolean setDeliverable() {

        return clickOnElement(deliverableInput);
    }

    public boolean getOptionsOnly() {

        return getCheckBoxLabelValue(optionsOnlyLabel);
    }

    public boolean setOptionsOnly() {

        return clickOnElement(optionsOnlyInput);
    }

    public boolean getCashSettledOption() {

        return getCheckBoxLabelValue(cashSettledOptionLabel);
    }

    public boolean setCashSettledOption() {

        return clickOnElement(cashSettledOptionInput);
    }

    public boolean getDelExpMonthRequired() {

        return getCheckBoxLabelValue(delExpMonthRequiredLabel);
    }

    public boolean setDelExpMonthRequired() {

        return clickOnElement(delExpMonthRequiredInput);
    }

    public boolean getWeekendPromptDates() {

        return getCheckBoxLabelValue(weekendPromptDatesLabel);
    }

    public boolean setWeekendPromptDates() {

        return clickOnElement(weekendPromptDatesInput);
    }

    public String getCombinedInstrumentCode() {

        return getLabelValue(combinedInstrumentCodeLabel);
    }

    public boolean setCombinedInstrumentCode(String newCode) {

        return setTextAreaValue(combinedInstrumentCodeInput, newCode);
    }
}
