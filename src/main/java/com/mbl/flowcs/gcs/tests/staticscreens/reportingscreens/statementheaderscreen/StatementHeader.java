package com.mbl.flowcs.gcs.tests.staticscreens.reportingscreens.statementheaderscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.reporting.StatementHeaderSearchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 * @author lev boichenko
 */

public class StatementHeader extends GcsGemsTest {

    private StatementHeaderSearchPage statementHeaderSearchPage;
    private String stHeaderTittle;
    private String stHeaderSelector;
    private String stHeaderValue;
    private String addressValue;
    private String successMessage;
    private String iconStatusColor;
    private String stHeaderView;
    private String rejectMessage;
    private String approveMessage;
    private String logoValue;



    //** Page Opening **//

    public void setStatementHeaderSearchPage(String search){

        statementHeaderSearchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToReportingSubItem().goToStatementHeader();
    }

    public String checkStHeaderTittle(){

        return statementHeaderSearchPage.getStHeaderTittle(stHeaderTittle);
    }

    public String checkStHeaderSelector(){

        return statementHeaderSearchPage.getStHeaderSelector(stHeaderSelector);
    }

    public boolean checkNewStHeaderBtn(){

        return statementHeaderSearchPage.setNewStHeaderBtn();
    }

    public boolean clickNewStHeader(){

        return statementHeaderSearchPage.setNewStHeader();
    }

    public boolean inputStHeader(){

        return statementHeaderSearchPage.setStHeader(stHeaderValue);
    }

    public boolean inputAddress(){

        return statementHeaderSearchPage.setAddress(addressValue);
    }

    public String checkAddress(){

        return statementHeaderSearchPage.getAddress(addressValue);
    }

    public boolean clickSaveButton(){

        return statementHeaderSearchPage.setClickSaveButton();
    }

    public String checkSuccessMessage(){

        return statementHeaderSearchPage.getSuccessMessage(successMessage);
    }

    public String checkStHeaderStatus(){

        return statementHeaderSearchPage.getStHeaderStatus(iconStatusColor);
    }

    public String checkStHeader(){

        return statementHeaderSearchPage.getStHeader(stHeaderView);
    }

    public boolean refreshPage(){

        return statementHeaderSearchPage.setRefreshPage();
    }

    public boolean clickStHeaderBC(){

        return statementHeaderSearchPage.setStHeaderBC();
    }

    public boolean selectStHeaderRecord(){

        return statementHeaderSearchPage.getStHeaderRecord(stHeaderValue);
    }

    public boolean clickBackLink() {

        return statementHeaderSearchPage.setBackLink();
    }

    public boolean clickRejectBtn() {

        return statementHeaderSearchPage.setRejectBtn();
    }

    public String checkRejectMessage() {

        return statementHeaderSearchPage.getRejectMessage(rejectMessage);
    }

    public String checkAddressPending(){

        return statementHeaderSearchPage.getAddressPending(addressValue);
    }

    public boolean clickAuthoriseBtn() {

        return statementHeaderSearchPage.setAuthoriseBtn();
    }

    public String checkApproveMessage(){

        return statementHeaderSearchPage.getApproveMessage(approveMessage);
    }

    public boolean applyPrintLogo(){

        return statementHeaderSearchPage.setPrintLogo();
    }

    public boolean applyWideLogo(){

        return statementHeaderSearchPage.setWideLogo();
    }

    public boolean  selectLogoToUse(){

        return statementHeaderSearchPage.getLogoToUse(logoValue);
    }

    public String checkLogo(){

        return statementHeaderSearchPage.getLogo(logoValue);
    }

    public boolean closeDriver() {

        return statementHeaderSearchPage.closeWebDriver();
    }

    //** SETTERS **//

    public void setStHeaderTittle(String stHeaderTittle){
        this.stHeaderTittle = stHeaderTittle;
    }

    public void setStHeaderSelector(String stHeaderSelector){
        this.stHeaderSelector = stHeaderSelector;
    }

    public void setStHeaderValue(String stHeaderValue){
        this.stHeaderValue = stHeaderValue;
    }

    public void setAddressValue(String addressValue){
        this.addressValue = addressValue;
    }

    public void setSuccessMessage(String successMessage){
        this.successMessage = successMessage;
    }

    public void setIconStatusColor(String iconStatusColor){
        this.iconStatusColor = iconStatusColor;
    }

    public void setStHeaderView(String stHeaderView){
        this.stHeaderView = stHeaderView;
    }

    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
    }

    public void setApproveMessage(String approveMessage) {
        this.approveMessage = approveMessage;
    }

    public void setLogoValue(String logoValue) {
        this.logoValue = logoValue;
    }

}
