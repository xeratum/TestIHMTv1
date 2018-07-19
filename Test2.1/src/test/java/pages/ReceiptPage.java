package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageObject;

public class ReceiptPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement header;

    public ReceiptPage(WebDriver driver) {
        super(driver);
    }

    public String confirmationHeader(){
        return header.getText();
    }
}