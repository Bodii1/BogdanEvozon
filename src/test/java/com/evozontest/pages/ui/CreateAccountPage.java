package com.evozontest.pages.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import static com.evozontest.utils.Constants.BASE_URL;

@DefaultUrl(BASE_URL + "/customer/account/create")
public class CreateAccountPage extends PageObject {

    @FindBy(css = "#firstname")
    private WebElement firstNameTextField;

    @FindBy(css = "#lastname")
    private WebElement lastNameTextField;

    @FindBy(css = "#email_address")
    private WebElement emailAddressTextField;

    @FindBy(css = "#password")
    private WebElement passwordTextField;

    @FindBy(css = "#confirmation")
    private WebElement confirmPasswordTextField;

    @FindBy(css = "div.buttons-set span > span")
    private WebElement registerButton;

    public void setFirstNameTextField(String firstName) {
        firstNameTextField.sendKeys(firstName);
    }

    public void setLastNameTextField(String lastName) {
        lastNameTextField.sendKeys(lastName);
    }

    public void setEmailAddressTextField(String emailAddress) {
        emailAddressTextField.sendKeys(emailAddress);
    }

    public void setPasswordTextField(String password) {
        passwordTextField.sendKeys(password);
    }

    public void setConfirmPasswordTextField(String confirmPassword) {
        confirmPasswordTextField.sendKeys(confirmPassword);
    }

    public void setRegisterButton() {
        registerButton.click();
    }
}
