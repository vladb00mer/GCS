package com.mbl.flowcs.gcs.tests.statik.market;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.market.TradingVenuePage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TradingVenuesTest extends GcsGemsTest {
    private TradingVenuePage tradingVenuePage;
    private WebDriver driver = null;
    @Setter
    private String venueKey;

    public void InitAndGoToPage() {
        if (null != driver) {
            this.closeDriver();
        }
        tradingVenuePage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToMarket().goToTradingVenue();

        driver = tradingVenuePage.getDriver();
    }

    public void CreateNewTradingVenue() {
        InitAndGoToPage();
        driver.findElement(By.id("icon-add")).click();
        driver.findElement(By.id("input-tradingVenue")).click();
        driver.findElement(By.id("input-tradingVenue")).clear();
        driver.findElement(By.id("input-tradingVenue")).sendKeys(venueKey);
        driver.findElement(By.id("input-name")).clear();
        driver.findElement(By.id("input-name")).sendKeys(venueKey);
        driver.findElement(By.id("dropdown-localOsFlag")).click();
        driver.findElement(By.id("option-L")).click();
        driver.findElement(By.id("checkbox-averagePrice")).click();
        driver.findElement(By.id("checkbox-tassFlag")).click();
        driver.findElement(By.id("checkbox-onlineInputFlag")).click();
        driver.findElement(By.id("dropdown-feeCalcFlag")).click();
        driver.findElement(By.id("option-1")).click();
        driver.findElement(By.id("checkbox-stacsIncludesGst")).click();
        driver.findElement(By.id("button-revert-Save")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void OpenTradingVenue() {
        InitAndGoToPage();
        driver.findElement(By.id("dropdown-categories-selector")).click();
        driver.findElement(By.id("group-item-container-" + convertTitleToKey(venueKey))).click();
    }

    private String convertTitleToKey(String venueKey) {
        return venueKey.toLowerCase() + '-' + venueKey.toLowerCase();
    }

    public void rejectTradingVenue() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        By rejectElement = By.id("button-revert-Reject");
        wait.until(ExpectedConditions.visibilityOfElementLocated(rejectElement));
        driver.findElement(rejectElement).click();
        driver.findElement(By.xpath("//app-navigation[contains(@class, 'toolbar')]//p-footer/button/span[contains(text(),'Yes')]")).click();
    }

    public boolean isStatusUnauthorized() {
        return driver.findElement(By.id("icon-status")).getAttribute("class").contains("unauthorised");
    }

    public boolean isVenueKeyEqual() {
        return venueKey.equals(driver.findElement(By.id("view-tradingVenue")).getText().trim());
    }

    public boolean isVenueNameEqual() {
        return venueKey.equals(driver.findElement(By.id("input-name")).getAttribute("value"));
    }

    public boolean selectTradingVenue() {
        driver.findElement(By.id("dropdown-categories-selector")).click();
        driver.findElement(By.id("group-item-container-aa-loncmdaa")).click();
        driver.findElement(By.id("button-revert-Save")).click();
        return true;
    }


    public boolean closeDriver() {
        return tradingVenuePage.closeWebDriver();
    }
}
