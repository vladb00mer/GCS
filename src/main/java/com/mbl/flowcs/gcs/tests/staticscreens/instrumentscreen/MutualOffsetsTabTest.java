package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.MutualOffsetsTabPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class MutualOffsetsTabTest extends GcsGemsTest{
    
    private MutualOffsetsTabPage mutualOffsetsTab;
    
    private String executedInstrument;
    private String clearedInstrument;
    private String conversionRatio1;
    private String conversionRatio2;
    
    //page opening
    public void setMutualOffsetsTab(String search) {

        mutualOffsetsTab = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMutualOffsetsTab();
    }
    
    public boolean beginCreation() {
        
        return mutualOffsetsTab.addNewRowClick();
    }

    public boolean verifyExecutedInstrument() {

        return mutualOffsetsTab.getExecutedInstrument().equals(executedInstrument);
    }

    public boolean verifyClearedInstrument() {

        return mutualOffsetsTab.getCreatedInstrument().equals(clearedInstrument);
    }
    
    public boolean modifyClearedInstrument() {
        
        return mutualOffsetsTab.setCreatedInstrument(clearedInstrument);
    }
    
    public boolean verifyConversionRatio1() {

        return mutualOffsetsTab.getConversionRatio1().equals(conversionRatio1);
    }
    
    public boolean modifyConversionRatio1() {

        return mutualOffsetsTab.setConversionRatio1(conversionRatio1);
    }
    
    public boolean verifyConversionRatio2() {

        return mutualOffsetsTab.getConversionRatio2().equals(conversionRatio2);
    }
    
    public boolean modifyConversionRatio2() {

        return mutualOffsetsTab.setConversionRatio2(conversionRatio2);
    }
    
    public boolean clickSave() {

        return mutualOffsetsTab.clickSave();
    }
    
    public boolean authoriseChanges() {

        return mutualOffsetsTab.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return mutualOffsetsTab.closeWebDriver();
    }
    
    // setters section
    public void setExecutedInstrument(String executedInstrument) {
        this.executedInstrument = executedInstrument;
    }

    public void setClearedInstrument(String clearedInstrument) {
        this.clearedInstrument = clearedInstrument;
    }

    public void setConversionRatio1(String conversionRatio1) {
        this.conversionRatio1 = conversionRatio1;
    }

    public void setConversionRatio2(String conversionRatio2) {
        this.conversionRatio2 = conversionRatio2;
    }
}
