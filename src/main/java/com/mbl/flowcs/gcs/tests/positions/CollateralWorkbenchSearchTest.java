package com.mbl.flowcs.gcs.tests.positions;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.positions.CollateralWorkbenchSearchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CollateralWorkbenchSearchTest extends GcsGemsTest {
    
    private CollateralWorkbenchSearchPage collateralWorkbenchSearchPage;
    
    private String firm;
    private String superGroup;
    private String group;
    private String account;
    private String category;
    private String shortCategory;
    private String currency;
    
    
    public boolean setCollateralWorkbenchSearchPage() {
        
        collateralWorkbenchSearchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToPositionsItem()
                .goToCollateralWorkbenchSearchPage();
        return true;
    }
    
    public boolean verifySearchByFirm() {
        
        return collateralWorkbenchSearchPage.findCollateralWorkbenchPageByFirm(firm).verifySearchResult("firm", firm);
    }
    
    public boolean verifySearchBySuperGroup() {
        
        return collateralWorkbenchSearchPage.findCollateralWorkbenchPageBySuperGroup(superGroup).verifySearchResult("supergroup", superGroup);
    }
    
    public boolean verifySearchByGroup() {
        
        return collateralWorkbenchSearchPage.findCollateralWorkbenchPageByGroup(group).verifySearchResult("group", group);
    }
    
    public boolean verifySearchByAccount() {
        
        return collateralWorkbenchSearchPage.findCollateralWorkbenchPageByAccount(account).verifySearchResult("account", account);
    }
    
    public boolean verifySearchByCategory() {
        
        return collateralWorkbenchSearchPage.findCollateralWorkbenchPageByCategory(category).verifySearchResult("category", shortCategory);
    }
    
    public boolean verifySearchByCurrency() {
        
        return collateralWorkbenchSearchPage.findCollateralWorkbenchPageByCurrency(currency).verifySearchResult("currency", currency);
    }

    public boolean closeDriver() {
        
        return collateralWorkbenchSearchPage.closeWebDriver();
    }
    
    // setters section
    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setSuperGroup(String superGroup) {
        this.superGroup = superGroup;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setShortCategory(String shortCategory) {
        this.shortCategory = shortCategory;
    }
}
