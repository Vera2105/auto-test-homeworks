package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.IssuePage;
import pages.LoginPage;
import pages.MainPage;

public class IssuePageTest extends BaseTest{

    @Test
    public void checkInitValueOfInputSearch(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("TestForAutomation.777@gmail.com","Test@777!");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToIssuePage();
        IssuePage issuePage = new IssuePage(driver);
        String actualResult = issuePage.getValue();
        String expectedResult = "author";
        Assertions.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void checkValueOfInputSearchOnCreatedTab(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("TestForAutomation.777@gmail.com","Test@777!");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToIssuePage();
        IssuePage issuePage = new IssuePage(driver);
        issuePage.clickOnAssignedTab();
        IssuePage updatedAssigned = new IssuePage(driver);
        String expectedResult = "author";
        String actualResultFirst = updatedAssigned.getValue();
        Assertions.assertFalse(actualResultFirst.contains(expectedResult));
        updatedAssigned.clickOnCreatedTab();
        IssuePage updateCreated = new IssuePage(driver);
        String actualResultSecond = updateCreated.getValue();
        Assertions.assertTrue(actualResultSecond.contains(expectedResult));
    }

    @Test
    public void checkValueOfInputSearchOnAssignedTab(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("TestForAutomation.777@gmail.com","Test@777!");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToIssuePage();
        IssuePage issuePage = new IssuePage(driver);
        issuePage.clickOnAssignedTab();
        IssuePage updated = new IssuePage(driver);
        String actualResult = updated.getValue();
        String expectedResult = "assignee";
        Assertions.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void checkValueOfInputSearchOnMentionedTab(){
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successfulLogin("TestForAutomation.777@gmail.com","Test@777!");
        MainPage mainPage = new MainPage(driver);
        mainPage.navigateToIssuePage();
        IssuePage issuePage = new IssuePage(driver);
        issuePage.clickOnMentionedTab();
        IssuePage updated = new IssuePage(driver);
        String actualResult = updated.getValue();
        String expectedResult = "mentions";
        Assertions.assertTrue(actualResult.contains(expectedResult));
    }
}
