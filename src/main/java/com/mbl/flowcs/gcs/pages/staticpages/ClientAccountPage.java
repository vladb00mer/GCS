package com.mbl.flowcs.gcs.pages.staticpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;

/**
 *
 * @author VMurashov
 *
 */
public class ClientAccountPage extends GcsGemsPage {

    /*--------HEADER ELEMENTS--------*/
    @FindBy(xpath = "//span[@id='view-code']")
    private WebElement clientAccountField;

    @FindBy(xpath = "//span[@id='view-groupCode']")
    private WebElement groupField;

    @FindBy(xpath = "//span[@id='view-clientType']")
    private WebElement clientTypeField;

    /*---------------MASTER TAB ELEMENTS-------------------------*/
    @FindBy(xpath = "//p-tabview/div/ul/li/a/span[contains(text(),'Master')]")
    private WebElement masterTab;

    /*-----contact sub item elements-----*/
    @FindBy(xpath = "//span[@id='header-contact']")
    private WebElement contactSubItem;

    @FindBy(xpath = "//textarea[@id='textarea-address']")
    private WebElement addressMaster;

    @FindBy(xpath = "//input[@id='input-contact']")
    private WebElement contactField;

    @FindBy(xpath = "//input[@id='input-phoneNo']")
    private WebElement phoneNoField;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-advisorCode']")
    private WebElement advisorCodeField;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-clearingManager']")
    private WebElement clearingManagerField;

    /*-----client details sub item elements-----*/
    @FindBy(xpath = "//span[@id='header-client-details']")
    private WebElement clientDetailsSubItem;

    @FindBy(xpath = "//input[@id='input-groupCode']")
    private WebElement groupCodeField;

    @FindBy(xpath = "//input[@id='input-centralCustomerNumber']")
    private WebElement centralCustomerNumberField;

    @FindBy(xpath = "//span[@id='view-centralCustomerDescription']")
    private WebElement centralCustomerDescriptionField;

    /*-----account type sub item elements-----*/
    @FindBy(xpath = "//span[@id='header-account-type']")
    private WebElement accountTypeSubItem;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-clientType']/div/label")
    private WebElement clientTypeDropDown;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-segregated']/div/div[2]")
    private WebElement segregatedCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-holdingAccount']/div/div[2]")
    private WebElement holdingAccountCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-errorAccount']/div/div[2]")
    private WebElement errorAccountCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-omnibusAccount']/div/div[2]")
    private WebElement omnibusAccountCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-tradingAccount']/div/div[2]")
    private WebElement tradingAccountCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-averageAccount']/div/div[2]")
    private WebElement averageAccountCheckBox;

    @FindBy(xpath = "//div[@id='radio-speculatorHedger']/div/p-radiobutton")
    private WebElement speculatorHedgerRadioButton;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-manualEntryAllowed']/div/div[2]")
    private WebElement manualEntryAllowedCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-contraAccount']/div/div[2]")
    private WebElement contraAccountCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-marketMaker']/div/div[2]")
    private WebElement marketMakerCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-realClearAccount']/div/div[2]")
    private WebElement realClearAccountCheckBox;

    /*-----tax sub item elements-----*/
    @FindBy(xpath = "//span[@id='header-tax']")
    private WebElement taxSubItem;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-auResident']/div/div[2]")
    private WebElement auResidentCheckBox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-gstExempt']/div/div[2]")
    private WebElement gstExemptCheckBox;

    @FindBy(xpath = "//span[@id='view-tfnProvided']")
    private WebElement tfnProvidedLabel;

    /*-----closeouts sub item elements-----*/
    @FindBy(xpath = "//span[@id='header-closeouts']")
    private WebElement closeoutsSubItem;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-defaultCloseoutMethod']/div/label")
    private WebElement defaultCloseoutMethodDropDown;

    @FindBy(xpath = "//div[@id='radio-closingDispositionFutures']/div/p-radiobutton")
    private WebElement closingDispositionFuturesRadioButton;

