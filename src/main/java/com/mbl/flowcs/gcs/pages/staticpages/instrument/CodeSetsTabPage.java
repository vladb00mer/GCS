package com.mbl.flowcs.gcs.pages.staticpages.instrument;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author vmurashov
 */

public class CodeSetsTabPage extends GcsGemsPage {
    
    @FindBy(xpath = "//span[@id = 'view-code']")
    private List<WebElement> codeSetColumn;
    
    @FindBy(xpath = "//input[@id = 'input-futCodeValue']")
    private List<WebElement> futuresColumnInput;
    
    @FindBy(xpath = "//span[@id = 'view-futCodeValue']")
    private List<WebElement> futuresColumnLabel;
    
    @FindBy(xpath = "//input[@id = 'input-optCodeValue']")
    private List<WebElement> optionsColumnInput;
    
    @FindBy(xpath = "//span[@id = 'view-optCodeValue']")
    private List<WebElement> optionsColumnLabel;
    
    @FindBy(xpath = "//input[@id = 'input-futPriceScale']")
    private List<WebElement> futPriceScaleColumnInput;
    
    @FindBy(xpath = "//span[@id = 'view-futPriceScale']")
    private List<WebElement> futPriceScaleColumnLabel;
    
    @FindBy(xpath = "//input[@id = 'input-optPriceScale']")
    private List<WebElement> optPriceScaleColumnInput;
    
    @FindBy(xpath = "//span[@id = 'view-optPriceScale']")
    private List<WebElement> optPriceScaleColumnLabel;
    
    @FindBy(xpath = "//input[@id = 'input-strikePriceScale']")
    private List<WebElement> strikePriceScaleColumnInput;
    
    @FindBy(xpath = "//span[@id = 'view-strikePriceScale']")
    private List<WebElement> strikePriceScaleColumnLabel;
    
    
    public CodeSetsTabPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        
        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getIndex(String code) {
        
        int index = 0;
        
        for (WebElement codeRec: codeSetColumn) {
            
            if (getLabelValue(codeRec).equalsIgnoreCase(code)) {
                
                index = codeSetColumn.indexOf(codeRec);
            }
            else index = -1;
        }
        return index;
    }
    
    public boolean setFutures(String futures, int index) {
        
        setTextAreaValue(futuresColumnInput.get(index), futures);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public String getFutures(int index) {
        
        return getLabelValue(futuresColumnLabel.get(index));
    }
    
    public boolean setOptions(String options, int index) {
        
        setTextAreaValue(optionsColumnInput.get(index), options);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public String getOptions(int index) {
        
        return getLabelValue(optionsColumnLabel.get(index));
    }
    
    public boolean setFutPriceScale(String futPriceScale, int index) {
        
        setTextAreaValue(futPriceScaleColumnInput.get(index), futPriceScale);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public String getFutPriceScale(int index) {
        
        return getLabelValue(futPriceScaleColumnLabel.get(index));
    }
    
    public boolean setOptPriceScale(String optPriceScale, int index) {
        
        setTextAreaValue(optPriceScaleColumnInput.get(index), optPriceScale);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public String getOptPriceScale(int index) {
        
        return getLabelValue(optPriceScaleColumnLabel.get(index));
    }
    
    public boolean setStrikePriceScale(String strikePriceScale, int index) {
        
        setTextAreaValue(strikePriceScaleColumnInput.get(index), strikePriceScale);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CodeSetsTabPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
    
    public String getStrikePriceScale(int index) {
        
        return getLabelValue(strikePriceScaleColumnLabel.get(index));
    }    
}
