package com.mbl.flowcs.gcs.pages.staticpages;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import com.mbl.flowcs.gcs.pages.staticpages.market.BadgeIdPage;
import com.mbl.flowcs.gcs.pages.staticpages.market.TradingVenuePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vmurashov
 */
public class MarketItem extends GcsGemsPage {
    @FindBy(id = "Static-Market-sub-menu-item-2")
    private WebElement tradingVenueSubItem;

    @FindBy(id = "Static-Market-sub-menu-item-4")
    private WebElement badgeIdSubItem;

    public MarketItem(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StaticItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TradingVenuePage goToTradingVenue() {

        clickOnElement(tradingVenueSubItem);
        return new TradingVenuePage(driver);
    }

    public BadgeIdPage goToBadgeId() {
        clickOnElement(badgeIdSubItem);
        return new BadgeIdPage(driver);
    }
}
