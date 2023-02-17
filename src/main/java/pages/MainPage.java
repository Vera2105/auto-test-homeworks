package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
    WebElement issueTab = driver.findElement(By.xpath("//a[@aria-label='Issues you created']"));

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public IssuePage navigateToIssuePage(){
        issueTab.click();
        return new IssuePage(driver);
    }
}
