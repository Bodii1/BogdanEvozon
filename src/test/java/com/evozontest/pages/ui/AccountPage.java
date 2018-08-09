package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL  + "/customer/account/")
public class AccountPage extends PageObject {

    @FindBy(css = ".hello strong")
    private WebElement welcomeMessageParagraph;

    @FindBy(css = "div.my-account span")
    private WebElement successRegisterMessage;

    @FindBy(css = "div.account-cart-wrapper > a > span.label ")
    private WebElementFacade accountButton;

    @FindBy(css = "#header-account li.last a")
    private WebElementFacade logOutButton;

    public boolean isLoggedIn(String username) {
        return welcomeMessageParagraph.getText().contains(username);
    }

    public boolean isCreateSuccess(String message) {
        return successRegisterMessage.getText().contains(message);
    }

    public void clickAccountButton() {
        accountButton.click();
    }

    public void clickLogOutButton() {
        logOutButton.click();
    }

}
