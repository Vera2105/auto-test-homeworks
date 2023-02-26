package pages;

import helpers.Level;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


import static helpers.ColorPrinter.printColorMessage;

abstract public class BasePage {
    protected WebDriver driver;
    private String title;
    protected Logger log;


    public BasePage(WebDriver driver, String title) {
        this.driver = driver;
        this.title = title;
        this.log = LogManager.getLogger(BasePage.class);
        printColorMessage("Page object of" + title + this.getClass().getName(), this.log, Level.DEBUG);

    }

}
