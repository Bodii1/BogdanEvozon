package com.evozontest.steps.ui;

import com.evozontest.entity.User;
import com.evozontest.factories.Factory;
import com.evozontest.pages.magento.LoginAdminPage;
import com.evozontest.pages.magento.MagentoMainPage;
import com.evozontest.pages.ui.AccountPage;
import com.evozontest.pages.ui.CreateAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps {

    CreateAccountPage createAccountPage;
    AccountPage accountPage;
    User user = Factory.generateUser();

    @Step
    public void openRegisterPage() {
        createAccountPage.open();
    }

    @Step
    public void firstNameField(String fistName) {
        createAccountPage.setFirstNameTextField(fistName);
    }

    @Step
    public void lastNameField(String lastName) {
        createAccountPage.setLastNameTextField(lastName);
    }

    @Step
    public void emailAddressField(String emailAddress) {
        createAccountPage.setEmailAddressTextField(emailAddress);
    }

    @Step
    public void passwordField(String password) {
        createAccountPage.setPasswordTextField(password);
    }

    @Step
    public void confirmPasswordField(String confirmPassword) {
        createAccountPage.setConfirmPasswordTextField(confirmPassword);
    }

    @Step
    public User enterUserValidFields() {
        createAccountPage.setFirstNameTextField(user.getFirstName());
        createAccountPage.setLastNameTextField(user.getLastName());
        createAccountPage.setEmailAddressTextField(user.getEmailAddress());
        createAccountPage.setPasswordTextField(user.getPassword());
        createAccountPage.setConfirmPasswordTextField(user.getPassword());

        return user;
    }

    @Step
    public void clickRegister() {
        createAccountPage.setRegisterButton();
    }

    @Step
    public void isCreated() {
        Assert.assertTrue(accountPage.isCreateSuccess("Thank you for registering"));
    }

    LoginAdminPage loginAdminPage;
    MagentoMainPage magentoMainPage;

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

    @Step
    public void mouseOverCustomers() {
        magentoMainPage.mouseOver();
    }

    @Step
    public void clickOnManageCustomers() {
        magentoMainPage.selectManageCustomers();
    }

    @Step
    public void clickOnEmailInputTextField() {
        magentoMainPage.selectSearchEmail(user.getEmailAddress());
    }

    @Step
    public void mouseOverEditButton() {
        magentoMainPage.mouseOverEdit();
    }

    @Step
    public void clickOnAcccountInformation() {
        magentoMainPage.selectAccountInformation();
    }

    @Step
    public void getEmailAddressText() {
        String actualResult = magentoMainPage.emailAddressText();
        Assert.assertEquals(actualResult,user.getEmailAddress());
    }

    @Step
    public void clickOnDeleteCustomerButton() {
        magentoMainPage.selectDeleteButton();
    }

    @Step
    public void clickOkJavascriptAlert() {
        magentoMainPage.selectOkJavascriotAlert();
    }
}
