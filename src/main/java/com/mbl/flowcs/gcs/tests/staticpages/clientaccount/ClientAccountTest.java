package com.mbl.flowcs.gcs.tests.staticpages.clientaccount;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.ClientAccountPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author VMurashov
 */
public class ClientAccountTest extends GcsGemsTest {

    private ClientAccountPage clientAccountPage;

    // MASTER tab values:
    // header elements values
    private String clientGroup;
    private String clientAccount;
    private String clientType;

    // master tab contact drop down elements values
    private String clientAddress;
    private String clientContact;
    private String clientPhone;
    private String clientAdvisorCode;
    private String clientClearingManager;

    // master tab client details drop down elements values
    private String clientGroupCode;
    private String clientCentralCustomerNumber;
    private String clientCentralCustomerDescription;

    // master tab account type drop down elements values
    private boolean clientSegregated;
    private boolean clientHoldingAccount;
    private boolean clientErrorAccount;
    private boolean clientOmnibusAccount;
    private boolean clientTradingAccount;
    private boolean clientAverageAccount;
    private String clientHedgerSpeculator;
    private boolean clientManualEntryAllowed;
    private boolean clientContraAccount;
    private boolean clientMarketMaker;
    private boolean clientRealClearAccount;

    // master tab tax elements values
    private boolean auResident;
    private boolean gstExtempt;
    private String tfnProvided;

    // master tab closeouts elements values
    private String defaultCloseoutMethod;
    private String closingDispositionFutures;
    private String closingDispositionOptions;
    private boolean closeOutDayTrades;
    private boolean openPostExpiry;

    // master tab balances elements values
    private boolean collateralOffsetsTotEq;
    private boolean marginFreeClient;
    private String balanceMonth;
    private String applyInitialMarginMultiplier;
    private String initialMarginMultiplier;

    // master tab reporting elements values
    private String headerType;
    private boolean suppressLMEDPRSReporting;

    // TAX FILE NUMBERS values:
    private String taxFileNumber;
    private String exemptionCode;
    private String type;
    private String companyName;
    private String surname;
    private String givenNames;
    private String initials;
    private String address;
    private String suburb;
    private String state;
    private String postcode;
    private String residencyCode;

    // Client Account opening
    public void setClientAccountPage(String accountData) {

        clientAccount = accountData;
        clientAccountPage = new NavigationTree(getBrowser(), getResolution(), getUser()).goToStaticItem().goToClientAccountSearch().findClientAccountPage(accountData);
    }

    // MASTER tab:
    // header
    public boolean verifyClientAccount() {
        return (clientAccountPage.getClientAccountLabelValue().equalsIgnoreCase(clientAccount));
    }

    public boolean verifyClientGroup() {
        return (clientAccountPage.getGroupLabelValue().equals(clientGroup));
    }

    public boolean verifyClientType() {
        return (clientAccountPage.getClientTypeLabelValue().equals(clientType));
    }

    // contact
    public boolean verifyClientAddress() {
        return (clientAccountPage.getAddressMaster().contains(clientAddress));
    }

    public boolean modifyClientAddress() {
        return clientAccountPage.setAddressField(clientAddress);
    }

    public boolean verifyClientContact() {
        return (clientAccountPage.getContact().equals(clientContact));
    }

    public boolean modifyClientContact() {
        return clientAccountPage.setContactField(clientContact);
    }

    public boolean verifyClientPhone() {
        return (clientAccountPage.getPhone().equals(clientPhone));
    }

    public boolean modifyClientPhone() {
        return clientAccountPage.setPhoneNoField(clientPhone);
    }

    public boolean verifyAdvisorCode() {
        return (clientAccountPage.getAdvisorCode().contains(clientAdvisorCode));
    }

    public boolean modifyAdvisorCode() {
        return clientAccountPage.setAdvisorCode(clientAdvisorCode);
    }

    public boolean verifyClearingManager() {
        return (clientAccountPage.getClearingManager().contains(clientClearingManager));
    }

