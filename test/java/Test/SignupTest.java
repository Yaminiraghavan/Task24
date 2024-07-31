package Test;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignupPage;

public class SignupTest extends BaseClass {
    @Test
    public void testSignup() {
        SignupPage signupPage = new SignupPage(driver);
        signupPage.enterUsername("testuser");
        signupPage.enterPassword("testpassword");
        signupPage.clickSignupButton();
        String successMessage = signupPage.getSuccessMessage();
        Assert.assertEquals(successMessage, "Sign up successful");
    }
}