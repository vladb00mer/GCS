package com.mbl.flowcs.gcs.pages.positions;

import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import static com.mbl.flowcs.gcs.pages.common.GcsGemsPage.getTIMEOUT;
import com.mbl.flowcs.gcs.pages.common.TooltipPage;
import java.util.List;
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

public class CollateralWorkbenchSearchPage extends GcsGemsPage {
    
    @FindBy(xpath = "//input[@id='input-firm']")
    private WebElement firmField;
    
    @FindBy(xpath = "//input[@id='input-sgroup']")
    private WebElement superGroupField;
    
    @FindBy(xpath = "//input[@id='input-group']")
    private WebElement groupField;
    
    @FindBy(xpath = "//input[@id='input-account']")
    private WebElement accountField;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-category']/div/label")
    private WebElement categoryDD;
    
    @FindBy(xpath = "//p-dropdown[@id='dropdown-currency']/div/label")
    private WebElement currencyDD;
    
    @FindBy(xpath = "//span[@id='positions-collateralscreen-workbench-icon-add']")
    private WebElement addNewCollateralLink;
    
    @FindBy(xpath = "//span[@id='positions-collateralscreen-workbench-row-icon-edit-0']")
    private WebElement firstRecordModifyLink;
    
    @FindBy(xpath = "//span[@id='positions-collateralscreen-workbench-row-icon-reports-0']")
    private WebElement firstRecordAllocateLink;
    
    @FindBy(xpath = "//span[@id='positions-collateralscreen-workbench-row-icon-approve-doc-0']")
    private WebElement firstRecordDeliveryLink;
    
    @FindBy(xpath = "//tr/td/span/span[4]")
    private WebElement firstRecordReceiptLink;
       
    
    public CollateralWorkbenchSearchPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Search collateral workbench')]"))));
    }
    
    public CollateralWorkbenchSearchPage findCollateralWorkbenchPageByFirm(String firm) {
        
        setTextAreaValue(firmField, firm);        
        return this;
    }
    
    public CollateralWorkbenchSearchPage findCollateralWorkbenchPageBySuperGroup(String supergroup) {
        
        setTextAreaValue(superGroupField, supergroup);        
        return this;
    }
    
    public CollateralWorkbenchSearchPage findCollateralWorkbenchPageByGroup(String group) {
        
        setTextAreaValue(groupField, group);        
        return this;
    }
    
    public CollateralWorkbenchSearchPage findCollateralWorkbenchPageByAccount(String account) {
        
        setTextAreaValue(accountField, account);        
        return this;
    }
    
    public CollateralWorkbenchSearchPage findCollateralWorkbenchPageByCategory(String category) {
        
        setDropDownWithSearch(categoryDD, category);        
        return this;
    }
    
    public CollateralWorkbenchSearchPage findCollateralWorkbenchPageByCurrency(String currency) {
        
        setDropDownWithSearch(currencyDD, currency);
        return this;
    }
    
    public boolean verifySearchResult(String param, String value) {
        
        boolean res = true;
        boolean stepRes = true;
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(firstRecordModifyLink));
        
        switch (param) {
            
            case "firm":
                
                List<WebElement> firmLabels = driver.findElements(By.xpath("//table/tbody/tr/td[3]/span[2]/span"));
                
                for(WebElement element: firmLabels) {
                    
                    stepRes = (getLabelValue(element).contains(value)) ? true : false;
                    
                    if (false == stepRes) {
                        
                        res = stepRes;
                    }
                } break;
                
            case "supergroup":
                List<WebElement> supergroupLinks = driver.findElements(By.xpath("//span[@class='link supergroup']"));
                for(WebElement element: supergroupLinks) {
                    res = (getLabelValue(element).contains(value)) ? true : false;
                    System.out.println("SuperGroup value is actual: "+res);
                } break;
                
            case "group":
                List<WebElement> groupLinks = driver.findElements(By.xpath("//span[@class='link group']"));
                for(WebElement element: groupLinks) {
                    res = (getLabelValue(element).contains(value)) ? true : false;
                    System.out.println("Group value is actual: "+res);
                } break;
                
            case "account":
                List<WebElement> accountLinks = driver.findElements(By.xpath("//span[@class='link account']"));
                for(WebElement element: accountLinks) {
                    res = (getLabelValue(element).contains(value)) ? true : false;
                    System.out.println("Account value is actual: "+res);
                } break;
                
            case "category":
                List<WebElement> categoryLabels = driver.findElements(By.xpath("//table/tbody/tr/td[7]/span[2]/span"));
                for(WebElement element: categoryLabels) {
                    res = (getLabelValue(element).contains(value)) ? true : false;
                    System.out.println("Category value is actual: "+res);
                } break;
                
            case "currency":
                List<WebElement> currencyLinks = driver.findElements(By.xpath("//table/tbody/tr/td[9]/span[2]/span"));
                for(WebElement element: currencyLinks) {
                    res = (getLabelValue(element).contains(value)) ? true : false;
                    System.out.println("Currency value "+getLabelValue(element)+" is actual: "+res);
                } break;
        
        } return res;        
    }
    
    public CollateralWorkbenchPage createCollateralWorkbenchPage() {
        
        clickOnElement(addNewCollateralLink);
       
        return new CollateralWorkbenchPage(driver);
    }
    
   public CollateralWorkbenchPage modifyCollateralWorkbenchPage() {
       
       clickOnElement(firstRecordModifyLink);
       
       return new CollateralWorkbenchPage(driver);
   }
    
   public CollateralWorkbenchPage allocateCollateralWorkbenchPage() {
       
       clickOnElement(firstRecordAllocateLink);
       
       return new CollateralWorkbenchPage(driver);
   }
   
   public CollateralWorkbenchPage deliveryCollateralWorkbenchPage() {
       
       clickOnElement(firstRecordDeliveryLink);
       
       return new CollateralWorkbenchPage(driver);
   }
   
   public CollateralWorkbenchPage receiptCollateralWorkbenchPage() {
       
       clickOnElement(firstRecordReceiptLink);
       
       return new CollateralWorkbenchPage(driver);
   }
    
    public TooltipPage openTooltip(String account, String tooltipType) {

        setTextAreaValue(accountField, account);

        switch (tooltipType.toLowerCase()) {

            case "supergroup":
                List<WebElement> supergroupLinks = driver.findElements(By.xpath("//span[@class='link supergroup']"));
                clickOnElement(supergroupLinks.get(0));
                break;

            case "group":
                List<WebElement> groupLinks = driver.findElements(By.xpath("//span[@class='link group']"));
                clickOnElement(groupLinks.get(0));
                break;

            case "account":
                List<WebElement> accountLinks = driver.findElements(By.xpath("//span[@class='link account']"));
                clickOnElement(accountLinks.get(0));
                break;

            default:
                System.out.println("Wrong tooltip type: " + tooltipType);
                break;
        }

        return new TooltipPage();
    }
}
