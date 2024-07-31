package Test;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseClass {
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("testpassword");
        loginPage.clickLoginButton();
        String successMessage = loginPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Log in successful");
    }
}
