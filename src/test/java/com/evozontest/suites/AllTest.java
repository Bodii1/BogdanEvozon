package com.evozontest.suites;

import com.evozontest.tests.magento.AdminLoginWithValidCredentials;
import com.evozontest.tests.ui.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreateNewCustomerAccount.class,
        LoginWithValidCredentials.class,
        AddToCartRandomProduct.class,
        SearchProduct.class,
        AdminLoginWithValidCredentials.class,
        AddToWishlistRandomProduct.class
})
public class AllTest {
}
