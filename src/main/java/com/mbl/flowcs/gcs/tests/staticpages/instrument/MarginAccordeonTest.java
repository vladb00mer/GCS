package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.MarginAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class MarginAccordeonTest extends GcsGemsTest {
    
    private MarginAccordeon marginAccordeon; 
    private String initialMarginMethod;
    private String variationMarginMethod;
    private boolean allowExcessCredit;
    private boolean isVariationMarginPart;
    private boolean realiseVmAtSettlement;
    private boolean setVmToZero;

    
    // page opening
    public void setMarginAccordeon(String search) {
        
        marginAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToMarginAccordeon();
    }

    public boolean verifyInitialMarginMethod() {

        return marginAccordeon.getInitialMarginMethod().equals(initialMarginMethod);
    }

    public boolean modifyInitialMarginMethod() {

        return marginAccordeon.setInitialMarginMethod(initialMarginMethod);
    }
    
    public boolean verifyVariationMarginMethod() {

        return marginAccordeon.getVariationMarginMethod().equals(variationMarginMethod);
    }

    public boolean modifyVariationMarginMethod() {

        return marginAccordeon.setVariationMarginMethod(variationMarginMethod);
    }
    
    public boolean verifyAllowExcessCredit() {

        return (marginAccordeon.getAllowExcessCredit()== allowExcessCredit);
    }

    public boolean modifyAllowExcessCredit() {

        return marginAccordeon.setAllowExcessCredit();
    }
    
    public boolean verifyIsVariationMarginPart() {

        return (marginAccordeon.getIsVariationMarginPart()== isVariationMarginPart);
    }

    public boolean modifyIsVariationMarginPart() {

        return marginAccordeon.setIsVariationMarginPart();
    }
    
    public boolean verifyRealiseVmAtSettlement() {

        return (marginAccordeon.getRealiseVmAtSettlement() == realiseVmAtSettlement);
    }

    public boolean modifyRealiseVmAtSettlement() {

        return marginAccordeon.setRealiseVmAtSettlement();
    }
    
    public boolean verifyVmToZero() {

        return (marginAccordeon.getVmToZero() == setVmToZero);
    }

    public boolean modifyVmToZero() {

        return marginAccordeon.setVmToZero();
    }    
    
    public boolean saveAndConfirm() {

        marginAccordeon.clickBackToTop();
        return marginAccordeon.clickSave();
    }
    
    public boolean authoriseChanges() {

        marginAccordeon.clickBackToTop();
        return marginAccordeon.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return marginAccordeon.closeWebDriver();
    }

    
    // setters section
    public void setInitialMarginMethod(String initialMarginMethod) {
        this.initialMarginMethod = initialMarginMethod;
    }

    public void setVariationMarginMethod(String variationMarginMethod) {
        this.variationMarginMethod = variationMarginMethod;
    }

    public void setAllowExcessCredit(boolean allowExcessCredit) {
        this.allowExcessCredit = allowExcessCredit;
    }

    public void setIsVariationMarginPart(boolean isVariationMarginPart) {
        this.isVariationMarginPart = isVariationMarginPart;
    }

    public void setRealiseVmAtSettlement(boolean realiseVmAtSettlement) {
        this.realiseVmAtSettlement = realiseVmAtSettlement;
    }

    public void setSetVmToZero(boolean setVmToZero) {
        this.setVmToZero = setVmToZero;
    }    
}
