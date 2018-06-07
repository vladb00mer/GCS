package com.mbl.flowcs.gcs.pages.staticpages.reporting;

/**
 * @author lev boichenko
 */

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatementHeaderSearchPage extends GcsGemsPage {

    @FindBy(id = "dropdown-categories-selector")
    private WebElement statementHeaderSelector;

    @FindBy(xpath = "//*[contains(@class, 'pageheader')]")
    private WebElement statementHeaderTittle;

    @FindBy(xpath = "//*[@id=\"dropdown-categories-selector\"]/div/label")
    private WebElement stHeaderSelectorLabel;

    @FindBy(id = "icon-add")
    private WebElement newStHeaderButton;

    @FindBy(id = "input-headerType")
    private WebElement statementHeader;

    @FindBy(id = "view-headerType")
    private WebElement statementHeaderView;

    @FindBy(id = "textarea-address")
    private WebElement address;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@class=\"ui-growl-title\"]")
    private WebElement growlMessage;

    @FindBy(id = "icon-status")
    private WebElement iconStatus;

    @FindBy(xpath = "//li[5]/a/span[@class=\"ui-menuitem-text\" and text()='Statement headers']")
    private WebElement statementHeaderLinkBC;

    @FindBy(xpath = "//*[@id=\"dropdown-categories-selector\"]/div/div[4]/div[1]/input")
    private WebElement searchStHeader;

    @FindBy(xpath = "//span[contains(@id, 'group-item-container')]")
    private WebElement currentStHeaderRecord;

    @FindBy(xpath = "//span[@class=\"link\" and text()='Back']")
    private WebElement backLink;

    @FindBy(xpath = "/html/body/app-root/p-confirmdialog/div/div[3]/p-footer/button[1]/span")
    private WebElement confirmDialogYes;

    @FindBy(xpath = "//span[contains(text(),'Reject')]")
    private WebElement rejectButton;

    @FindBy(xpath = "//div[1]/app-navigation/p-confirmdialog/div/div[3]/p-footer/button[1]")
    private WebElement confirmRejectYes;

    @FindBy(id = "view-address")
    private WebElement addressPending;

    @FindBy(xpath = "//span[contains(text(),'Authorise')]")
    private WebElement authoriseButton;

    @FindBy(id = "checkbox-printLogo")
    private WebElement printLogoCheckbox;

    @FindBy(id = "checkbox-wideImage")
    private WebElement wideLogoCheckbox;

    @FindBy(xpath = "//*[@id=\"dropdown-logoType\"]/div/label")
    private WebElement logoSelector;

    @FindBy(id = "view-logoType")
    private WebElement logoValuePending;

    @FindBy(xpath = "/html/body/div/div[1]/input")
    private WebElement searchLogo;

    @FindBy(xpath = "/html/body/div/div[2]/ul/li")
    private WebElement searchedLogoValue;


    public StatementHeaderSearchPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(statementHeaderSelector));
    }


    public String getStHeaderTittle(String newStHeaderTittle){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(statementHeaderTittle));
        return getLabelValue(statementHeaderTittle);
    }

    public String getStHeaderSelector(String newStHeaderSelector){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(stHeaderSelectorLabel));
        return getLabelValue(stHeaderSelectorLabel);
    }

    public boolean setNewStHeaderBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(newStHeaderButton));
        return newStHeaderButton.isDisplayed();
    }

    public boolean setNewStHeader(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(newStHeaderButton));
        return clickOnElement(newStHeaderButton);
    }

    public boolean setStHeader(String newStHeader){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(statementHeader));
        return setTextAreaValue(statementHeader, newStHeader);
    }

    public boolean setAddress(String newAddress){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(address));
        return setTextAreaValue(address, newAddress);
    }

    public boolean setClickSaveButton(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        return clickOnElement(saveButton);
    }

    public String getSuccessMessage(String newSuccessMessage){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(growlMessage));
        return getLabelValue(growlMessage);
    }

    public String getStHeaderStatus(String newStHeaderStatus){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(iconStatus));
        return !iconStatus.getAttribute("class").contains("unauthorised") ? "authorised" : "unauthorised";
    }

    public String getStHeader(String newStHeader){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(statementHeaderView));
        return getLabelValue(statementHeaderView);
    }

    public String getAddress(String newAddress){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(address));
        return getTextAreaValue(address);
    }

    public boolean setRefreshPage(){
        driver.navigate().refresh();
        return true;
    }

    public boolean setStHeaderBC(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(statementHeaderLinkBC));
        return clickOnElement(statementHeaderLinkBC);

    }

    public boolean getStHeaderRecord(String StHeaderRecord){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(statementHeaderLinkBC));
        clickOnElement(stHeaderSelectorLabel);
        setTextAreaValue(searchStHeader, StHeaderRecord);
        return clickOnElement(currentStHeaderRecord);
    }

    public boolean getLogoToUse(String LogoToUse){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(logoSelector));
        clickOnElement(logoSelector);
        setTextAreaValue(searchLogo,LogoToUse);
        return clickOnElement(searchedLogoValue);
    }

    public String getLogo(String newLogo){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(logoValuePending));
        return getLabelValue(logoValuePending);
    }

    public boolean setBackLink() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(backLink));
        clickOnElement(backLink);
        if (confirmDialogYes.isDisplayed()) {
            clickOnElement(confirmDialogYes);
        }
        return true;

    }

    public boolean setRejectBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(rejectButton));
        clickOnElement(rejectButton);
        return clickOnElement(confirmRejectYes);
    }

    public String getRejectMessage(String newRejectMessage){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(growlMessage));
        return getLabelValue(growlMessage);
    }

    public String getAddressPending(String newAddressPending){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(addressPending));
        return getLabelValue(addressPending);

    }

    public boolean setAuthoriseBtn(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(authoriseButton));
        clickOnElement(authoriseButton);
        return clickOnElement(confirmRejectYes);
    }

    public String getApproveMessage(String newApproveMessage){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(growlMessage));
        return getLabelValue(growlMessage);
    }

    public boolean setPrintLogo(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(printLogoCheckbox));
        return clickOnElement(printLogoCheckbox);

    }

    public boolean setWideLogo(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(wideLogoCheckbox));
        return clickOnElement(wideLogoCheckbox);
    }

}

