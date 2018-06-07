package com.mbl.flowcs.gcs.pages.staticpages;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import com.mbl.flowcs.gcs.pages.staticpages.collateral.CollateralCategorySearchPage;
import com.mbl.flowcs.gcs.pages.staticpages.marketzone.MarketZoneMaintenancePage;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author VMurashov
 */
public class StaticItem extends GcsGemsPage {

    @FindBy(id = "Static-parent-menu-item")
    public WebElement staticItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-0']")
    private WebElement clientAccountSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-1']")
    private WebElement brokerAccountSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-2']")
    private WebElement groupSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-3']")
    private WebElement superGroupSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-4']")
    private WebElement clearingFirmSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-5']")
    private WebElement comissionBrowserSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-6']")
    private WebElement interestSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-7']")
    private WebElement collateralSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-8']")
    private WebElement LtrAccountOverrideSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-9']")
    private WebElement accountClosureWorkbenchSubItem;

    @FindBy(id = "Static-menu-item-10")
    private WebElement marketZoneSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-11']")
    private WebElement marketSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-12']")
    private WebElement instrumentSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-13']")
    private WebElement asxCodeMaintenanceSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-14']")
    private WebElement reportingSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-15']")
    private WebElement tradeFeedSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-16']")
    private WebElement currencySubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-17']")
    private WebElement taxationSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-18']")
    private WebElement gL4InterfaceSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-19']")
    private WebElement riskSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-20']")
    private WebElement codeSetSubItem;

    @FindBy(xpath = "//app-sidebar-menu//div[@id='Static-menu-item-21']")
    private WebElement marginSubItem;

    @FindBy(xpath = "//app-sidebar-tooltip//a[contains(text(),'contact us')]")
    private WebElement disabledItemTooltip;
    

