package com.mbl.flowcs.gcs.pages.staticpages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;

/**
 *
 * @author VMurashov
 */
public class BrokerAccountSearchPage extends GcsGemsPage {

    @FindBy(xpath = "")
    private WebElement searchField;

    @FindBy(xpath = "")
    private WebElement brokerAccountPageRecord;

    public BrokerAccountSearchPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(searchField));
    }

    public BrokerAccountPage findBrokerAccountPage(String brokerAccount) {

        searchField.sendKeys(brokerAccount);

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(brokerAccountPageRecord));

        List<WebElement> brokerAccountPageRecords = driver.findElements(By.xpath(""));
        System.out.println("Records found: " + brokerAccountPageRecords.size());
        brokerAccountPageRecords.get(0).click();

        return new BrokerAccountPage();
    }
}
