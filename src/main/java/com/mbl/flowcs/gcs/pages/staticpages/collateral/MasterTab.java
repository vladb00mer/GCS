package com.mbl.flowcs.gcs.pages.staticpages.collateral;

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

public class MasterTab extends GcsGemsPage {
    
    @FindBy(xpath = "//input[@id = 'input-code']")
    public WebElement categoryCodeInput;
    
    @FindBy(xpath = "//input[@id = 'view-code']")
    public WebElement categoryCodeLabel;

    @FindBy(xpath = "//input[@id = 'input-category-name']")
    public WebElement categoryNameInput;
    
    @FindBy(xpath = "//input[@id = 'view-category-name']")
    public WebElement categoryNameLabel;
    
    @FindBy(xpath = "//input[@id = 'input-haircut']")
    public WebElement clientHaircutInput;
    
    @FindBy(xpath = "//input[@id = 'view-haircut']")
    public WebElement clientHaircutLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-maturityFlag']/div/div[2]")
    private WebElement maturityFlagCB;
    
    @FindBy(xpath = "//span[@id = 'view-maturityFlag']")
    private WebElement maturityFlagLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-marketRevalFlag']/div/div[2]")
    public WebElement marketRevalFlagCB;
    
    @FindBy(xpath = "//span[@id = 'view-marketRevalFlag']")
    public WebElement marketRevalFlagLabel;    
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-marketRevalEOM']/div/label")
    private WebElement marketRevalEomDD;
    
    @FindBy(xpath = "//span[@id = 'view-marketRevalEOM']")
    private WebElement marketRevalEomLabel;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-priceSource']/div/label")
    private WebElement priceSourceDD;
    
    @FindBy(xpath = "//span[@id = 'view-priceSource']")
    private WebElement priceSourceLabel;
    
    
    public MasterTab(WebDriver driver) {
        
        this.driver = driver;
        PageFactory.initElements(driver, this);        
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[contains(text(), 'Category code')]"))));
    }
    
    
    public boolean setCategoryCode(String newCode) {

        return setTextAreaValue(categoryCodeInput, newCode);
    }
    
    public String getCategoryCode() {
        
        return getLabelValue(categoryCodeLabel);
    }
    
    public boolean setCategoryName(String newName) {

        return setTextAreaValue(categoryNameInput, newName);
    }
    
    public String getCategoryName() {
        
        return getLabelValue(categoryNameLabel);
    }
    
    public boolean setClientHaircut(String newClientHaircut) {

        return setTextAreaValue(clientHaircutInput, newClientHaircut);
    }
    
    public String getClientHaircut() {
        
        return getLabelValue(clientHaircutLabel);
    }
    
    public boolean setMaturityFlag() {

        return clickOnElement(maturityFlagCB);
    }

    public boolean getMaturityFlagState() {

        return getCheckBoxValue(maturityFlagLabel);
    }
    
    public boolean setMarketRevalFlag() {

        return clickOnElement(marketRevalFlagCB);
    }

    public boolean getMarketRevalFlagState() {

        return getCheckBoxValue(marketRevalFlagLabel);
    }
    
    public boolean setMarketRevalEom(String marketRevalEom) {

        return setDropDown(marketRevalEomDD, marketRevalEom);
    }

    public String getMarketRevalEom() {

        return getLabelValue(marketRevalEomLabel);
    }
    
    public boolean setPriceSource(String priceSource) {

        return setDropDown(priceSourceDD, priceSource);
    }

    public String getPriceSource() {

        return getLabelValue(priceSourceLabel);
    }
}
