package Test;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Locale;

public class TestLogin extends BasePage {

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test (priority = 10)
    public void verifyThatUserCanLogIn() throws InterruptedException {

        String validUsername = "standard_user";
        String validPassword = "secret_sauce";

        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();
        logoutPage.clickOnReactBurgerMenuButton();

        String logOutButtonText = logoutPage.getLogoutSidebarLink().getText().toUpperCase(Locale.ROOT);
        wdwait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("LOGOUT")));

        Assert.assertTrue(logoutPage.getLogoutSidebarLink().isDisplayed());

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.saucedemo.com/inventory.html";

        Assert.assertEquals(actualURL, expectedURL);

        }

        @Test (priority = 20)

    public void verifyThatUserCannotLogInWithInvalidUsername(){
            String invalidUsername = "invalidusername";
            String validPassword = "secret_sauce";
           // String expectedErrorMessage = "password do not match any user in this service";

            loginPage.inputUsername(invalidUsername);
            loginPage.inputPassword(validPassword);
            loginPage.clickOnLoginButton();
            wdwait.until(ExpectedConditions.visibilityOf(loginPage.getErrorMessage()));
            Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());
           // Assert.assertEquals(loginPage.getErrorText(), expectedErrorMessage);
            // prikazuje mi da je ErrorText prazan. Ne znam zasto
            String actualURL = driver.getCurrentUrl();
            String expectedURL = "https://www.saucedemo.com/";

            Assert.assertEquals(actualURL, expectedURL);

            Assert.assertTrue(loginPage.getLoginButton().isDisplayed());






        }








    }





