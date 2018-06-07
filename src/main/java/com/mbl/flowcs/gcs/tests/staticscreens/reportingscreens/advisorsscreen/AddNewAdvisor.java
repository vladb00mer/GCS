package com.mbl.flowcs.gcs.tests.staticscreens.reportingscreens.advisorsscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.reporting.AdvisorsSearchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 * @author lev boichenko
 */

public class AddNewAdvisor extends GcsGemsTest {

    private AdvisorsSearchPage advisorsSearchPage;
    private String advisorCodeValue;
    private String advisorNameValue;
    private String successMessage;
    private String rejectMessage;
    private String approveMessage;
    private String selectedAdviserValue;
    private String advisorViewCodeValue;
    private String advisorValue;
    private String iconStatusColor;
    private String previousValue;
    private String messageDescription;


    //** Page Opening **//

    public void setAdvisorsSearchPage(String search) {

        advisorsSearchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToReportingSubItem().goToAdvisors();
    }

    public boolean clickNewAdviserButton(){

        return advisorsSearchPage.setClickNewAdviserButton();
    }

    public boolean inputAdvisorCode() {

        return advisorsSearchPage.setAdvisorCode(advisorCodeValue);
    }

    public boolean inputAdvisorName() {

        return advisorsSearchPage.setAdvisorName(advisorNameValue);
    }

    public boolean clickSaveButton(){

        return advisorsSearchPage.setClickSaveButton();
    }

    public String checkSuccessMessage(){

        return advisorsSearchPage.getSuccessMessage(successMessage);
    }

    public String checkRejectMessage() {

        return advisorsSearchPage.getRejectMessage(rejectMessage);
    }

    public String checkApproveMessage(){

        return advisorsSearchPage.getApproveMessage(approveMessage);
    }

    public String checkMessageDescription(){

        return advisorsSearchPage.getMessageDescription(messageDescription);
    }

    public String checkSelectedAdviser(){

        return advisorsSearchPage.getSelectedAdviser(selectedAdviserValue);
    }

    public String checkAdviserStatus(){

        return advisorsSearchPage.getAdviserStatus(iconStatusColor);
    }

    public String checkAdvisorCodeValue(){

        return advisorsSearchPage.getAdvisorViewCodeValue(advisorViewCodeValue);
    }

    public String checkAdvisorNameValue(){

        return advisorsSearchPage.getAdvisorNameValue(advisorNameValue);
    }

    public String checkAdvisorNameValueView(){

        return advisorsSearchPage.getAdvisorNameValueView(advisorNameValue);
    }

    public boolean refreshPage(){

        return advisorsSearchPage.setRefreshPage();
    }

    public boolean chromeReloadPopUp(){

        return advisorsSearchPage.setReloadPopUp();
    }

    public boolean clickAdvisersBC(){

        return advisorsSearchPage.setAdvisersBC();
    }

    public boolean selectAdvisor(){

        return advisorsSearchPage.getAdvisor(advisorValue);
    }

    public boolean clickBackLink() {

        return advisorsSearchPage.setBackLink();
    }

    public boolean clickRejectBtn() {

        return advisorsSearchPage.setRejectBtn();
    }

    public boolean clickAuthoriseBtn() {

        return advisorsSearchPage.setAuthoriseBtn();
    }

    public boolean clickInactiveIcon() {

        return advisorsSearchPage.setInactiveIcon();
    }

    public boolean displayActiveIcon(){

        return advisorsSearchPage.setDisplayActiveIcon();
    }

    public boolean displayRevertButton(){

        return advisorsSearchPage.setRevertButton();
    }

    public String checkPreviousValue(){

        return advisorsSearchPage.getPreviousValue(previousValue);
    }

    public boolean closeDriver() {

        return advisorsSearchPage.closeWebDriver();
    }

    //** SETTERS **//

    public void setAdvisorCodeValue(String advisorCodeValue){
        this.advisorCodeValue = advisorCodeValue;
    }

    public void setAdvisorNameValue(String advisorNameValue){
        this.advisorNameValue = advisorNameValue;
    }

    public void setSuccessMessage(String successMessage){
        this.successMessage = successMessage;
    }

    public void setApproveMessage(String approveMessage) {
        this.approveMessage = approveMessage;
    }

    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
    }

    public void setSelectedAdviserValue(String selectedAdviserValue){
        this.selectedAdviserValue = selectedAdviserValue;
    }

    public void setAdvisorViewCodeValue(String advisorViewCodeValue){
        this.advisorViewCodeValue = advisorViewCodeValue;
    }

    public void setAdvisorValue(String advisorValue){
        this.advisorValue = advisorValue;
    }

    public void setIconStatusColor(String iconStatusColor){
        this.iconStatusColor = iconStatusColor;
    }

    public void setPreviousValue(String previousValue) {
        this.previousValue = previousValue;
    }

    public void setMessageDescription(String messageDescription){
        this.messageDescription = messageDescription;
    }
}