    public boolean modifyClearingManager() {
        return clientAccountPage.setClearingManagerField(clientClearingManager);
    }

    // client details
    public boolean verifyGroupCode() {
        return (clientAccountPage.getGroupCodeField().equals(clientGroupCode));
    }

    public boolean modifyGroupCode() {
        return clientAccountPage.setGroupCodeField(clientGroupCode);
    }

    public boolean verifyCentralCustomerNumber() {
        return (clientAccountPage.getCentralCustomerNumberField().equals(clientCentralCustomerNumber));
    }

    public boolean modifyCentralCustomerNumber() {
        clientAccountPage.setCentralCustomerNumberField(clientCentralCustomerNumber);
        return clientAccountPage.getCentralCustomerNumberField().equals(clientCentralCustomerNumber);
    }

    public boolean verifyCentralCustomerDescription() {
        return (clientAccountPage.getCentralCustomerDescriptionLabel().equals(clientCentralCustomerDescription));
    }

    // account type
    public boolean verifyClientTypeDD() {
        return (clientAccountPage.getClientTypeDropDown().contains(clientType));
    }

    public boolean modifyClientTypeDD() {
        return clientAccountPage.setClientTypeDropDown(clientType);
    }

    public boolean verifyClientSegregated() {
        return (clientAccountPage.getSegregatedCheckBoxState() == (clientSegregated));
    }

    public boolean modifyClientSegregated() {
        return clientAccountPage.setSegregatedCheckBox();
    }

    public boolean verifyClientHoldingAccount() {
        return (clientAccountPage.getHoldingAccountCheckBoxState() == clientHoldingAccount);
    }

    public boolean modifyClientHoldingAccount() {
        clientAccountPage.setHoldingAccountCheckBox();
        return true;
    }

    public boolean verifyClientErrorAccount() {
        return (clientAccountPage.getErrorAccountCheckBox() == clientErrorAccount);
    }

    public boolean modifyClientErrorAccount() {
        clientAccountPage.setErrorAccountCheckBox();
        return true;
    }

    public boolean verifyClientOmnibusAccount() {
        return (clientAccountPage.getOmnibusAccountCheckBox() == clientOmnibusAccount);
    }

    public boolean modifyClientOmnibusAccount() {
        clientAccountPage.setOmnibusAccountCheckBox();
        return true;
    }

    public boolean verifyClientTradingAccount() {
        return (clientAccountPage.getTradingAccountCheckBox() == clientTradingAccount);
    }

    public boolean modifyClientTradingAccount() {
        clientAccountPage.setTradingAccountCheckBox();
        return true;
    }

    public boolean verifyClientAverageAccount() {
        return (clientAccountPage.getAverageAccountCheckBox() == clientAverageAccount);
    }

    public boolean modifyClientAverageAccount() {
        clientAccountPage.setAverageAccountCheckBox();
        return true;
    }

    public boolean verifyClientHedgerSpeculator() {
        return (clientAccountPage.getSpeculatorHedgerRadioButton().equals(clientHedgerSpeculator));
    }

    public boolean modifyClientHedgerSpeculator() {
        clientAccountPage.setSpeculatorHedgerRadioButton();
        return true;
    }

    public boolean verifyClientManualEntryAllowed() {
        return (clientAccountPage.getManualEntryAllowedCheckBox() == clientManualEntryAllowed);
    }

    public boolean modifyClientManualEntryAllowed() {
        clientAccountPage.setManualEntryAllowedCheckBox();
        return true;
    }

    public boolean verifyContraAccount() {
        return (clientAccountPage.getContraAccountCheckBox() == clientContraAccount);
    }

    public boolean modifyContraAccount() {
        clientAccountPage.setContraAccountCheckBox();
        return true;
    }

    public boolean verifyClientMarketMaker() {
        return (clientAccountPage.getMarketMakerCheckBox() == clientMarketMaker);
    }

    public boolean modifyClientMarketMaker() {
        clientAccountPage.setMarketMakerCheckBox();
        return true;
    }

