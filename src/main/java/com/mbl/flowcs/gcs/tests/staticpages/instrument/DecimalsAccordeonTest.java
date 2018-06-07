package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.DecimalsAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class DecimalsAccordeonTest extends GcsGemsTest {
    
    private DecimalsAccordeon decimalsAccordeon;
    
    private String noDecimalsInPrice;
    private String noDecimalsForAveragePricing;
    private String noDecimalsInLotSize;
    private String tradeQuantityDecimals;    
    private String extendedDecimalsForExchangeFeeRates;
    
    
    // page opening
    public void setDecimalsAccordeon(String search) {

        decimalsAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToDecimalsAccordeon();
    }
    
    public boolean verifyDecimalsInPrice() {

        return (decimalsAccordeon.getNoDecimalsInPrice().equals(noDecimalsInPrice));
    }

    public boolean modifyDecimalsInPrice() {

        return decimalsAccordeon.setNoDecimalsInPrice(noDecimalsInPrice);
    }
    
    public boolean verifyDecimalsForAveragePricing() {

        return (decimalsAccordeon.getNoDecimalsForAveragePricing().equals(noDecimalsForAveragePricing));
    }

    public boolean modifyDecimalsForAveragePricing() {

        return decimalsAccordeon.setNoDecimalsForAveragePricing(noDecimalsForAveragePricing);
    }
    
    public boolean verifyNoDecimalsInLotSize() {

        return (decimalsAccordeon.getNoDecimalsInLotSize().equals(noDecimalsInLotSize));
    }

    public boolean modifyNoDecimalsInLotSize() {

        return decimalsAccordeon.setNoDecimalsInLotSize(noDecimalsInLotSize);
    }
    
    public boolean verifyTradeQuantityDecimals() {

        return (decimalsAccordeon.getTradeQuantityDecimals().equals(tradeQuantityDecimals));
    }

    public boolean modifyTradeQuantityDecimals() {

        return decimalsAccordeon.setTradeQuantityDecimals(tradeQuantityDecimals);
    }
    
    public boolean verifyExtendedDecimalsForExchangeFeeRates() {

        return decimalsAccordeon.getExtendedDecimalsForExchangeFeeRates().equals(extendedDecimalsForExchangeFeeRates);
    }

    public boolean modifyExtendedDecimalsForExchangeFeeRates() {

        return decimalsAccordeon.setExtendedDecimalsForExchangeFeeRates(extendedDecimalsForExchangeFeeRates);
    }   
    
    public boolean saveAndConfirm() {

        decimalsAccordeon.clickBackToTop();
        decimalsAccordeon.clickSave();
        decimalsAccordeon.clickConfirmYes();
        return decimalsAccordeon.isSaved();
    }
    
    public boolean authoriseChanges() {

        decimalsAccordeon.clickBackToTop();
        return decimalsAccordeon.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return decimalsAccordeon.closeWebDriver();
    }

    // setters section
    public void setNoDecimalsInPrice(String noDecimalsInPrice) {
        this.noDecimalsInPrice = noDecimalsInPrice;
    }

    public void setNoDecimalsForAveragePricing(String noDecimalsForAveragePricing) {
        this.noDecimalsForAveragePricing = noDecimalsForAveragePricing;
    }

    public void setNoDecimalsInLotSize(String noDecimalsInLotSize) {
        this.noDecimalsInLotSize = noDecimalsInLotSize;
    }

    public void setTradeQuantityDecimals(String tradeQuantityDecimals) {
        this.tradeQuantityDecimals = tradeQuantityDecimals;
    }

    public void setExtendedDecimalsForExchangeFeeRates(String extendedDecimalsForExchangeFeeRates) {
        this.extendedDecimalsForExchangeFeeRates = extendedDecimalsForExchangeFeeRates;
    }
}
