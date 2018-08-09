package com.evozontest.tests.ui;

import com.evozontest.steps.ui.RegisterSteps;
import com.evozontest.utils.BaseTest;
import com.evozontest.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

//@RunWith(SerenityParameterizedRunner.class)
//@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "Register.csv")
public class CreateNewCustomerAccount extends BaseTest {

    @Steps
    RegisterSteps bodiionekenobi;

    @Test
    public void createRandomNewCostumerAccount() {
        bodiionekenobi.createNewCustomerGroup();
    }

    String firstname;
    String lastname;
    String email;
    String password;
    String confirm;

    @Test
    public void createNewCostumerAccountDataDriven() {
        bodiionekenobi.openRegisterPage();
        bodiionekenobi.firstNameField(firstname);
        bodiionekenobi.lastNameField(lastname);
        bodiionekenobi.emailAddressField(email);
        bodiionekenobi.passwordField(password);
        bodiionekenobi.confirmPasswordField(confirm);
        bodiionekenobi.clickRegister();
        bodiionekenobi.isCreated();
    }

}
