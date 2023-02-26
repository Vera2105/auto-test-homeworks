package pages;

import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;


public class LoginPage extends BasePage{

    private WebElement loginField = driver.findElement(By.id("login_field"));
    private WebElement passwordField = driver.findElement(By.id("password"));
    private WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
    private WebElement logo = driver.findElement(By.className("header-logo"));
    public final static String TITLE = "Login Page";

    public WebElement getLogo() {
        return logo;
    }

    public LoginPage(WebDriver driver) {
        super(driver,TITLE);
    }
    public MainPage successfulLogin(String login, String password){
        loginField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        printColorMessage("successful authorization", log, Level.INFO);
        return new MainPage(driver);
    }
}
