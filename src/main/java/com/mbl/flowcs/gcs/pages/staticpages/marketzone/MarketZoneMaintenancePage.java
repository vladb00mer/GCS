package com.mbl.flowcs.gcs.pages.staticpages.marketzone;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
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

public class MarketZoneMaintenancePage extends GcsGemsPage {
    
    @FindBy(xpath = "//app-gcs-dropdown[@id = 'dropdown-categories-selector']/div/label")
    private WebElement selectMarketZodeDD;    
    
    @FindBy(xpath = "//input[@id = 'input-mktZoneCode']")
    private WebElement marketZoneCodeInput;
    
    @FindBy(xpath = "//span[@id = 'view-mktZoneCode']")
    private WebElement marketZoneCodeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-mktZoneDescription']")
    private WebElement marketZoneNameInput;
    
    @FindBy(xpath = "//span[@id = 'view-mktZoneDescription']")
    private WebElement marketZoneNameLabel;
    
    
    public MarketZoneMaintenancePage(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);        
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(iconAddLink));
    }

    public boolean setMarketZone(String marketZone) {

        clickOnElement(selectMarketZodeDD);
        return clickOnElement(driver.findElement(By.xpath("//span[@id='group-item-container-value-"+marketZone.toLowerCase()+"']")));
    }
    
    public boolean setMarketZoneCode(String marketZoneCode) {

        return setTextAreaValue(marketZoneCodeInput, marketZoneCode);
    }
    
    public String getMarketZoneCode() {

        return getLabelValue(marketZoneCodeLabel);
    }
    
    public boolean setMarketZoneName(String marketZoneName) {

        return setTextAreaValue(marketZoneNameInput, marketZoneName);
    }
    
    public String getMarketZoneName() {

        return getLabelValue(marketZoneNameLabel);
    }
}
