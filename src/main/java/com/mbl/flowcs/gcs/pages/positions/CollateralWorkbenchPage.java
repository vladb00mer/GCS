package com.mbl.flowcs.gcs.pages.positions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author vmurashov
 */

public class CollateralWorkbenchPage extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id='view-account']")
    private WebElement accountLabel;
    
    @FindBy(xpath = "//input[@id='input-account']")
    private WebElement clientAccountField;

    @FindBy(xpath = "//input[@id='input-tradePrice']")
    private WebElement tradePriceField;

    @FindBy(xpath = "//span[@id='view-tradePrice']")
    private WebElement tradePriceLabel;
    
    @FindBy(xpath = "//input[@id='input-marketPrice']")
    private WebElement marketPriceField;
    
    @FindBy(xpath = "//span[@id='view-marketPrice']")
    private WebElement marketPriceLabel;
    
    @FindBy(xpath = "//input[@id='input-faceValue']")
    private WebElement faceValueField;
    
    @FindBy(xpath = "//span[@id='view-faceValue']")
    private WebElement faceValueLabel;
        
    @FindBy(xpath = "//input[@id='input-collateralAfterHaircut']")
    private WebElement collateralAfterHaircutField;
    
    @FindBy(xpath = "//span[@id='view-collateralAfterHaircut']")
    private WebElement collateralAfterHaircutLabel;
    
    @FindBy(xpath = "//input[@id='input-haircut']")
    private WebElement haircutField;
    
    @FindBy(xpath = "//span[@id='view-haircut']")
    private WebElement haircutLabel;
    
    @FindBy(xpath = "//p-calendar/span/input")
    private List<WebElement> calendarElements;
    
    @FindBy(xpath = "//span[@id='view-maturity']")
    private WebElement maturityLabel;
    
    @FindBy(xpath = "//span[@id='view-dateIn']")
    private WebElement dateInLabel;    
        
    @FindBy(xpath = "//span[@id='view-quantity']")
    private WebElement quantityLabel;
    
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement quantityField;
    
    @FindBy(xpath = "//span[@id='view-allocationPriority']")
    private WebElement allocationPriorityLabel;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-allocationPriority']/div/label")
    private WebElement allocationPriorityDD;
    
    @FindBy(xpath = "//div[@id='view-comment']")
    private WebElement commentLabel;
    
    @FindBy(xpath = "//textarea[@id='textarea-comment']")
    private WebElement commentTA;
    
    @FindBy(xpath = "//span[@id='view-defaultAlloc']")
    private WebElement defaultPrioritiesLabel;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-defaultAlloc']")
    private WebElement defaultPrioritiesCheckBox;
    
    @FindBy(xpath = "//span[@id='view-category']")
    private WebElement categoryLabel;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-category']/div/label")
    private WebElement categoryDD;
        
    @FindBy(xpath = "//span[@id='view-code']")
    private WebElement codeLabel;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-code']/div/label")
    private WebElement codeDD;
        
    @FindBy(xpath = "//span[@id='view-currency']")
    private WebElement currencyLabel;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-currency']/div/label")
    private WebElement currencyDD;
    
    @FindBy(xpath = "//span[@id='view-isin']")
    private WebElement isinLabel;
    
    @FindBy(xpath = "//input[@id='input-isin']")
    private WebElement isinField;
    
    @FindBy(xpath = "//span[@id='view-collateralId']")
    private WebElement collateralIdLabel;
    
    @FindBy(xpath = "//span[@id='view-batchId']")
    private WebElement batchIDLabel;
    
    @FindBy(xpath = "//span[@id = 'add-new-row']")
    private WebElement addRowLink;
    
    @FindBy(xpath = "//input[@id='input-quantity']")
    private WebElement tableSetQuantity;
    
    @FindBy(xpath = "//span[@id='view-quantity']")
    private WebElement tableGetQuantity;
    
    @FindBy(xpath = "//input[@id='input-haircut']")
    private WebElement tableSetHaircut;
    
    @FindBy(xpath = "//span[@id='view-haircut']")
    private WebElement tableGetHaircut;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-broker']/div/label")
    private WebElement tableSetBroker;
    
    @FindBy(xpath = "//span[@id='view-broker']")
    private WebElement tableGetBroker;
    
    @FindBy(xpath = "//span[@id = 'save-row0']")
    private WebElement saveCodeLink;
    
    @FindBy(xpath = "//span[@id = 'remove-row0']")
    private WebElement removeCodeLink;
    
    @FindBy(xpath = "//span[@id = 'revert-row-0']")
    private WebElement editCodeLink;
    
    
    public CollateralWorkbenchPage(WebDriver driver) {

        this.driver = driver;
        
        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Collateral workbench')]"))));
    }

    public String getTradePrice() {

        return getTextAreaValue(tradePriceField);
    }

    public boolean setTradePrice(String tradePrice) {

        return setTextAreaValue(tradePriceField, tradePrice);
    }
    
    public boolean setClientAccount(String clientAccount) {

        return setTextAreaValue(clientAccountField, clientAccount);
    }
        
    public String getTradePriceLabel() {

        return getLabelValue(tradePriceLabel);
    }
    
    public String getMarketPrice() {

        return getTextAreaValue(marketPriceField);
    }

    public boolean setMarketPrice(String marketPrice) {

        return setTextAreaValue(marketPriceField, marketPrice);
    }
    
    public String getMarketPriceLabel() {

        return getLabelValue(marketPriceLabel);
    }
    
    public String getFaceValue() {

        return getTextAreaValue(faceValueField);
    }

    public boolean setFaceValue(String faceValue) {

        return setTextAreaValue(faceValueField, faceValue);
    }
    
    public String getFaceValueLabel() {

        return getLabelValue(faceValueLabel);
    }
    
    public String getCollateralAfterHaircutLabel() {

        return getLabelValue(collateralAfterHaircutLabel);
    }
    
    public String getCollateralAfterHaircutField() {

        return getLabelValue(collateralAfterHaircutField);
    }

    public boolean setCollateralAfterHaircut(String collateralAfterHaircut) {

        return setTextAreaValue(collateralAfterHaircutField, collateralAfterHaircut);
    }
    
    public String getHaircut() {

        return getTextAreaValue(haircutField);
    }

    public boolean setHaircut(String haircut) {

        return setTextAreaValue(haircutField, haircut);
    }
    
    public String getHaircutLabel() {

        return getLabelValue(haircutLabel);
    }
    
    public String getMaturity() {

        return getTextAreaValue(calendarElements.get(0));
    }
    
    public String getMaturityLabel() {

        return getLabelValue(maturityLabel);
    }

    public boolean setMaturity(String maturity) {

        return setCalendarValue(calendarElements.get(0), maturity);
    }
    
    public String getDateInLabel() {

        return getLabelValue(dateInLabel);
    }
    
    public String getDateInField() {

        return getTextAreaValue(calendarElements.get(1));
    }

    public boolean setDateIn(String dateIn) {

        return setCalendarValue(calendarElements.get(1), dateIn);
    }
    
    public String getQuantity() {

        return getTextAreaValue(quantityField);
    }

    public boolean setQuantity(String quantity) {

        return setTextAreaValue(quantityField, quantity);
    }
    
    public String getQuantityLabel() {

        return getLabelValue(quantityLabel);
    }
    
    public String getAllocationPriority() {

        return getDropDownValue(allocationPriorityDD);
    }

    public boolean setAllocationPriority(String allocationPriority) {

        return setDropDown(allocationPriorityDD, allocationPriority);
    }
    
    public String getAllocationPriorityLabel() {

        return getLabelValue(allocationPriorityLabel);
    }
    
    public String getComment() {

        return getTextAreaValue(commentTA);
    }

    public boolean setComment(String comment) {

        return setTextAreaValue(commentTA, comment);
    }
    
    public String getCommentLabel() {

        return getLabelValue(commentLabel);
    }
    
    public boolean getDefaultPrioritiesLabel() {

        return getCheckBoxLabelValue(defaultPrioritiesLabel);
    }
    
    public boolean getDefaultPrioritiesCheckBox() {

        return getCheckBoxValue(defaultPrioritiesCheckBox);
    }
    
    public boolean setDefaultPrioritiesCheckBox() {

        return clickOnElement(defaultPrioritiesCheckBox);
    }
    
    public String getCategoryLabel() {

        return getLabelValue(categoryLabel);
    }
    
    public String getCategory() {

        return getDropDownValue(categoryDD);
    }

    public boolean setCategory(String category) {

        return setDropDown(categoryDD, category);
    }
    
    public String getCodeLabel() {

        return getLabelValue(codeLabel);
    }
    
    public String getCode() {

        return getDropDownValue(codeDD);
    }

    public boolean setCode(String code) {

        return setDropDown(codeDD, code);
    }
    
    public String getCurrencyLabel() {

        return getLabelValue(currencyLabel);
    }
    
    public String getCurrency() {

        return getDropDownValue(currencyDD);
    }

    public boolean setCurrency(String currency) {

        return setDropDown(currencyDD, currency);
    }
    
    public String getIsin() {

        return getTextAreaValue(isinField);
    }

    public boolean setIsin(String isin) {

        return setTextAreaValue(isinField, isin);
    }
    
    public String getIsinLabel() {

        return getLabelValue(isinLabel);
    }
    
    public String getCollateralIdLabel() {

        return getLabelValue(collateralIdLabel);
    }
    
    public String getBatchIdLabel() {

        return getLabelValue(batchIDLabel);
    }
}
