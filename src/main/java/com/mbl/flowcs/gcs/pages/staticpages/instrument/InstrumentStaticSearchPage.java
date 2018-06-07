package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author vmurashov
 */

public class InstrumentStaticSearchPage extends GcsGemsPage {

    @FindBy(xpath = "//input[@id = 'input-text']")
    private WebElement searchField;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-searchIn']/div/label")
    private WebElement inDD;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-market']/div/label")
    private WebElement marketDD;
    
    @FindBy(xpath = "//p-checkbox[@id = 'custom-checkbox-showInActive']/div/div[2]")
    private WebElement showInActiveCB;
    
    @FindBy(xpath = "//p-checkbox[@id = 'custom-checkbox-unauthorised']/div/div[2]")
    private WebElement unauthorisedCB;
    
    @FindBy(xpath = "//div[@id = 'static-instrument-btn-new']")
    private WebElement addNew;
    
    @FindBy(xpath = "//perfect-scrollbar//p-datatable//table/thead//th[1]/span[2]")
    private WebElement searchResultTableCodeHeader;

    @FindBy(xpath = "//span[@id='code']")
    private WebElement searchResultTableCodeFirstValue;

    @FindBy(xpath = "//perfect-scrollbar//p-datatable//table/thead//th[2]/span[2]")
    private WebElement searchResultTableInstrumentNameHeader;

    @FindBy(xpath = "//p-datatable//table//tbody/tr/td[2]/span[2]/span")
    private WebElement searchResultTableInstrumentNameFirstValue;

    @FindBy(xpath = "//perfect-scrollbar//p-datatable//table/thead//th[3]/span[2]")
    private WebElement searchResultTableMarketHeader;

    @FindBy(xpath = "//p-datatable//table//tbody/tr/td[3]/span[2]/span")
    private WebElement searchResultTableMarketFirstValue;
    
    @FindBy(xpath = "//span[contains(text(), 'No data found')]")
    private WebElement instrumentNotFoundRecord;
    

    public InstrumentStaticSearchPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(searchField));
    }

    public InstrumentStaticPage findInstrumentStatic(String search) {

        setTextAreaValue(searchField, search);       
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(InstrumentStaticSearchPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new InstrumentStaticPage(driver);
    }
    
    public boolean verifyInstrumentExisting(String search) {
        
        setTextAreaValue(searchField, search);
        return instrumentNotFoundRecord.isDisplayed();
    }
    
    public InstrumentStaticPage createInstrumentStatic() {
        
        clickOnElement(addNew);
        
        return new InstrumentStaticPage(driver);
    }
    
    public boolean setShowInActiveCB() {
        
        return clickOnElement(showInActiveCB);
    }
    
    public boolean getShowInActiveCB() {
        
        return getCheckBoxLabelValue(showInActiveCB);
    }
    
    public boolean setUnauthorisedCB() {
        
        return clickOnElement(unauthorisedCB);
    }
    
    public boolean getUnauthorisedCB() {
        
        return getCheckBoxLabelValue(unauthorisedCB);
    }    
}
