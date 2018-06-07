package com.mbl.flowcs.gcs.tests.positions;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.positions.CollateralWorkbenchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class NewCollateralTest extends GcsGemsTest {
    
    protected CollateralWorkbenchPage collateralWorkbenchPage;
    private String clientAccount;
    protected String collateralWorkbench;
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
    private String category;
    private String code;
    private String currency;
    private String isin;
    
    public boolean setCollateralWorkbenchPage() {
        
         collateralWorkbenchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToPositionsItem()
                .goToCollateralWorkbenchSearchPage()
                .findCollateralWorkbenchPageByFirm(collateralWorkbench)
                .createCollateralWorkbenchPage();
        
        return true;
    }    
    
    public boolean modifyCategory() {
        
        return collateralWorkbenchPage.setCategory(category);
    }
    
    public boolean modifyCode() {
        
        return collateralWorkbenchPage.setCode(code);
    }
    
    public boolean modifyCurrency() {
        
        return collateralWorkbenchPage.setCurrency(currency);
    }
    
    public boolean modifyISIN() {
        
        return collateralWorkbenchPage.setIsin(isin);
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
    
    public boolean modifyCollateralAfterHaircut() {
        
        return collateralWorkbenchPage.setCollateralAfterHaircut(collateralAfterHaircut);
    }
    
    public boolean modifyHaircut() {
        
        return collateralWorkbenchPage.setHaircut(haircut);
    }
    
    public boolean modifyMaturity() {
        
        return collateralWorkbenchPage.setMaturity(maturity);
    }
    
    public boolean modifyDateIn() {
        
        return collateralWorkbenchPage.setDateIn(dateIn);
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
    
    public boolean modifyDefaultProirities() {
        
        return collateralWorkbenchPage.setDefaultPrioritiesCheckBox();
    }
    
    public boolean modifyClientAccount() {
        
        return collateralWorkbenchPage.setClientAccount(clientAccount);
    }
    
    public boolean saveChanges() {
        
        collateralWorkbenchPage.clickSave();
        return collateralWorkbenchPage.clickConfirmYes();
    }
    
    public boolean closeDriver() {
        
        return collateralWorkbenchPage.closeWebDriver();
    }
        
    // settters section
    public void setClientAccount(String clientAccount) {
        this.clientAccount = clientAccount;
    }

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
}