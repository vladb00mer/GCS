package com.mbl.flowcs.gcs.tests.positions;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.positions.CollateralWorkbenchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CollateralWorkbenchAllocateTest extends GcsGemsTest {
    
    private CollateralWorkbenchPage collateralWorkbenchPage;
    private String collateralWorkbench;
    private String tradePrice;
    private String marketPrice;
    private String faceValue;
    private String collateralAfterHaircut;
    private String haircut;
    private String maturity;
    private String dateIn;
    private String quantity;
    private String allocationPriority;
    private String comment;
    private boolean defaultPriorities;
    private String category;
    private String code;
    private String currency;
    private String isin;
    private String collateralID;
    private String batchID;
    
    
    public boolean setCollateralWorkbenchPage() {
        
        collateralWorkbenchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToPositionsItem()
                .goToCollateralWorkbenchSearchPage()
                .findCollateralWorkbenchPageByFirm(collateralWorkbench)
                .allocateCollateralWorkbenchPage();
        
        return true;
    }

    public boolean verifyTradePrice() {
        
        return collateralWorkbenchPage.getTradePriceLabel().equals(tradePrice);
    }
    
    public boolean verifyMarketPrice() {
        
        return collateralWorkbenchPage.getMarketPriceLabel().equals(marketPrice);
    }
    
    public boolean verifyFaceValue() {
        
        return collateralWorkbenchPage.getFaceValueLabel().equals(faceValue);
    }
    
    public boolean verifyCollateralAfterHaircut() {
        
        return collateralWorkbenchPage.getCollateralAfterHaircutLabel().equals(collateralAfterHaircut);
    }
    
    public boolean verifyHaircut() {
        
        return collateralWorkbenchPage.getHaircutLabel().equals(haircut);
    }
    
    public boolean verifyMaturity() {
        
        return collateralWorkbenchPage.getMaturityLabel().equals(maturity);
    }
    
    public boolean verifyDateIn() {
        
        return collateralWorkbenchPage.getDateInLabel().equals(dateIn);
    }
    
    public boolean verifyQuantity() {
        
        return collateralWorkbenchPage.getQuantityLabel().equals(quantity);
    }
    
    public boolean verifyAllocationPriority() {
        
        return collateralWorkbenchPage.getAllocationPriorityLabel().equals(allocationPriority);
    }
    
    public boolean verifyComment() {
        
        return collateralWorkbenchPage.getCommentLabel().equals(comment);
    }
    
    public boolean verifyDefaultPriorities() {
        
        return (collateralWorkbenchPage.getDefaultPrioritiesCheckBox() == defaultPriorities);
    }
    
    public boolean modifyDefaultPriorities() {
        
        return collateralWorkbenchPage.setDefaultPrioritiesCheckBox();
    }
    
    public boolean verifyCategory() {
        
        return collateralWorkbenchPage.getCategoryLabel().equals(category);
    }
    
    public boolean verifyCode() {
        
        return collateralWorkbenchPage.getCodeLabel().equals(code);
    }
    
    public boolean verifyCurrency() {
        
        return collateralWorkbenchPage.getCurrencyLabel().equals(currency);
    }
    
    public boolean verifyISIN() {
        
        return collateralWorkbenchPage.getIsinLabel().equals(isin);
    }
    
    public boolean verifyCollateralId() {
        
        return collateralWorkbenchPage.getCollateralIdLabel().equals(collateralID);
    }
    
    public boolean verifyBatchId() {
        
        return collateralWorkbenchPage.getBatchIdLabel().equals(batchID);
    }
    
    public boolean closeDriver() {
        
        return collateralWorkbenchPage.closeWebDriver();
    }
    
    // setters section
    public void setCollateralWorkbench(String collateralWorkbench) {
        this.collateralWorkbench = collateralWorkbench;
    }
    public void setTradePrice(String tradePrice) {
        this.tradePrice = tradePrice;
    }
    public void setMarketPrice(String marketPrice) {
        this.marketPrice = marketPrice;
    }
    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }
    public void setCollateralAfterHaircut(String collateralAfterHaircut) {
        this.collateralAfterHaircut = collateralAfterHaircut;
    }
    public void setHaircut(String haircut) {
        this.haircut = haircut;
    }
    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }
    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
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
    public void setDefaultPriorities(boolean defaultPriorities) {
        this.defaultPriorities = defaultPriorities;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void setIsin(String isin) {
        this.isin = isin;
    }
    public void setCollateralID(String collateralID) {
        this.collateralID = collateralID;
    }
    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }
}
