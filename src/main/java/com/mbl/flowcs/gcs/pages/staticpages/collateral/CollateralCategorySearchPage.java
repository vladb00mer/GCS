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

public class CollateralCategorySearchPage extends GcsGemsPage {
    
    @FindBy(xpath = "//app-gcs-dropdown[@id='dropdown-categories-selector']/div/label")
    public WebElement selectCategoryDropDown;
    
    @FindBy(xpath = "//span[contains(text(), 'Master')]")
    public WebElement masterTabLink;

    @FindBy(xpath = "//span[contains(text(), 'Codes')]")
    public WebElement codesTabLink;
    
    @FindBy(xpath = "//input[@id = 'input-code']")
    private WebElement categoryCodeInput;
    
    @FindBy(xpath = "//span[@id = 'view-code']")
    private WebElement categoryCodeLabel;

    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement categoryNameInput;
    
    @FindBy(xpath = "//span[@id = 'view-name']")
    private WebElement categoryNameLabel;
    
    @FindBy(xpath = "//input[@id = 'input-haircut']")
    private WebElement clientHaircutInput;
    
    @FindBy(xpath = "//span[@id = 'view-haircut']")
    private WebElement clientHaircutLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-maturityFlag']/div/div[2]")
    private WebElement maturityFlagCB;
    
    @FindBy(xpath = "//span[@id = 'view-maturityFlag']")
    private WebElement maturityFlagLabel;
    
    @FindBy(xpath = "//p-checkbox[@id = 'checkbox-marketRevalFlag']/div/div[2]")
    private WebElement marketRevalFlagCB;
    
    @FindBy(xpath = "//span[@id = 'view-marketRevalFlag']")
    private WebElement marketRevalFlagLabel;    
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-marketRevalEOM']/div/label")
    private WebElement marketRevalEomDD;
    
    @FindBy(xpath = "//span[@id = 'view-marketRevalEOM']")
    private WebElement marketRevalEomLabel;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-priceSource']/div/label")
    private WebElement priceSourceDD;
    
    @FindBy(xpath = "//span[@id = 'view-priceSource']")
    private WebElement priceSourceLabel;
    
    @FindBy(xpath = "//span[@id = 'add-new-row']")
    private WebElement addNewRowLink;
    
    @FindBy(xpath = "//div[@class = 'action-container im icon-more2 d-inline-block']")
    private WebElement rowControls;
    
    @FindBy(xpath = "//div[@id = 'save-row0']")
    private WebElement saveCodeRow0;
        
    @FindBy(xpath = "//div[@id = 'edit-row0']")
    private WebElement editCodeRow0;
    
    @FindBy(xpath = "//div[@id = 'remove-row0']")
    private WebElement removeCodeRow0;
    
    @FindBy(xpath = "//input[@id = 'input-code']")
    private WebElement collateralCodeInput;

    @FindBy(xpath = "//span[@id = 'view-code']")
    private WebElement collateralCodeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement collateralNameInput;
    
    @FindBy(xpath = "//span[@id = 'view-name']")
    private WebElement collateralNameLabel;
    
    @FindBy(xpath = "//input[@id = 'input-isin']")
    private WebElement collateralIsinInput;

    @FindBy(xpath = "//span[@id = 'view-isin']")
    private WebElement collateralIsinLabel;
    
    @FindBy(xpath = "//input[@id = 'input-cusip']")
    private WebElement collateralCusipInput;

    @FindBy(xpath = "//span[@id = 'view-cusip']")
    private WebElement collateralCusipLabel;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-priceSource']/div/label")
    private WebElement priceSourceCodesDD;
    
    @FindBy(xpath = "//span[@id = 'view-priceSource']")
    private WebElement priceSourceCodesLabel;
    
    @FindBy(xpath = "//input[@id = 'input-priceSourceCode']")
    private WebElement priceSourceCodeInput;

    @FindBy(xpath = "//span[@id = 'view-priceSourceCode']")
    private WebElement priceSourceCodeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-priceScale']")
    private WebElement priceScaleInput;

    @FindBy(xpath = "//span[@id = 'view-priceScale']")
    private WebElement priceScaleLabel;
    
    
    public CollateralCategorySearchPage(WebDriver driver) {
    
        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(selectCategoryDropDown));
    }

    public boolean selectCategory(String category) {
        
        clickOnElement(selectCategoryDropDown);
        return clickOnElement(driver.findElement(By.xpath("//span[@id='group-item-container-value-"+category.toLowerCase()+"']")));
    }
    
    public boolean createCategory() {
        
        return clickOnElement(iconAddLink);
    }    
    
    public boolean goToMasterTab() {
        
        clickOnElement(masterTabLink);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[contains(text(), 'Category code')]"))));
        return true;
    }
    
    public boolean goToCodesTab() {
        
        clickOnElement(codesTabLink);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(), 'Collateral category:')]"))));
        return true;
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
    
    public boolean clickAddNewRow() {

        return clickOnElement(addNewRowLink);
    }
    
    public boolean setCollateralCode(String newCode) {

        return setTextAreaValue(collateralCodeInput, newCode);
    }
    
    public String getCollateralCode() {
        
        return getLabelValue(collateralCodeLabel);
    }
    
    public boolean setCollateralCodeName(String newName) {

        return setTextAreaValue(collateralNameInput, newName);
    }
    
    public String getCollateralCodeName() {
        
        return getLabelValue(collateralNameLabel);
    }
    
    public boolean setCollateralIsin(String newISIN) {

        return setTextAreaValue(collateralIsinInput, newISIN);
    }
    
    public String getCollateralIsin() {
        
        return getLabelValue(collateralIsinLabel);
    }
    
    public boolean setCollateralCusip(String newCusip) {

        return setTextAreaValue(collateralCusipInput, newCusip);
    }
    
    public String getCollateralCusip() {
        
        return getLabelValue(collateralCusipLabel);
    }
    
    public boolean setPriceSourceCodesTab(String priceSource) {

        return setDropDown(priceSourceCodesDD, priceSource);
    }

    public String getPriceSourceCodesTab() {

        return getLabelValue(priceSourceCodesLabel);
    }
    
    public boolean setPriceSourceCode(String priceSourceCode) {

        return setDropDown(priceSourceCodeInput, priceSourceCode);
    }

    public String getPriceSourceCode() {

        return getLabelValue(priceSourceCodeLabel);
    }
    
    public boolean setPriceScale(String priceScale) {

        return setDropDown(priceScaleInput, priceScale);
    }

    public String getPriceScale() {

        return getLabelValue(priceScaleLabel);
    }
    
    public boolean saveCode() {

        clickOnElement(rowControls);
        return clickOnElement(saveCodeRow0);
    }
    
    public boolean editCode() {

        clickOnElement(rowControls);
        return clickOnElement(editCodeRow0);
    }
    
    public boolean removeCode() {

        clickOnElement(rowControls);
        return clickOnElement(removeCodeRow0);
    }
}
