package com.mbl.flowcs.gcs.tests.navigationtooltip;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.positions.PositionsItem;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class PositionsItemTooltipTest extends GcsGemsTest {

    private boolean positionWorkbench;
    private boolean newTrade;
    private boolean multipleTradeEntry;
    private boolean tradeBatchEnquiry;
    private boolean pendingTransactions;
    private boolean reverseSettlemens;
    private boolean reverseOptionAbEx;
    private boolean collateralWorkbench;
    private boolean optionExpiryLoad;
    private boolean closeoutImport;

    private PositionsItem positionsItem;

    public void setTreeItem(String item) {

        if (item.equals("positions")) {
            setPositionsItem(new NavigationTree(getBrowser(), getResolution(), getUser()).goToPositionsItem());
        } else {
            setPositionsItem(null);
        }
    }

    // verificators
    public boolean verifyPositionWorkbenchTooltip() {

        return (positionsItem.verifyPositionWorkbenchTooltip() == positionWorkbench);
    }

    public boolean verifyNewTradeTooltip() {

        return (positionsItem.verifyNewTradeTooltip() == newTrade);
    }

    public boolean verifyMultipleTradeEntryTooltip() {

        return (positionsItem.verifyMultipleTradeEntryTooltip() == multipleTradeEntry);
    }

    public boolean verifyTradeBatchEnquiryTooltip() {

        return (positionsItem.verifyTradeBatchEnquiryTooltip() == tradeBatchEnquiry);
    }

    public boolean verifyPendingTransactionsTooltip() {

        return (positionsItem.verifyPendingTransactionsTooltip() == pendingTransactions);
    }

    public boolean verifyReverseSettlemensTooltip() {

        return (positionsItem.verifyReverseSettlemensTooltip() == reverseSettlemens);
    }

    public boolean verifyReverseOptionAbExTooltip() {

        return (positionsItem.verifyReverseOptionAbExTooltip() == reverseOptionAbEx);
    }

    public boolean verifyCollateralWorkbenchTooltip() {

        return (positionsItem.verifyCollateralWorkbenchTooltip() == collateralWorkbench);
    }

    public boolean verifyOptionExpiryLoadTooltip() {

        return (positionsItem.verifyOptionExpiryLoadTooltip() == optionExpiryLoad);
    }

    public boolean verifyCloseoutImportTooltip() {

        return (positionsItem.verifyCloseoutImportTooltip() == closeoutImport);
    }

    // setters
    public void setPositionWorkbench(boolean positionWorkbench) {
        this.positionWorkbench = positionWorkbench;
    }

    public void setNewTrade(boolean newTrade) {
        this.newTrade = newTrade;
    }

    public void setMultipleTradeEntry(boolean multipleTradeEntry) {
        this.multipleTradeEntry = multipleTradeEntry;
    }

    public void setTradeBatchEnquiry(boolean tradeBatchEnquiry) {
        this.tradeBatchEnquiry = tradeBatchEnquiry;
    }

    public void setPendingTransactions(boolean pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }

    public void setReverseSettlemens(boolean reverseSettlemens) {
        this.reverseSettlemens = reverseSettlemens;
    }

    public void setReverseOptionAbEx(boolean reverseOptionAbEx) {
        this.reverseOptionAbEx = reverseOptionAbEx;
    }

    public void setCollateralWorkbench(boolean collateralWorkbench) {
        this.collateralWorkbench = collateralWorkbench;
    }

    public void setOptionExpiryLoad(boolean optionExpiryLoad) {
        this.optionExpiryLoad = optionExpiryLoad;
    }

    public void setCloseoutImport(boolean closeoutImport) {
        this.closeoutImport = closeoutImport;
    }

    public void setPositionsItem(PositionsItem positionsItem) {
        this.positionsItem = positionsItem;
    }
}
