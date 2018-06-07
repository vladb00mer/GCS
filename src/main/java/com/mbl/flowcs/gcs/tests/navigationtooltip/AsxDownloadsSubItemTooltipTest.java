package com.mbl.flowcs.gcs.tests.navigationtooltip;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.extracts.AsxDownloadsSubItem;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class AsxDownloadsSubItemTooltipTest extends GcsGemsTest {

    private boolean moplTradeDownload;
    private boolean asxMarginRecDownload;

    private AsxDownloadsSubItem asxDownloadsSubItem;

    public void setTreeItem(String item) {

        if (item.equals("asxDownloads")) {
            setAsxDownloadsSubItem(new NavigationTree(getBrowser(), getResolution(), getUser()).goToExtractsItem().goToAsxDownloads());
        } else {
            setAsxDownloadsSubItem(null);
        }
    }

    // verificators
    public boolean verifyMOPLTradeDownload() {

        return (asxDownloadsSubItem.verifyMOPLTradeDownloadTooltip() == moplTradeDownload);
    }

    public boolean verifyASXMarginRecDownload() {

        return (asxDownloadsSubItem.verifyASXMarginRecDownloadTooltip() == asxMarginRecDownload);
    }

    // setters
    public void setMoplTradeDownload(boolean moplTradeDownload) {
        this.moplTradeDownload = moplTradeDownload;
    }

    public void setAsxMarginRecDownload(boolean asxMarginRecDownload) {
        this.asxMarginRecDownload = asxMarginRecDownload;
    }

    public void setAsxDownloadsSubItem(AsxDownloadsSubItem asxDownloadsSubItem) {
        this.asxDownloadsSubItem = asxDownloadsSubItem;
    }
}
