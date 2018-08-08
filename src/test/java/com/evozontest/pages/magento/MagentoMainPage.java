package com.evozontest.pages.magento;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static com.evozontest.utils.Constants.BASE_ADMIN_URL;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

@DefaultUrl(BASE_ADMIN_URL + "/dashboard/index/key/")
public class MagentoMainPage extends PageObject {

    @FindBy(css = "#nav > li:nth-child(4) > a  span")
    private WebElementFacade mouseOverCusomer;

    @FindBy(css = "#nav > li:nth-child(4) > ul > li:nth-child(1) > a > span")
    private WebElementFacade clickOn;

    @FindBy(css = "#customerGrid_filter_email")
    private WebElementFacade searchByEmail;

    @FindBy(css = "td.last")
    private WebElementFacade editLine;

    @FindBy(css = "td.last > a")
    private WebElementFacade editButton;

    @FindBy(css = "[title=\"Account Information\"]")
    private WebElementFacade accountInformation;

    @FindBy(css = "#_accountemail")
    private WebElementFacade emailAccount;

    @FindBy(css = "[title=\"Delete Customer\"]")
    private WebElementFacade deleteButton;

    public void mouseOver() {
        Actions hover = new Actions(getDriver());
        hover.moveToElement(mouseOverCusomer).build().perform();
    }

    public void selectManageCustomers() {
        clickOn.click();
    }

    public void selectSearchEmail(String emailAddress) {
        searchByEmail.sendKeys(emailAddress);
    }

    public void mouseOverEdit() {
        Actions hover = new Actions(getDriver());
        hover.moveToElement(editLine).build().perform();
        editButton.click();
    }

    public void selectAccountInformation() {
        accountInformation.click();
    }

    public String emailAddressText() {
        return emailAccount.getAttribute("value");
    }

    public void selectDeleteButton() {
        deleteButton.click();
    }

    public void selectOkJavascriotAlert() {
        getDriver().switchTo().alert().accept();
    }

}
