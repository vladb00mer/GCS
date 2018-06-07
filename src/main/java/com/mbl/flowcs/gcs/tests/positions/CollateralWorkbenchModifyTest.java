package com.mbl.flowcs.gcs.tests.positions;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.positions.CollateralWorkbenchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CollateralWorkbenchModifyTest extends GcsGemsTest {
    
    private CollateralWorkbenchPage collateralWorkbenchPage;
    private String collateralWorkbench;
    private String tradePrice;
    private String marketPrice;
    private String faceValue;
    private String haircut;
    private String maturity;
    private String quantity;
    private String allocationPriority;
    private String comment;
    
    public boolean setCollateralWorkbenchPage() {
        
        collateralWorkbenchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToPositionsItem()
                .goToCollateralWorkbenchSearchPage()
                .findCollateralWorkbenchPageByGroup(collateralWorkbench)
                .modifyCollateralWorkbenchPage();
        
        return true;
    }
    
    public boolean modifyTradePrice() {
        
        return collateralWorkbenchPage.setTradePrice(tradePrice);
    }
    
    public boolean modifyMarketPrice() {
        
        return collateralWorkbenchPage.setMarketPrice(marketPrice);
    }
    
    public boolean modifyFaceValue() {
        
        return collateralWorkbenchPage.setFaceValue(faceValue);
    }
    
    public boolean modifyHaircut() {
        
        return collateralWorkbenchPage.setHaircut(haircut);
    }
    
    public boolean modifyMaturity() {
        
        return collateralWorkbenchPage.setMaturity(maturity);
    }
    
    public boolean modifyQuantity() {
        
        return collateralWorkbenchPage.setQuantity(quantity);
    }
    
    public boolean modifyAllocationPriority() {
        
        return collateralWorkbenchPage.setAllocationPriority(allocationPriority);
    }
    
    public boolean modifyComment() {
        
        return collateralWorkbenchPage.setComment(comment);
    }
    
    public boolean revertModifications() {
        
        collateralWorkbenchPage.clickRevert();
        return collateralWorkbenchPage.clickConfirmYes();
    }
    
    public boolean saveModifications() {
        
        return collateralWorkbenchPage.clickSave();
    }
    
    public boolean rejectModifications() {
        
        collateralWorkbenchPage.clickReject();
        return collateralWorkbenchPage.clickConfirmYes();
    }
    
    public boolean closeDriver() {
        
        return collateralWorkbenchPage.closeWebDriver();
    }
        
    // setters section    
    public void setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
    }

    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public void setHaircut(String haircut) {
        this.haircut = haircut;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setAllocationPriority(String allocationPriority) {
        this.allocationPriority = allocationPriority;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setCollateralWorkbench(String collateralWorkbench) {
        this.collateralWorkbench = collateralWorkbench;
    }
}
