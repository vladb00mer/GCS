package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.TradefeedPriceDecimalsAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class TradefeedPriceDecimalsAccordeonTest extends GcsGemsTest {
    
    private TradefeedPriceDecimalsAccordeon tradefeedPriceDecimalsAccordeon;
    
    private String strike;
    private String futureTradePrice;
    private String optionPremium;

    /*
    // page opening
    public void setTradefeedPriceDecimalsAccordeon(String search) {

        tradefeedPriceDecimalsAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToTradefeedPriceDecimalsAccordeon();
    }
    */
    
    public boolean verifyStrike() {

        return (tradefeedPriceDecimalsAccordeon.getStrike().equals(strike));
    }

    public boolean modifyStrike() {

        return tradefeedPriceDecimalsAccordeon.setStrike(strike);
    }
    
    public boolean verifyFutureTradePrice() {

        return (tradefeedPriceDecimalsAccordeon.getFutureTradePrice().equals(futureTradePrice));
    }

    public boolean modifyFutureTradePrice() {

        return tradefeedPriceDecimalsAccordeon.setFutureTradePrice(futureTradePrice);
    }
    
    public boolean verifyOptionPremium() {

        return (tradefeedPriceDecimalsAccordeon.getOptionPremium().equals(optionPremium));
    }

    public boolean modifyOptionPremium() {

        return tradefeedPriceDecimalsAccordeon.setOptionPremium(optionPremium);
    }

    public boolean saveChanges() {

        tradefeedPriceDecimalsAccordeon.clickBackToTop();
        return tradefeedPriceDecimalsAccordeon.clickSave();
    }

    public boolean authoriseChanges() {

        tradefeedPriceDecimalsAccordeon.clickBackToTop();
        return tradefeedPriceDecimalsAccordeon.clickAuthorise();
    }
    
    public boolean saveAndConfirm() {

        tradefeedPriceDecimalsAccordeon.clickBackToTop();
        tradefeedPriceDecimalsAccordeon.clickSave();
        return tradefeedPriceDecimalsAccordeon.clickConfirmYes();
    }

    public boolean closeDriver() {
        
        return tradefeedPriceDecimalsAccordeon.closeWebDriver();
    }
    
    // setters section
    public void setStrike(String strike) {
        this.strike = strike;
    }

    public void setFutureTradePrice(String futureTradePrice) {
        this.futureTradePrice = futureTradePrice;
    }

    public void setOptionPremium(String optionPremium) {
        this.optionPremium = optionPremium;
    }
}
