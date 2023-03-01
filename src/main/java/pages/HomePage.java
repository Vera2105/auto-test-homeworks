package pages;


import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class HomePage extends BasePage {
    WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),\"Sign in\")]"));
    private final static String TITLE = "Home Page";


    public HomePage(WebDriver driver) {
        super(driver, TITLE);
    }

    public LoginPage goToLoginPage() {
        signInButton.click();
        printColorMessage("The Login page was opened", log, Level.INFO);
        return new LoginPage(driver);
    }
}