    public boolean verifyRealClearAccount() {
        return (clientAccountPage.getRealClearAccountCheckBox() == clientRealClearAccount);
    }

    public boolean modifyRealClearAccount() {
        clientAccountPage.setRealClearAccountCheckBox();
        return true;
    }

    // tax
    public boolean verifyAuResident() {
        return (clientAccountPage.getAuResidentCheckBox() == auResident);
    }

    public boolean modifyAuResident() {
        return clientAccountPage.setAuResidentCheckBox();
    }

    public boolean verifyGstExempt() {
        return (clientAccountPage.getGstExemptCheckBox() == gstExtempt);
    }

    public boolean modifyGstExempt() {
        return clientAccountPage.setGstExemptCheckBox();
    }

    public boolean verifyTfnProvided() {
        return (clientAccountPage.getTfnProvidedLabel().equals(tfnProvided));
    }

    // closeouts
    public boolean verifyDefaultCloseoutMethod() {
        return (clientAccountPage.getDefaultCloseoutMethodDropDown().contains(defaultCloseoutMethod));
    }

    public boolean modifyDefaultCloseoutMethod() {
        return clientAccountPage.setDefaultCloseoutMethodDropDown(defaultCloseoutMethod);
    }

    public boolean verifyClosingDispositionFutures() {
        return (clientAccountPage.getClosingDispositionFuturesRadioButton().equals(closingDispositionFutures));
    }

    public boolean modifyClosingDispositionFutures() {
        return clientAccountPage.setClosingDispositionFuturesRadioButton(closingDispositionFutures);
    }

    public boolean verifyClosingDispositionOptions() {
        return (clientAccountPage.getClosingDispositionOptionsRadioButton().equals(closingDispositionOptions));
    }

    public boolean modifyClosingDispositionOptions() {
        return clientAccountPage.setClosingDispositionOptionsRadioButton(closingDispositionOptions);
    }

    public boolean verifyCloseoutDayTrades() {
        return (clientAccountPage.getCloseOutDayTradesCheckbox() == closeOutDayTrades);
    }

    public boolean modifyCloseoutDayTrades() {
        return clientAccountPage.setCloseOutDayTradesCheckbox();
    }

    public boolean verifyOpenPostExpiry() {
        return (clientAccountPage.getOpenPostExpiryCheckbox() == openPostExpiry);
    }

    public boolean modifyOpenPostExpiry() {
        return clientAccountPage.setOpenPostExpiryCheckbox();
    }

    // balances
    public boolean verifyCollateralOffsetsTotEq() {
        return (clientAccountPage.getCollateralOffsetsTotEqCheckbox() == collateralOffsetsTotEq);
    }

    public boolean modifyCollateralOffsetsTotEq() {
        return clientAccountPage.setCollateralOffsetsTotEqCheckbox();
    }

    public boolean verifyMarginFreeClient() {
        return (clientAccountPage.getMarginFreeClientCheckbox() == marginFreeClient);
    }

    public boolean modifyMarginFreeClient() {
        return clientAccountPage.setMarginFreeClientCheckbox();
    }

    public boolean verifyBalanceMonth() {
        return (clientAccountPage.getBalanceMonthDropDown().contains(balanceMonth));
    }

    public boolean modifyBalanceMonth() {
        return clientAccountPage.setBalanceMonthDropDown(balanceMonth);
    }

    public boolean verifyApplyInitialMarginMultiplier() {
        return (clientAccountPage.getApplyInitialMarginMultiplierLabel().equals(applyInitialMarginMultiplier));
    }

    public boolean verifyInitialMarginMultiplierLabel() {
        return (clientAccountPage.getInitialMarginMultiplierLabel().equals(initialMarginMultiplier));
    }

    // reporting
    public boolean verifyHeaderType() {
        return (clientAccountPage.getHeaderTypeDropDown().contains(headerType));
    }

    public boolean modifyHeaderType() {
        return clientAccountPage.setHeaderTypeDropDown(headerType);
    }

