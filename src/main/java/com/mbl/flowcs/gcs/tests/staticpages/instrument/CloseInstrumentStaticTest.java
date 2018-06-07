package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.InstrumentStaticPage;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.InstrumentStaticSearchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CloseInstrumentStaticTest extends GcsGemsTest{
    
    private InstrumentStaticPage instrumentStaticPage;
    private InstrumentStaticSearchPage instrumentStaticSearchPage;
    
    private String instrumentCode;
    
    public boolean closeInstrument() {
        
        instrumentStaticPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem()
                .goToMaster()
                .findInstrumentStatic(instrumentCode);
        
        instrumentStaticPage.clickClose();
        return instrumentStaticPage.clickConfirmYes();
    }
    
    public boolean authoriseChanges() {
        
        instrumentStaticPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem()
                .goToMaster()
                .findInstrumentStatic(instrumentCode);
        
        instrumentStaticPage.clickAuthorise();
        return  instrumentStaticPage.clickConfirmYes();
    }
        
    public boolean checkInstrumentNotFound() {
        
        instrumentStaticSearchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem()
                .goToMaster();
        
        return instrumentStaticSearchPage.verifyInstrumentExisting(instrumentCode);
    }
    
    public boolean closeWebDriver() {

        return instrumentStaticPage.closeWebDriver();
    }
    
    public boolean closeDriver() {

        return instrumentStaticSearchPage.closeWebDriver();
    }        

    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }
}