    @FindBy(xpath = "//div[@id='radio-closingDispositionOptions']/div/p-radiobutton")
    private WebElement closingDispositionOptionsRadioButton;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-closeOutDayTrades']/div/div[2]")
    private WebElement closeOutDayTradesCheckbox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-openPostExpiry']/div/div[2]")
    private WebElement openPostExpiryCheckbox;

    /*-----balances sub item elements-----*/
    @FindBy(xpath = "//p-header/span[@id='header-balances']")
    private WebElement balancesSubItem;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-collateralOffsetsTotEq']/div/div[2]")
    private WebElement collateralOffsetsTotEqCheckbox;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-marginFreeClient']/div/div[2]")
    private WebElement marginFreeClientCheckbox;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-balanceMonth']")
    private WebElement balanceMonthDropDown;

    @FindBy(xpath = "//span[@id='view-applyInitialMarginMultiplier']")
    private WebElement applyInitialMarginMultiplierTextArea;

    @FindBy(xpath = "//span[@id='view-initialMarginMultiplier']")
    private WebElement initialMarginMultiplierTextArea;

    /*-----reporting sub item elements-----*/
    @FindBy(xpath = "//p-header/span[@id='header-reporting']")
    private WebElement reportingSubItem;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-headerType']/div/label")
    private WebElement headerTypeDropDown;

    @FindBy(xpath = "//p-checkbox[@id='checkbox-suppressLmeDprsReporting']/div/div[2]")
    private WebElement suppressLmeDprsReportingClientCheckbox;

    /*-----------TAX FILE NUMBER TAB ELEMENTS------------*/
    @FindBy(xpath = "//p-tabview/div/ul/li[2]/a")
    private WebElement taxFileNumberTab;

    @FindBy(xpath = "//input[@id='input-taxFileNumber']")
    private WebElement taxFileNumberTextArea;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-exemptionCode']")
    private WebElement exemptionCodeDropDown;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-type']")
    private WebElement typeDropDown;

    @FindBy(xpath = "//input[@id='input-companyName']")
    private WebElement companyNameTextArea;

    @FindBy(xpath = "//input[@id='input-surname']")
    private WebElement surnameTextArea;

    @FindBy(xpath = "//input[@id='input-givenNames']")
    private WebElement givenNamesTextArea;

    @FindBy(xpath = "//input[@id='input-initials']")
    private WebElement initialsTextArea;

    @FindBy(xpath = "//textarea[@id='textarea-tfnAddress']")
    private WebElement addressTFN;

    @FindBy(xpath = "//input[@id='input-suburb']")
    private WebElement suburbTextArea;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-state']")
    private WebElement stateDropDown;

    @FindBy(xpath = "//input[@id='input-postcode']")
    private WebElement postcodeTextArea;

    @FindBy(xpath = "//p-dropdown[@id='dropdown-residencyCode']")
    private WebElement residencyCodeDropDown;

