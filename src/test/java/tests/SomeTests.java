package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.LoginPage;

public class SomeTests extends BaseTest{

    @Test
    public void checkLogoOnThe1loginPage(){
        Logger logger1 = LogManager.getLogger();
        logger1.info("checkLogoOnThe1loginPage is started ");
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        Assertions.assertTrue(loginPage.getLogo().isDisplayed());
        logger1.info("checkLogoOnThe1loginPage was passed successfully");
    }
}
