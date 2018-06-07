package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.CascadingContractsAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CascadingContractsAccordeonTest extends GcsGemsTest {

    private CascadingContractsAccordeon cascadingContractsAccordeon;
    private String cascadePriceType;
    private String contractType;
    private String type;
    private String cascadingRulesTablePosDevMonth;
    private String cascadingRulesTableComCode;
    
    
    // page opening
    public void setCascadingContractsAccordeon(String search) {

        cascadingContractsAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToCascadingContractsAccordeon();
    }

    public boolean modifyCascadingContract() {

        return cascadingContractsAccordeon.setCascadingContract();
    }

    public boolean verifyCascadePriceType() {

        return cascadingContractsAccordeon.getCascadePriceType().equals(cascadePriceType);
    }

    public boolean modifyCascadePriceType() {

        return cascadingContractsAccordeon.setCascadePriceType(cascadePriceType);
    }

    public boolean verifyContractType() {

        return cascadingContractsAccordeon.getContractType().equals(contractType);
    }

    public boolean modifyContractType() {

        return cascadingContractsAccordeon.setContractType(contractType);
    }
    
    public boolean verifyType() {

        return cascadingContractsAccordeon.getType().equals(type);
    }
    
    public boolean verifyPossibleDeliveryMonth() {

        return cascadingContractsAccordeon.getPossibleDeliveryMonth().equals(cascadingRulesTablePosDevMonth);
    }
    
    public boolean verifyCommodityCode() {

        return cascadingContractsAccordeon.getCommodityCode().equals(cascadingRulesTableComCode);
    }

    public boolean modifyCommodityCode() {

        return cascadingContractsAccordeon.setCommodityCode(cascadingRulesTableComCode);
    }

    public boolean saveAndConfirm() {

        cascadingContractsAccordeon.clickBackToTop();
        return cascadingContractsAccordeon.clickSave();
    }
    
    public boolean authoriseChanges() {

        cascadingContractsAccordeon.clickBackToTop();
        return cascadingContractsAccordeon.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return cascadingContractsAccordeon.closeWebDriver();
    }

    //setters
    public void setCascadePriceType(String cascadePriceType) {
        this.cascadePriceType = cascadePriceType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void setCascadingRulesTablePosDevMonth(String cascadingRulesTablePosDevMonth) {
        this.cascadingRulesTablePosDevMonth = cascadingRulesTablePosDevMonth;
    }

    public void setCascadingRulesTableComCode(String cascadingRulesTableComCode) {
        this.cascadingRulesTableComCode = cascadingRulesTableComCode;
    }    

    public void setType(String type) {
        this.type = type;
    }
}
