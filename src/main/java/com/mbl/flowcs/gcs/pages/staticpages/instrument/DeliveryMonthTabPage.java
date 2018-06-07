package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */

public class DeliveryMonthTabPage extends GcsGemsPage {

    @FindBy(xpath = "//div[@id = 'dm-expired-month-checkbox-container']")
    private WebElement showExpiredMonth;
    
    @FindBy(xpath = "//span[@id='add-new-row-delivery-month']")
    private WebElement addNewRowLink;
    
    @FindBy(xpath = "//span[@id='???']")
    private List<WebElement> actionsMenuLinks;
    
    @FindBy(xpath = "//span[@id='???']")
    private WebElement editLink;
    
    @FindBy(xpath = "//span[@id='???']")
    private WebElement deleteLink;
        
    @FindBy(xpath = "//span[@id='view-delMonthStr']")
    private List<WebElement> deliveryMonthLabels;
    
    @FindBy(xpath = "//input[@id='input-delMonthStr']")
    private WebElement deliveryMonthInput;

    @FindBy(xpath = "//span[@id='view-mandatorySettlementDate']")
    private List<WebElement> mandatorySettlementDateLabels;

    @FindBy(xpath = "//span[@id='view-lastTradeDate']")
    private List<WebElement> futuresLastTradeDateLabels;
    
    @FindBy(xpath = "//input[@id='input-date-lastTradeDate']")
    private WebElement futuresLastTradeDateInput;

    @FindBy(xpath = "//span[@id='view-firstNoticeDay']")
    private List<WebElement> futuresFirstNoticeDayLabels;
    
    @FindBy(xpath = "//input[@id='input-date-firstNoticeDay']")
    private WebElement futuresFirstNoticeDayInput;
    
    @FindBy(xpath = "//span[@id='view-reportNotificationDate']")
    private List<WebElement> futuresReportNotificationDateLabels;
    
    @FindBy(xpath = "//span[@id='view-lotSize']")
    private List<WebElement> lotSizeLabels;
    
    @FindBy(xpath = "//input[@id='input-lotSize']")
    private WebElement lotSizeInput;
    
    
    public DeliveryMonthTabPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(showExpiredMonth));
    }
    
    public boolean setShowExpiredMonth() {

        return clickOnElement(showExpiredMonth);
    }
        
    public boolean clickAddNewRow() {

        return clickOnElement(addNewRowLink);
    }   
    
    public boolean clickActionsLink(int index) {

        return clickOnElement(actionsMenuLinks.get(index));
    } 
    
    public boolean clickEditLink() {

        return clickOnElement(editLink);
    } 
    
    public boolean clickDeleteLink() {

        return clickOnElement(deleteLink);
    } 
    
    public String getDeliveryMonth(int index) {

        return getLabelValue(deliveryMonthLabels.get(index));
    }

    public boolean setDeliveryMonth(String deliveryMonth) {

        return setTextAreaValue(deliveryMonthInput, deliveryMonth);
    }
    
    public String getMandatorySettlementDate(int index) {

        return getTextAreaValue(mandatorySettlementDateLabels.get(index));
    }
    
    public String getFuturesLastTradeDate(int index) {

        return getLabelValue(futuresLastTradeDateLabels.get(index));
    }

    public boolean setFuturesLastTradeDate(String futuresLastTradeDate) {

        setTextAreaValue(futuresLastTradeDateInput, futuresLastTradeDate);        
        return  clickOnElement(deliveryMonthInput);
    }
    
    public String getFuturesFirstNoticeDay(int index) {

        return getLabelValue(futuresFirstNoticeDayLabels.get(index));
    }

    public boolean setFuturesFirstNoticeDay(String futuresFirstNoticeDay) {

        setTextAreaValue(futuresFirstNoticeDayInput, futuresFirstNoticeDay);        
        return  clickOnElement(deliveryMonthInput);
    }
    
    public String getFuturesReportNotificationDate(int index) {

        return getLabelValue(futuresReportNotificationDateLabels.get(index));
    }
    
    public String getLotSize(int index) {

        return getLabelValue(lotSizeLabels.get(index));
    }

    public boolean setLotSize(String lotSize) {

        return setTextAreaValue(lotSizeInput, lotSize);
    }
}
