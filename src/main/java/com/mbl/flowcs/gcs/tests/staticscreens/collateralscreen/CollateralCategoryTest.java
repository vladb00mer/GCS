package com.mbl.flowcs.gcs.tests.staticscreens.collateralscreen;

import com.mbl.flowcs.gcs.pages.common.NavigationTree;
import com.mbl.flowcs.gcs.pages.staticpages.collateral.CollateralCategorySearchPage;
import com.mbl.flowcs.gcs.tests.common.GcsGemsTest;

/**
 *
 * @author vmurashov
 */

public class CollateralCategoryTest extends GcsGemsTest {
    
    private CollateralCategorySearchPage collateralCategorySearchPage;
    
    private String categoryCode;
    private String categoryName;
    private String clientHaircut;    
    private boolean maturityFlag;
    private boolean marketRevalFlag;    
    private String marketRevalEOM;
    private String priceSource;
    
    private String collateralCode;
    private String collateralCodeName;
    private String isin;    
    private String cusip;
    private String priceSourceC;
    private String priceSourceCodeC;    
    private String priceScale;
    
    
    
    public boolean openCollateralSearch() {
        
        collateralCategorySearchPage = new NavigationTree(getBrowser(), getResolution(), getUser())
                .goToStaticItem()
                .goToCollateralCategorySearchPage();
        
        return true;
    }
    
    public boolean openCategory() {
        
        return collateralCategorySearchPage.selectCategory(categoryCode);
    }
    
    public boolean openMasterTab() {
        
        collateralCategorySearchPage.goToMasterTab();        
        return true;
    }
    
    public boolean openCodesTab() {
        
        collateralCategorySearchPage.goToCodesTab();        
        return true;
    }
    
    public boolean createCategory() {
        
        return collateralCategorySearchPage.createCategory();
    }
    
    public boolean addNewRow() {
        
        return collateralCategorySearchPage.clickAddNewRow();
    }
    
    public boolean verifyCategoryCode() {

        return collateralCategorySearchPage.getCategoryCode().equals(categoryCode);
    }
    
    public boolean modifyCategoryName() {

        return collateralCategorySearchPage.setCategoryName(categoryName);
    }
    
    public boolean verifyCategoryName() {

        return collateralCategorySearchPage.getCategoryName().equals(categoryName);
    }
    
    public boolean modifyClientHaircut() {

        return collateralCategorySearchPage.setClientHaircut(clientHaircut);
    }
    
    public boolean verifyClientHaircut() {

        return collateralCategorySearchPage.getClientHaircut().equals(clientHaircut);
    }
    
    public boolean modifyMaturityFlag() {

        return collateralCategorySearchPage.setMaturityFlag();
    }
    
    public boolean verifyMaturityFlag() {

        return (collateralCategorySearchPage.getMaturityFlagState() == maturityFlag);
    }
    
    public boolean modifyMarketRevalFlag() {

        return collateralCategorySearchPage.setMarketRevalFlag();
    }
    
    public boolean verifyMarketRevalFlag() {

        return (collateralCategorySearchPage.getMarketRevalFlagState()== marketRevalFlag);
    }
    
    public boolean modifyMarketRevalEOM() {

        return collateralCategorySearchPage.setMarketRevalEom(marketRevalEOM);
    }
    
    public boolean verifyMarketRevalEOM() {

        return collateralCategorySearchPage.getMarketRevalEom().equals(marketRevalEOM);
    }
    
    public boolean modifyPriceSource() {

        return collateralCategorySearchPage.setPriceSource(priceSource);
    }
    
    public boolean verifyPriceSource() {

        return collateralCategorySearchPage.getPriceSource().equals(priceSource);
    }
    
    public boolean modifyCollateralCode() {

        return collateralCategorySearchPage.setCollateralCode(collateralCode);
    }
    
    public boolean verifyCollateralCode() {

        return collateralCategorySearchPage.getCollateralCode().equals(collateralCode);
    }
    
    public boolean modifyCollateralCodeName() {

        return collateralCategorySearchPage.setCollateralCodeName(collateralCodeName);
    }
    
    public boolean verifyCollateralCodeName() {

        return collateralCategorySearchPage.getCollateralCodeName().equals(collateralCodeName);
    }
    
    public boolean modifyCollateralIsin() {

        return collateralCategorySearchPage.setCollateralIsin(isin);
    }
    
    public boolean verifyCollateralIsin() {

        return collateralCategorySearchPage.getCollateralIsin().equals(isin);
    }
    
    public boolean modifyCollateralCusip() {

        return collateralCategorySearchPage.setCollateralCusip(cusip);
    }
    
    public boolean verifyCollateralCusip() {

        return collateralCategorySearchPage.getCollateralCusip().equals(cusip);
    }
    
    public boolean modifyPriceSourceCodesTab() {

        return collateralCategorySearchPage.setPriceSourceCodesTab(priceSourceC);
    }
    
    public boolean verifyPriceSourceCodesTab() {

        return collateralCategorySearchPage.getPriceSourceCodesTab().equals(priceSourceC);
    }
    
    public boolean modifyPriceSourceCode() {

        return collateralCategorySearchPage.setPriceSourceCode(priceSourceCodeC);
    }
    
    public boolean verifyPriceSourceCode() {

        return collateralCategorySearchPage.getPriceSourceCode().equals(priceSourceCodeC);
    }
    
    public boolean modifyPriceScale() {

        return collateralCategorySearchPage.setPriceScale(priceScale);
    }
    
    public boolean verifyPriceScale() {

        return collateralCategorySearchPage.getPriceScale().equals(priceScale);
    }
    
    public boolean saveAndConfirm() {
        
        collateralCategorySearchPage.clickSave();
        collateralCategorySearchPage.clickConfirmYes();
        return true;
    }

    public boolean authoriseChanges() {

        return collateralCategorySearchPage.clickAuthorise();
    }
    
    public boolean closeDriver() {

        return collateralCategorySearchPage.closeWebDriver();
    }    

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setClientHaircut(String clientHaircut) {
        this.clientHaircut = clientHaircut;
    }

    public void setMaturityFlag(boolean maturityFlag) {
        this.maturityFlag = maturityFlag;
    }

    public void setMarketRevalFlag(boolean marketRevalFlag) {
        this.marketRevalFlag = marketRevalFlag;
    }

    public void setMarketRevalEOM(String marketRevalEOM) {
        this.marketRevalEOM = marketRevalEOM;
    }

    public void setPriceSource(String priceSource) {
        this.priceSource = priceSource;
    }
    
    public void setCollateralCode(String collateralCode) {
        this.collateralCode = collateralCode;
    }

    public void setCollateralCodeName(String collateralCodeName) {
        this.collateralCodeName = collateralCodeName;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    public void setPriceSourceC(String priceSourceC) {
        this.priceSourceC = priceSourceC;
    }

    public void setPriceSourceCodeC(String priceSourceCodeC) {
        this.priceSourceCodeC = priceSourceCodeC;
    }

    public void setPriceScale(String priceScale) {
        this.priceScale = priceScale;
    }
}