    public ClientAccountPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(clientAccountField));
    }

    public String getClientAccountLabelValue() {

        return getLabelValue(clientAccountField);
    }

    public String getGroupLabelValue() {

        return getLabelValue(groupField);
    }

    public String getClientTypeLabelValue() {

        return getLabelValue(clientTypeField);
    }

    public void getMasterTab() {

        clickOnElement(masterTab);
    }

    /*-----------------Contact---------------------*/
    public void getContactSubItem() {

        clickOnElement(contactSubItem);
    }

    public String getAddressMaster() {

        return getTextAreaValue(addressMaster);
    }

    public boolean setAddressField(String address) {

        return setTextAreaValue(addressMaster, address);
    }

    public String getContact() {

        return getTextAreaValue(contactField);
    }

    public boolean setContactField(String contact) {

        return setTextAreaValue(contactField, contact);
    }

    public String getPhone() {

        return getTextAreaValue(phoneNoField);
    }

    public boolean setPhoneNoField(String phoneNo) {

        return setTextAreaValue(phoneNoField, phoneNo);
    }

    public String getAdvisorCode() {

        return getDropDownValue(advisorCodeField);
    }

    public boolean setAdvisorCode(String advisorCode) {

        return setDropDown(advisorCodeField, advisorCode);
    }

    public String getClearingManager() {

        return getDropDownValue(clearingManagerField);
    }

    public boolean setClearingManagerField(String clearingManager) {

        return setDropDown(clearingManagerField, clearingManager);
    }

    /*------------------- Client details -----------------------*/
    public void clickClientDetailsSubItem() {

        clickOnElement(clientDetailsSubItem);
    }

    public String getGroupCodeField() {

        clickClientDetailsSubItem();

        return getTextAreaValue(groupCodeField);
    }

    public boolean setGroupCodeField(String groupCode) {

        clickClientDetailsSubItem();

        return setTextAreaValue(groupCodeField, groupCode);
    }

    public String getCentralCustomerNumberField() {

        return getTextAreaValue(centralCustomerNumberField);
    }

    public void setCentralCustomerNumberField(String centralCustomerNumber) {

        setTextAreaValue(centralCustomerNumberField, centralCustomerNumber);
    }

    public String getCentralCustomerDescriptionLabel() {

        return getLabelValue(centralCustomerDescriptionField);
    }

    // account type
    public void getAccountTypeSubItem() {

        clickOnElement(accountTypeSubItem);
    }

    public String getClientTypeDropDown() {

        getAccountTypeSubItem();

        return getDropDownValue(clientTypeDropDown);
    }

    public boolean setClientTypeDropDown(String clientType) {

        getAccountTypeSubItem();

        return setDropDown(clientTypeDropDown, clientType);
    }

    public boolean getSegregatedCheckBoxState() {

        return getCheckBoxValue(segregatedCheckBox);
    }

    public boolean setSegregatedCheckBox() {

        return clickOnElement(segregatedCheckBox);
    }

    public boolean getHoldingAccountCheckBoxState() {

        return getCheckBoxValue(holdingAccountCheckBox);
    }

    public void setHoldingAccountCheckBox() {

        clickOnElement(holdingAccountCheckBox);
    }

    public boolean getErrorAccountCheckBox() {

        return getCheckBoxValue(errorAccountCheckBox);
    }

    public void setErrorAccountCheckBox() {

        clickOnElement(errorAccountCheckBox);
    }

    public boolean getOmnibusAccountCheckBox() {

        return getCheckBoxValue(omnibusAccountCheckBox);
    }

    public void setOmnibusAccountCheckBox() {

        clickOnElement(omnibusAccountCheckBox);
    }

    public boolean getTradingAccountCheckBox() {

        return getCheckBoxValue(tradingAccountCheckBox);
    }

    public void setTradingAccountCheckBox() {

        clickOnElement(tradingAccountCheckBox);
    }

    public boolean getAverageAccountCheckBox() {

        return getCheckBoxValue(averageAccountCheckBox);
    }

    public void setAverageAccountCheckBox() {

        clickOnElement(averageAccountCheckBox);
    }

    public String getSpeculatorHedgerRadioButton() {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(speculatorHedgerRadioButton));

        if (speculatorHedgerRadioButton.getAttribute("id").equals("radio-speculatorHedger-S")) {
            return " Speculator";
        } else {
            return "Hedger";
        }
    }

    public ClientAccountPage setSpeculatorHedgerRadioButton() {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(speculatorHedgerRadioButton));
        speculatorHedgerRadioButton.click();

        return this;
    }

    public boolean getManualEntryAllowedCheckBox() {

        return getCheckBoxValue(manualEntryAllowedCheckBox);
    }

    public void setManualEntryAllowedCheckBox() {

        clickOnElement(manualEntryAllowedCheckBox);
    }

    public boolean getContraAccountCheckBox() {

        return getCheckBoxValue(contraAccountCheckBox);
    }

    public void setContraAccountCheckBox() {

        clickOnElement(contraAccountCheckBox);
    }

    public boolean getMarketMakerCheckBox() {

        return getCheckBoxValue(marketMakerCheckBox);
    }

    public void setMarketMakerCheckBox() {

        clickOnElement(marketMakerCheckBox);
    }

    public boolean getRealClearAccountCheckBox() {

        return getCheckBoxValue(realClearAccountCheckBox);
    }

    public void setRealClearAccountCheckBox() {

        clickOnElement(realClearAccountCheckBox);
    }

    // tax sub item
    public void getTaxSubItem() {

        clickOnElement(taxSubItem);
    }

    public boolean getAuResidentCheckBox() {

        getTaxSubItem();

        return getCheckBoxValue(auResidentCheckBox);
    }

    public boolean setAuResidentCheckBox() {

        getTaxSubItem();

        return clickOnElement(auResidentCheckBox);
    }

    public boolean getGstExemptCheckBox() {

        return getCheckBoxValue(gstExemptCheckBox);
    }

    public boolean setGstExemptCheckBox() {

        return clickOnElement(gstExemptCheckBox);
    }

    public String getTfnProvidedLabel() {

        return getLabelValue(tfnProvidedLabel);
    }

    public void getCloseoutsSubItem() {

        clickOnElement(closeoutsSubItem);
    }

    // closeouts
    public String getDefaultCloseoutMethodDropDown() {

        getCloseoutsSubItem();

        return getDropDownValue(defaultCloseoutMethodDropDown);
    }

    public boolean setDefaultCloseoutMethodDropDown(String defaultCloseoutMethod) {

        getCloseoutsSubItem();

        return setDropDown(defaultCloseoutMethodDropDown, defaultCloseoutMethod);
    }

    public String getClosingDispositionFuturesRadioButton() {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(closingDispositionFuturesRadioButton));

        if (closingDispositionFuturesRadioButton.getAttribute("id").equals("radio-closingDispositionFutures-C")) {
            return " Closeout";
        } else {
            return "Back-to-back";
        }
    }

    public boolean setClosingDispositionFuturesRadioButton(String value) {

        return clickOnElement(closingDispositionFuturesRadioButton);
    }

    public String getClosingDispositionOptionsRadioButton() {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(closingDispositionOptionsRadioButton));

        if (closingDispositionFuturesRadioButton.getAttribute("id").equals("radio-closingDispositionFutures-C")) {
            return " Closeout";
        } else {
            return "Back-to-back";
        }
    }

    public boolean setClosingDispositionOptionsRadioButton(String value) {

        return clickOnElement(closingDispositionOptionsRadioButton);
    }

    public boolean getCloseOutDayTradesCheckbox() {

        return getCheckBoxValue(closeOutDayTradesCheckbox);
    }

    public boolean setCloseOutDayTradesCheckbox() {

        return clickOnElement(closeOutDayTradesCheckbox);
    }

    public boolean getOpenPostExpiryCheckbox() {

        return getCheckBoxValue(openPostExpiryCheckbox);
    }

    public boolean setOpenPostExpiryCheckbox() {

        return clickOnElement(openPostExpiryCheckbox);
    }

    // balances
    public boolean getBalancesSubItem() {

        return clickOnElement(balancesSubItem);
    }

    public boolean getCollateralOffsetsTotEqCheckbox() {

        getBalancesSubItem();

        return getCheckBoxValue(collateralOffsetsTotEqCheckbox);
    }

    public boolean setCollateralOffsetsTotEqCheckbox() {

        getBalancesSubItem();

        return clickOnElement(collateralOffsetsTotEqCheckbox);
    }

    public boolean getMarginFreeClientCheckbox() {

        return getCheckBoxValue(marginFreeClientCheckbox);
    }

    public boolean setMarginFreeClientCheckbox() {

        return clickOnElement(marginFreeClientCheckbox);
    }

    public String getBalanceMonthDropDown() {

        return getDropDownValue(balanceMonthDropDown);
    }

    public boolean setBalanceMonthDropDown(String balanceMonth) {

        return setDropDown(balanceMonthDropDown, balanceMonth);
    }

    public String getApplyInitialMarginMultiplierLabel() {

        return getLabelValue(applyInitialMarginMultiplierTextArea);
    }

    public String getInitialMarginMultiplierLabel() {

        return getLabelValue(initialMarginMultiplierTextArea);
    }

    // reporting
    public void getReportingSubItem() {

        clickOnElement(reportingSubItem);
    }

    public String getHeaderTypeDropDown() {

        getReportingSubItem();

        return getDropDownValue(headerTypeDropDown);
    }

    public boolean setHeaderTypeDropDown(String headerType) {

        getReportingSubItem();

        return setDropDown(headerTypeDropDown, headerType);
    }

    public boolean getSuppressLmeDprsReportingClientCheckbox() {

        return getCheckBoxValue(suppressLmeDprsReportingClientCheckbox);
    }

    public boolean setSuppressLmeDprsReportingClientCheckbox() {

        return clickOnElement(suppressLmeDprsReportingClientCheckbox);
    }

    // TAX FILE NUMBER tab
    public void getTaxFileNumberTab() {

        clickOnElement(taxFileNumberTab);
    }

    public String getTaxFileNumberTextArea() {

        getTaxFileNumberTab();

        return getTextAreaValue(taxFileNumberTextArea);
    }

    public boolean setTaxFileNumberTextArea(String taxFileNumber) {

        getTaxFileNumberTab();

        return setTextAreaValue(taxFileNumberTextArea, taxFileNumber);
    }

    public String getExemptionCodeDropDown() {

        return getDropDownValue(exemptionCodeDropDown);
    }

    public boolean setExemptionCodeDropDown(String exemptionCode) {

        return setDropDown(exemptionCodeDropDown, exemptionCode);
    }

    public String getTypeDropDown() {

        return getDropDownValue(typeDropDown);
    }

    public boolean setTypeDropDown(String type) {

        return setDropDown(typeDropDown, type);
    }

    public String getCompanyNameTextArea() {

        return getTextAreaValue(companyNameTextArea);
    }

    public boolean setCompanyNameTextArea(String companyName) {

        return setTextAreaValue(companyNameTextArea, companyName);
    }

    public String getSurnameTextArea() {

        return getTextAreaValue(surnameTextArea);
    }

    public boolean setSurnameTextArea(String surname) {

        return setTextAreaValue(surnameTextArea, surname);
    }

    public String getGivenNamesTextArea() {

        return getTextAreaValue(givenNamesTextArea);
    }

    public boolean setGivenNamesTextArea(String givenNames) {

        return setTextAreaValue(givenNamesTextArea, givenNames);
    }

    public String getInitialsTextArea() {

        return getTextAreaValue(initialsTextArea);
    }

    public boolean setInitialsTextArea(String initials) {

        return setTextAreaValue(initialsTextArea, initials);
    }

    public String getAddressTFN() {

        return getTextAreaValue(addressTFN);
    }

    public boolean setAddressTFN(String address) {

        return setTextAreaValue(addressTFN, address);
    }

    public String getSuburbTextArea() {

        return getTextAreaValue(suburbTextArea);
    }

    public boolean setSuburbTextArea(String suburb) {

        return setTextAreaValue(suburbTextArea, suburb);
    }

    public String getStateDropDown() {

        return getDropDownValue(stateDropDown);
    }

    public boolean setStateDropDown(String state) {

        return setDropDown(stateDropDown, state);
    }

    public String getPostcodeTextArea() {

        return getTextAreaValue(postcodeTextArea);
    }

    public boolean setPostcodeTextArea(String postcode) {

        return setTextAreaValue(postcodeTextArea, postcode);
    }

    public String getResidencyCodeDropDown() {

        return getDropDownValue(residencyCodeDropDown);
    }

    public boolean setResidencyCodeDropDown(String residencyCode) {

        return setDropDown(residencyCodeDropDown, residencyCode);
    }
}
