package com.mbl.flowcs.gcs.pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang.BooleanUtils;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author vmurashov
 */

public class GcsGemsPage {

    /*----------------------- Commmon toolbar elements and methods------------------------------*/
    @FindBy(xpath = "//app-navigation//span[@id='icon-add']")
    protected WebElement iconAddLink;

    @FindBy(xpath = "//app-navigation//span[@id='icon-open-account']")
    protected WebElement iconOpenAccountLink;

    @FindBy(xpath = "//app-navigation//span[@id='icon-close']")
    protected WebElement iconCloseLink;

    @FindBy(xpath = "//app-navigation//span[@id='icon-status']")
    protected WebElement iconStatus;

    @FindBy(xpath = "//div[contains(text(), 'Back')]")
    protected WebElement backToTop;

    @FindBy(xpath = "//button[@id = 'button-revert-Save']")
    protected WebElement saveButton;

    @FindBy(xpath = "//span[contains(text(), 'Revert')]")
    protected WebElement revertButton;

    @FindBy(xpath = "//span[contains(text(), 'Authorise')]")
    protected WebElement authoriseButton;

    @FindBy(xpath = "//span[contains(text(), 'Reject')]")
    protected WebElement rejectButton;

    @FindBy(xpath = "//span[contains(text(), 'Yes')]")
    protected WebElement confirmYesButton;

    @FindBy(xpath = "//span[contains(text(), 'No')]")
    protected WebElement confirmNoButton;

    @FindBy(xpath = "//div/div/input[@class='ui-dropdown-filter ui-inputtext ui-widget ui-state-default ui-corner-all']")
    protected List<WebElement> dropDownSearchAreas;
    
    @FindBy(xpath = "//span[contains(text(), 'saved')]")
    private WebElement successSaving;

    public WebDriver getDriver() {
        return driver;
    }

    protected WebDriver driver;

    private static final String TOMAS;
    private static final String TEST;
    private static final Long TIMEOUT = 10L;

    static {
        TOMAS = Optional.ofNullable(System.getenv("USER1_URL")).orElse("http://172.26.137.49/gcs-auto-test/tomas/");
        TEST = Optional.ofNullable(System.getenv("USER2_URL")).orElse("http://172.26.137.49/gcs-auto-test/test/");
        System.out.println("Follow URLs are used");
        System.out.println(TOMAS);
        System.out.println(TEST);
    }

    //getters section    
    public static Long getTIMEOUT() {
        return TIMEOUT;
    }

    public static String getTomasURL() {
        return TOMAS;
    }

    public static String getTestURL() {
        return TEST;
    }

    // page object api
    public boolean clickIconAddLink() {

        return clickOnElement(iconAddLink);
    }

    public void clickIconOpenAccountLink() {

        clickOnElement(iconOpenAccountLink);
    }

    public void clickIconCloseLink() {

        clickOnElement(iconCloseLink);
    }