    public StaticItem(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(StaticItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ClientAccountSearchPage goToClientAccountSearch() {

        clickOnElement(clientAccountSubItem);
        return new ClientAccountSearchPage();
    }

    public boolean verifyClientAccountTooltip() {

        return verifyNavigationTooltip(clientAccountSubItem, disabledItemTooltip);
    }

    public BrokerAccountSearchPage goToBrokerAccountSearch() {

        clickOnElement(brokerAccountSubItem);
        return new BrokerAccountSearchPage();
    }

    public boolean verifyBrokerAccountTooltip() {

        return verifyNavigationTooltip(brokerAccountSubItem, disabledItemTooltip);
    }

    public GroupPage goToGroup() {

        clickOnElement(groupSubItem);
        return new GroupPage();
    }

    public boolean verifyGroupTooltip() {

        return verifyNavigationTooltip(groupSubItem, disabledItemTooltip);
    }

    public SupergroupPage goToSuperGroup() {

        clickOnElement(superGroupSubItem);
        return new SupergroupPage();
    }

    public boolean verifySupergroupTooltip() {

        return verifyNavigationTooltip(superGroupSubItem, disabledItemTooltip);
    }

    public ClearingFirmPage goToClearingFirm() {

        clickOnElement(clearingFirmSubItem);
        return new ClearingFirmPage();
    }

    public boolean verifyClearingFirmTooltip() {

        return verifyNavigationTooltip(clearingFirmSubItem, disabledItemTooltip);
    }

    public ComissionBrowserPage goToComissionBrowser() {

        clickOnElement(comissionBrowserSubItem);
        return new ComissionBrowserPage();
    }

    public boolean verifyComissionBrowserTooltip() {

        return verifyNavigationTooltip(comissionBrowserSubItem, disabledItemTooltip);
    }

    public InterestPage goToInterestPage() {

        clickOnElement(interestSubItem);
        return new InterestPage();
    }

    public boolean verifyInterestTooltip() {

        return verifyNavigationTooltip(interestSubItem, disabledItemTooltip);
    }

    public CollateralCategorySearchPage goToCollateralCategorySearchPage() {

        clickOnElement(collateralSubItem);
        return new CollateralCategorySearchPage(driver);
    }

    public boolean verifyCollateralTooltip() {

        return verifyNavigationTooltip(collateralSubItem, disabledItemTooltip);
    }

    public LTRAccountOverrideItem goToLTRAccountOverride() {

        clickOnElement(LtrAccountOverrideSubItem);
        return new LTRAccountOverrideItem();
    }

    public boolean verifyLTRAccountOverrideTooltip() {

        return verifyNavigationTooltip(LtrAccountOverrideSubItem, disabledItemTooltip);
    }

    public AccountClosureWorkbenchItem goToAccoountClosureWorkbench() {

        clickOnElement(accountClosureWorkbenchSubItem);
        return new AccountClosureWorkbenchItem();
    }

    public boolean verifyAccountClosureWorkbenchTooltip() {

        return verifyNavigationTooltip(accountClosureWorkbenchSubItem, disabledItemTooltip);
    }

    public MarketZoneMaintenancePage goToMarketZone() {

        clickOnElement(marketZoneSubItem);
        return new MarketZoneMaintenancePage(driver);
    }

    public boolean verifyMarketZoneTooltip() {

        return verifyNavigationTooltip(marketZoneSubItem, disabledItemTooltip);
    }

    public MarketItem goToMarket() {

        clickOnElement(marketSubItem);
        return new MarketItem(driver);
    }

    public boolean verifyMarketTooltip() {

        return verifyNavigationTooltip(marketSubItem, disabledItemTooltip);
    }

    public InstrumentSubItem goToInstrumentSubItem() {

        clickOnElement(instrumentSubItem);
        return new InstrumentSubItem(driver);
    }

    public ReportingSubItem goToReportingSubItem() {

        clickOnElement(reportingSubItem);
        return new ReportingSubItem(driver);
    }


    public boolean verifyInstrumentTooltip() {

        return verifyNavigationTooltip(instrumentSubItem, disabledItemTooltip);
    }

    public ASXCodeMaintenanceItem goToASXCodeMaintenance() {

        clickOnElement(asxCodeMaintenanceSubItem);
        return new ASXCodeMaintenanceItem();
    }

    public boolean verifyASXCodeMaintenanceTooltip() {

        return verifyNavigationTooltip(asxCodeMaintenanceSubItem, disabledItemTooltip);
    }

    public ReportingItem goToReporting() {

        clickOnElement(reportingSubItem);
        return new ReportingItem();
    }

    public boolean verifyReportingTooltip() {

        return verifyNavigationTooltip(reportingSubItem, disabledItemTooltip);
    }

    public TradeFeedItem goToTradeFeed() {

        clickOnElement(tradeFeedSubItem);
        return new TradeFeedItem();
    }

    public boolean verifyTradeFeedTooltip() {

        return verifyNavigationTooltip(tradeFeedSubItem, disabledItemTooltip);
    }

    public CurrencyItem goToCurrency() {

        clickOnElement(currencySubItem);
        return new CurrencyItem();
    }

    public boolean verifyCurrencyTooltip() {

        return verifyNavigationTooltip(currencySubItem, disabledItemTooltip);
    }

    public TaxationItem goToTaxation() {

        clickOnElement(taxationSubItem);
        return new TaxationItem();
    }

    public boolean verifyTaxationTooltip() {

        return verifyNavigationTooltip(taxationSubItem, disabledItemTooltip);
    }

    public GL4InterfaceItem goToGL4Interface() {

        clickOnElement(gL4InterfaceSubItem);
        return new GL4InterfaceItem();
    }

    public boolean verifyGL4InterfaceTooltip() {

        return verifyNavigationTooltip(gL4InterfaceSubItem, disabledItemTooltip);
    }

    public RiskItem goToRisk() {

        clickOnElement(riskSubItem);
        return new RiskItem();
    }

    public boolean verifyRiskTooltip() {

        return verifyNavigationTooltip(riskSubItem, disabledItemTooltip);
    }

    public CodeSetItem goToCodeSet() {

        clickOnElement(codeSetSubItem);
        return new CodeSetItem();
    }

    public boolean verifyCodeSetTooltip() {

        return verifyNavigationTooltip(codeSetSubItem, disabledItemTooltip);
    }

    public MarginItem goToMargin() {

        clickOnElement(marginSubItem);
        return new MarginItem();
    }

    public boolean verifyMarginTooltip() {

        return verifyNavigationTooltip(marginSubItem, disabledItemTooltip);
    }
}
