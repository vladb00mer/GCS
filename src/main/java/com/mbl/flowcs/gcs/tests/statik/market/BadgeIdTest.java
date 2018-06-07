package com.mbl.flowcs.gcs.tests.statik.market;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.market.BadgeIdPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BadgeIdTest extends GcsGemsTest {
    private BadgeIdPage badgeIdPage;
    private WebDriver driver = null;
    @Setter
    private String badgeIdKey;

    public void InitAndGoToPage() {
        if (null != driver) {
            this.closeDriver();
        }
        badgeIdPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToMarket().goToBadgeId();

        driver = badgeIdPage.getDriver();
    }

    public void CreateBadgeId() {
        InitAndGoToPage();
        driver.findElement(By.id("badge-id-btn-new")).click();
        badgeIdPage.fillAllFields(badgeIdKey);
        badgeIdPage.clickConfirmationBtn();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isStatusUnauthorized() {
        return driver.findElement(By.id("icon-status")).getAttribute("class").contains("unauthorised");
    }

    public boolean isBadgeIdEqual() {
        return badgeIdKey.equals(driver.findElement(By.id("view-badgeId")).getText().trim());
    }

    public boolean isBadgeIdDescriptionEqual() {
        return badgeIdKey.equals(driver.findElement(By.id("input-description")).getAttribute("value"));
    }


    public boolean closeDriver() {
        return badgeIdPage.closeWebDriver();
    }
}
