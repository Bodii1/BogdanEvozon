package com.evozontest.steps.ui;

import com.evozontest.pages.ui.AccountPage;
import com.evozontest.pages.ui.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage;
    AccountPage accountPage;

    @Step
    public void openLoginPage() {
        loginPage.open();
    }

    @Step
    public void emailField(String username) {
        loginPage.setEmailInputTextField(username);
    }

    @Step
    public void passwordField(String password) {
        loginPage.setPasswordInputTextField(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLoginButton();
    }

    @Step
    public void isLogged() {
        Assert.assertTrue(accountPage.isLoggedIn("Bodii"));
    }

    @Step
    public void isLogged(String expectedResults) {
        switch (expectedResults) {
            case ("This is a required field.X2"):
                Assert.assertTrue(loginPage.getRequiredEmailField());
                Assert.assertTrue(loginPage.getRequiredPasswordField());
                break;
            case ("This is a required fieldP."):
                Assert.assertTrue(loginPage.getRequiredPasswordField());
                break;
            case ("This is a required fieldE."):
                Assert.assertTrue(loginPage.getRequiredEmailField());
                break;
            case ("Invalid login or password."):
                Assert.assertTrue(loginPage.getInvalidLoginOrPassword());
                break;
            case ("Please enter 6 or more characters without leading or trailing spaces."):
                Assert.assertTrue(loginPage.getSixOrMore());
                break;
            case ("Hello Bodii One!"):
                Assert.assertTrue(accountPage.isLoggedIn("Bodii"));
                break;
        }
    }

    @StepGroup
    public void login(String emailAddress, String password){
        openLoginPage();
        emailField(emailAddress);
        passwordField(password);
        clickLogin();
        isLogged();
    }

}
