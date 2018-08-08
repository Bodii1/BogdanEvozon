package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL + "/customer/account/login/")
public class LoginPage extends PageObject {

    @FindBy(css = "#email")
    private WebElement emailInputTextField;

    @FindBy(css = "#pass")
    private WebElement passwordInputTextField;

    @FindBy(css="#send2")
    private WebElement loginButton;

    public void setEmailInputTextField(String username) {
        emailInputTextField.sendKeys(username);
    }

    public void setPasswordInputTextField(String password) {
        passwordInputTextField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}
