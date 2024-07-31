package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.SignupPage;

import java.time.Duration;

public class BaseClass {
    protected WebDriver driver;
    public WebDriverWait wait;
    public SignupPage signUpPage;
    public LoginPage loginPage;
    public AddToCartPage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signUpPage = new SignupPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new AddToCartPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
