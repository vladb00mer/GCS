package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import org.openqa.selenium.StaleElementReferenceException;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.MarketDataTabPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */
public class MarketDataTabTest extends GcsGemsTest {

    private MarketDataTabPage marketDataTab;

    private String marketDataSource;
    private String futuresCode;
    private String optionCode;
    private String futuresPriceScale;
    private String optionsPriceScale;
    private String strikePriceScale;
    private String futuresCodeFormat;
    private String optionsCodeFormat;
    private String strikeDecimals;
    private String strikeRouding;
    private String instrumentTypeCode;
    private String preferedFuturesPriceField;
    private String preferedOptionsPriceField;

    private int index;

    //page opening
    public void setMarketDataTab(String search) {

        marketDataTab = new NavigationTree(getBrowser(), getResolution(), getUser())
            .goToStaticItem()
            .goToInstrumentSubItem().goToMaster()
            .findInstrumentStatic(search)
            .goToMarketDataTab();
    }

    public boolean verifyInstrumentCode() {

        return marketDataTab.getMarketDataSource(index).equals(marketDataSource);
    }

    public boolean verifyFuturesCode() {

        return marketDataTab.getFuturesCode(index).equals(futuresCode);
    }

    public boolean verifyOptionCode() {

        return marketDataTab.getOptionCode(index).equals(optionCode);
    }

    public boolean verifyFuturesPriceScale() {

        return marketDataTab.getFuturesPriceScale(index).equals(futuresPriceScale);
    }

    public boolean modifyFuturesPriceScale() {

        return marketDataTab.setFuturesPriceScale(index, futuresPriceScale);
    }

    public boolean verifyOptionsPriceScale() {

        return marketDataTab.getOptionsPriceScale(index).equals(optionsPriceScale);
    }

    public boolean modifyOptionsPriceScale() {

        return marketDataTab.setOptionsPriceScale(index, optionsPriceScale);
    }

    public boolean verifyStrikePriceScale() {

        return marketDataTab.getStrikePriceScale(index).equals(strikePriceScale);
    }

    public boolean modifyStrikePriceScale() {

        return marketDataTab.setStrikePriceScale(index, strikePriceScale);
    }

    public boolean verifyFuturesCodeFormat() {

        return marketDataTab.getFuturesCodeFormat(index).equals(futuresCodeFormat);
    }

    public boolean modifyFuturesCodeFormat() {

        return marketDataTab.setFuturesCodeFormat(index, futuresCodeFormat);
    }

    public boolean verifyOptionsCodeFormat() {

        return marketDataTab.getOptionsCodeFormat(index).equals(optionsCodeFormat);
    }

    public boolean modifyOptionsCodeFormat() {

        return marketDataTab.setOptionsCodeFormat(index, optionsCodeFormat);
    }

    public boolean verifyStrikeDecimals() {

        return marketDataTab.getStrikeDecimals(index).equals(strikeDecimals);
    }

    public boolean modifyStrikeDecimals() {

        return marketDataTab.setStrikeDecimals(index, strikeDecimals);
    }

    public boolean verifyStrikeRounding() {

        return marketDataTab.getStrikeRounding(index).equals(strikeRouding);
    }

    public boolean modifyStrikeRounding() {

        return marketDataTab.setStrikeRounding(index, strikeRouding);
    }

    public boolean verifyInstrumentTypeCode() {

        return marketDataTab.getInstrumentTypeCode(index).equals(instrumentTypeCode);
    }

    public boolean modifyInstrumentTypeCode() {

        return marketDataTab.setInstrumentTypeCode(index, instrumentTypeCode);
    }

    public boolean verifyPreferedFuturesPriceField() {

        return marketDataTab.getPreferedFuturesPriceField(index).equals(preferedFuturesPriceField);
    }

    public boolean modifyPreferedFuturesPriceField() {

        marketDataTab.setPreferedFuturesPriceField(index, preferedFuturesPriceField);
        return true;
    }

    public boolean verifyPreferedOptionsPriceField() {

        return marketDataTab.getPreferedOptionsPriceField(index).equals(preferedOptionsPriceField);
    }

    public boolean modifyPreferedOptionsPriceField() {

        marketDataTab.setPreferedOptionsPriceField(index, preferedOptionsPriceField);
        return true;
    }

    public boolean closeDriver() {

        return marketDataTab.closeWebDriver();
    }

    public boolean saveAndConfirm() {

        marketDataTab.clickSave();
        return marketDataTab.clickConfirmYes();
    }

    public boolean rejectAndConfirm() {

        marketDataTab.clickReject();
        return marketDataTab.clickConfirmYes();
    }
    
    public boolean clickSave() {

        return marketDataTab.clickSave();
    }

    public boolean authoriseChanges() {

        return marketDataTab.clickAuthorise();
    }

    // setters
    public void setMarketDataSource(String marketDataSource) {
        this.marketDataSource = marketDataSource;
    }

    public void setFuturesCode(String futuresCode) {
        this.futuresCode = futuresCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    public void setFuturesPriceScale(String futuresPriceScale) {
        this.futuresPriceScale = futuresPriceScale;
    }

    public void setOptionsPriceScale(String optionsPriceScale) {
        this.optionsPriceScale = optionsPriceScale;
    }

    public void setStrikePriceScale(String strikePriceScale) {
        this.strikePriceScale = strikePriceScale;
    }

    public void setFuturesCodeFormat(String futuresCodeFormat) {
        this.futuresCodeFormat = futuresCodeFormat;
    }

    public void setOptionsCodeFormat(String optionsCodeFormat) {
        this.optionsCodeFormat = optionsCodeFormat;
    }

    public void setStrikeDecimals(String strikeDecimals) {
        this.strikeDecimals = strikeDecimals;
    }

    public void setStrikeRounding(String strikeRouding) {
        this.strikeRouding = strikeRouding;
    }

    public void setInstrumentTypeCode(String instrumentTypeCode) {
        this.instrumentTypeCode = instrumentTypeCode;
    }

    public void setPreferedFuturesPriceField(String preferedFuturesPriceField) {
        this.preferedFuturesPriceField = preferedFuturesPriceField;
    }

    public void setPreferedOptionsPriceField(String preferedOptionsPriceField) {
        this.preferedOptionsPriceField = preferedOptionsPriceField;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
