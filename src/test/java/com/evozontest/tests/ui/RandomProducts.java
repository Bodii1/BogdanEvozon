package com.evozontest.tests.ui;

import com.evozontest.steps.ui.LoginSteps;
import com.evozontest.steps.ui.ProductsSteps;
import com.evozontest.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

import static com.evozontest.utils.Constants.USER_EMAIL_ADDRESS;
import static com.evozontest.utils.Constants.USER_PASSWORD;

public class RandomProducts extends BaseTest {

    @Steps
    ProductsSteps lista;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void chooseRandomProduct() {
        loginSteps.login(USER_EMAIL_ADDRESS, USER_PASSWORD);
        lista.openHomepage();
        lista.randomByCategory();
        lista.randomBySubCategory();
        lista.clickProduct();
    }

}
