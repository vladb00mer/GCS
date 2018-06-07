package com.mbl.flowcs.gcs.pages.staticpages.reporting;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearingManagersPage extends GcsGemsPage {

    @FindBy(id = "dropdown-categories-selector")
    private WebElement clearingManagersSelector;

    @FindBy(xpath = "//*[contains(@class, 'pageheader')]")
    private WebElement clearingManagersTittle;






    public ClearingManagersPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(clearingManagersSelector));
    }

    public String getClManagersTittle(String newClManagersTittle){
        WebDriverWait wait = new WebDriverWait(driver, 90);
        wait.until(ExpectedConditions.visibilityOf(clearingManagersTittle));
        return getLabelValue(clearingManagersTittle);
    }





}
