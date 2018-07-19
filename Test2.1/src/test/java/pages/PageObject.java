package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends abs {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}