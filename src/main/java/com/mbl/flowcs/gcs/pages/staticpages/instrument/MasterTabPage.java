package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author vmurashov
 */

public class MasterTabPage extends GcsGemsPage {

    @FindBy(xpath = "//span[@id = 'header-instrument-details']")
    private WebElement instrumentDetailsAccordeon;
    
    @FindBy(xpath = "//span[@id = 'header-decimals']")
    private WebElement decimalsAccordeon;
    
    @FindBy(xpath = "//span[@id = 'header-pricing']")
    private WebElement pricingAccordeon;
    
    @FindBy(xpath = "//span[@id = 'header-closing-disposition-overrides']")
    private WebElement closingDispositionOverridesAccordeon;

    @FindBy(xpath = "//span[@id = 'header-cascading-contracts']")
    private WebElement cascadingContractsAccordeon;

    @FindBy(xpath = "//span[@id = 'header-reportable-levels']") 
    private WebElement reportableLevelsAccordeon;    

    @FindBy(xpath = "//span[@id = 'header-margin']")
    private WebElement marginAccordeon;

    @FindBy(xpath = "//span[@id = 'header-non-span-rates']")
    private WebElement nonSpanRatesAccordeon;
    
    @FindBy(xpath = "//p-accordion/div/p-accordiontab/div[1]")
    private List<WebElement> accordeons;
    

    public MasterTabPage(WebDriver driver) {

        this.driver = driver;        
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean turnAccordeonsOFF() {
        
        accordeons.forEach((acc) -> { turnAccordeon(acc, "off"); });
        
        return true;
    }
        
    public InstrumentDetailsAccordeon goToInstrumentDetailsAccordeon() {

        if (instrumentDetailsAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new InstrumentDetailsAccordeon(driver);
        } else { 
            clickOnElement(instrumentDetailsAccordeon);
            return new InstrumentDetailsAccordeon(driver);
        }
    }

    public ClosingDispositionOverridesAccordeon goToClosingDispositionOverridesAccordeon() {

        if (closingDispositionOverridesAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new ClosingDispositionOverridesAccordeon(driver);
        } else { 
            clickOnElement(closingDispositionOverridesAccordeon);
            return new ClosingDispositionOverridesAccordeon(driver);
        }
    }

    public CascadingContractsAccordeon goToCascadingContractsAccordeon() {

        if (cascadingContractsAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new CascadingContractsAccordeon(driver);
        } else { 
            clickOnElement(cascadingContractsAccordeon);
            return new CascadingContractsAccordeon(driver);
        }
    }

    public DecimalsAccordeon goToDecimalsAccordeon() {

        if (decimalsAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new DecimalsAccordeon(driver);
        } else { 
            clickOnElement(decimalsAccordeon);
            return new DecimalsAccordeon(driver);
        }
    }

    public PricingAccordeon goToPricingAccordeon() {

        if (pricingAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new PricingAccordeon(driver);
        } else { 
            clickOnElement(pricingAccordeon);
            return new PricingAccordeon(driver);
        }
    }

    public MarginAccordeon goToMarginAccordeon() {

        if (marginAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new MarginAccordeon(driver);
        } else { 
            clickOnElement(marginAccordeon);
            return new MarginAccordeon(driver);
        }
    }

    public NonSpanRatesAccordeon goToNonSpanRatesAccordeon() {

        if (nonSpanRatesAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new NonSpanRatesAccordeon(driver);
        } else { 
            clickOnElement(nonSpanRatesAccordeon);
            return new NonSpanRatesAccordeon(driver);
        }
    }

    public ReportableLevelsAccordeon goToReportableLevelsAccordeon() {

        if (reportableLevelsAccordeon.getAttribute("class").contains("ui-state-active")) {
            return new ReportableLevelsAccordeon(driver);
        } else { 
            clickOnElement(reportableLevelsAccordeon);
            return new ReportableLevelsAccordeon(driver);
        }
    }
}
