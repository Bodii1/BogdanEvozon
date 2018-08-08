package com.evozontest.pages.magento;

import com.evozontest.utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import static com.evozontest.utils.Constants.ADMIN_MAGENTO;
import static com.evozontest.utils.Constants.BASE_ADMIN_URL;
import static com.evozontest.utils.Constants.PASSWORD_MAGENTO;

@DefaultUrl(BASE_ADMIN_URL)
public class LoginAdminPage extends PageObject {

    @FindBy(css = "#username")
    private WebElementFacade userNameInputTextField;

    @FindBy(css = "#login")
    private WebElementFacade passwordInputTextField;

    @FindBy(css="div.form-buttons  input")
    private WebElement loginButton;

    @FindBy(css = "[title=close]")
    private WebElementFacade closeButton;

    public void setUserNameInputTextField() {
        userNameInputTextField.sendKeys(ADMIN_MAGENTO);
    }

    public void setPasswordInputTextField() {
        passwordInputTextField.sendKeys(PASSWORD_MAGENTO);
    }

    public void clickAdminLoginButton() {
        evaluateJavascript("jQuery.noConflict();");
        clickOn(loginButton);
    }

    public void clickCloseButton() {
        closeButton.click();
    }

}
