package Test;

import base.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static utilities.ElementUtils.*;

public class AddToCartTest extends BaseClass {

    @Test
    public void verifyProductCounts() {

        toClick(homePage.prodlink);

        toClick(homePage.addtocartbtn);

        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertEquals(toAlertText(), "Product added");

        toAlertAccept();
    }

}