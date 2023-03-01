package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IssuePage extends BasePage{
    WebElement createdTab = driver.findElement(By.xpath("//a[text()='Created']"));
    WebElement assignedTab = driver.findElement(By.xpath("//a[text()='Assigned']"));
    WebElement mentionedTab = driver.findElement(By.xpath("//a[text()='Mentioned']"));
    WebElement inputSearch = driver.findElement(By.id("js-issues-search"));

    public final static String TITLE = "Issue Page";

    public IssuePage(WebDriver driver) {
        super(driver,TITLE);
    }

    public String getValue(){
        return inputSearch.getAttribute("value");
    }

    public IssuePage clickOnCreatedTab(){
        String url = createdTab.getAttribute("href");
        driver.get(url);
        return new IssuePage(driver);
    }

    public IssuePage clickOnAssignedTab(){
        String url = assignedTab.getAttribute("href");
        driver.get(url);
        return new IssuePage(driver);
    }

    public IssuePage clickOnMentionedTab(){
        String url = mentionedTab.getAttribute("href");
        driver.get(url);
        return new IssuePage(driver);
    }

}
