package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */
public class InstrumentStaticPage extends GcsGemsPage {

    @FindBy(xpath = "//span[@id='view-code']")
    private WebElement instrumentCodeField;

    @FindBy(xpath = "//span[@id='view-name']")
    private WebElement instrumentNameField;

    @FindBy(xpath = "//p-tabview/div/ul/li[1]")
    private WebElement masterTab;

    @FindBy(xpath = "//p-tabview/div/ul/li[2]")
    private WebElement comissionTab;

    @FindBy(xpath = "//p-tabview/div/ul/li[3]")
    private WebElement deliveryMonthTab;

    @FindBy(xpath = "//p-tabview/div/ul/li[4]")
    private WebElement codeSetsTab;

    @FindBy(xpath = "//p-tabview/div/ul/li[5]")
    private WebElement marketDataTab;

    @FindBy(xpath = "//p-tabview/div/ul/li[6]")
    private WebElement mutualOffsetsTab;
    

    public InstrumentStaticPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);     
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(mutualOffsetsTab));
    }

    public MasterTabPage goToMasterTab() {

        if (masterTab.getAttribute("class").contains("ui-state-active")) {
            return new MasterTabPage(driver);
        } else { 
            clickOnElement(masterTab);
            return new MasterTabPage(driver);
        }
    }
    
    public ComissionTabPage goToComissionTab() {

        clickOnElement(comissionTab);
        return new ComissionTabPage(driver);
    }
    
    public DeliveryMonthTabPage goToDeliveryMonthTab() {

        clickOnElement(deliveryMonthTab);
        return new DeliveryMonthTabPage(driver);
    }
    
    public CodeSetsTabPage goToCodeSetsTab() {

        clickOnElement(codeSetsTab);
        return new CodeSetsTabPage(driver);
    }    

    public MarketDataTabPage goToMarketDataTab(){

        clickOnElement(marketDataTab);
        return new MarketDataTabPage(driver);
    }
    
    public MutualOffsetsTabPage goToMutualOffsetsTab() {

        clickOnElement(mutualOffsetsTab);
        return new MutualOffsetsTabPage(driver);
    }
}
