package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL + "/customer/account/login/")
public class LoginPage extends PageObject {

    AccountPage accountPage;

    @FindBy(css = "#email")
    private WebElementFacade emailInputTextField;

    @FindBy(css = "#pass")
    private WebElementFacade passwordInputTextField;

    @FindBy(css="#send2")
    private WebElementFacade loginButton;

    @FindBy(css = "#advice-required-entry-email")
    private WebElementFacade requiredEmailField;

    @FindBy(css = "#advice-required-entry-pass")
    private WebElementFacade requiredPasswordField;

    @FindBy(css = "div.account-login li  span")
    private WebElementFacade invalidLoginOrPassword;

    @FindBy(css = "#advice-validate-password-pass")
    private WebElementFacade sixOrMore;

    public void setEmailInputTextField(String username) {
        emailInputTextField.sendKeys(username);
    }

    public void setPasswordInputTextField(String password) {
        passwordInputTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean getRequiredEmailField() {
        return requiredEmailField.isDisplayed();
    }

    public boolean getRequiredPasswordField() {
        return requiredPasswordField.isDisplayed();
    }

    public boolean getInvalidLoginOrPassword() {
        return invalidLoginOrPassword.isDisplayed();
    }

    public boolean getSixOrMore() {
        return sixOrMore.isDisplayed();
    }
}
