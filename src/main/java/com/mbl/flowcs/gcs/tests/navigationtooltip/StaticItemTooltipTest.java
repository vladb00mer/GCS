package com.mbl.flowcs.gcs.tests.navigationtooltip;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.StaticItem;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class StaticItemTooltipTest extends GcsGemsTest {

    private boolean clientAccount;
    private boolean brokerAccount;
    private boolean group;
    private boolean superGroup;
    private boolean clearingFirm;
    private boolean comissionBrowser;
    private boolean interest;
    private boolean collateral;
    private boolean LtrAccountOverride;
    private boolean accountClosureWorkbench;
    private boolean marketZone;
    private boolean market;
    private boolean instrument;
    private boolean asxCodeMaintenance;
    private boolean reporting;
    private boolean tradeFeed;
    private boolean currency;
    private boolean taxation;
    private boolean gL4Interface;
    private boolean risk;
    private boolean codeSet;
    private boolean margin;

    private StaticItem staticItem;

    public void setTreeItem(String item) {

        if (item.equals("static")) {
            staticItem = new NavigationTree(getBrowser(), getResolution(), getUser()).goToStaticItem();
        } else {
            staticItem = null;
        }
    }

    // veriificators
    public boolean verifyClientAccount() {

        return (staticItem.verifyClientAccountTooltip() == clientAccount);
    }

    public boolean verifyBrokerAccount() {

        return (staticItem.verifyBrokerAccountTooltip() == brokerAccount);
    }

    public boolean verifyGroup() {

        return (staticItem.verifyGroupTooltip() == group);
    }

    public boolean verifySupergroup() {

        return (staticItem.verifySupergroupTooltip() == superGroup);
    }

    public boolean verifyClearingFirm() {

        return (staticItem.verifyClearingFirmTooltip() == clearingFirm);
    }

    public boolean verifyComissionBrowser() {

        return (staticItem.verifyComissionBrowserTooltip() == comissionBrowser);
    }

    public boolean verifyInterest() {

        return (staticItem.verifyInterestTooltip() == interest);
    }

    public boolean verifyCollateral() {

        return (staticItem.verifyCollateralTooltip() == collateral);
    }

    public boolean verifyLTRAccountOverride() {

        return (staticItem.verifyLTRAccountOverrideTooltip() == LtrAccountOverride);
    }

    public boolean verifyAccountClosureWorkbench() {

        return (staticItem.verifyAccountClosureWorkbenchTooltip() == accountClosureWorkbench);
    }

    public boolean verifyMarketZone() {

        return (staticItem.verifyMarketZoneTooltip() == marketZone);
    }

    public boolean verifyMarket() {

        return (staticItem.verifyMarketTooltip() == market);
    }

    public boolean verifyInstrument() {

        return (staticItem.verifyInstrumentTooltip() == instrument);
    }

    public boolean verifyASXCodeMaintenance() {

        return (staticItem.verifyASXCodeMaintenanceTooltip() == asxCodeMaintenance);
    }

    public boolean verifyReporting() {

        return (staticItem.verifyReportingTooltip() == reporting);
    }

    public boolean verifyTradeFeed() {

        return (staticItem.verifyTradeFeedTooltip() == tradeFeed);
    }

    public boolean verifyCurrency() {

        return (staticItem.verifyCurrencyTooltip() == currency);
    }

    public boolean verifyTaxation() {

        return (staticItem.verifyTaxationTooltip() == taxation);
    }

    public boolean verifyGL4Interface() {

        return (staticItem.verifyGL4InterfaceTooltip() == gL4Interface);
    }

    public boolean verifyRisk() {

        return (staticItem.verifyRiskTooltip() == risk);
    }

    public boolean verifyCodeSet() {

        return (staticItem.verifyCodeSetTooltip() == codeSet);
    }

    public boolean verifyMargin() {

        return (staticItem.verifyMarginTooltip() == margin);
    }

    // setters
    public void setClientAccount(boolean clientAccount) {
        this.clientAccount = clientAccount;
    }

    public void setBrokerAccount(boolean brokerAccount) {
        this.brokerAccount = brokerAccount;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public void setSuperGroup(boolean superGroup) {
        this.superGroup = superGroup;
    }

    public void setClearingFirm(boolean clearingFirm) {
        this.clearingFirm = clearingFirm;
    }

    public void setComissionBrowser(boolean comissionBrowser) {
        this.comissionBrowser = comissionBrowser;
    }

    public void setInterest(boolean interest) {
        this.interest = interest;
    }

    public void setCollateral(boolean collateral) {
        this.collateral = collateral;
    }

    public void setLtrAccountOverride(boolean LtrAccountOverride) {
        this.LtrAccountOverride = LtrAccountOverride;
    }

    public void setAccountClosureWorkbench(boolean accountClosureWorkbench) {
        this.accountClosureWorkbench = accountClosureWorkbench;
    }

    public void setMarketZone(boolean marketZone) {
        this.marketZone = marketZone;
    }

    public void setMarket(boolean market) {
        this.market = market;
    }

    public void setInstrument(boolean instrument) {
        this.instrument = instrument;
    }

    public void setAsxCodeMaintenance(boolean asxCodeMaintenance) {
        this.asxCodeMaintenance = asxCodeMaintenance;
    }

    public void setReporting(boolean reporting) {
        this.reporting = reporting;
    }

    public void setTradeFeed(boolean tradeFeed) {
        this.tradeFeed = tradeFeed;
    }

    public void setCurrency(boolean currency) {
        this.currency = currency;
    }

    public void setTaxation(boolean taxation) {
        this.taxation = taxation;
    }

    public void setGL4Interface(boolean gL4Interface) {
        this.gL4Interface = gL4Interface;
    }

    public void setRisk(boolean risk) {
        this.risk = risk;
    }

    public void setCodeSet(boolean codeSet) {
        this.codeSet = codeSet;
    }

    public void setMargin(boolean margin) {
        this.margin = margin;
    }
}
