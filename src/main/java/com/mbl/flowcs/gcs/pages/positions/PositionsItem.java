package com.mbl.flowcs.gcs.pages.positions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author VMurashov
 */

public class PositionsItem extends GcsGemsPage {

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-0']")
    private WebElement positionWorkbenchSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-1']")
    private WebElement newTradeSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-2']")
    private WebElement multipleTradeEntrySubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-3']")
    private WebElement tradeBatchEnquirySubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-4']")
    private WebElement pendingTransactionsSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-5']")
    private WebElement reverseSettlemensSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-6']")
    private WebElement reverseOptionAbExSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-7']/div/a")
    private WebElement collateralWorkbenchSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-8']")
    private WebElement optionExpiryLoadSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Positions-menu-item-9']")
    private WebElement closeoutImportSubItem;

    @FindBy(xpath = "//app-sidebar-tooltip//a[contains(text(),'contact us')]")
    private WebElement disabledItemTooltip;

    
    public PositionsItem(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(collateralWorkbenchSubItem));
    }

    public PositionWorkbenchPage goToPositionWorkbench() {

        clickOnElement(positionWorkbenchSubItem);
        return new PositionWorkbenchPage();
    }

    public boolean verifyPositionWorkbenchTooltip() {

        return verifyNavigationTooltip(positionWorkbenchSubItem, disabledItemTooltip);
    }

    public NewTradePage goToNewTrade() {

        clickOnElement(newTradeSubItem);
        return new NewTradePage();
    }

    public boolean verifyNewTradeTooltip() {

        return verifyNavigationTooltip(newTradeSubItem, disabledItemTooltip);
    }

    public MultipleTradeEntryPage goToMultipleTradeEntry() {

        clickOnElement(multipleTradeEntrySubItem);
        return new MultipleTradeEntryPage();
    }

    public boolean verifyMultipleTradeEntryTooltip() {

        return verifyNavigationTooltip(multipleTradeEntrySubItem, disabledItemTooltip);
    }

    public TradeBatchEnquiryPage goToTradeBatchEnquirySubItem() {

        clickOnElement(tradeBatchEnquirySubItem);
        return new TradeBatchEnquiryPage();
    }

    public boolean verifyTradeBatchEnquiryTooltip() {

        return verifyNavigationTooltip(tradeBatchEnquirySubItem, disabledItemTooltip);
    }

    public PendingTransactionsPage goToPendingTransactions() {

        clickOnElement(pendingTransactionsSubItem);
        return new PendingTransactionsPage();
    }

    public boolean verifyPendingTransactionsTooltip() {

        return verifyNavigationTooltip(pendingTransactionsSubItem, disabledItemTooltip);
    }

    public ReverseSettlemensPage goToReverseSettlemens() {

        clickOnElement(reverseSettlemensSubItem);
        return new ReverseSettlemensPage();
    }

    public boolean verifyReverseSettlemensTooltip() {

        return verifyNavigationTooltip(positionWorkbenchSubItem, disabledItemTooltip);
    }

    public ReverseOptionAbExPage goToReverseOptionAbEx() {

        clickOnElement(reverseOptionAbExSubItem);
        return new ReverseOptionAbExPage();
    }

    public boolean verifyReverseOptionAbExTooltip() {

        return verifyNavigationTooltip(positionWorkbenchSubItem, disabledItemTooltip);
    }

    public CollateralWorkbenchSearchPage goToCollateralWorkbenchSearchPage() {

        clickOnElement(collateralWorkbenchSubItem);
        return new CollateralWorkbenchSearchPage(driver);
    }

    public boolean verifyCollateralWorkbenchTooltip() {

        return verifyNavigationTooltip(collateralWorkbenchSubItem, disabledItemTooltip);
    }

    public OptionExpiryLoadPage goToOptionExpiryLoad() {

        clickOnElement(optionExpiryLoadSubItem);
        return new OptionExpiryLoadPage();
    }

    public boolean verifyOptionExpiryLoadTooltip() {

        return verifyNavigationTooltip(optionExpiryLoadSubItem, disabledItemTooltip);
    }

    public CloseoutImportPage goToCloseoutImport() {

        clickOnElement(closeoutImportSubItem);
        return new CloseoutImportPage();
    }

    public boolean verifyCloseoutImportTooltip() {

        return verifyNavigationTooltip(positionWorkbenchSubItem, disabledItemTooltip);
    }
}
