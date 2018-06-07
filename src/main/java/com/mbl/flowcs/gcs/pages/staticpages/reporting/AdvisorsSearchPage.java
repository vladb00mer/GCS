package com.mbl.flowcs.gcs.pages.staticpages.reporting;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author lev boichenko
 */

public class AdvisorsSearchPage extends GcsGemsPage {

    @FindBy(id = "dropdown-categories-selector")
    private WebElement adviserSelector;

    @FindBy(id = "icon-add")
    private WebElement newAdviserButton;

    @FindBy(id = "input-code")
    private WebElement advisorCodeField;

    @FindBy(id = "input-name")
    private WebElement advisorNameField;

    @FindBy(id = "view-name")
    private WebElement advisorNameFieldView;

    @FindBy(id = "icon-close")
    private WebElement inactiveIcon;

    @FindBy(id = "icon-open-account")
    private WebElement activeIcon;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@class=\"ui-growl-title\"]")
    private WebElement growlMessage;

    @FindBy(xpath = "/html/body/app-root/p-growl/div/div/div/div[2]/p")
    private WebElement descGrowlMessage;

    @FindBy(xpath = "//*[@id=\"dropdown-categories-selector\"]/div/label")
    private WebElement selectedAdviserValue;

    @FindBy(id = "icon-status")
    private WebElement iconStatus;

    @FindBy(id = "view-code")
    private WebElement adviserViewCode;

    @FindBy(xpath = "//li[5]/a/span[@class=\"ui-menuitem-text\" and text()='Advisers']")
    private WebElement advisersLinkBC;

    @FindBy(xpath = "//*[@id=\"dropdown-categories-selector\"]/div/div[4]/div[1]/input")
    private WebElement searchAdvisers;

    @FindBy(xpath = "//*[@id=\"dropdown-categories-selector\"]/div/div[4]/div[2]/ul/li[2]")
    private WebElement advisersValues;

    @FindBy(xpath = "//span[@class=\"link\" and text()='Back']")
    private WebElement backLink;

    @FindBy(xpath = "/html/body/app-root/p-confirmdialog/div/div[3]/p-footer/button[1]/span")
    private WebElement confirmDialogYes;

    @FindBy(xpath = "//span[contains(text(),'Reject')]")
    private WebElement rejectButton;

    @FindBy(xpath = "//span[contains(text(),'Authorise')]")
    private WebElement authoriseButton;

    @FindBy(xpath = "//div[1]/app-navigation/p-confirmdialog/div/div[3]/p-footer/button[1]")
    private WebElement confirmRejectYes;

    @FindBy(xpath = "//app-navigation/p-confirmdialog/div/div[3]/p-footer/button[1]")
    private WebElement yesButton;

    @FindBy(xpath = "//*[contains(@class, 'previous')]/span")
    private WebElement previousAdviserName;

    @FindBy(xpath = "//span[contains(text(),'Revert')]")
    private WebElement revertButton;


    public AdvisorsSearchPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(adviserSelector));
    }

    public boolean setClickNewAdviserButton() {

        return clickOnElement(newAdviserButton);
    }

    public boolean setClickSaveButton(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        return clickOnElement(saveButton);
    }

    public boolean setAdvisorCode(String newAdvisorCode){

        return setTextAreaValue(advisorCodeField, newAdvisorCode);
    }

    public boolean setAdvisorName(String newAdvisorName){

        return setTextAreaValue(advisorNameField ,newAdvisorName);
    }

    public String getSuccessMessage(String newSuccessMessage){

        return getLabelValue(growlMessage);
    }

    public String getRejectMessage(String newRejectMessage){

        return getLabelValue(growlMessage);
    }

    public String getApproveMessage(String newApproveMessage){

        return getLabelValue(growlMessage);
    }

    public String getMessageDescription(String newMessageDescription){

        return getLabelValue(descGrowlMessage);
    }

    public String getSelectedAdviser(String newSelectedAdviser){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(selectedAdviserValue));
        return getLabelValue(selectedAdviserValue);
    }

    public String getAdviserStatus(String newAdviserStatus){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(iconStatus));
        return iconStatus.getCssValue("color");
    }

    public String getAdvisorViewCodeValue(String newAdvisorCodeValue){

        return getLabelValue(adviserViewCode);
    }

    public String getAdvisorNameValue(String newAdvisorNameValue){

        return getTextAreaValue(advisorNameField);
    }

    public String getAdvisorNameValueView(String newAdvisorNameValueView){

        return getLabelValue(advisorNameFieldView);

    }

    public String getPreviousValue(String newPreviousValue){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(previousAdviserName));
        return getLabelValue(previousAdviserName);
    }

    public boolean setRefreshPage(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean setAdvisersBC(){

        return clickOnElement(advisersLinkBC);

    }

    public boolean setBackLink(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(backLink));
        clickOnElement(backLink);
        if (confirmDialogYes.isDisplayed()){
            clickOnElement(confirmDialogYes);
        }
        return true;
    }

    public boolean getAdvisor(String Advisor){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(selectedAdviserValue));
        clickOnElement(selectedAdviserValue);
        setTextAreaValue(searchAdvisers, Advisor);
        return clickOnElement(advisersValues);
    }

    public boolean setRejectBtn(){

        clickOnElement(rejectButton);
        return clickOnElement(confirmRejectYes);
    }

    public boolean setRevertButton(){

        return revertButton.isDisplayed();
    }

    public boolean setAuthoriseBtn(){
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(authoriseButton));
        clickOnElement(authoriseButton);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(confirmRejectYes));
        return clickOnElement(confirmRejectYes);
    }

    public boolean setInactiveIcon(){

        clickOnElement(inactiveIcon);
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.elementToBeClickable(yesButton));
        return clickOnElement(yesButton);
    }

    public boolean setDisplayActiveIcon(){
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOf(activeIcon));
        return activeIcon.isDisplayed();
    }

    public boolean setReloadPopUp(){

        Alert popup = driver.switchTo().alert();
        // here you can examine the text within the alert using popup.getText();
        popup.accept();
        return true;
    }

}
