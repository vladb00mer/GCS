package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.ComissionTabPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class ComissionTabPageTest extends GcsGemsTest {
    
    private ComissionTabPage comissionTabPage;
    
    private String futuresFull;
    private String futuresDayTrade;
    private String futuresMandSett;
    private String futuresNFA;
    private String futuresFee1;
    private String futuresFee2;
    private String futuresFee3;
    private String futuresFee4;
    private String futuresFee5;
    private String futuresFee6;
    private String futuresFee7;
    private String futuresFee8;
    private String futuresFee9;
    private String futuresFee10;
    private String optionsFull;
    private String optionsDayTrade;
    private String optionsAssign;
    private String optionsAbandon;
    private String optionsFee1;
    private String optionsFee2;
    private String optionsFee3;
    private String optionsFee4;
    private String optionsFee5;
    private String optionsFee6;
    private String optionsFee7;
    private String optionsFee8;
    private String optionsFee9;
    private String optionsFee10;
    private String venue1;
    private String venue2;
    private String venue3;
    private String venue4;
    private String venue5;
    private String venue6;
    private String venue7;
    private String venue8;
    private String venue9;
    private String venue10;
    
    
    //page opening
    public void setComissionTabPage(String search) {

        comissionTabPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem().goToMaster()
                .findInstrumentStatic(search)
                .goToComissionTab();
    }
    
    // Futures
    public boolean verifyFuturesFull() {

        return comissionTabPage.getFuturesFull().equals(futuresFull);
    }

    public boolean modifyFuturesFull() {

        return comissionTabPage.setFuturesFull(futuresFull);
    }
    
    public boolean verifyFuturesDayTrade() {

        return comissionTabPage.getFuturesDayTrade().equals(futuresDayTrade);
    }

    public boolean modifyFuturesDayTrade() {

        return comissionTabPage.setFuturesDayTrade(futuresDayTrade);
    }
    
    public boolean verifyMandSett() {

        return comissionTabPage.getMandSett().equals(futuresMandSett);
    }

    public boolean modifyMandSett() {

        return comissionTabPage.setMandSett(futuresMandSett);
    }
    
    public boolean verifyNFA() {

        return comissionTabPage.getNFA().equals(futuresNFA);
    }

    public boolean modifyNFA() {

        return comissionTabPage.setNFA(futuresNFA);
    }
    
    public boolean verifyFuturesFee1() {

        return comissionTabPage.getFuturesFee1().equals(futuresFee1);
    }

    public boolean modifyFuturesFee1() {

        return comissionTabPage.setFuturesFee1(futuresFee1);
    }
    
    public boolean verifyFuturesFee2() {

        return comissionTabPage.getFuturesFee2().equals(futuresFee2);
    }

    public boolean modifyFuturesFee2() {

        return comissionTabPage.setFuturesFee2(futuresFee2);
    }
    
    public boolean verifyFuturesFee3() {

        return comissionTabPage.getFuturesFee3().equals(futuresFee3);
    }

    public boolean modifyFuturesFee3() {

        return comissionTabPage.setFuturesFee3(futuresFee3);
    }
    
    public boolean verifyFuturesFee4() {

        return comissionTabPage.getFuturesFee4().equals(futuresFee4);
    }

    public boolean modifyFuturesFee4() {

        return comissionTabPage.setFuturesFee4(futuresFee4);
    }
    
    public boolean verifyFuturesFee5() {

        return comissionTabPage.getFuturesFee5().equals(futuresFee5);
    }

    public boolean modifyFuturesFee5() {

        return comissionTabPage.setFuturesFee5(futuresFee5);
    }
    
    public boolean verifyFuturesFee6() {

        return comissionTabPage.getFuturesFee6().equals(futuresFee6);
    }

    public boolean modifyFuturesFee6() {

        return comissionTabPage.setFuturesFee6(futuresFee6);
    }
    
    public boolean verifyFuturesFee7() {

        return comissionTabPage.getFuturesFee7().equals(futuresFee7);
    }

    public boolean modifyFuturesFee7() {

        return comissionTabPage.setFuturesFee7(futuresFee7);
    }
    
    public boolean verifyFuturesFee8() {

        return comissionTabPage.getFuturesFee8().equals(futuresFee8);
    }

    public boolean modifyFuturesFee8() {

        return comissionTabPage.setFuturesFee8(futuresFee8);
    }
    
    public boolean verifyFuturesFee9() {

        return comissionTabPage.getFuturesFee9().equals(futuresFee9);
    }

    public boolean modifyFuturesFee9() {

        return comissionTabPage.setFuturesFee9(futuresFee9);
    }
    
    public boolean verifyFuturesFee10() {

        return comissionTabPage.getFuturesFee10().equals(futuresFee10);
    }

    public boolean modifyFuturesFee10() {

        return comissionTabPage.setFuturesFee10(futuresFee10);
    }
    
    // Options
    public boolean verifyOptionsFull() {

        return comissionTabPage.getOptionsFull().equals(optionsFull);
    }

    public boolean modifyOptionsFull() {

        return comissionTabPage.setOptionsFull(optionsFull);
    }
    
    public boolean verifyOptionsDayTrade() {

        return comissionTabPage.getOptionsDayTrade().equals(optionsDayTrade);
    }

    public boolean modifyOptionsDayTrade() {

        return comissionTabPage.setOptionsDayTrade(optionsDayTrade);
    }
    
    public boolean verifyAssign() {

        return comissionTabPage.getOptionsAssign().equals(optionsAssign);
    }

    public boolean modifyAssign() {

        return comissionTabPage.setOptionsAssign(optionsAssign);
    }
    
    public boolean verifyAbandon() {

        return comissionTabPage.getOptionsAbandon().equals(optionsAbandon);
    }

    public boolean modifyAbandon() {

        return comissionTabPage.setOptionsAbandon(optionsAbandon);
    }
    
    public boolean verifyOptionsFee1() {

        return comissionTabPage.getOptionsFee1().equals(optionsFee1);
    }

    public boolean modifyOptionsFee1() {

        return comissionTabPage.setOptionsFee1(optionsFee1);
    }
    
    public boolean verifyOptionsFee2() {

        return comissionTabPage.getOptionsFee2().equals(optionsFee2);
    }

    public boolean modifyOptionsFee2() {

        return comissionTabPage.setOptionsFee2(optionsFee2);
    }
    
    public boolean verifyOptionsFee3() {

        return comissionTabPage.getOptionsFee3().equals(optionsFee3);
    }

    public boolean modifyOptionsFee3() {

        return comissionTabPage.setOptionsFee3(optionsFee3);
    }
    
    public boolean verifyOptionsFee4() {

        return comissionTabPage.getOptionsFee4().equals(optionsFee4);
    }

    public boolean modifyOptionsFee4() {

        return comissionTabPage.setOptionsFee4(optionsFee4);
    }
    
    public boolean verifyOptionsFee5() {

        return comissionTabPage.getOptionsFee5().equals(optionsFee5);
    }

    public boolean modifyOptionsFee5() {

        return comissionTabPage.setOptionsFee5(optionsFee5);
    }
    
    public boolean verifyOptionsFee6() {

        return comissionTabPage.getOptionsFee6().equals(optionsFee6);
    }

    public boolean modifyOptionsFee6() {

        return comissionTabPage.setOptionsFee6(optionsFee6);
    }
    
    public boolean verifyOptionsFee7() {

        return comissionTabPage.getOptionsFee7().equals(optionsFee7);
    }

    public boolean modifyOptionsFee7() {

        return comissionTabPage.setOptionsFee7(optionsFee7);
    }
    
    public boolean verifyOptionsFee8() {

        return comissionTabPage.getOptionsFee8().equals(optionsFee8);
    }

    public boolean modifyOptionsFee8() {

        return comissionTabPage.setOptionsFee8(optionsFee8);
    }
    
    public boolean verifyOptionsFee9() {

        return comissionTabPage.getOptionsFee9().equals(optionsFee9);
    }

    public boolean modifyOptionsFee9() {

        return comissionTabPage.setOptionsFee9(optionsFee9);
    }
    
    public boolean verifyOptionsFee10() {

        return comissionTabPage.getOptionsFee10().equals(optionsFee10);
    }

    public boolean modifyOptionsFee10() {

        return comissionTabPage.setOptionsFee10(optionsFee10);
    }
    
    // Venue
    public boolean verifyVenue1() {

        return comissionTabPage.getVenue1().equals(venue1);
    }

    public boolean modifyVenue1() {

        return comissionTabPage.setVenue1(venue1);
    }
    
    public boolean verifyVenue2() {

        return comissionTabPage.getVenue2().equals(venue2);
    }

    public boolean modifyVenue2() {

        return comissionTabPage.setVenue2(venue2);
    }
    
    public boolean verifyVenue3() {

        return comissionTabPage.getVenue3().equals(venue3);
    }

    public boolean modifyVenue3() {

        return comissionTabPage.setVenue3(venue3);
    }
    
    public boolean verifyVenue4() {

        return comissionTabPage.getVenue4().equals(venue4);
    }

    public boolean modifyVenue4() {

        return comissionTabPage.setVenue4(venue4);
    }
    
    public boolean verifyVenue5() {

        return comissionTabPage.getVenue5().equals(venue5);
    }

    public boolean modifyVenue5() {

        return comissionTabPage.setVenue5(venue5);
    }
    
    public boolean verifyVenue6() {

        return comissionTabPage.getVenue6().equals(venue6);
    }

    public boolean modifyVenue6() {

        return comissionTabPage.setVenue6(venue6);
    }
    
    public boolean verifyVenue7() {

        return comissionTabPage.getVenue7().equals(venue7);
    }

    public boolean modifyVenue7() {

        return comissionTabPage.setVenue7(venue7);
    }
    
    public boolean verifyVenue8() {

        return comissionTabPage.getVenue8().equals(venue8);
    }

    public boolean modifyVenue8() {

        return comissionTabPage.setVenue8(venue8);
    }
    
    public boolean verifyVenue9() {

        return comissionTabPage.getVenue9().equals(venue9);
    }

    public boolean modifyVenue9() {

        return comissionTabPage.setVenue9(venue9);
    }
    
    public boolean verifyVenue10() {

        return comissionTabPage.getVenue10().equals(venue10);
    }

    public boolean modifyVenue10() {

        return comissionTabPage.setVenue10(venue10);
    }

    public boolean saveChanges() {

        return comissionTabPage.clickSave();
    }

    public boolean authoriseChanges() {

        return comissionTabPage.clickAuthorise();
    }
    
    public boolean closeWebDriver() {

        return comissionTabPage.closeWebDriver();
    }
   
    // Setters
    public void setFuturesFull(String futuresFull) {
        this.futuresFull = futuresFull;
    }
    public void setFuturesDayTrade(String futuresDayTrade) {
        this.futuresDayTrade = futuresDayTrade;
    }
    public void setFuturesMandSett(String futuresMandSett) {
        this.futuresMandSett = futuresMandSett;
    }
    public void setFuturesNFA(String futuresNFA) {
        this.futuresNFA = futuresNFA;
    }
    public void setFuturesFee1(String futuresFee1) {
        this.futuresFee1 = futuresFee1;
    }
    public void setFuturesFee2(String futuresFee2) {
        this.futuresFee2 = futuresFee2;
    }
    public void setFuturesFee3(String futuresFee3) {
        this.futuresFee3 = futuresFee3;
    }
    public void setFuturesFee4(String futuresFee4) {
        this.futuresFee4 = futuresFee4;
    }
    public void setFuturesFee5(String futuresFee5) {
        this.futuresFee5 = futuresFee5;
    }
    public void setFuturesFee6(String futuresFee6) {
        this.futuresFee6 = futuresFee6;
    }
    public void setFuturesFee7(String futuresFee7) {
        this.futuresFee7 = futuresFee7;
    }
    public void setFuturesFee8(String futuresFee8) {
        this.futuresFee8 = futuresFee8;
    }
    public void setFuturesFee9(String futuresFee9) {
        this.futuresFee9 = futuresFee9;
    }
    public void setFuturesFee10(String futuresFee10) {
        this.futuresFee10 = futuresFee10;
    }
    public void setOptionsFull(String optionsFull) {
        this.optionsFull = optionsFull;
    }
    public void setOptionsDayTrade(String optionsDayTrade) {
        this.optionsDayTrade = optionsDayTrade;
    }
    public void setOptionsAssign(String optionsAssign) {
        this.optionsAssign = optionsAssign;
    }
    public void setOptionsAbandon(String optionsAbandon) {
        this.optionsAbandon = optionsAbandon;
    }
    public void setOptionsFee1(String optionsFee1) {
        this.optionsFee1 = optionsFee1;
    }
    public void setOptionsFee2(String optionsFee2) {
        this.optionsFee2 = optionsFee2;
    }
    public void setOptionsFee3(String optionsFee3) {
        this.optionsFee3 = optionsFee3;
    }
    public void setOptionsFee4(String optionsFee4) {
        this.optionsFee4 = optionsFee4;
    }
    public void setOptionsFee5(String optionsFee5) {
        this.optionsFee5 = optionsFee5;
    }
    public void setOptionsFee6(String optionsFee6) {
        this.optionsFee6 = optionsFee6;
    }
    public void setOptionsFee7(String optionsFee7) {
        this.optionsFee7 = optionsFee7;
    }
    public void setOptionsFee8(String optionsFee8) {
        this.optionsFee8 = optionsFee8;
    }
    public void setOptionsFee9(String optionsFee9) {
        this.optionsFee9 = optionsFee9;
    }
    public void setOptionsFee10(String optionsFee10) {
        this.optionsFee10 = optionsFee10;
    }
    public void setVenue1(String venue1) {
        this.venue1 = venue1;
    }
    public void setVenue2(String venue2) {
        this.venue2 = venue2;
    }
    public void setVenue3(String venue3) {
        this.venue3 = venue3;
    }
    public void setVenue4(String venue4) {
        this.venue4 = venue4;
    }
    public void setVenue5(String venue5) {
        this.venue5 = venue5;
    }
    public void setVenue6(String venue6) {
        this.venue6 = venue6;
    }
    public void setVenue7(String venue7) {
        this.venue7 = venue7;
    }
    public void setVenue8(String venue8) {
        this.venue8 = venue8;
    }
    public void setVenue9(String venue9) {
        this.venue9 = venue9;
    }
    public void setVenue10(String venue10) {
        this.venue10 = venue10;
    }    
}
