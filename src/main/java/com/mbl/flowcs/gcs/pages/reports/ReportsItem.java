package com.mbl.flowcs.gcs.pages.reports;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import com.mbl.flowcs.gcs.pages.staticpages.StaticItem;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author vmurashov
 */

public class ReportsItem extends GcsGemsPage {
    
    @FindBy(id = "Static-parent-menu-item")
    public WebElement staticItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-0']")
    private WebElement clientStatementsReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-1']")
    private WebElement clientDataFilesReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-2']")
    private WebElement clientReportDataDownloadsToWebReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-3']")
    private WebElement brokerStatementsReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-4']")
    private WebElement dailyTransactionReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-5']")
    private WebElement tradeRevenueExpenseReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-6']")
    private WebElement brokersPositionAndTransactionSummaryReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-7']")
    private WebElement exchangeClientNetDownReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-8']")
    private WebElement upcomingExpiryReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-9']")
    private WebElement interestRebateReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-10']")
    private WebElement commissionTradingDataAnalysisReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-11']")
    private WebElement centralCustomerNumberReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-12']")
    private WebElement generalLedgerReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-13']")
    private WebElement TfnAlarmsReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-14']")
    private WebElement SwiftReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-15']")
    private WebElement OchReport;
    
    @FindBy(xpath = "//app-sidebar-menu//div[@id='Reports-menu-item-16']")
    private WebElement viewBatchReport;
    
    
    public ReportsItem(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(StaticItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
