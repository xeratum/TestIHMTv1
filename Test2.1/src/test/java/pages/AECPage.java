package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.PageObject;

public class AECPage extends PageObject {

    @FindBy(id="metier")
    private WebElement metier;

    @FindBy(name="submitButton")
    private WebElement submitButton;

    @FindBy(id="operator0")
    private WebElement operator0;

    @FindBy(name="valcrit0")
    private WebElement zipCode;


    public AECPage(WebDriver driver) {
        super(driver);
    }

    public void changerDePage(String idpage){
        Select meiSelect = new Select(this.metier);
        meiSelect.selectByValue(idpage);
    }

    public ReceiptPage submit(){
        this.submitButton.click();
        return new ReceiptPage(driver);
    }




}