    public boolean verifySuppressLmeDprsReporting() {
        return (clientAccountPage.getSuppressLmeDprsReportingClientCheckbox() == suppressLMEDPRSReporting);
    }

    public boolean modifySuppressLmeDprsReporting() {
        return clientAccountPage.setSuppressLmeDprsReportingClientCheckbox();
    }

    // TAX FILE NUMBER tab:
    public boolean verifyTaxFileNumber() {
        return (clientAccountPage.getTaxFileNumberTextArea().equals(taxFileNumber));
    }

    public boolean modifyTaxFileNumber() {
        return clientAccountPage.setTaxFileNumberTextArea(taxFileNumber);
    }

    public boolean verifyExemptionCode() {
        return (clientAccountPage.getExemptionCodeDropDown().contains(exemptionCode));
    }

    public boolean modifyExemptionCode() {
        return clientAccountPage.setExemptionCodeDropDown(exemptionCode);
    }

    public boolean verifyType() {
        return (clientAccountPage.getTypeDropDown().contains(type));
    }

    public boolean modifyType() {
        return clientAccountPage.setTypeDropDown(type);
    }

    public boolean verifyCompanyName() {
        return (clientAccountPage.getCompanyNameTextArea().equals(companyName));
    }

    public boolean modifyCompanyName() {
        return clientAccountPage.setCompanyNameTextArea(companyName);
    }

    public boolean verifySurname() {
        return (clientAccountPage.getSurnameTextArea().equals(surname));
    }

    public boolean modifySurname() {
        return clientAccountPage.setSurnameTextArea(surname);
    }

    public boolean verifyGivenNames() {
        return (clientAccountPage.getGivenNamesTextArea().equals(givenNames));
    }

    public boolean modifyGivenNames() {
        return clientAccountPage.setGivenNamesTextArea(givenNames);
    }

    public boolean verifyInitials() {
        return (clientAccountPage.getInitialsTextArea().equals(initials));
    }

    public boolean modifyInitials() {
        return clientAccountPage.setInitialsTextArea(initials);
    }

    public boolean verifyAddressTFN() {
        return (clientAccountPage.getAddressTFN().equals(address));
    }

    public boolean modifyAddressTFN() {
        return clientAccountPage.setAddressTFN(address);
    }

    public boolean verifySuburb() {
        return ((clientAccountPage.getSuburbTextArea().equals(suburb)));
    }

    public boolean modifySuburb() {
        return clientAccountPage.setSuburbTextArea(suburb);
    }

    public boolean verifyState() {
        return (clientAccountPage.getStateDropDown().contains(state));
    }

    public boolean modifyState() {
        return clientAccountPage.setStateDropDown(state);
    }

    public boolean verifyPostcode() {
        return (clientAccountPage.getPostcodeTextArea().equals(postcode));
    }

    public boolean modifyPostcode() {
        return clientAccountPage.setPostcodeTextArea(postcode);
    }

    public boolean verifyResidencyCode() {
        return (clientAccountPage.getResidencyCodeDropDown().contains(residencyCode));
    }

    public boolean modifyResidencyCode() {
        return clientAccountPage.setResidencyCodeDropDown(residencyCode);
    }

    public boolean saveChanges() {
        return (clientAccountPage.clickSave() && clientAccountPage.clickConfirmYes());
    }

    public boolean discardChanges() {
        return (clientAccountPage.clickSave() && clientAccountPage.clickConfirmNo());
    }

    // setters section
    public void setClientGroup(String clientGroup) {
        this.clientGroup = clientGroup;
    }

    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public void setClientAdvisorCode(String clientAdvisorCode) {
        this.clientAdvisorCode = clientAdvisorCode;
    }

    public void setClientClearingManager(String clientClearingManager) {
        this.clientClearingManager = clientClearingManager;
    }

    public void setClientGroupCode(String clientGroupCode) {
        this.clientGroupCode = clientGroupCode;
    }

    public void setClientCentralCustomerNumber(String clientCentralCustomerNumber) {
        this.clientCentralCustomerNumber = clientCentralCustomerNumber;
    }

