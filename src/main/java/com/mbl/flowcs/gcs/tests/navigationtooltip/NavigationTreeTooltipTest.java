package com.mbl.flowcs.gcs.tests.navigationtooltip;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class NavigationTreeTooltipTest extends GcsGemsTest {

    private boolean dashboard;
    private boolean statik;
    private boolean interfaces;
    private boolean positions;
    private boolean journals;
    private boolean enquiry;
    private boolean reports;
    private boolean extracts;
    private boolean eodEom;

    private NavigationTree navigationTreePage;

    public void setTreeItem(String item) {

        if (item.equals("main")) {
            navigationTreePage = new NavigationTree(getBrowser(), getResolution(), getUser());
        } else {
            navigationTreePage = null;
        }
    }

    // verificators
    public boolean verifyDashboardTooltip() {

        return (navigationTreePage.verifyDashboardTooltip() == dashboard);
    }

    public boolean verifyStaticTooltip() {

        return (navigationTreePage.verifyStaticTooltip() == statik);
    }

    public boolean verifyInterfacesTooltip() {

        return (navigationTreePage.verifyInterfacesTooltip() == interfaces);
    }

    public boolean verifyPositionsTooltip() {

        return (navigationTreePage.verifyPositionsTooltip() == positions);
    }

    public boolean verifyJournalsTooltip() {

        return (navigationTreePage.verifyJournalsTooltip() == journals);
    }

    public boolean verifyEnquiryTooltip() {

        return (navigationTreePage.verifyJournalsTooltip() == enquiry);
    }

    public boolean verifyReportsTooltip() {

        return (navigationTreePage.verifyReportsTooltip() == reports);
    }

    public boolean verifyExtractsTooltip() {

        return (navigationTreePage.verifyExtractsTooltip() == extracts);
    }

    public boolean verifyEodEomTooltip() {

        return (navigationTreePage.verifyEodEomTooltip() == eodEom);
    }

    // setters section
    public void setDashboard(boolean dashboard) {
        this.dashboard = dashboard;
    }

    public void setStatik(boolean statik) {
        this.statik = statik;
    }

    public void setInterfaces(boolean interfaces) {
        this.interfaces = interfaces;
    }

    public void setPositions(boolean positions) {
        this.positions = positions;
    }

    public void setJournals(boolean journals) {
        this.journals = journals;
    }

    public void setEnquiry(boolean enquiry) {
        this.enquiry = enquiry;
    }

    public void setReports(boolean reports) {
        this.reports = reports;
    }

    public void setExtracts(boolean extracts) {
        this.extracts = extracts;
    }

    public void setEodEom(boolean eodEom) {
        this.eodEom = eodEom;
    }
}
