package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.NonSpanRatesAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class NonSpanRatesAccordeonTest extends GcsGemsTest {
    
    private NonSpanRatesAccordeon nonSpanRatesAccordeon;
    private String speculatorFull;
    private String speculatorInterMonth;
    private String speculatorIntraMonth;
    private String speculatorSpotRate;
    private String hedgerFull;
    private String hedgerInterMonth;
    private String hedgerIntraMonth;
    private String hedgerSpot;
    
    public void setNonSpanRatesAccordeon(String search) {
        
        nonSpanRatesAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToNonSpanRatesAccordeon();
    }
    
    public boolean verifySpeculatorFull() {

        return nonSpanRatesAccordeon.getSpeculatorFull().equals(speculatorFull);
    }

    public boolean modifySpeculatorFull() {

        return nonSpanRatesAccordeon.setSpeculatorFull(speculatorFull);
    }
    
    public boolean verifySpeculatorInterMonth() {

        return nonSpanRatesAccordeon.getSpeculatorInterMonth().equals(speculatorInterMonth);
    }

    public boolean modifySpeculatorInterMonth() {

        return nonSpanRatesAccordeon.setSpeculatorInterMonth(speculatorInterMonth);
    }
    
    public boolean verifySpeculatorIntraMonth() {

        return nonSpanRatesAccordeon.getSpeculatorIntraMonth().equals(speculatorIntraMonth);
    }

    public boolean modifySpeculatorIntraMonth() {

        return nonSpanRatesAccordeon.setSpeculatorIntraMonth(speculatorIntraMonth);
    }
    
    public boolean verifySpeculatorSpotRate() {

        return nonSpanRatesAccordeon.getSpeculatorSpotRate().equals(speculatorSpotRate);
    }

    public boolean modifySpeculatorSpotRate() {

        return nonSpanRatesAccordeon.setSpeculatorSpotRate(speculatorSpotRate);
    }
    
    public boolean verifyHedgerFull() {

        return nonSpanRatesAccordeon.getHedgerFull().equals(hedgerFull);
    }

    public boolean modifyHedgerFull() {

        return nonSpanRatesAccordeon.setHedgerFull(hedgerFull);
    }
    
    public boolean verifyHedgerInterMonth() {

        return nonSpanRatesAccordeon.getHedgerInterMonth().equals(hedgerInterMonth);
    }

    public boolean modifyHedgerInterMonth() {

        return nonSpanRatesAccordeon.setHedgerInterMonth(hedgerInterMonth);
    }
    
    public boolean verifyHedgerIntraMonth() {

        return nonSpanRatesAccordeon.getHedgerIntraMonth().equals(hedgerIntraMonth);
    }

    public boolean modifyHedgerIntraMonth() {

        return nonSpanRatesAccordeon.setHedgerIntraMonth(hedgerIntraMonth);
    }
    
    public boolean verifyHedgerSpot() {

        return nonSpanRatesAccordeon.getHedgerSpot().equals(hedgerSpot);
    }

    public boolean modifyHedgerSpot() {

        return nonSpanRatesAccordeon.setHedgerSpot(hedgerSpot);
    }

    public boolean saveAndConfirm() {

        nonSpanRatesAccordeon.clickBackToTop();
        return nonSpanRatesAccordeon.clickSave();
    }
    
    public boolean authoriseChanges() {

        nonSpanRatesAccordeon.clickBackToTop();
        return nonSpanRatesAccordeon.clickAuthorise();
    }
            
    public boolean closeDriver() {
        
        return nonSpanRatesAccordeon.closeWebDriver();
    }
    
    // setters section
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
}
