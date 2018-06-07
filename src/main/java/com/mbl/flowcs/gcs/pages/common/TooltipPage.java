package com.mbl.flowcs.gcs.pages.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */
public class TooltipPage extends GcsGemsPage {

    @FindBy(xpath = "//app-entity-tooltip//div[@class='header']")
    private WebElement tooltipHeaderField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Account type']")
    private WebElement tooltipAccountTypeField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Super group']")
    private WebElement tooltipSuperGroupField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Firm']")
    private WebElement tooltipFirmField;

    @FindBy(xpath = "//div[@class='item Segregated']/label/i")
    private WebElement tooltipSegregatedField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Group static']")
    private WebElement tooltipGroupStaticField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Group enquiry']")
    private WebElement tooltipGroupEnquiryField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Group']")
    private WebElement tooltipGroupField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Super group static']")
    private WebElement tooltipSuperGroupStaticField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Client dashboard']")
    private WebElement tooltipClientDashboardField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Account static']")
    private WebElement tooltipAccountStaticField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item button Account enquiry']")
    private WebElement tooltipAccountEnquiryField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item SWIFT code']")
    private WebElement tooltipSwiftCodeField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item Base currency']")
    private WebElement tooltipBaseCurrencyField;

    @FindBy(xpath = "//app-entity-tooltip//div[@class='item SWIFT code']")
    private WebElement tooltipAccountClassField;

    public TooltipPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(tooltipHeaderField));
    }

    public String getTooltipHeader() {

        return getLabelValue(tooltipHeaderField);
    }

    public String getTooltipAccountType() {

        return getLabelValue(tooltipAccountTypeField);
    }

    public String getTooltipSuperGroup() {

        return getLabelValue(tooltipSuperGroupField);
    }

    public String getTooltipFirm() {

        return getLabelValue(tooltipFirmField);
    }

    public boolean getTooltipSegregated() {

        return getCheckBoxValue(tooltipSegregatedField);
    }

    public String getTooltipGroupStatic() {

        return getLabelValue(tooltipGroupStaticField);
    }

    public String getTooltipSwiftCode() {

        return getLabelValue(tooltipSwiftCodeField);
    }

    public String getBaseCurrencyType() {

        return getLabelValue(tooltipBaseCurrencyField);
    }

    public String getTooltipAccountClass() {

        return getLabelValue(tooltipAccountClassField);
    }

    public String getTooltipGroupEnquiry() {

        return getLabelValue(tooltipGroupEnquiryField);
    }

    public String getTooltipGroup() {

        return getLabelValue(tooltipGroupField);
    }

    public String getTooltipSuperGroupStatic() {

        return getLabelValue(tooltipSuperGroupStaticField);
    }

    public String getTooltipClientDashboard() {

        return getLabelValue(tooltipClientDashboardField);
    }

    public String getTooltipAccountStatic() {

        return getLabelValue(tooltipAccountStaticField);
    }

    public String getTooltipAccountEnquiry() {

        return getLabelValue(tooltipAccountEnquiryField);
    }
}
