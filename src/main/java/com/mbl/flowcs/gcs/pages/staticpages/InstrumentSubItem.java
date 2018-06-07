package com.mbl.flowcs.gcs.pages.staticpages;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.InstrumentStaticSearchPage;
import com.mbl.flowcs.gcs.pages.staticpages.instrument.types.InstrumentTypesMaintenancePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author vmurashov
 */

public class InstrumentSubItem extends GcsGemsPage {

    @FindBy(xpath = "//app-sidebar-menu//li[@id='Static-Instrument-sub-menu-item-0']/div")
    private WebElement masterSubItem;
    
    @FindBy(xpath = "//app-sidebar-menu//li[@id='Static-Instrument-sub-menu-item-2']/div")
    private WebElement typesSubItem;
    
    
    public InstrumentSubItem(WebDriver driver) {
        
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    
    public InstrumentStaticSearchPage goToMaster() {
        
        clickOnElement(masterSubItem);        
        return new InstrumentStaticSearchPage(driver);
    }
    
    public InstrumentTypesMaintenancePage goToTypes() {
        
        clickOnElement(typesSubItem);        
        return new InstrumentTypesMaintenancePage(driver);
    }
}
