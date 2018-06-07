package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.ReportableLevelsAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class ReportableLevelsAccordeonTest extends GcsGemsTest {
    
    private ReportableLevelsAccordeon reportableLevelsAccordeon;
    private String futuresBought;
    private String futuresSold;
    private String futuresUncovered;
    private String optionsBought;
    private String optionsSold;
    private String optionsUncovered;
    
    public void setReportableLevelsAccordeon(String search) {
        
        reportableLevelsAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToReportableLevelsAccordeon();
    }
    
    public boolean verifyFuturesBought() {

        return reportableLevelsAccordeon.getFuturesBought().equals(futuresBought);
    }

    public boolean modifyFuturesBought() {

        return reportableLevelsAccordeon.setFuturesBought(futuresBought);
    }
    
    public boolean verifyFuturesSold() {

        return reportableLevelsAccordeon.getFuturesSold().equals(futuresSold);
    }

    public boolean modifyFuturesSold() {

        return reportableLevelsAccordeon.setFuturesSold(futuresSold);
    }
    
    public boolean verifyFuturesUncovered() {

        return reportableLevelsAccordeon.getFuturesUncovered().equals(futuresUncovered);
    }

    public boolean modifyFuturesUncovered() {

        return reportableLevelsAccordeon.setFuturesUncovered(futuresUncovered);
    }
    
    public boolean verifyOptionsBought() {

        return reportableLevelsAccordeon.getOptionsBought().equals(optionsBought);
    }

    public boolean modifyOptionsBought() {

        return reportableLevelsAccordeon.setOptionsBought(optionsBought);
    }
    
    public boolean verifyOptionsSold() {

        return reportableLevelsAccordeon.getOptionsSold().equals(optionsSold);
    }

    public boolean modifyOptionsSold() {

        return reportableLevelsAccordeon.setOptionsSold(optionsSold);
    }
    
    public boolean verifyOptionsUncovered() {

        return reportableLevelsAccordeon.getOptionsUncovered().equals(optionsUncovered);
    }

    public boolean modifyOptionsUncovered() {

        return reportableLevelsAccordeon.setOptionsUncovered(optionsUncovered);
    }   
    
    public boolean saveAndConfirm() {

        reportableLevelsAccordeon.clickBackToTop();
        reportableLevelsAccordeon.clickSave();
        reportableLevelsAccordeon.clickConfirmYes();
        return reportableLevelsAccordeon.isSaved();
    }
    
    public boolean authoriseChanges() {

        return reportableLevelsAccordeon.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return reportableLevelsAccordeon.closeWebDriver();
    }
    
    //setters section
    public void setFuturesBought(String futuresBought) {
        this.futuresBought = futuresBought;
    }

    public void setFuturesSold(String futuresSold) {
        this.futuresSold = futuresSold;
    }

    public void setFuturesUncovered(String futuresUncovered) {
        this.futuresUncovered = futuresUncovered;
    }

    public void setOptionsBought(String optionsBought) {
        this.optionsBought = optionsBought;
    }

    public void setOptionsSold(String optionsSold) {
        this.optionsSold = optionsSold;
    }

    public void setOptionsUncovered(String optionsUncovered) {
        this.optionsUncovered = optionsUncovered;
    }
}
