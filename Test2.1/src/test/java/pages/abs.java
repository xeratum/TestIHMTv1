package pages;

import org.openqa.selenium.WebDriver;

public abstract class abs {
    protected WebDriver driver;

    protected abs(WebDriver driver)
    {
        this.driver = driver;
    }

    public abs() {

    }
}



