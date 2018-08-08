package com.evozontest.suites;

import com.evozontest.tests.ui.CreateNewCustomerAccount;
import com.evozontest.tests.ui.LoginWithValidCredentials;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CreateNewCustomerAccount.class,
        LoginWithValidCredentials.class
})
public class AccountTests {
}
