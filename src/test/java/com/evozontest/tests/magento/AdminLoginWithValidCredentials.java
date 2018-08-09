package com.evozontest.tests.magento;

import com.evozontest.steps.magento.AdminLoginSteps;
import com.evozontest.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class AdminLoginWithValidCredentials extends BaseTest {

    @Steps
    AdminLoginSteps adminLoginSteps;

    @Test
    public void adminLogin() {
        adminLoginSteps.openAdminLoginMagento();
        adminLoginSteps.usernameField();
        adminLoginSteps.passwordField();
        adminLoginSteps.clickLogin();
        adminLoginSteps.clickClose();
    }
}