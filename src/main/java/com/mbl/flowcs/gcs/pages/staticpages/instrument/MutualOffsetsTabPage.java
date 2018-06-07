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

public class MutualOffsetsTabPage extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'add-new-row']")
    private WebElement addNewRowLink;
    
    @FindBy(xpath = "//span[@id = 'view-executedInstrument']")
    private WebElement executedInstrumentLabel;
    
    @FindBy(xpath = "//input[@id = 'auto-complete-clearedInstrument']")
    private WebElement clearedInstrumentInput;
    
    @FindBy(xpath = "//span[@id = 'view-clearedInstrument']")
    private WebElement clearedInstrumentLabel;
    
    @FindBy(xpath = "//span[@id = 'view-conversionRatio1']")
    private WebElement conversionRatio1Label;
    
    @FindBy(xpath = "//input[@id = 'input-conversionRatio1']")
    private WebElement conversionRatio1Input;
    
    @FindBy(xpath = "//span[@id = 'view-conversionRatio2']")
    private WebElement conversionRatio2Label;
        
    @FindBy(xpath = "//input[@id = 'input-conversionRatio2']")
    private WebElement conversionRatio2Inputl;
    
    @FindBy(xpath = "//span[@id = 'save-new-code']")
    private WebElement saveNewCodeLink;
    
    @FindBy(xpath = "//span[@id = 'remove-new-code']")
    private WebElement removeNewCodeLink;
    
    
    public MutualOffsetsTabPage(WebDriver driver) {

        this.driver = driver;        
        PageFactory.initElements(driver, this);     
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean addNewRowClick() {
        
        return clickOnElement(addNewRowLink);
    }
    
    public String getExecutedInstrument() {
        
        return getLabelValue(executedInstrumentLabel);
    }
    
    public boolean setCreatedInstrument(String clearedInstrument) {
        
        return setTextAreaValue(clearedInstrumentInput, clearedInstrument);
    }
    
    public String getCreatedInstrument() {
        
        return getLabelValue(clearedInstrumentLabel);
    }
    
    public boolean setConversionRatio1(String conversionRatio1) {
        
        setTextAreaValue(conversionRatio1Input, conversionRatio1);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public String getConversionRatio1() {
        
        return getLabelValue(conversionRatio1Label);
    }
    
    public boolean setConversionRatio2(String conversionRatio2) {
        
        return setTextAreaValue(conversionRatio2Inputl, conversionRatio2);
    }
    
    public String getConversionRatio2() {
        
        return getLabelValue(conversionRatio2Label);
    }
    
    public boolean saveNewCodeClick() {
        
        return clickOnElement(saveNewCodeLink);
    }
    
    public boolean removeNewCodeClick() {
        
        return clickOnElement(removeNewCodeLink);
    }
}
