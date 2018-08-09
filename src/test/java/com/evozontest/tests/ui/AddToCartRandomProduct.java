package com.evozontest.tests.ui;

import com.evozontest.steps.ui.LoginSteps;
import com.evozontest.steps.ui.ProductsSteps;
import com.evozontest.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

import static com.evozontest.utils.Constants.USER_EMAIL_ADDRESS;
import static com.evozontest.utils.Constants.USER_PASSWORD;

public class AddToCartRandomProduct extends BaseTest {

    @Steps
    ProductsSteps product;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void chooseRandomProduct() {
        loginSteps.loginGroup(USER_EMAIL_ADDRESS, USER_PASSWORD);
        product.addARandomProduct();
        product.addToCartRandomProduct();
    }

}
