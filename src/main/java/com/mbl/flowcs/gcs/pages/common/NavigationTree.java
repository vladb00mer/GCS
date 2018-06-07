package com.mbl.flowcs.gcs.pages.common;

import com.mbl.flowcs.gcs.pages.staticpages.StaticItem;
import com.mbl.flowcs.gcs.pages.dashboard.DashboardPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.enquiry.EnquiryItem;
import com.mbl.flowcs.gcs.pages.extracts.ExtractsItem;
import com.mbl.flowcs.gcs.pages.interfaces.InterfacesItem;
import com.mbl.flowcs.gcs.pages.journals.JournalsItem;
import com.mbl.flowcs.gcs.pages.positions.PositionsItem;
import com.mbl.flowcs.gcs.pages.reports.ReportsItem;
import com.mbl.flowcs.gcs.pages.system.SystemItem;

/**
 *
 * @author VMurashov
 */

public class NavigationTree extends GcsGemsPage {

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Dashboard-parent-menu-item']")
    private WebElement dashboardItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Static-parent-menu-item']")
    private WebElement staticItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Interfaces-parent-menu-item']")
    private WebElement interfacesItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Positions-parent-menu-item']")
    private WebElement positionsItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Journals-parent-menu-item']")
    private WebElement journalsItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Enquiry-parent-menu-item']")
    private WebElement enquiryItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Reports-parent-menu-item']")
    private WebElement reportsItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='Extracts-parent-menu-item']")
    private WebElement extractsItem;

    @FindBy(xpath = "//app-sidebar//perfect-scrollbar//div[@id='EOD/EOM-parent-menu-item']")
    private WebElement eodEomItem;

    @FindBy(xpath = "//app-sidebar-tooltip//a[contains(text(),'contact us')]")
    private WebElement disabledItemTooltip;

    @FindBy(id = "Static-menu-item-7")
    private WebElement collateralSubItem;

    public NavigationTree(String browser, String resolution, String user)  {

        getWebDriver(browser, resolution);

        if (user.equalsIgnoreCase("tomas")) {
            driver.navigate().to(getTomasURL());
        } else if (user.equalsIgnoreCase("test")) {
            driver.navigate().to(getTestURL());
        } else return;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(eodEomItem));
    }

    public DashboardPage goToDashboard() {

        clickOnElement(dashboardItem);
        return new DashboardPage();
    }

    public boolean verifyDashboardTooltip() {

        return verifyNavigationTooltip(dashboardItem, disabledItemTooltip);
    }

    public StaticItem goToStaticItem() {

        clickOnElement(staticItem);
        return new StaticItem(driver);
    }

    public boolean verifyStaticTooltip() {

        return verifyNavigationTooltip(staticItem, disabledItemTooltip);
    }

    public InterfacesItem goToInterfacesItem() {

        clickOnElement(interfacesItem);
        return new InterfacesItem();
    }

    public boolean verifyInterfacesTooltip() {

        return verifyNavigationTooltip(interfacesItem, disabledItemTooltip);
    }

    public PositionsItem goToPositionsItem() {

        clickOnElement(positionsItem);
        return new PositionsItem(driver);
    }

    public boolean verifyPositionsTooltip() {

        return verifyNavigationTooltip(positionsItem, disabledItemTooltip);
    }

    public JournalsItem goToJournalsItem() {

        clickOnElement(journalsItem);
        return new JournalsItem();
    }

    public boolean verifyJournalsTooltip() {

        return verifyNavigationTooltip(journalsItem, disabledItemTooltip);
    }

    public EnquiryItem goToEnquiryItem() {

        clickOnElement(enquiryItem);
        return new EnquiryItem();
    }

    public boolean verifyEnquiryTooltip() {

        return verifyNavigationTooltip(enquiryItem, disabledItemTooltip);
    }

    public ReportsItem goToReportsItem() {

        clickOnElement(reportsItem);
        return new ReportsItem(driver);
    }

    public boolean verifyReportsTooltip() {

        return verifyNavigationTooltip(reportsItem, disabledItemTooltip);
    }

    public ExtractsItem goToExtractsItem() {

        clickOnElement(extractsItem);
        return new ExtractsItem(driver);
    }

    public boolean verifyExtractsTooltip() {

        return verifyNavigationTooltip(extractsItem, disabledItemTooltip);
    }

    public SystemItem goToEodEomItem() {

        clickOnElement(eodEomItem);
        return new SystemItem();
    }

    public boolean verifyEodEomTooltip() {

        return verifyNavigationTooltip(eodEomItem, disabledItemTooltip);
    }
    
    
}
