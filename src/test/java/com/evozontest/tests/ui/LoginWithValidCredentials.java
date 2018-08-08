package com.evozontest.tests.ui;

import com.evozontest.steps.ui.LoginSteps;
import com.evozontest.utils.BaseTest;
import com.evozontest.utils.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.evozontest.utils.Constants.USER_EMAIL_ADDRESS;
import static com.evozontest.utils.Constants.USER_PASSWORD;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = Constants.CSV_FILES_PATH + "Login.csv")
public class LoginWithValidCredentials extends BaseTest {

    @Steps
    LoginSteps bodii;



    String user, password;

    @Test
    public void loginBodii() {
        bodii.openLoginPage();
        bodii.emailField(user);
        bodii.passwordField(password);
        bodii.clickLogin();
        bodii.isLogged();
    }

}
