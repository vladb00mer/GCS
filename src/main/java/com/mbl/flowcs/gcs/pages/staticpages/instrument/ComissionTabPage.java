package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import org.openqa.selenium.By;
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

public class ComissionTabPage extends GcsGemsPage {
    
    // Futures
    @FindBy(xpath = "//input[@id = 'input-feesFutFullRate']")
    private WebElement futuresFullInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutFullRate']")
    private WebElement futuresFullLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutDayTradeRate']")
    private WebElement futuresDayTradeInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutDayTradeRate']")
    private WebElement futuresDayTradeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutSettRate']")
    private WebElement futuresMandSettInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutSettRate']")
    private WebElement futuresMandSettLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutNFARate']")
    private WebElement futuresNFAInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutNFARate']")
    private WebElement futuresNFALabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutOne']")
    private WebElement futuresFee1Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutOne']")
    private WebElement futuresFee1Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutTwo']")
    private WebElement futuresFee2Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutTwo']")
    private WebElement futuresFee2Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutThree']")
    private WebElement futuresFee3Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutThree']")
    private WebElement futuresFee3Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutFour']")
    private WebElement futuresFee4Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutFour']")
    private WebElement futuresFee4Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutFive']")
    private WebElement futuresFee5Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutFive']")
    private WebElement futuresFee5Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutSix']")
    private WebElement futuresFee6Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutSix']")
    private WebElement futuresFee6Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutSeven']")
    private WebElement futuresFee7Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutSeven']")
    private WebElement futuresFee7Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutEight']")
    private WebElement futuresFee8Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutEight']")
    private WebElement futuresFee8Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutNine']")
    private WebElement futuresFee9Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutNine']")
    private WebElement futuresFee9Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesFutTen']")
    private WebElement futuresFee10Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesFutTen']")
    private WebElement futuresFee10Label;
    
    // Options
    @FindBy(xpath = "//input[@id = 'input-feesOptFullRate']")
    private WebElement optionsFullInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptFullRate']")
    private WebElement optionsFullLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptDayTradeRate']")
    private WebElement optionsDayTradeInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptDayTradeRate']")
    private WebElement optionsDayTradeLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptAssignRate']")
    private WebElement optionsAssignInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptAssignRate']")
    private WebElement optionsAssignLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptAbandonRate']")
    private WebElement optionsAbandonInput;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptAbandonRate']")
    private WebElement optionsAbandonLabel;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptOne']")
    private WebElement optionsFee1Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptOne']")
    private WebElement optionsFee1Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptTwo']")
    private WebElement optionsFee2Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptTwo']")
    private WebElement optionsFee2Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptThree']")
    private WebElement optionsFee3Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptThree']")
    private WebElement optionsFee3Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptFour']")
    private WebElement optionsFee4Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptFour']")
    private WebElement optionsFee4Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptFive']")
    private WebElement optionsFee5Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptFive']")
    private WebElement optionsFee5Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptSix']")
    private WebElement optionsFee6Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptSix']")
    private WebElement optionsFee6Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptSeven']")
    private WebElement optionsFee7Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptSeven']")
    private WebElement optionsFee7Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptEight']")
    private WebElement optionsFee8Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptEight']")
    private WebElement optionsFee8Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptNine']")
    private WebElement optionsFee9Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptNine']")
    private WebElement optionsFee9Label;
    
    @FindBy(xpath = "//input[@id = 'input-feesOptTen']")
    private WebElement optionsFee10Input;
    
    @FindBy(xpath = "//span[@id = 'view-feesOptTen']")
    private WebElement optionsFee10Label;
    
    // Venues
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeOneVenue']/div/label")
    private WebElement venue1Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeOneVenue']")
    private WebElement venue1Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeTwoVenue']/div/label")
    private WebElement venue2Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeTwoVenue']")
    private WebElement venue2Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeThreeVenue']/div/label")
    private WebElement venue3Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeThreeVenue']")
    private WebElement venue3Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeFourVenue']/div/label")
    private WebElement venue4Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeFourVenue']")
    private WebElement venue4Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeFiveVenue']/div/label")
    private WebElement venue5Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeFiveVenue']")
    private WebElement venue5Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeSixVenue']/div/label")
    private WebElement venue6Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeSixVenue']")
    private WebElement venue6Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeSevenVenue']/div/label")
    private WebElement venue7Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeSevenVenue']")
    private WebElement venue7Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeEightVenue']/div/label")
    private WebElement venue8Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeEightVenue']")
    private WebElement venue8Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeNineVenue']/div/label")
    private WebElement venue9Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeNineVenue']")
    private WebElement venue9Label;
    
    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-feeTenVenue']/div/label")
    private WebElement venue10Input;
    
