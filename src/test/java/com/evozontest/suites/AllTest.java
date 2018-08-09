package com.evozontest.suites;

import com.evozontest.tests.magento.AdminLoginWithValidCredentials;
import com.evozontest.tests.ui.AddToCartRandomProducts;
import com.evozontest.tests.ui.CreateNewCustomerAccount;
import com.evozontest.tests.ui.LoginWithValidCredentials;
import com.evozontest.tests.ui.SearchProduct;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreateNewCustomerAccount.class,
        LoginWithValidCredentials.class,
        AddToCartRandomProducts.class,
        SearchProduct.class,
        AdminLoginWithValidCredentials.class
})
public class AllTest {
}
