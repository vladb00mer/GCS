package com.mbl.flowcs.gcs.pages.staticpages.instrument.types;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author vmurashov
 */

public class InstrumentTypesMaintenancePage extends GcsGemsPage {
    
    @FindBy(xpath = "//div[contains(text(), 'Instrument type maintenance')]")
    protected WebElement pageHeader;
    
    @FindBy(xpath = "//app-shared-table//span[@id='add-new-row']")
    protected WebElement addNewRowLink;
    
    @FindBy(xpath = "//input[@id='input-cmdType']")
    protected WebElement instrumentTypeInput;
    
    @FindBy(xpath = "//input[@id='input-description']")
    protected WebElement descriptionInput;
    
    @FindBy(xpath = "//span[@id='view-description']")
    protected List<WebElement> descriptionLabels;
    
    @FindBy(xpath = "//span[@id='view-lastUpDate']")
    protected List<WebElement> lastUpdateLabels;
    
    @FindBy(xpath = "//div[@id='action-dots-1']")
    protected WebElement openControlsLink;
    
    @FindBy(xpath = "//div[@id='edit-row1']")
    protected WebElement editCodeLink;
    
    @FindBy(xpath = "//span[@id='remove-row1']")
    protected WebElement removeCodeLink;
    
    @FindBy(xpath = "//span[@id='save-row1']")
    protected WebElement saveCodeLink;
    
    
    public InstrumentTypesMaintenancePage(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);        
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(pageHeader));
    }
        
    public boolean clickAddNewRow() {
        
        return clickOnElement(addNewRowLink);
    }
    
    public boolean clickEditCode() {
        
        clickOnElement(openControlsLink);
        return clickOnElement(editCodeLink);
    }
    
    public boolean clickRemoveCode() {
        
        clickOnElement(openControlsLink);
        return clickOnElement(removeCodeLink);
    }
    
    public boolean clickSaveCode() {
        
        clickOnElement(openControlsLink);
        return clickOnElement(saveCodeLink);
    }
    
    public boolean setInstrumentType(String instrumentType, int index) {

        return setTextAreaValue(instrumentTypeInput, instrumentType);
    }
    
    public boolean getInstrumentType(String type) {

        return (driver.findElement(By.xpath("//span[contains(text(), '"+type+"')]")).isDisplayed());
    }
    
    public boolean setDescription(String instrumentType, int index) {

        return setTextAreaValue(descriptionInput, instrumentType);
    }
    
    public boolean getDescription(String desc) {

        return (driver.findElement(By.xpath("//span[contains(text(), '"+desc+"')]")).isDisplayed());
    }
    
    public String getLastUpdate(int index) {

        return getLabelValue(lastUpdateLabels.get(index));
    }
}