    public void setClientCentralCustomerDescription(String clientCentralCustomerDescription) {
        this.clientCentralCustomerDescription = clientCentralCustomerDescription;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setClientSegregated(boolean clientSegregated) {
        this.clientSegregated = clientSegregated;
    }

    public void setClientHoldingAccount(boolean clientHoldingAccount) {
        this.clientHoldingAccount = clientHoldingAccount;
    }

    public void setClientErrorAccount(boolean clientErrorAccount) {
        this.clientErrorAccount = clientErrorAccount;
    }

    public void setClientOmnibusAccount(boolean clientOmnibusAccount) {
        this.clientOmnibusAccount = clientOmnibusAccount;
    }

    public void setClientTradingAccount(boolean clientTradingAccount) {
        this.clientTradingAccount = clientTradingAccount;
    }

    public void setClientAverageAccount(boolean clientAverageAccount) {
        this.clientAverageAccount = clientAverageAccount;
    }

    public void setClientManualEntryAllowed(boolean clientManualEntryAllowed) {
        this.clientManualEntryAllowed = clientManualEntryAllowed;
    }

    public void setClientContraAccount(boolean clientContraAccount) {
        this.clientContraAccount = clientContraAccount;
    }

    public void setClientMarketMaker(boolean clientMarketMaker) {
        this.clientMarketMaker = clientMarketMaker;
    }

    public void setClientRealClearAccount(boolean clientRealClearAccount) {
        this.clientRealClearAccount = clientRealClearAccount;
    }

    public void setAuResident(boolean auResident) {
        this.auResident = auResident;
    }

    public void setGstExtempt(boolean gstExtempt) {
        this.gstExtempt = gstExtempt;
    }

    public void setTfnProvided(String tfnProvided) {
        this.tfnProvided = tfnProvided;
    }

    public void setDefaultCloseoutMethod(String defaultCloseoutMethod) {
        this.defaultCloseoutMethod = defaultCloseoutMethod;
    }

    public void setClosingDispositionFutures(String closingDispositionFutures) {
        this.closingDispositionFutures = closingDispositionFutures;
    }

    public void setClosingDispositionOptions(String closingDispositionOptions) {
        this.closingDispositionOptions = closingDispositionOptions;
    }

    public void setCloseOutDayTrades(boolean closeOutDayTrades) {
        this.closeOutDayTrades = closeOutDayTrades;
    }

    public void setOpenPostExpiry(boolean openPostExpiry) {
        this.openPostExpiry = openPostExpiry;
    }

    public void setClientHedgerSpeculator(String clientHedgerSpeculator) {
        this.clientHedgerSpeculator = clientHedgerSpeculator;
    }

    public void setTaxFileNumber(String taxFileNumber) {
        this.taxFileNumber = taxFileNumber;
    }

    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGivenNames(String givenNames) {
        this.givenNames = givenNames;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setResidencyCode(String residencyCode) {
        this.residencyCode = residencyCode;
    }

    public void setCollateralOffsetsTotEq(boolean collateralOffsetsTotEq) {
        this.collateralOffsetsTotEq = collateralOffsetsTotEq;
    }

    public void setMarginFreeClient(boolean marginFreeClient) {
        this.marginFreeClient = marginFreeClient;
    }

    public void setBalanceMonth(String balanceMonth) {
        this.balanceMonth = balanceMonth;
    }

    public void setApplyInitialMarginMultiplier(String applyInitialMarginMultiplier) {
        this.applyInitialMarginMultiplier = applyInitialMarginMultiplier;
    }

    public void setInitialMarginMultiplier(String initialMarginMultiplier) {
        this.initialMarginMultiplier = initialMarginMultiplier;
    }

    public void setHeaderType(String headerType) {
        this.headerType = headerType;
    }

    public void setSuppressLMEDPRSReporting(boolean suppressLMEDPRSReporting) {
        this.suppressLMEDPRSReporting = suppressLMEDPRSReporting;
    }
}
