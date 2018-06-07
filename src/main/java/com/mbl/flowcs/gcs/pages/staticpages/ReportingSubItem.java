package com.mbl.flowcs.gcs.pages.staticpages;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import com.mbl.flowcs.gcs.pages.staticpages.reporting.AdvisorsSearchPage;
import com.mbl.flowcs.gcs.pages.staticpages.reporting.ClearingManagersPage;
import com.mbl.flowcs.gcs.pages.staticpages.reporting.StatementHeaderSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author lev boichenko
 */


public class ReportingSubItem extends GcsGemsPage {

    @FindBy(id = "Static-Reporting-sub-menu-item-3")
    private WebElement advisorsSubItem;

    @FindBy(id = "Static-Reporting-sub-menu-item-2")
    private WebElement statementHeaderSubItem;

    @FindBy(id = "Static-Reporting-sub-menu-item-4")
    private WebElement clearingManagersSubItem;

    public ReportingSubItem(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public AdvisorsSearchPage goToAdvisors() {

        clickOnElement(advisorsSubItem);
        return new AdvisorsSearchPage(driver);
    }

    public StatementHeaderSearchPage goToStatementHeader() {

        clickOnElement(statementHeaderSubItem);
        return new StatementHeaderSearchPage(driver);
    }

    public ClearingManagersPage goToClearingManagers() {

        clickOnElement(clearingManagersSubItem);
        return new ClearingManagersPage(driver);
    }

}
