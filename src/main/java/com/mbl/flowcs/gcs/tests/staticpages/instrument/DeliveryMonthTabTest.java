package com.mbl.flowcs.gcs.tests.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.DeliveryMonthTabPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class DeliveryMonthTabTest extends GcsGemsTest{
    
    private DeliveryMonthTabPage deliveryMonthTabPage;
    
    private String deliveryMonth;
    private String mandatorySettlementDate;
    private String futuresLastTradeDate;
    private String futuresFirstNoticeDay;
    private String futuresReportNotificationDay;
    private String lotSize;
    
    private int index;
   
    //page opening
    public void setDeliveryMonthTabPage(String search) {

        deliveryMonthTabPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToInstrumentSubItem()
                .goToMaster()
                .findInstrumentStatic(search)
                .goToDeliveryMonthTab();
    }
    
    public boolean addNewRow() {
        
        return deliveryMonthTabPage.clickAddNewRow();
    }
    
    public boolean verifyDeliveryMonth() {

        return deliveryMonthTabPage.getDeliveryMonth(index).equals(deliveryMonth);
    }
    
    public boolean modifyDeliveryMonth() {

        return deliveryMonthTabPage.setDeliveryMonth(deliveryMonth);
    }
    
    public boolean verifyMandatorySettlementDate() {

        return deliveryMonthTabPage.getMandatorySettlementDate(index).equals(mandatorySettlementDate);
    }
    
    public boolean verifyFuturesLastTradeDate() {

        return deliveryMonthTabPage.getFuturesLastTradeDate(index).equals(futuresLastTradeDate);
    }
    
    public boolean modifyFuturesLastTradeDate() {
        
        return deliveryMonthTabPage.setFuturesLastTradeDate(futuresLastTradeDate);
    }
    
    public boolean verifyFuturesFirstNoticeDay() {

        return deliveryMonthTabPage.getFuturesFirstNoticeDay(index).equals(futuresFirstNoticeDay);
    }
    
    public boolean modifyFuturesFirstNoticeDay() {

        return deliveryMonthTabPage.setFuturesFirstNoticeDay(futuresFirstNoticeDay);
    }
    
    public boolean verifyFuturesReportNotificationDay() {

        return deliveryMonthTabPage.getFuturesReportNotificationDate(index).equals(futuresReportNotificationDay);
    }
    
    public boolean verifyLotSize() {

        return deliveryMonthTabPage.getLotSize(index).equals(lotSize);
    }
    
    public boolean modifyLotSize() {

        return deliveryMonthTabPage.setLotSize(lotSize);
    }
    
    public boolean saveChanges() {

        return deliveryMonthTabPage.clickSave();
    }
    
    public boolean authoriseChanges() {

        return deliveryMonthTabPage.clickAuthorise();
    }
    
    public boolean closeDriver() {

        return deliveryMonthTabPage.closeWebDriver();
    }
    
    // setters
    public void setMandatorySettlementDate(String mandatorySettlementDate) {
        this.mandatorySettlementDate = mandatorySettlementDate.trim();
    }
    public void setFuturesLastTradeDate(String futuresLastTradeDate) {
        this.futuresLastTradeDate = futuresLastTradeDate.trim();
    }
    public void setFuturesFirstNoticeDay(String futuresFirstNoticeDay) {
        this.futuresFirstNoticeDay = futuresFirstNoticeDay.trim();
    }
    public void setFuturesReportNotificationDay(String futuresReportNotificationDay) {
        this.futuresReportNotificationDay = futuresReportNotificationDay.trim();
    }
    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setDeliveryMonth(String deliveryMonth) {
        this.deliveryMonth = deliveryMonth.trim();
    }
}
