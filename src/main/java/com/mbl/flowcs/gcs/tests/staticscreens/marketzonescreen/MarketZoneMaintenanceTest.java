package com.mbl.flowcs.gcs.tests.staticscreens.marketzonescreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.marketzone.MarketZoneMaintenancePage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vmurashov
 */

public class MarketZoneMaintenanceTest extends GcsGemsTest {
    
    private MarketZoneMaintenancePage marketZoneMaintenancePage;
    
    private String marketZoneCode;
    private String marketZoneName;
    
       
    public boolean openMarketZoneMaintenance() {
        
        marketZoneMaintenancePage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToMarketZone();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MarketZoneMaintenanceTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public boolean clickAdd() {
        
        return marketZoneMaintenancePage.clickIconAddLink();
    }
    
    public boolean selectMarketZone() {
        
        return marketZoneMaintenancePage.setMarketZone(marketZoneCode);
    }
    
    public boolean verifyCode() {
        
        return marketZoneMaintenancePage.getMarketZoneCode().equals(marketZoneCode);
    }
    
    public boolean modifyCode() {
        
        return marketZoneMaintenancePage.setMarketZoneCode(marketZoneCode);
    }
    
    public boolean verifyName() {
        
        return marketZoneMaintenancePage.getMarketZoneName().equals(marketZoneName);
    }
    
    public boolean modifyName() {
        
        return marketZoneMaintenancePage.setMarketZoneName(marketZoneName);
    }
    
    public boolean clickSave() {
        
        return marketZoneMaintenancePage.clickSave();
    }
    
    public boolean authorise() {
        
        return marketZoneMaintenancePage.clickAuthorise();
    }
    
    public boolean closeDriver() {
        
        return marketZoneMaintenancePage.closeWebDriver();
    }

    // setters
    public void setCode(String marketZoneCode) {
        this.marketZoneCode = marketZoneCode;
    }

    public void setName(String marketZoneName) {
        this.marketZoneName = marketZoneName;
    }
}
