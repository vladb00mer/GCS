package com.mbl.flowcs.gcs.pages.staticpages.market;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BadgeIdPage extends GcsGemsPage {

    // Main selector
    @FindBy(id = "input-text")
    private WebElement badgeIdSearch;

    @FindBy(xpath = "/html/body/app-root/p-confirmdialog/div/div[3]/p-footer/button[1]")
    private WebElement confirmPopupYes;

    @FindBy(id = "button-revert-Save")
    private WebElement saveButton;

    public BadgeIdPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(badgeIdSearch));
    }

    public boolean setBadgeId(String badgeId) {
        return setDropDownWithSearch(badgeIdSearch, badgeId);
    }

    public void fillAllFields(String badgeIdKey){
        driver.findElement(By.id("dropdown-mktCode")).click();
        driver.findElement(By.id("option-CMX")).click();
        driver.findElement(By.id("input-badgeId")).click();
        driver.findElement(By.id("input-badgeId")).clear();
        driver.findElement(By.id("input-badgeId")).sendKeys(badgeIdKey);
        driver.findElement(By.id("input-description")).clear();
        driver.findElement(By.id("input-description")).sendKeys(badgeIdKey);
    }

    public boolean clickConfirmationBtn(){
        clickOnElement(saveButton);

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(confirmPopupYes));
        return clickOnElement(confirmPopupYes);
    }

}
