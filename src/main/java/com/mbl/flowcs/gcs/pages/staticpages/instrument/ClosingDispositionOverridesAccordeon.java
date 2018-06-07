package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author vmurashov
 */

public class ClosingDispositionOverridesAccordeon extends GcsGemsPage {

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-closingDispositionOverrideFutures']/div/label")
    private WebElement futures;
    
    @FindBy(xpath = "//span[@id = 'view-closingDispositionOverrideFutures']")
    private WebElement futuresLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-closingDispositionOverrideOptions']/div/label")
    private WebElement options;
    
    @FindBy(xpath = "//span[@id = 'view-closingDispositionOverrideOptions']")
    private WebElement optionsLabel;
    

    public ClosingDispositionOverridesAccordeon(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ClosingDispositionOverridesAccordeon.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public String getFutures() {

        return getLabelValue(futuresLabel);
    }

    public boolean setFutures(String newFutures) {

        return setDropDown(futures, newFutures);
    }

    public String getOptions() {

        return getLabelValue(optionsLabel);
    }

    public boolean setOptions(String newOptions) {

        return setDropDown(options, newOptions);
    }
}
