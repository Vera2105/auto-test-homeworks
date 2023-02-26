package pages;

import helpers.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helpers.ColorPrinter.printColorMessage;

public class MainPage extends BasePage{
    WebElement issueTab = driver.findElement(By.xpath("//a[@aria-label='Issues you created']"));
    public final static String TITLE = "Main Page";

    public MainPage(WebDriver driver) {
        super(driver,TITLE);
    }
    public IssuePage navigateToIssuePage(){
        issueTab.click();
        printColorMessage("The Issue page was opened", log, Level.INFO);
        return new IssuePage(driver);
    }
}
