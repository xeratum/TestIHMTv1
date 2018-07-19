

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class testouvrir {





    @Test

    public void test12() throws Exception {

// set driver path

        System.setProperty("webdriver.ie.driver","C:\\Users\\JOUVEV\\Desktop\\SELENIUM\\IEDriverServer.exe");

// Initialise browser

        WebDriver driver = new InternetExplorerDriver();


// Load google.com


        driver.get("http://ndwebltcihmi/NDWebLtcIhmWeb/jsp/identification.jsp?dicid=CHENG");

        //driver.manage().timeouts().implicitlyWait(10, SECONDS);

        //JavascriptExecutor jsx = (JavascriptExecutor)driver;
        //jsx.executeScript("window.scrollBy(0,450)", "");


        // Type Name in the FirstName text box
        //driver.findElement(By.id("gsr")).click();

        //Type Identifiant unique
       // driver.findElement(By.id("EN_IDUNIQUE")).click();
       driver.findElement(By.id("EN_IDUNIQUE")).sendKeys("420");

        //Type Identifiant unique
        // Click on the Submit button
       // driver.findElement(By.id("submit")).click();



    }

}