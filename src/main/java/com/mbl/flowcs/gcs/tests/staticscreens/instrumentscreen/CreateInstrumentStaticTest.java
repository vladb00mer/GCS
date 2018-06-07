package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.InstrumentDetailsAccordeon;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.MasterTabPage;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.NonSpanRatesAccordeon;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.PricingAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CreateInstrumentStaticTest extends GcsGemsTest{
    
    private MasterTabPage masterTabPage;
    
    private InstrumentDetailsAccordeon instrumentDetailsAccordeon;
    private String instrumentCode;
    private String name;
    private String market;
    private String lotSize;
    private String settlementCurrency;
    private String unitOfMeasure;
    private String underlyingFuturesInstrumentForOptions;
    private String combinedInstrumentCode;    
        
    private PricingAccordeon pricingAccordeon;
    private String futuresMinPriceFluctuation;
    private String optionsMinPriceFluctuation;
    
    private NonSpanRatesAccordeon nonSpanRatesAccordeon;
    private String speculatorFull;
    private String speculatorInterMonth;
    private String speculatorIntraMonth;
    private String speculatorSpotRate;
    private String hedgerFull;
    private String hedgerInterMonth;
    private String hedgerIntraMonth;
    private String hedgerSpot;
    
    
    public boolean openNewInstrument() {
        
        masterTabPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .createInstrumentStatic()
                .goToMasterTab();
        
        return masterTabPage.turnAccordeonsOFF();
    }
    
    public boolean modifyInstrumentCode() {

        instrumentDetailsAccordeon = masterTabPage.goToInstrumentDetailsAccordeon();
        return instrumentDetailsAccordeon.setInstrumentCode(instrumentCode);
    }

    public boolean modifyName() {

        return instrumentDetailsAccordeon.setName(name);
    }
    
    public boolean modifyMarket() {

        return instrumentDetailsAccordeon.setMarket(market);
    }

    public boolean modifyLotSize() {

        return instrumentDetailsAccordeon.setLotSize(lotSize);
    }

    public boolean modifySettlementCurrency() {

        return instrumentDetailsAccordeon.setSettlementCurrency(settlementCurrency);
    }

    public boolean modifyUnitOfMeasure() {

        return instrumentDetailsAccordeon.setUnitOfMeasure(unitOfMeasure);
    }

    public boolean modifyUnderlyingFuturesInstrumentForOptions() {

        return instrumentDetailsAccordeon.setUnderlyingFuturesInstrumentForOptions(underlyingFuturesInstrumentForOptions);
    }

    public boolean modifyCombinedInstrumentCode() {

        return instrumentDetailsAccordeon.setCombinedInstrumentCode(combinedInstrumentCode);
    }
    
    public boolean modifyFuturesMinPriceFluctuation() {

        pricingAccordeon = masterTabPage.goToPricingAccordeon();
        return pricingAccordeon.setFuturesMinPriceFluctuation(futuresMinPriceFluctuation);
    }
    
    public boolean modifyOptionsMinPriceFluctuation() {

        return pricingAccordeon.setOptionsMinPriceFluctuation(optionsMinPriceFluctuation);
    }
    
    public boolean modifySpeculatorFull() {

        nonSpanRatesAccordeon = masterTabPage.goToNonSpanRatesAccordeon();
        return nonSpanRatesAccordeon.setSpeculatorFull(speculatorFull);
    }
    
    public boolean modifySpeculatorInterMonth() {

        return nonSpanRatesAccordeon.setSpeculatorInterMonth(speculatorInterMonth);
    }
    
    public boolean modifySpeculatorIntraMonth() {

        return nonSpanRatesAccordeon.setSpeculatorIntraMonth(speculatorIntraMonth);
    }
    
    public boolean modifySpeculatorSpotRate() {

        return nonSpanRatesAccordeon.setSpeculatorSpotRate(speculatorSpotRate);
    }
    
    public boolean modifyHedgerFull() {

        return nonSpanRatesAccordeon.setHedgerFull(hedgerFull);
    }
    
    public boolean modifyHedgerInterMonth() {

        return nonSpanRatesAccordeon.setHedgerInterMonth(hedgerInterMonth);
    }
    
    public boolean modifyHedgerIntraMonth() {

        return nonSpanRatesAccordeon.setHedgerIntraMonth(hedgerIntraMonth);
    }
    
    public boolean modifyHedgerSpot() {

        return nonSpanRatesAccordeon.setHedgerSpot(hedgerSpot);
    }
    
    public boolean saveAndConfirm() {
        
        masterTabPage.clickBackToTop();
        return masterTabPage.clickSave();
        //return masterTabPage.clickConfirmYes();
    }

    public boolean authoriseChanges() {

        return masterTabPage.clickAuthorise();
    }
    
    public boolean closeDriver() {

        return masterTabPage.closeWebDriver();
    }
    
    // setters section    
    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }
    public void setName(String name) {
        this.name = name;
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
    public void setUnderlyingFuturesInstrumentForOptions(String underlyingFuturesInstrumentForOptions) {
        this.underlyingFuturesInstrumentForOptions = underlyingFuturesInstrumentForOptions;
    }
    public void setCombinedInstrumentCode(String combinedInstrumentCode) {
        this.combinedInstrumentCode = combinedInstrumentCode;
    }
    public void setPricingAccordeon(PricingAccordeon pricingAccordeon) {
        this.pricingAccordeon = pricingAccordeon;
    }
    public void setNonSpanRatesAccordeon(NonSpanRatesAccordeon nonSpanRatesAccordeon) {
        this.nonSpanRatesAccordeon = nonSpanRatesAccordeon;
    }
    public void setSpeculatorFull(String speculatorFull) {
        this.speculatorFull = speculatorFull;
    }
    public void setSpeculatorInterMonth(String speculatorInterMonth) {
        this.speculatorInterMonth = speculatorInterMonth;
    }
    public void setSpeculatorIntraMonth(String speculatorIntraMonth) {
        this.speculatorIntraMonth = speculatorIntraMonth;
    }
    public void setSpeculatorSpotRate(String speculatorSpotRate) {
        this.speculatorSpotRate = speculatorSpotRate;
    }
    public void setHedgerFull(String hedgerFull) {
        this.hedgerFull = hedgerFull;
    }
    public void setHedgerInterMonth(String hedgerInterMonth) {
        this.hedgerInterMonth = hedgerInterMonth;
    }
    public void setHedgerIntraMonth(String hedgerIntraMonth) {
        this.hedgerIntraMonth = hedgerIntraMonth;
    }
    public void setHedgerSpot(String hedgerSpot) {
        this.hedgerSpot = hedgerSpot;
    }
    public void setFuturesMinPriceFluctuation(String futuresMinPriceFluctuation) {
        this.futuresMinPriceFluctuation = futuresMinPriceFluctuation;
    }
    public void setOptionsMinPriceFluctuation(String optionsMinPriceFluctuation) {
        this.optionsMinPriceFluctuation = optionsMinPriceFluctuation;
    }
}
