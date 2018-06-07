package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vmurashov
 */

public class MarketDataTabPage extends GcsGemsPage {

    @FindBy(xpath = "//span[@id = 'view-mktDataSrcCode']")
    private List<WebElement> marketDataSourceLabel;

    @FindBy(xpath = "//span[@id = 'view-futCode']")
    private List<WebElement> futuresCodeLabel;

    @FindBy(xpath = "//span[@id = 'view-optCode']")
    private List<WebElement> optionCodeLabel;

    @FindBy(xpath = "//input[@id = 'input-futPriceScale']")
    private List<WebElement> futuresPriceScaleInput;
    
    @FindBy(xpath = "//span[@id = 'view-futPriceScale']")
    private List<WebElement> futuresPriceScaleLabel;

    @FindBy(xpath = "//input[@id = 'input-optPriceScale']")
    private List<WebElement> optionsPriceScaleInput;
    
    @FindBy(xpath = "//span[@id = 'view-optPriceScale']")
    private List<WebElement> optionsPriceScaleLabel;

    @FindBy(xpath = "//input[@id = 'input-strikeScale']")
    private List<WebElement> strikePriceScaleInput;
    
    @FindBy(xpath = "//span[@id = 'view-strikeScale']")
    private List<WebElement> strikePriceScaleLabel;

    @FindBy(xpath = "//input[@id = 'input-futCodeFormat']")
    private List<WebElement> futuresCodeFormatInput;
    
    @FindBy(xpath = "//span[@id = 'view-futCodeFormat']")
    private List<WebElement> futuresCodeFormatLabel;

    @FindBy(xpath = "//input[@id = 'input-optCodeFormat']")
    private List<WebElement> optionsCodeFormatInput;
    
    @FindBy(xpath = "//span[@id = 'view-optCodeFormat']")
    private List<WebElement> optionsCodeFormatLabel;

    @FindBy(xpath = "//input[@id = 'input-strikeDecimals']")
    private List<WebElement> strikeDecimalsInput;
    
    @FindBy(xpath = "//span[@id = 'view-strikeDecimals']")
    private List<WebElement> strikeDecimalsLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-strikeRouding']/div/label")
    private List<WebElement> strikeRoundingDD;
    
    @FindBy(xpath = "//span[@id = 'view-strikeRouding']")
    private List<WebElement> strikeRoundingLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-instTypeCode']/div/label")
    private List<WebElement> instrumentTypeCodeDD;
    
    @FindBy(xpath = "//span[@id = 'view-instTypeCode']")
    private List<WebElement> instrumentTypeCodeLabel;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-prefPriceFldFut']/div/label")
    private List<WebElement> prefPriceFldFutDD;
    
    @FindBy(xpath = "//span[@id = 'view-prefPriceFldFut']")
    private List<WebElement> prefPriceFldFutLabel;
    
    @FindBy(xpath = "//span[@id = 'option-C']")
    private WebElement optionC;

    @FindBy(xpath = "//p-dropdown[@id = 'dropdown-prefPriceFldOpt']/div/label")
    private List<WebElement> prefPriceFldOptDD;
    
    @FindBy(xpath = "//span[@id = 'view-prefPriceFldOpt']")
    private List<WebElement> prefPriceFldOptLabel;
    

    public MarketDataTabPage(WebDriver driver)  {

        this.driver = driver;
        PageFactory.initElements(driver, this);      
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(), 'Market data source')]"))));
    }
    
    public String getMarketDataSource(int index) {
        
        return getLabelValue(marketDataSourceLabel.get(index));
    }

    public String getFuturesCode(int index) {

        return getLabelValue(futuresCodeLabel.get(index));
    }

    public String getOptionCode(int index) {

        return getLabelValue(optionCodeLabel.get(index));
    }

    public String getFuturesPriceScale(int index) {

        return getLabelValue(futuresPriceScaleLabel.get(index));
    }

    public boolean setFuturesPriceScale(int index, String newFuturesPriceScale) {

        return setTextAreaValue(futuresPriceScaleInput.get(index), newFuturesPriceScale);
    }

    public String getOptionsPriceScale(int index) {

        return getLabelValue(optionsPriceScaleLabel.get(index));
    }

    public boolean setOptionsPriceScale(int index, String newOptionsPriceScale) {

        return setTextAreaValue(optionsPriceScaleInput.get(index), newOptionsPriceScale);
    }

    public String getStrikePriceScale(int index) {

        return getLabelValue(strikePriceScaleLabel.get(index));
    }

    public boolean setStrikePriceScale(int index, String newStrikePriceScale) {

        return setTextAreaValue(strikePriceScaleInput.get(index), newStrikePriceScale);
    }

    public String getFuturesCodeFormat(int index) {

        return getLabelValue(futuresCodeFormatLabel.get(index));
    }

    public boolean setFuturesCodeFormat(int index, String newFuturesCodeFormat) {

        return setTextAreaValue(futuresCodeFormatInput.get(index), newFuturesCodeFormat);
    }

    public String getOptionsCodeFormat(int index) {

        return getLabelValue(optionsCodeFormatLabel.get(index));
    }

    public boolean setOptionsCodeFormat(int index, String newOptionsPriceScale) {

        return setTextAreaValue(optionsCodeFormatInput.get(index), newOptionsPriceScale);
    }

    public String getStrikeDecimals(int index) {

        return getLabelValue(strikeDecimalsLabel.get(index));
    }

    public boolean setStrikeDecimals(int index, String newStrikeDecimals) {

        return setTextAreaValue(strikeDecimalsInput.get(index), newStrikeDecimals);
    }

    public String getStrikeRounding(int index) {

        return getLabelValue(strikeRoundingLabel.get(index));
    }

    public boolean setStrikeRounding(int index, String newStrikeRounding) {

        return setDropDown(strikeRoundingDD.get(index), newStrikeRounding);
    }

    public String getInstrumentTypeCode(int index) {

        return getLabelValue(instrumentTypeCodeLabel.get(index));
    }

    public boolean setInstrumentTypeCode(int index, String newInstrumentTypeCode) {

        return setDropDown(instrumentTypeCodeDD.get(index), newInstrumentTypeCode);
    }

    public String getPreferedFuturesPriceField(int index) {

        return getLabelValue(prefPriceFldFutLabel.get(index));
    }

    public boolean setPreferedFuturesPriceField(int index, String newPreferedFuturesPriceField) {

        clickOnElement(prefPriceFldFutDD.get(index));
        return clickOnElement(optionC);
    }

    public String getPreferedOptionsPriceField(int index) {

        return getLabelValue(prefPriceFldOptLabel.get(index));
    }

    public boolean setPreferedOptionsPriceField(int index, String newPreferedOptionsPriceField) {

        clickOnElement(prefPriceFldOptDD.get(index));
        return clickOnElement(optionC);
    }
}
