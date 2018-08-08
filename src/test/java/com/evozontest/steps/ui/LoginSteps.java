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

    @StepGroup
    public void login(String emailAddress, String password){
        openLoginPage();
        emailField(emailAddress);
        passwordField(password);
        clickLogin();
        isLogged();
    }

}
