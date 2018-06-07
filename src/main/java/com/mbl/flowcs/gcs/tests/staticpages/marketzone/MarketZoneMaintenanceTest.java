package com.mbl.flowcs.gcs.tests.staticpages.marketzone;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.marketzone.MarketZoneMaintenancePage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

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
