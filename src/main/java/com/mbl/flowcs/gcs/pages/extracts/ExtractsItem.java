package com.mbl.flowcs.gcs.pages.extracts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author vmurashov
 */
public class ExtractsItem extends GcsGemsPage {

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Extracts-menu-item-0']")
    private WebElement reconciliationsSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Extracts-menu-item-1']")
    private WebElement asxDownloadsSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Extracts-menu-item-2']")
    private WebElement otherDownlooadsSubItem;

    @FindBy(xpath = "//app-sidebar-tooltip//a[contains(text(),'contact us')]")
    private WebElement disabledItemTooltip;
    

    public ExtractsItem(WebDriver driver) {

        this.driver = driver;
        
        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Extracts')]"))));
    }

    public ReconciliationsSubItem goToReconciliations() {

        clickOnElement(reconciliationsSubItem);
        return new ReconciliationsSubItem();
    }

    public boolean verifyReconciliationsTooltip() {

        return verifyNavigationTooltip(reconciliationsSubItem, disabledItemTooltip);
    }

    public AsxDownloadsSubItem goToAsxDownloads() {

        clickOnElement(asxDownloadsSubItem);
        return new AsxDownloadsSubItem(driver);
    }

    public boolean verifyAsxDownloadsTooltip() {

        return verifyNavigationTooltip(asxDownloadsSubItem, disabledItemTooltip);
    }

    public OtherDownloadsSubItem goToOtherDownlooadsSubItem() {

        clickOnElement(otherDownlooadsSubItem);
        return new OtherDownloadsSubItem();
    }

    public boolean verifyOtherDownloadsTooltip() {

        return verifyNavigationTooltip(otherDownlooadsSubItem, disabledItemTooltip);
    }
}
