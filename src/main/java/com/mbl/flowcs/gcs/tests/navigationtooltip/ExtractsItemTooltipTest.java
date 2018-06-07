package com.mbl.flowcs.gcs.tests.navigationtooltip;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.extracts.ExtractsItem;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class ExtractsItemTooltipTest extends GcsGemsTest {

    private boolean reconciliations;
    private boolean asxDownloads;
    private boolean otherDownlooads;

    private ExtractsItem extractsItem;

    public void setTreeItem(String item) {

        if (item.equals("extracts")) {
            extractsItem = new NavigationTree(getBrowser(), getResolution(), getUser()).goToExtractsItem();
        } else {
            extractsItem = null;
        }
    }

    // verificators
    public boolean verifyReconciliations() {

        return (extractsItem.verifyReconciliationsTooltip() == reconciliations);
    }

    public boolean verifyAsxDownloads() {

        return (extractsItem.verifyAsxDownloadsTooltip() == asxDownloads);
    }

    public boolean verifyOtherDownloads() {

        return (extractsItem.verifyOtherDownloadsTooltip() == otherDownlooads);
    }

    // setters
    public void setReconciliations(boolean reconciliations) {
        this.reconciliations = reconciliations;
    }

    public void setAsxDownloads(boolean asxDownloads) {
        this.asxDownloads = asxDownloads;
    }

    public void setOtherDownlooads(boolean otherDownlooads) {
        this.otherDownlooads = otherDownlooads;
    }
}
