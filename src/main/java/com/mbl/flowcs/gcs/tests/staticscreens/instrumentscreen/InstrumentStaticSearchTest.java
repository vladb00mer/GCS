package com.mbl.flowcs.gcs.tests.staticscreens.instrumentscreen;

import com.mbl.flowcs.gcs.pages.staticpages.instrument.InstrumentStaticSearchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class InstrumentStaticSearchTest extends GcsGemsTest {

    private String market;
    private String search;
    private String in;

    private InstrumentStaticSearchPage instrumentStaticSearchPage;
    

    public void closeWebDriver() {

        instrumentStaticSearchPage.closeWebDriver();
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void setIn(String in) {
        this.in = in;
    }
}
