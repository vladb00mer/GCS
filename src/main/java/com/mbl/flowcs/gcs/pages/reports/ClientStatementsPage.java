package com.mbl.flowcs.gcs.pages.reports;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */

public class ClientStatementsPage extends GcsGemsPage{
    
    // top
    @FindBy(xpath = "//div[contains(text(), 'Client statements')]")
    protected WebElement pageHeader;
    
    @FindBy(xpath = "//span[contains(text(), 'Reset')]")
    protected WebElement resetButton;
    
    @FindBy(xpath = "//span[contains(text(), 'Run')]")
    protected WebElement runButton;
    
    // first
    @FindBy(xpath = "//p-checkbox[@id='checkbox-tradingAdvice']/div/div[2]")
    private WebElement tradingAdviceCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-openPosition']/div/div[2]")
    private WebElement openPositionCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-openPositionSummary']/div/div[2]")
    private WebElement openPositionSummaryCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-collateralStatement']/div/div[2]")
    private WebElement collateralStatementCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-monthlyAccountStatement']/div/div[2]")
    private WebElement monthlyAccountStatementCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-taxInvoice']/div/div[2]")
    private WebElement taxInvoiceCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-interestStatement']/div/div[2]")
    private WebElement interestStatementCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-dailyStatement']/div/div[2]")
    private WebElement dailyStatementCheckBox;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-monthlyStatement']/div/div[2]")
    private WebElement monthlyStatementCheckBox;
    
    // second
    @FindBy(xpath = "//p-dropdown[@id='dropdown-clearingFirm']/div/label")
    private WebElement clearingFirmDD;
    
    @FindBy(xpath = "//input[@id = 'input-fromAccount']")
    private WebElement fromClientAccountInput;
    
    @FindBy(xpath = "//input[@id = 'input-toAccount']")
    private WebElement toClientAccountInput;
    
    @FindBy(xpath = "//input[@id = 'input-fromGroup']")
    private WebElement fromGroupInput;
    
    @FindBy(xpath = "//input[@id = 'input-toGroup']")
    private WebElement toGroupInput;
    
    @FindBy(xpath = "//input[@id = 'input-superGroup']")
    private WebElement superGroupInput;
    
    @FindBy(xpath = "//input[@id = 'input-downloadCode']")
    private WebElement downloadCodeInput;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-reportingCode']/div/label")
    private WebElement reportingCodeDD;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-currency']/div/label")
    private WebElement currencyDD;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-market']/div/label")
    private WebElement marketDD;
    
    @FindBy(xpath = "//input[@id = 'input-date-fromBusinessDate']")
    private WebElement fromBusinessDateInput;
    
    @FindBy(xpath = "//input[@id = 'input-date-toBusinessDate]")
    private WebElement toBusinessDateInput;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-bookmarkFlag']/div/div[2]")
    private WebElement bookmarkFlagCheckBox;
        
    // third
    @FindBy(xpath = "//p-checkbox[@id='checkbox-printToPrinter']/div/div[2]")
    private WebElement printToPrinterCheckBox;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-printerName']/div/label")
    private WebElement printerNameDD;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-saveToNetwork']/div/div[2]")
    private WebElement saveToNetworkCheckBox;
    
    @FindBy(xpath = "//input[@id='input-fileName']")
    private WebElement fileNameInput;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-email']/div/div[2]")
    private WebElement emailCheckBox;
    
    @FindBy(xpath = "//input[@id='input-emailTo']")
    private WebElement emailToInput;
    
    @FindBy(xpath = "//p-checkbox[@id='checkbox-fax']/div/div[2]")
    private WebElement faxCheckBox;
    
    @FindBy(xpath = "//input[@id='input-faxName']")
    private WebElement faxNameInput;
    
    @FindBy(xpath = "//input[@id='input-faxNumber']")
    private WebElement faxNumberInput;
    
    
    public ClientStatementsPage (WebDriver driver) {
    
        this.driver = driver;

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(pageHeader));
    }
    
    public boolean setTradingAdvice() {
        
        return clickOnElement(marketDD);
    }
    
    
    
}
