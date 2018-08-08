package com.evozontest.steps.ui;

import com.evozontest.entity.User;
import com.evozontest.factories.Factory;
import com.evozontest.pages.ui.AccountPage;
import com.evozontest.pages.ui.CreateAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps {

    CreateAccountPage createAccountPage;
    AccountPage accountPage;

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

        User user = Factory.generateUser();

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
}
