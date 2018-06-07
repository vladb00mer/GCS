package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import org.openqa.selenium.By;
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

public class CascadingContractsAccordeon extends GcsGemsPage {

    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-cascadingContract']/div/div[2]")
    private WebElement cascadingContractCheckbox;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-cascadePriceType']/div/label")
    private WebElement cascadePriceTypeDD;
    
    @FindBy(xpath = "//span[@id = 'view-cascadePriceType']")
    private WebElement cascadePriceTypeLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-contractType']/div/label")
    private WebElement contractTypeDD;
    
    @FindBy(xpath = "//span[@id = 'view-contractType']")
    private WebElement contractTypeLabel;
    
    @FindBy(xpath = "//input[@id = 'auto-complete-childCmdCode']")
    private WebElement commodityCode;
    
    @FindBy(xpath = "//span[@id = 'view-childCmdCode']")
    private WebElement commodityCodeLabel;

    @FindBy(xpath = "//span[@id = 'view-childContractType']")
    private WebElement typeLabel;

    @FindBy(xpath = "//span[@id = 'view-possibleDeliveryMonths']")
    private WebElement possibleDeliveryMonthsLabel;
    

    public CascadingContractsAccordeon(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);        
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[contains(text(), 'Cascade price type:')]"))));
    }

    public boolean setCascadingContract() {

        return clickOnElement(cascadingContractCheckbox);
    }

    public boolean getCascadingContractState() {

        return getCheckBoxValue(cascadingContractCheckbox);
    }

    public boolean setCascadePriceType(String newPriceType) {

        return setDropDown(cascadePriceTypeDD, newPriceType);
    }

    public String getCascadePriceType() {

        return getLabelValue(cascadePriceTypeLabel);
    }

    public boolean setContractType(String newContractType) {

        return setDropDown(contractTypeDD, newContractType);
    }

    public String getContractType() {

        return getLabelValue(contractTypeLabel);
    }
    
    public boolean setCommodityCode(String newCode) {

        return setTextAreaValue(commodityCode, newCode);
    }
    
    public String getCommodityCode() {
        
        return getLabelValue(commodityCodeLabel);
    }
    
    public String getType() {
        
        return getLabelValue(typeLabel);
    }
    
    public String getPossibleDeliveryMonth() {
        
        return getLabelValue(possibleDeliveryMonthsLabel);
    }
}
