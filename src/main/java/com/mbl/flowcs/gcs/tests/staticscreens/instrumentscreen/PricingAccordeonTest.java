package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.PricingAccordeon;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class PricingAccordeonTest extends GcsGemsTest {
    
    private PricingAccordeon pricingAccordeon; 
    private String futuresMinPriceFluctuation;
    private String futuresTickBase;
    private String futuresTickValue;
    private String futuresPriceVarianceAllowed;
    private boolean priceInversion;
    private String couponRate;
    private String daysInYear;
    private String daysInTerm;
    private String optionsMinPriceFluctuation;
    private String optionsTickBase;
    private String optionsTickValue;
    private String optionsPriceVarianceAllowed;
    private String contractValCalcMethod;
    private String noOfYears;
    private String termsPerYear;

    
    // page opening
    public void setPricingAccordeon(String search) {
        
        pricingAccordeon = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToMasterTab()
                .goToPricingAccordeon();
    }
    
    public boolean verifyFuturesMinPriceFluctuation() {

        return pricingAccordeon.getFuturesMinPriceFluctuation().equals(futuresMinPriceFluctuation);
    }

    public boolean modifyFuturesMinPriceFluctuation() {

        return pricingAccordeon.setFuturesMinPriceFluctuation(futuresMinPriceFluctuation);
    }
    
    public boolean verifyFuturesTickBase() {

        return pricingAccordeon.getFuturesTickBase().equals(futuresTickBase);
    }

    public boolean modifyFuturesTickBase() {

        return pricingAccordeon.setFuturesTickBase(futuresTickBase);
    }
    
    public boolean verifyFuturesTickValue() {

        return pricingAccordeon.getFuturesTickValue().equals(futuresTickValue);
    }

    public boolean modifyFuturesTickValue() {

        return pricingAccordeon.setFuturesTickValue(futuresTickValue);
    }
    
    public boolean verifyFuturesPriceVarianceAllowed() {

        return pricingAccordeon.getFuturesPriceVarianceAllowed().equals(futuresPriceVarianceAllowed);
    }

    public boolean modifyFuturesPriceVarianceAllowed() {

        return pricingAccordeon.setFuturesPriceVarianceAllowed(futuresPriceVarianceAllowed);
    }
    
    public boolean verifyPriceInversion() {

        return (pricingAccordeon.getPriceInversion() == priceInversion);
    }

    public boolean modifyPriceInversion() {

        return pricingAccordeon.setPriceInversion();
    }
    
    public boolean verifyCouponRate() {

        return pricingAccordeon.getCouponRate().equals(couponRate);
    }

    public boolean modifyCouponRate() {

        return pricingAccordeon.setCouponRate(couponRate);
    }
    
    public boolean verifyDaysInYear() {

        return pricingAccordeon.getDaysInYear().equals(daysInYear);
    }

    public boolean modifyDaysInYear() {

        return pricingAccordeon.setDaysInYear(daysInYear);
    }
    
    public boolean verifyDaysInTerm() {

        return pricingAccordeon.getDaysInTerm().equals(daysInTerm);
    }

    public boolean modifyDaysInTerm() {

        return pricingAccordeon.setDaysInTerm(daysInTerm);
    }
    
    public boolean verifyOptionsMinPriceFluctuation() {

        return pricingAccordeon.getOptionsMinPriceFluctuation().equals(optionsMinPriceFluctuation);
    }

    public boolean modifyOptionsMinPriceFluctuation() {

        return pricingAccordeon.setOptionsMinPriceFluctuation(optionsMinPriceFluctuation);
    }
    
    public boolean verifyOptionsTickBase() {

        return pricingAccordeon.getOptionsTickBase().equals(optionsTickBase);
    }

    public boolean modifyOptionsTickBase() {

        return pricingAccordeon.setOptionsTickBase(optionsTickBase);
    }
    
    public boolean verifyOptionsTickValue() {

        return pricingAccordeon.getOptionsTickValue().equals(optionsTickValue);
    }

    public boolean modifyOptionsTickValue() {

        return pricingAccordeon.setOptionsTickValue(optionsTickValue);
    }
    
    public boolean verifyOptionsPriceVarianceAllowed() {

        return pricingAccordeon.getOptionsPriceVarianceAllowed().equals(optionsPriceVarianceAllowed);
    }

    public boolean modifyOptionsPriceVarianceAllowed() {

        return pricingAccordeon.setOptionsPriceVarianceAllowed(optionsPriceVarianceAllowed);
    }
    
    public boolean verifyContractValCalcMethod() {

        return pricingAccordeon.getContractValCalcMethod().equals(contractValCalcMethod);
    }

    public boolean modifyContractValCalcMethod() {

        return pricingAccordeon.setContractValCalcMethod(contractValCalcMethod);
    }
    
    public boolean verifyNoOfYears() {

        return pricingAccordeon.getNoOfYears().equals(noOfYears);
    }

    public boolean modifyNoOfYears() {

        return pricingAccordeon.setNoOfYears(noOfYears);
    }
    
    public boolean verifyTermsPerYear() {

        return pricingAccordeon.getTermsPerYear().equals(termsPerYear);
    }

    public boolean modifyTermsPerYear() {

        return pricingAccordeon.setTermsPerYear(termsPerYear);
    }

    public boolean saveAndConfirm() {

        pricingAccordeon.clickBackToTop();
        pricingAccordeon.clickSave();
        return pricingAccordeon.clickConfirmYes();
    }

    public boolean authoriseChanges() {

        pricingAccordeon.clickBackToTop();
        return pricingAccordeon.clickAuthorise();
    }

    public boolean closeDriver() {
        
        return pricingAccordeon.closeWebDriver();
    }

    //setters section
    public void setFuturesMinPriceFluctuation(String futuresMinPriceFluctuation) {
        this.futuresMinPriceFluctuation = futuresMinPriceFluctuation;
    }

    public void setFuturesTickBase(String futuresTickBase) {
        this.futuresTickBase = futuresTickBase;
    }

    public void setFuturesTickValue(String futuresTickValue) {
        this.futuresTickValue = futuresTickValue;
    }

    public void setFuturesPriceVarianceAllowed(String futuresPriceVarianceAllowed) {
        this.futuresPriceVarianceAllowed = futuresPriceVarianceAllowed;
    }

    public void setPriceInversion(boolean priceInversion) {
        this.priceInversion = priceInversion;
    }

    public void setCouponRate(String couponRate) {
        this.couponRate = couponRate;
    }

    public void setDaysInYear(String daysInYear) {
        this.daysInYear = daysInYear;
    }

    public void setDaysInTerm(String daysInTerm) {
        this.daysInTerm = daysInTerm;
    }

    public void setOptionsMinPriceFluctuation(String optionsMinPriceFluctuation) {
        this.optionsMinPriceFluctuation = optionsMinPriceFluctuation;
    }

    public void setOptionsTickBase(String optionsTickBase) {
        this.optionsTickBase = optionsTickBase;
    }

    public void setOptionsTickValue(String optionsTickValue) {
        this.optionsTickValue = optionsTickValue;
    }

    public void setOptionsPriceVarianceAllowed(String optionsPriceVarianceAllowed) {
        this.optionsPriceVarianceAllowed = optionsPriceVarianceAllowed;
    }

    public void setContractValCalcMethod(String contractValCalcMethod) {
        this.contractValCalcMethod = contractValCalcMethod;
    }

    public void setNoOfYears(String noOfYears) {
        this.noOfYears = noOfYears;
    }

    public void setTermsPerYear(String termsPerYear) {
        this.termsPerYear = termsPerYear;
    }
}
