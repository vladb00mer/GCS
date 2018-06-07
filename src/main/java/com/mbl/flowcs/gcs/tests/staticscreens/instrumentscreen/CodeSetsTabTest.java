package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.CodeSetsTabPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CodeSetsTabTest extends GcsGemsTest {
    
    private CodeSetsTabPage codeSetsTabPage;
    
    private String futures;
    private String options;
    private String futPriceScale;
    private String optPriceScale;
    private String strikePriceScale;
    
    private int index;
   
    //page opening
    public void setCodeSetsTabPage(String search) {

        codeSetsTabPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem()
                .goToMaster()
                .findInstrumentStatic(search)
                .goToCodeSetsTab();
    }
    
    public boolean verifyFutures() {

        return codeSetsTabPage.getFutures(index).equals(futures);
    }
    public boolean modifyFutures() {

        return codeSetsTabPage.setFutures(futures, index);
    }
    
    public boolean verifyOptions() {

        return codeSetsTabPage.getOptions(index).equals(options);
    }
    public boolean modifyOptions() {

        return codeSetsTabPage.setOptions(options, index);
    }
    
    public boolean verifyFutPriceScale() {

        return codeSetsTabPage.getFutPriceScale(index).equals(futPriceScale);
    }
    public boolean modifyFutPriceScale() {

        return codeSetsTabPage.setFutPriceScale(futPriceScale, index);
    }
    
    public boolean verifyOptPriceScale() {

        return codeSetsTabPage.getOptPriceScale(index).equals(optPriceScale);
    }
    public boolean modifyOptPriceScale() {

        return codeSetsTabPage.setOptPriceScale(optPriceScale, index);
    }
    
    public boolean verifyStrikePriceScale() {

        return codeSetsTabPage.getStrikePriceScale(index).equals(strikePriceScale);
    }
    public boolean modifyStrikePriceScale() {

        return codeSetsTabPage.setStrikePriceScale(strikePriceScale, index);
    }
    
    public boolean saveChanges() {

        return codeSetsTabPage.clickSave();
    }
    
    public boolean authoriseChanges() {

        return codeSetsTabPage.clickAuthorise();
    }
    
    public boolean closeWebDriver() {

        return codeSetsTabPage.closeWebDriver();
    }

    // setters
    public void setFutures(String futures) {
        this.futures = futures;
    }
    public void setOptions(String options) {
        this.options = options;
    }
    public void setFutPriceScale(String futPriceScale) {
        this.futPriceScale = futPriceScale;
    }
    public void setOptPriceScale(String optPriceScale) {
        this.optPriceScale = optPriceScale;
    }
    public void setStrikePriceScale(String strikePriceScale) {
        this.strikePriceScale = strikePriceScale;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setCode(String code) {
        index = codeSetsTabPage.getIndex(code);
    }
}
