package com.mbl.flowcs.gcs.pages.staticpages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.mbl.flowcs.gcs.pages.common.GcsGemsPage;
import com.mbl.flowcs.gcs.pages.common.TooltipPage;

/**
 *
 * @author VMurashov
 */
public class ClientAccountSearchPage extends GcsGemsPage {

    @FindBy(id = "static-client-account-search")
    private WebElement searchField;

    @FindBy(xpath = "//span[@id='code']")
    private WebElement searchResultRecord;

    public ClientAccountSearchPage() {

        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(searchField));
    }

    public ClientAccountPage findClientAccountPage(String clientAccount) {

        setTextAreaValue(searchField, clientAccount);

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(searchResultRecord));

        List<WebElement> clientAccountPageRecords = driver.findElements(By.xpath("//span[@id='code']"));
        System.out.println("!!! Client Account records found: " + clientAccountPageRecords.size());

        clickOnElement(clientAccountPageRecords.get(0));

        return new ClientAccountPage();
    }

    public TooltipPage openGroupTooltip(String clientAccount) {

        setTextAreaValue(searchField, clientAccount);

        new WebDriverWait(driver, getTIMEOUT()).until(ExpectedConditions.elementToBeClickable(searchResultRecord));

        List<WebElement> clientAccountSearchResultTableGroupLinks = driver.findElements(By.xpath("//div[@id='static-client-account-result']/p-datatable//table/tbody/tr/td[2]/span/span/span[@class='search-highlight']"));
        System.out.println("!!! Client Account records found: " + clientAccountSearchResultTableGroupLinks.size());

        clickOnElement(clientAccountSearchResultTableGroupLinks.get(0));

        return new TooltipPage();
    }
}
