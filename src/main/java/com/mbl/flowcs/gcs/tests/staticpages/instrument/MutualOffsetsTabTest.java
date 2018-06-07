package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.CodeSetsTabPage;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.MutualOffsetsTabPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        mutualOffsetsTab.setConversionRatio1(conversionRatio1);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public boolean verifyConversionRatio2() {

        return mutualOffsetsTab.getConversionRatio2().equals(conversionRatio2);
    }
    
    public boolean modifyConversionRatio2() {

        mutualOffsetsTab.setConversionRatio2(conversionRatio2);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public boolean clickSave() {

        mutualOffsetsTab.clickSave();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
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
