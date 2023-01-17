package com.tta.vwo.LoginTests;

import com.tta.basetest.BaseTest;
import com.tta.driver.DriverManagerTL;
import com.tta.pages.DashboardPage;
import com.tta.pages.LoginPage;
import com.tta.utils.PropertyReaderOptimized;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws Exception {
        DriverManagerTL.getDriver().get(PropertyReaderOptimized.readKeyO("url"));
        DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
        String expectResult  = dashboardPage.loggedInUserName();
        Assertions.assertThat(expectResult)
                .isNotBlank()
                .isNotNull()
                .contains(PropertyReaderOptimized.readKeyO("expected_username"));
    }
}