    public boolean getStatus() {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(iconStatus));
        return iconStatus.getAttribute("class").equals("im icon-status icon-activated");
    }
    
    public boolean clickBackToTop() {

        return clickOnElement(backToTop);
    }

    public boolean clickSave() {

        return clickOnElement(saveButton);
    }

    public boolean clickConfirmYes() {
        
        return clickOnElement(confirmYesButton);        
    }
    
    public boolean clickClose() {
        
        return clickOnElement(iconCloseLink);
    }

    public boolean clickConfirmNo() {

        return clickOnElement(confirmNoButton);
    }

    public boolean clickRevert() {

        return clickOnElement(revertButton);
    }

    public boolean clickAuthorise() {

        return clickOnElement(authoriseButton);
    }

    public boolean clickReject() {

        return clickOnElement(rejectButton);
    }    
    
    public boolean isSaved() {
        
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(successSaving));
        return successSaving.isDisplayed();
    }

    /*------------------------- API for work with prime ng elements--------------------------------*/
    public boolean clickOnElement(WebElement element) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GcsGemsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public String getLabelValue(WebElement label) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(label));
        return label.getText();
    }

    public boolean getCheckBoxLabelValue(WebElement checkBoxLabel) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(checkBoxLabel));
        return !checkBoxLabel.getAttribute("class").contains("inactive");
    }

    public String getTextAreaValue(WebElement textArea) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(textArea));
        return textArea.getAttribute("value");
    }

    public boolean getCheckBoxValue(WebElement checkBox) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(checkBox));
        return checkBox.getAttribute("class").contains("ui-state-active");
    }

    public boolean setTextAreaValue(WebElement textArea, String value) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(textArea));

        textArea.click();
        textArea.clear();
        textArea.sendKeys(value);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GcsGemsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

    public boolean setCalendarValue(WebElement calendar, String value) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(calendar));

        calendar.click();
        calendar.clear();
        calendar.sendKeys(value);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GcsGemsPage.class.getName()).log(Level.SEVERE, null, ex);
        }

        return calendar.getAttribute("value").equals(value);
    }

    public String getDropDownValue(WebElement dropDown) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(dropDown));
        return dropDown.getText();
    }

    public boolean setDropDown(WebElement dropDown, String setValue) {

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(dropDown));

        dropDown.click();

        List<WebElement> allValues = driver.findElements(By.xpath("//*[@class='dropdown-option']"));

        for (WebElement value : allValues) {
            
            if (value.getText().equals(setValue)) {
                
                value.click();
                break;
            }
        }
        return true;
    }
    
    public boolean setDropDownWithSearchDIV(WebElement dropDown, String setValue) {

        clickOnElement(dropDown);

        setTextAreaValue(driver.switchTo().activeElement(), setValue);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GcsGemsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clickOnElement(driver.findElement(By.xpath("//div[contains(text(), '"+setValue+"')]")));
    }

    public boolean setDropDownWithSearch(WebElement dropDown, String setValue) {

        clickOnElement(dropDown);

        setTextAreaValue(driver.switchTo().activeElement(), setValue);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GcsGemsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clickOnElement(driver.findElement(By.xpath("//span[contains(text(), '"+setValue+"')]")));
    }

    public boolean verifyNavigationTooltip(WebElement item, WebElement tooltip) {

        Actions builder = new Actions(driver);

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.visibilityOf(item));

        builder.moveToElement(item).pause(Duration.ofSeconds(1)).build().perform();

        return tooltip.isDisplayed();
    }

    public final void turnAccordeon(WebElement accordeon, String value) {

        if (value.equalsIgnoreCase("on")) {
            while (!accordeon.getAttribute("class").contains("ui-state-active")) {
                clickOnElement(accordeon);
            }
        } else if (value.equalsIgnoreCase("off")) {
            while (accordeon.getAttribute("class").contains("ui-state-active")) {
                clickOnElement(accordeon);
            }
        }
    }

    protected final void getWebDriver(String browserType, String browserResolution) {
        System.out.println("webdriver.chrome.driver is " + browserType);
        System.out.println("fitness.os.family:" + System.getenv("FITNESSE_OS_FAMILY"));

        switch (browserType) {

            case "ie":
                if (null == driver) {
                    System.setProperty("webdriver.ie.driver", ".\\SeleniumWebDrivers\\IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    System.out.println("\nInternet Explorer WebDriver INSTANTIATED!!!");
                }
                break;

            case "chrome":
                
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                
                if (BooleanUtils.toBoolean(System.getenv("CHROME_HEADLESS"))) {
                    System.out.println("running chrome in headless mode");
                    options.addArguments("--headless");
                }
                if (null == driver) {
                    final String fitnesseOsFamily = System.getenv("FITNESSE_OS_FAMILY");
                    if (Objects.equals(System.getenv("FITNESSE_OS_FAMILY"), "linux")) {
                        System.out.println("OS: " + Optional.ofNullable(fitnesseOsFamily)
                                                            .map(String::trim)
                                                            .map(String::toLowerCase)
                                                            .orElse("Define FITNESSE_OS_FAMILY property!"));
                        System.setProperty("webdriver.chrome.driver", "./SeleniumWebDrivers/chromedriver");
                        options.addArguments("--no-sandbox");

                        System.out.println("linux chrome driver");
                    } else if (Objects.equals(fitnesseOsFamily, "windows")) {
                        System.setProperty("webdriver.chrome.driver", ".\\SeleniumWebDrivers\\chromedriver.exe");
                        System.out.println("windows chrome driver");
                    } else if (Objects.equals(fitnesseOsFamily, "mac")) {
                        System.setProperty("webdriver.chrome.driver", "./SeleniumWebDrivers/chromedriver.mac.2.3.6");
                        System.out.println("mac chrome driver");
                    } else {
                        System.setProperty("webdriver.chrome.driver", ".\\SeleniumWebDrivers\\chromedriver.exe");
                        System.out.println("default windows chrome driver ");
                    }

                    System.out.println("Chrome WebDriver initializing...");
                    driver = new ChromeDriver(options);
                    System.out.println("\nChrome WebDriver INSTANTIATED!!! " + driver);
                }
                break;
        }

        switch (browserResolution) {

            case "1600x1024":
                driver.manage().window().setSize(new Dimension(1600, 1024));
                break;
            case "1366x768":
                driver.manage().window().setSize(new Dimension(1366, 768));
                break;
            default:
                driver.manage().window().maximize();
        }
    }

    public boolean closeWebDriver() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GcsGemsPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if (null != driver) {
            driver.quit();
            driver = null;
            System.out.println("\nWebDriver CLOSED!!!");
            return (null == driver);
        } else {
            return true;
        }
    }

    public void initPrWebDriver(String browserType, String browserResolution){
        this.getWebDriver(browserType, browserResolution);
    }
}
