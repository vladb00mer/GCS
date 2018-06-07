package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */

public class MarginAccordeon extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'view-initMarginMethod']")
    private WebElement initialMarginMethodLabel;
    
    @FindBy(xpath = "//input[@id = 'input-initMarginMethod']")
    private WebElement initialMarginMethodInput;
    
    @FindBy(xpath = "//span[@id = 'view-varMarginMethod']")
    private WebElement variationMarginMethodLabel;
    
    @FindBy(xpath = "//input[@id = 'input-varMarginMethod']")
    private WebElement variationMarginMethodInput;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-allowExcessCredirVarMargin']/div/div[2]")
    private WebElement allowExcessCreditCheckBox;
    
    @FindBy(xpath = "//span[@id = 'view-allowExcessCredirVarMargin']")
    private WebElement allowExcessCreditCheckBoxLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-isVarMarginInTotalEquity']/div/div[2]")
    private WebElement isVariationMarginPartCheckBox;
    
    @FindBy(xpath = "//span[@id = 'view-isVarMarginInTotalEquity']")
    private WebElement isVariationMarginPartCheckBoxLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-settVmFlag']/div/div[2]")
    private WebElement realiseVmAtSettlementCheckBox;
    
    @FindBy(xpath = "//span[@id = 'view-settVmFlag']")
    private WebElement realiseVmAtSettlementCheckBoxLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-zeroVarMgnFlag']/div/div[2]")
    private WebElement setVmToZeroCheckBox;
    
    @FindBy(xpath = "//span[@id = 'view-zeroVarMgnFlag']")
    private WebElement setVmToZeroCheckBoxLabel;
    
    
    public MarginAccordeon(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[contains(text(), 'Initial margin method')]"))));
    }
    
    public boolean setInitialMarginMethod(String initialMarginMethod) {
        
        return setTextAreaValue(initialMarginMethodInput, initialMarginMethod);
    }
    
    public String getInitialMarginMethod() {
        
        return getLabelValue(initialMarginMethodLabel);
    }
    
    public boolean setVariationMarginMethod(String variationMarginMethod) {
        
        return setTextAreaValue(variationMarginMethodInput, variationMarginMethod);
    }
    
    public String getVariationMarginMethod() {
        
        return getLabelValue(variationMarginMethodLabel);
    }
    
    public boolean setAllowExcessCredit() {
        
        return clickOnElement(allowExcessCreditCheckBox);
    }
    
    public boolean getAllowExcessCredit() {
        
        return getCheckBoxLabelValue(allowExcessCreditCheckBoxLabel);
    }
    
    public boolean setIsVariationMarginPart() {
        
        return clickOnElement(isVariationMarginPartCheckBox);
    }
    
    public boolean getIsVariationMarginPart() {
        
        return getCheckBoxLabelValue(isVariationMarginPartCheckBoxLabel);
    }
    
    public boolean setRealiseVmAtSettlement() {
        
        return clickOnElement(realiseVmAtSettlementCheckBox);
    }
    
    public boolean getRealiseVmAtSettlement() {
        
        return getCheckBoxLabelValue(realiseVmAtSettlementCheckBoxLabel);
    }
    
    public boolean setVmToZero() {
        
        clickOnElement(setVmToZeroCheckBox);
        
        if (confirmYesButton.isDisplayed()) {
            clickConfirmYes();
        } return true;
    }
    
    public boolean getVmToZero() {
        
        return getCheckBoxLabelValue(setVmToZeroCheckBoxLabel);
    }
}
