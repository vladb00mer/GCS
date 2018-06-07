package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.ClosingDispositionOverridesAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class ClosingDispositionOverridesAccordeonTest extends GcsGemsTest {

    private ClosingDispositionOverridesAccordeon closingDispositionOverridesAccordeon;

    private String futures;
    private String options;

    //page opening
    public void setClosingDispositionOverridesAccordeon(String search) {

        closingDispositionOverridesAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToClosingDispositionOverridesAccordeon();
    }

    public boolean verifyFutures() {

        return closingDispositionOverridesAccordeon.getFutures().equals(futures);
    }

    public boolean modifyFutures() {

        return closingDispositionOverridesAccordeon.setFutures(futures);
    }

    public boolean verifyOptions() {

        return closingDispositionOverridesAccordeon.getOptions().equals(options);
    }

    public boolean modifyOptions() {

        return closingDispositionOverridesAccordeon.setOptions(options);
    }
    
    public boolean saveAndConfirm() {

        closingDispositionOverridesAccordeon.clickBackToTop();
        return closingDispositionOverridesAccordeon.clickSave();
    }
    
    public boolean authoriseChanges() {

        closingDispositionOverridesAccordeon.clickBackToTop();
        return closingDispositionOverridesAccordeon.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return closingDispositionOverridesAccordeon.closeWebDriver();
    }


    // setters
    public void setFutures(String futures) {
        this.futures = futures;
    }

    public void setOptions(String options) {
        this.options = options;
    }
}