    @FindBy(xpath = "//span[@id = 'view-feeTenVenue']")
    private WebElement venue10Label;
    
    
    public ComissionTabPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);        
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Exchange fees')]"))));
    }
    
    // Futures
    public boolean setFuturesFull(String futuresFull) {
        
        return setTextAreaValue(futuresFullInput, futuresFull);
    }
    
    public String getFuturesFull() {
        
        return getLabelValue(futuresFullLabel);
    }
    
    public boolean setFuturesDayTrade(String futuresDayTrade) {
        
        return setTextAreaValue(futuresDayTradeInput, futuresDayTrade);
    }
    
    public String getFuturesDayTrade() {
        
        return getLabelValue(futuresDayTradeLabel);
    }
    
    public boolean setMandSett(String futuresMandSett) {
        
        return setTextAreaValue(futuresMandSettInput, futuresMandSett);
    }
    
    public String getMandSett() {
        
        return getLabelValue(futuresMandSettLabel);
    }
    
    public boolean setNFA(String futuresNFA) {
        
        return setTextAreaValue(futuresNFAInput, futuresNFA);
    }
    
    public String getNFA() {
        
        return getLabelValue(futuresNFALabel);
    }
    
    public boolean setFuturesFee1(String futuresFee1) {
        
        return setTextAreaValue(futuresFee1Input, futuresFee1);
    }
    
    public String getFuturesFee1() {
        
        return getLabelValue(futuresFee1Label);
    }
    
    public boolean setFuturesFee2(String futuresFee2) {
        
        return setTextAreaValue(futuresFee2Input, futuresFee2);
    }
    
    public String getFuturesFee2() {
        
        return getLabelValue(futuresFee2Label);
    }
    
    public boolean setFuturesFee3(String futuresFee3) {
        
        return setTextAreaValue(futuresFee3Input, futuresFee3);
    }
    
    public String getFuturesFee3() {
        
        return getLabelValue(futuresFee3Label);
    }
    
    public boolean setFuturesFee4(String futuresFee4) {
        
        return setTextAreaValue(futuresFee4Input, futuresFee4);
    }
    
    public String getFuturesFee4() {
        
        return getLabelValue(futuresFee4Label);
    }
    
    public boolean setFuturesFee5(String futuresFee5) {
        
        return setTextAreaValue(futuresFee5Input, futuresFee5);
    }
    
    public String getFuturesFee5() {
        
        return getLabelValue(futuresFee5Label);
    }
    
    public boolean setFuturesFee6(String futuresFee6) {
        
        return setTextAreaValue(futuresFee6Input, futuresFee6);
    }
    
    public String getFuturesFee6() {
        
        return getLabelValue(futuresFee6Label);
    }
    
    public boolean setFuturesFee7(String futuresFee7) {
        
        return setTextAreaValue(futuresFee7Input, futuresFee7);
    }
    
    public String getFuturesFee7() {
        
        return getLabelValue(futuresFee7Label);
    }
    
    public boolean setFuturesFee8(String futuresFee8) {
        
        return setTextAreaValue(futuresFee8Input, futuresFee8);
    }
    
    public String getFuturesFee8() {
        
        return getLabelValue(futuresFee8Label);
    }
    
    public boolean setFuturesFee9(String futuresFee9) {
        
        return setTextAreaValue(futuresFee9Input, futuresFee9);
    }
    
    public String getFuturesFee9() {
        
        return getLabelValue(futuresFee9Label);
    }
    
    public boolean setFuturesFee10(String futuresFee10) {
        
        return setTextAreaValue(futuresFee10Input, futuresFee10);
    }
    
    public String getFuturesFee10() {
        
        return getLabelValue(futuresFee10Label);
    }
    
    // Options
    public boolean setOptionsFull(String optionsFull) {
        
        return setTextAreaValue(optionsFullInput, optionsFull);
    }
    
    public String getOptionsFull() {
        
        return getLabelValue(optionsFullLabel);
    }
    
    public boolean setOptionsDayTrade(String optionsDayTrade) {
        
        return setTextAreaValue(optionsDayTradeInput, optionsDayTrade);
    }
    
    public String getOptionsDayTrade() {
        
        return getLabelValue(optionsDayTradeLabel);
    }
    
    public boolean setOptionsAssign(String optionsAssign) {
        
        return setTextAreaValue(optionsAssignInput, optionsAssign);
    }
    
    public String getOptionsAssign() {
        
        return getLabelValue(optionsAssignLabel);
    }
    
    public boolean setOptionsAbandon(String optionsAbandon) {
        
        return setTextAreaValue(optionsAbandonInput, optionsAbandon);
    }
    
    public String getOptionsAbandon() {
        
        return getLabelValue(optionsAbandonLabel);
    }
    
    public boolean setOptionsFee1(String optionsFee1) {
        
        return setTextAreaValue(optionsFee1Input, optionsFee1);
    }
    
    public String getOptionsFee1() {
        
        return getLabelValue(optionsFee1Label);
    }
    
    public boolean setOptionsFee2(String optionsFee2) {
        
        return setTextAreaValue(optionsFee2Input, optionsFee2);
    }
    
    public String getOptionsFee2() {
        
        return getLabelValue(optionsFee2Label);
    }
    
    public boolean setOptionsFee3(String optionsFee3) {
        
        return setTextAreaValue(optionsFee3Input, optionsFee3);
    }
    
    public String getOptionsFee3() {
        
        return getLabelValue(optionsFee3Label);
    }
    
    public boolean setOptionsFee4(String optionsFee4) {
        
        return setTextAreaValue(optionsFee4Input, optionsFee4);
    }
    
    public String getOptionsFee4() {
        
        return getLabelValue(optionsFee4Label);
    }
    
    public boolean setOptionsFee5(String optionsFee5) {
        
        return setTextAreaValue(optionsFee5Input, optionsFee5);
    }
    
    public String getOptionsFee5() {
        
        return getLabelValue(optionsFee5Label);
    }
    
    public boolean setOptionsFee6(String optionsFee6) {
        
        return setTextAreaValue(optionsFee6Input, optionsFee6);
    }
    
    public String getOptionsFee6() {
        
        return getLabelValue(optionsFee6Label);
    }
    
    public boolean setOptionsFee7(String optionsFee7) {
        
        return setTextAreaValue(optionsFee7Input, optionsFee7);
    }
    
    public String getOptionsFee7() {
        
        return getLabelValue(optionsFee7Label);
    }
    
    public boolean setOptionsFee8(String optionsFee8) {
        
        return setTextAreaValue(optionsFee8Input, optionsFee8);
    }
    
    public String getOptionsFee8() {
        
        return getLabelValue(optionsFee8Label);
    }
    
    public boolean setOptionsFee9(String optionsFee9) {
        
        return setTextAreaValue(optionsFee9Input, optionsFee9);
    }
    
    public String getOptionsFee9() {
        
        return getLabelValue(optionsFee9Label);
    }
    
    public boolean setOptionsFee10(String optionsFee10) {
        
        return setTextAreaValue(optionsFee10Input, optionsFee10);
    }
    
    public String getOptionsFee10() {
        
        return getLabelValue(optionsFee10Label);
    }
    
    // Venues    
    public boolean setVenue1(String venue1) {
        
        return setDropDownWithSearchDIV(venue1Input, venue1);
    }
    
    public String getVenue1() {
        
        return getLabelValue(venue1Label);
    }
    
    public boolean setVenue2(String venue2) {
        
        return setDropDownWithSearchDIV(venue2Input, venue2);
    }
    
    public String getVenue2() {
        
        return getLabelValue(venue2Label);
    }
    
    public boolean setVenue3(String venue3) {
        
        return setDropDownWithSearchDIV(venue3Input, venue3);
    }
    
    public String getVenue3() {
        
        return getLabelValue(venue3Label);
    }
    
    public boolean setVenue4(String venue4) {
        
        return setDropDownWithSearchDIV(venue4Input, venue4);
    }
    
    public String getVenue4() {
        
        return getLabelValue(venue4Label);
    }
    
    public boolean setVenue5(String venue5) {
        
        return setDropDownWithSearchDIV(venue5Input, venue5);
    }
    
    public String getVenue5() {
        
        return getLabelValue(venue5Label);
    }
    
    public boolean setVenue6(String venue6) {
        
        return setDropDownWithSearchDIV(venue6Input, venue6);
    }
    
    public String getVenue6() {
        
        return getLabelValue(venue6Label);
    }
    
    public boolean setVenue7(String venue7) {
        
        return setDropDownWithSearchDIV(venue7Input, venue7);
    }
    
    public String getVenue7() {
        
        return getLabelValue(venue7Label);
    }
    
    public boolean setVenue8(String venue8) {
        
        return setDropDownWithSearchDIV(venue8Input, venue8);
    }
    
    public String getVenue8() {
        
        return getLabelValue(venue8Label);
    }
    
    public boolean setVenue9(String venue9) {
        
        return setDropDownWithSearchDIV(venue9Input, venue9);
    }
    
    public String getVenue9() {
        
        return getLabelValue(venue9Label);
    }
    
    public boolean setVenue10(String venue10) {
        
        return setDropDownWithSearchDIV(venue10Input, venue10);
    }
    
    public String getVenue10() {
        
        return getLabelValue(venue10Label);
    }    
}
