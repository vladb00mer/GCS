package com.mbl.flowcs.gcs.tests.common;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.common.TooltipPage;

/**
 *
 * @author vmurashov
 */

public class TooltipTest extends GcsGemsTest {

    private String tooltipType;
    private TooltipPage tooltipPage;
    
    private String header;
    private String status;
    private String accountType;
    private String superGroup;
    private String group;
    private String firm;
    private boolean segregated;
    private String groupStatic;
    private String groupEnquiry;
    private String superGroupStatic;
    private String clientDashboard;
    private String accountStatic;
    private String accountEnquiry;

    
    public void setClientAccount(String accountData) {

        tooltipPage = new NavigationTree(getBrowser(), getResolution(), getUser()).goToStaticItem().goToClientAccountSearch().openGroupTooltip(accountData);
    }

    public void setCollateral(String collateralData) {

        tooltipPage = new NavigationTree(getBrowser(), getResolution(), getUser()).goToPositionsItem().goToCollateralWorkbenchSearchPage().openTooltip(collateralData, tooltipType);
    }
    
    public boolean verifyHeader() {

        return tooltipPage.getTooltipHeader().contains(header);
    }

    public boolean verifyStatus() {

        return tooltipPage.getTooltipHeader().contains(status);
    }

    public boolean verifyAccountType() {

        return tooltipPage.getTooltipAccountType().equals(accountType);
    }

    public boolean verifySuperGroup() {

        return tooltipPage.getTooltipSuperGroup().equals(superGroup);
    }

    public boolean verifyFirm() {

        return tooltipPage.getTooltipFirm().equals(firm);
    }

    public boolean verifySegregated() {

        return tooltipPage.getTooltipSegregated() == (segregated);
    }

    public boolean verifyGroupStatic() {

        return tooltipPage.getTooltipGroupStatic().equals(groupStatic);
    }

    public boolean verifyGroup() {

        return tooltipPage.getTooltipGroup().equals(group);
    }

    public boolean verifyGroupEnquiry() {

        return tooltipPage.getTooltipGroupEnquiry().equals(groupEnquiry);
    }

    public boolean verifySuperGroupStatic() {

        return tooltipPage.getTooltipSuperGroupStatic().equals(superGroupStatic);
    }

    public boolean verifyClientDashboard() {

        return tooltipPage.getTooltipClientDashboard().equals(clientDashboard);
    }

    public boolean verifyAccountStatic() {

        return tooltipPage.getTooltipAccountStatic().equals(accountStatic);
    }

    public boolean verifyAccountEnquiry() {

        return tooltipPage.getTooltipAccountEnquiry().equals(accountEnquiry);
    }

    // setters section
    public void setHeader(String header) {
        this.header = header;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setSuperGroup(String superGroup) {
        this.superGroup = superGroup;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setSegregated(boolean segregated) {
        this.segregated = segregated;
    }

    public void setGroupStatic(String groupStatic) {
        this.groupStatic = groupStatic;
    }

    public void setGroupEnquiry(String groupEnquiry) {
        this.groupEnquiry = groupEnquiry;
    }

    public void setTooltipType(String tooltipType) {
        this.tooltipType = tooltipType;
    }

    public void setSuperGroupStatic(String superGroupStatic) {
        this.superGroupStatic = superGroupStatic;
    }

    public void setClientDashboard(String clientDashboard) {
        this.clientDashboard = clientDashboard;
    }

    public void setAccountStatic(String accountStatic) {
        this.accountStatic = accountStatic;
    }

    public void setAccountEnquiry(String accountEnquiry) {
        this.accountEnquiry = accountEnquiry;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
