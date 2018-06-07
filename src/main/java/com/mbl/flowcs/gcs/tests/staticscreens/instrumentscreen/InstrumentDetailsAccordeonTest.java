package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.InstrumentDetailsAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class InstrumentDetailsAccordeonTest extends GcsGemsTest {

    private InstrumentDetailsAccordeon instrumentDetailsAccordeon;
    private String instrumentCode;
    private String name;
    private String nameContinued;
    private String market;
    private String lotSize;
    private String settlementCurrency;
    private String unitOfMeasure;
    private String instrumentType;
    private String underlyingFuturesInstrumentForOptions;
    private String optionsExerciseStyle;
    private String optionsPremiumSettlementTime;
    private String daysToMandatorySettlement;
    private String usDesignation;
    private String changeProductType;
    private String cdpUnderlyingProductCode;
    private String aggregationCode;
    private String baselMRCProductGroup;
    private boolean tradingAllowed;
    private boolean overnightOptions;
    private boolean promptDateDeliveryMonth;
    private boolean deliverable;
    private boolean optionsOnly;
    private boolean cashSettledOption;
    private boolean delExpMonthRequired;
    private boolean weekendPromptDates;
    private String combinedInstrumentCode;

    //page opening
    public void setInstrumentDetailsAccordeon(String search) {

        instrumentDetailsAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToInstrumentDetailsAccordeon();
    }

    public boolean verifyInstrumentCode() {

        return instrumentDetailsAccordeon.getInstrumentCode().equals(instrumentCode);
    }

    public boolean verifyName() {

        return instrumentDetailsAccordeon.getName().equals(name);
    }

    public boolean modifyName() {

        return instrumentDetailsAccordeon.setName(name);
    }

    public boolean verifyNameContinued() {

        return instrumentDetailsAccordeon.getNameContinued().equals(nameContinued);
    }

    public boolean modifyNameContinued() {

        return instrumentDetailsAccordeon.setNameContinued(nameContinued);
    }

    public boolean verifyMarket() {

        return instrumentDetailsAccordeon.getMarket().equals(market);
    }

    public boolean modifyMarket() {

        return instrumentDetailsAccordeon.setMarket(market);
    }

    public boolean verifyLotSize() {

        return instrumentDetailsAccordeon.getLotSize().equals(lotSize);
    }

    public boolean modifyLotSize() {

        return instrumentDetailsAccordeon.setLotSize(lotSize);
    }

    public boolean verifySettlementCurrency() {

        return instrumentDetailsAccordeon.getSettlementCurrency().equals(settlementCurrency);
    }

    public boolean modifySettlementCurrency() {

        return instrumentDetailsAccordeon.setSettlementCurrency(settlementCurrency);
    }

    public boolean verifyUnitOfMeasure() {

        return instrumentDetailsAccordeon.getUnitOfMeasure().equals(unitOfMeasure);
    }

    public boolean modifyUnitOfMeasure() {

        return instrumentDetailsAccordeon.setUnitOfMeasure(unitOfMeasure);
    }

    public boolean verifyInstrumentType() {

        return instrumentDetailsAccordeon.getInstrumentType().equals(instrumentType);
    }

    public boolean modifyInstrumentType() {

        return instrumentDetailsAccordeon.setInstrumentType(instrumentType);
    }

    public boolean verifyUnderlyingFuturesInstrumentForOptions() {

        return instrumentDetailsAccordeon.getUnderlyingFuturesInstrumentForOptions().equals(underlyingFuturesInstrumentForOptions);
    }

    public boolean modifyUnderlyingFuturesInstrumentForOptions() {

        return instrumentDetailsAccordeon.setUnderlyingFuturesInstrumentForOptions(underlyingFuturesInstrumentForOptions);
    }

    public boolean verifyOptionExerciseStyle() {

        return instrumentDetailsAccordeon.getOptionExerciseStyle().equals(optionsExerciseStyle);
    }

    public boolean modifyOptionExerciseStyle() {

        return instrumentDetailsAccordeon.setOptionExerciseStyle(optionsExerciseStyle);
    }

    public boolean verifyOptionsPremiumSettTiming() {

        return instrumentDetailsAccordeon.getOptionsPremiumSettTiming().equals(optionsPremiumSettlementTime);
    }

    public boolean modifyOptionsPremiumSettTiming() {

        return instrumentDetailsAccordeon.setOptionsPremiumSettTiming(optionsPremiumSettlementTime);
    }

    public boolean verifyDaysToMandatorySettlement() {

        return instrumentDetailsAccordeon.getDaysToMandatorySettlement().equals(daysToMandatorySettlement);
    }

    public boolean modifyDaysToMandatorySettlement() {

        return instrumentDetailsAccordeon.setDaysToMandatorySettlement(daysToMandatorySettlement);
    }

    public boolean verifyUsDesignation() {

        return instrumentDetailsAccordeon.getUsDesignation().equals(usDesignation);
    }

    public boolean modifyUsDesignation() {

        return instrumentDetailsAccordeon.setUsDesignation(usDesignation);
    }

    public boolean verifyChargeProductType() {

        return instrumentDetailsAccordeon.getChargeProductType().equals(changeProductType);
    }

    public boolean modifyChargeProductType() {

        return instrumentDetailsAccordeon.setChargeProductType(changeProductType);
    }

    public boolean verifyCdpUnderlyingProductCode() {

        return instrumentDetailsAccordeon.getCdpUnderlyingProductCode().equals(cdpUnderlyingProductCode);
    }

    public boolean modifyCdpUnderlyingProductCode() {

        return instrumentDetailsAccordeon.setCdpUnderlyingProductCode(cdpUnderlyingProductCode);
    }

    public boolean verifyAggregationCode() {

        return instrumentDetailsAccordeon.getAggregationCode().equals(aggregationCode);
    }

    public boolean modifyAggregationCode() {

        return instrumentDetailsAccordeon.setAggregationCode(aggregationCode);
    }

    public boolean verifyBaselMrcProductGroup() {

        return instrumentDetailsAccordeon.getBaselMrcProductGroup().equals(baselMRCProductGroup);
    }

    public boolean modifyBaselMrcProductGroup() {

        return instrumentDetailsAccordeon.setBaselMrcProductGroup(baselMRCProductGroup);
    }

    public boolean verifyTradingAllowed() {

        return instrumentDetailsAccordeon.getTradingAllowed() == (tradingAllowed);
    }

    public boolean modifyTradingAllowed() {

        return instrumentDetailsAccordeon.setTradingAllowed();
    }

    public boolean verifyOvernightOptions() {

        return instrumentDetailsAccordeon.getOvernightOptions() == (overnightOptions);
    }

    public boolean modifyOvernightOptions() {

        return instrumentDetailsAccordeon.setOvernightOptions();
    }

    public boolean verifyPromptDateDeliveryMonth() {

        return instrumentDetailsAccordeon.getPromptDateDeliveryMonth() == (promptDateDeliveryMonth);
    }

    public boolean modifyPromptDateDeliveryMonth() {

        return instrumentDetailsAccordeon.setPromptDateDeliveryMonth();
    }

    public boolean verifyDeliverable() {

        return instrumentDetailsAccordeon.getDeliverable() == (deliverable);
    }

    public boolean modifyDeliverable() {

        return instrumentDetailsAccordeon.setDeliverable();
    }

    public boolean verifyOptionsOnly() {

        return instrumentDetailsAccordeon.getOptionsOnly() == (optionsOnly);
    }

    public boolean modifyOptionsOnly() {

        return instrumentDetailsAccordeon.setOptionsOnly();
    }

    public boolean verifyCashSettledOption() {

        return instrumentDetailsAccordeon.getCashSettledOption() == (cashSettledOption);
    }

    public boolean modifyCashSettledOption() {

        return instrumentDetailsAccordeon.setCashSettledOption();
    }

    public boolean verifyDelExpMonthRequired() {

        return instrumentDetailsAccordeon.getDelExpMonthRequired() == (delExpMonthRequired);
    }

    public boolean modifyDelExpMonthRequired() {

        return instrumentDetailsAccordeon.setDelExpMonthRequired();
    }

    public boolean verifyWeekendPromptDates() {

        return instrumentDetailsAccordeon.getWeekendPromptDates() == (weekendPromptDates);
    }

    public boolean modifyWeekendPromptDates() {

        return instrumentDetailsAccordeon.setWeekendPromptDates();
    }

    public boolean verifyCombinedInstrumentCode() {

        return instrumentDetailsAccordeon.getCombinedInstrumentCode().equals(combinedInstrumentCode);
    }

    public boolean modifyCombinedInstrumentCode() {

        return instrumentDetailsAccordeon.setCombinedInstrumentCode(combinedInstrumentCode);
    }
    
    public boolean saveAndConfirm() {

        instrumentDetailsAccordeon.clickBackToTop();
        instrumentDetailsAccordeon.clickSave();
        instrumentDetailsAccordeon.clickConfirmYes();
        return instrumentDetailsAccordeon.isSaved();
    }
    
    public boolean authoriseChanges() {

        return instrumentDetailsAccordeon.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return instrumentDetailsAccordeon.closeWebDriver();
    }
    
    // setters
    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameContinued(String nameContinued) {
        this.nameContinued = nameContinued;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public void setUnderlyingFuturesInstrumentForOptions(String underlyingFuturesInstrumentForOptions) {
        this.underlyingFuturesInstrumentForOptions = underlyingFuturesInstrumentForOptions;
    }

    public void setOptionsExerciseStyle(String optionsExerciseStyle) {
        this.optionsExerciseStyle = optionsExerciseStyle;
    }

    public void setOptionsPremiumSettlementTime(String optionsPremiumSettlementTime) {
        this.optionsPremiumSettlementTime = optionsPremiumSettlementTime;
    }

    public void setDaysToMandatorySettlement(String daysToMandatorySettlement) {
        this.daysToMandatorySettlement = daysToMandatorySettlement;
    }

    public void setUsDesignation(String usDesignation) {
        this.usDesignation = usDesignation;
    }

    public void setChangeProductType(String changeProductType) {
        this.changeProductType = changeProductType;
    }

    public void setCdpUnderlyingProductCode(String cdpUnderlyingProductCode) {
        this.cdpUnderlyingProductCode = cdpUnderlyingProductCode;
    }

    public void setAggregationCode(String aggregationCode) {
        this.aggregationCode = aggregationCode;
    }

    public void setBaselMRCProductGroup(String baselMRCProductGroup) {
        this.baselMRCProductGroup = baselMRCProductGroup;
    }

    public void setTradingAllowed(boolean tradingAllowed) {
        this.tradingAllowed = tradingAllowed;
    }

    public void setOvernightOptions(boolean overnightOptions) {
        this.overnightOptions = overnightOptions;
    }

    public void setPromptDateDeliveryMonth(boolean promptDateDeliveryMonth) {
        this.promptDateDeliveryMonth = promptDateDeliveryMonth;
    }

    public void setDeliverable(boolean deliverable) {
        this.deliverable = deliverable;
    }

    public void setOptionsOnly(boolean optionsOnly) {
        this.optionsOnly = optionsOnly;
    }

    public void setCashSettledOption(boolean cashSettledOption) {
        this.cashSettledOption = cashSettledOption;
    }

    public void setDelExpMonthRequired(boolean delExpMonthRequired) {
        this.delExpMonthRequired = delExpMonthRequired;
    }

    public void setWeekendPromptDates(boolean weekendPromptDates) {
        this.weekendPromptDates = weekendPromptDates;
    }

    public void setCombinedInstrumentCode(String combinedInstrumentCode) {
        this.combinedInstrumentCode = combinedInstrumentCode;
    }
}
