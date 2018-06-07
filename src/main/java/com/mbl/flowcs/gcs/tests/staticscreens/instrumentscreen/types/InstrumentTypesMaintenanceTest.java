package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen.types;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.types.InstrumentTypesMaintenancePage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class InstrumentTypesMaintenanceTest extends GcsGemsTest{
    
    private InstrumentTypesMaintenancePage instrumentTypesMaintenancePage;
    
    private String instrumentType;
    private String description;
    private String lastUpdate;
    
    private int index;
    
    public boolean openInstrumentTypesMaintenance() {
        
        instrumentTypesMaintenancePage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem()
                .goToTypes();
        
        return true;
    }
    
    public boolean clickAddNewRow() {
        
        return instrumentTypesMaintenancePage.clickAddNewRow();
    }
    
    public boolean clickEditCode() {
        
        return instrumentTypesMaintenancePage.clickEditCode();
    }
    
    public boolean verifyInstrumentType() {
        
        return instrumentTypesMaintenancePage.getInstrumentType(instrumentType);
    }
    
    public boolean modifyInstrumentType() {
        
        return instrumentTypesMaintenancePage.setInstrumentType(instrumentType, index);
    }
    
    public boolean verifyDescription() {
        
        return instrumentTypesMaintenancePage.getDescription(description);
    }
    
    public boolean modifyDescription() {
        
        return instrumentTypesMaintenancePage.setDescription(description, index);
    }
    
    public boolean verifyLastUpdate() {
        
        return instrumentTypesMaintenancePage.getLastUpdate(index).equals(lastUpdate);
    }
        
    public boolean clickRemoveCode() {
        
        return instrumentTypesMaintenancePage.clickRemoveCode();
    }
    
    public boolean clickSave() {
        
        return instrumentTypesMaintenancePage.clickSave();
    }
    
    public boolean authorise() {
        
        instrumentTypesMaintenancePage.clickAuthorise();
        return instrumentTypesMaintenancePage.clickConfirmYes();
    }
    
    public boolean closeDriver() {
        
        return instrumentTypesMaintenancePage.closeWebDriver();
    }

    // setters
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public void setIndex(int index) {
        this.index = index;
    }
}
