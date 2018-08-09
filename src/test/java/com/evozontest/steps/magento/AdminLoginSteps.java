package com.evozontest.steps.magento;

import com.evozontest.pages.magento.LoginAdminPage;
import com.evozontest.pages.magento.MagentoMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

public class AdminLoginSteps {

    LoginAdminPage loginAdminPage;
    //MagentoMainPage magentoMainPage;

    @Step
    public void openAdminLoginMagento() {
        loginAdminPage.open();
    }

    @Step
    public void usernameField() {
        loginAdminPage.setUserNameInputTextField();
    }

    @Step
    public void passwordField() {
        loginAdminPage.setPasswordInputTextField();
    }

    @Step
    public void clickLogin() {
        loginAdminPage.clickAdminLoginButton();
    }

    @Step
    public void clickClose() {
        loginAdminPage.clickCloseButton();
    }

    /*@Step
    public void mouseOverCustomers() {
        magentoMainPage.mouseOver();
    }

    @Step
    public void clickOnManageCustomers() {
        magentoMainPage.selectManageCustomers();
    }*/

    @StepGroup
    public void adminLoginGroup() {
        openAdminLoginMagento();
        usernameField();
        passwordField();
        clickLogin();
        clickClose();
    }

}
