package com.mbl.flowcs.gcs.pages.extracts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author vmurashov
 */
public class AsxDownloadsSubItem extends GcsGemsPage {

    @FindBy(xpath = "//app-sidebar-submenu//li[@id='Extracts-ASX-downloads-sub-menu-item-0']")
    private WebElement moplTradeDownload;

    @FindBy(xpath = "//app-sidebar-submenu//li[@id='Extracts-ASX-downloads-sub-menu-item-1']")
    private WebElement asxMarginRecDownload;

    @FindBy(xpath = "//app-sidebar-tooltip//a[contains(text(),'contact us')]")
    private WebElement disabledItemTooltip;
    

    public AsxDownloadsSubItem(WebDriver driver) {

        this.driver = driver;
        
        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(moplTradeDownload));
    }

    public MOPLTradeDownloadPage goToMOPLTradeDownload() {

        clickOnElement(moplTradeDownload);
        return new MOPLTradeDownloadPage();
    }

    public boolean verifyMOPLTradeDownloadTooltip() {

        return verifyNavigationTooltip(moplTradeDownload, disabledItemTooltip);
    }

    public ASXMarginRecDownloadPage goToReconciliations() {

        clickOnElement(asxMarginRecDownload);
        return new ASXMarginRecDownloadPage();
    }

    public boolean verifyASXMarginRecDownloadTooltip() {

        return verifyNavigationTooltip(asxMarginRecDownload, disabledItemTooltip);
    }
}
