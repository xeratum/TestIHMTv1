package tests;

        import org.junit.After;
        import org.junit.AfterClass;
        import org.junit.BeforeClass;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.ie.InternetExplorerDriver;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.remote.DesiredCapabilities;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.annotations.Test;
        import org.openqa.selenium.Point;
        import pages.AECPage;
        import pages.AECPage;
        import java.util.List;
        import java.util.Random;
        import java.util.concurrent.TimeUnit;
        import static java.util.concurrent.TimeUnit.SECONDS;
        import org.openqa.selenium.interactions.Action;
        import org.openqa.selenium.interactions.Actions;

public class FunctionalTest  {

    @Test

    public static void ouvrirbrowser() throws Exception {
        System.setProperty("webdriver.ie.driver", "C:\\Users\\JOUVEV\\Desktop\\SELENIUM\\IEDriverServer.exe");

        // Initialise browser
        //WebDriver driver = new InternetExplorerDriver();
        //driver.findElement(By.id("EN_IDUNIQUE")).click();

        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability("requireWindowFocus", true);
        WebDriver driver = new InternetExplorerDriver(capabilities);
        driver.get("http://ndwebltcihmi2/NDWebLtcIhmWeb/jsp/identification.jsp?dicid=CHENG" + "");

        // ((InternetExplorerDriver) driver).findElementByXPath("//*[@id='haut']/img[2]").click();
        // Locate element for which you wants to retrieve x y coordinates.

        WebElement Image = driver.findElement(By.xpath("//*[@id='haut']/img[2]"));

        //Used points class to get x and y coordinates of element.
        /*
        Point point = Image.getLocation();
        int xcord = point.getX();
        System.out.println("Element's Position from left side Is "+xcord +" pixels.");
        int ycord = point.getY();
        System.out.println("Element's Position from top side Is "+ycord +" pixels.");
        Actions action = new Actions(driver);

        //clicking on the logo based on x coordinate and y coordinate

        action.moveByOffset(xcord+10,ycord+10).click().build().perform();
    */
           // opening docs

            Select meiSelect = new Select(driver.findElement(By.id("metier")));
            meiSelect.selectByValue("GPS");

            driver.findElement(By.id("EN_STATUT")).sendKeys("OBS");

            driver.findElement(By.name("submitButton")).click();
            driver.findElement(By.id("contenu")).click();
            driver.findElement(By.id("contenu")).click();
            driver.findElement(By.name("coche0")).click();
            driver.findElement(By.name("coche1")).click();
            driver.findElement(By.name("coche8")).click();
           // ((InternetExplorerDriver) driver).findElementByClassName("pagine2").click();

        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(((InternetExplorerDriver) driver).findElementByClassName("pagine2"))
                .build();
           String bgColor1 = ((InternetExplorerDriver) driver).findElementByClassName("pagine2").getCssValue("Color");
           System.out.println("Before hover: " + bgColor1);
           mouseOverHome.perform();
           String bgColor2 = ((InternetExplorerDriver) driver).findElementByClassName("pagine2").getCssValue("Color");
            System.out.println("After hover: " + bgColor2);
        if(bgColor1 !=bgColor2){
            System.out.println(" le hover change la couleur ");
        }/*

            /*
            if(driver.getTitle().equals("INFORMATIONS CONFIDENTIELLES ALLIANZ")){
            System.out.println(" les docs sont bien ouvert ");
            }/*
        /*

        Select idunSelect = new Select(driver.findElement(By.id("operator0")));
        idunSelect.selectByValue(">");

        driver.findElement(By.id("  EN_IDUNIQUE")).sendKeys("420");

        driver.findElement(By.id("IN_NSINISTRE")).sendKeys("azerty123456");

        driver.findElement(By.id("IN_NVICTIME")).sendKeys("123456789");

        //cleanUp(driver);
        //submit();
        Select oSelect = new Select(driver.findElement(By.id("operator4")));
        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();

        Random rand = new Random();

        int  n = rand.nextInt(iListSize);

            // Storing the value of the option
            String sValue = oSelect.getOptions().get(n).getText();
            // Printing the stored value
            System.out.println(sValue);
            // Putting a check on each option that if any of the option is equal to 'Africa" then select it

                oSelect.selectByIndex(n);

        Select jSelect = new Select(driver.findElement(By.id("valcrit10")));
        List<WebElement> jSize = jSelect.getOptions();
        int jListSize = jSize.size();

        for(int i =0; i < jListSize ; i++){
            // Storing the value of the option
            String jValue = jSelect.getOptions().get(i).getText();
            // Printing the stored value
            System.out.println(jValue);
            // Putting a check on each option that if any of the option is equal to 'Africa" then select it

            jSelect.selectByIndex(i);

        }
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.findElement(By.name("submitButton")).click();
        //tearDown(driver);
    }

    public void cleanUp(WebDriver driver){
        driver.manage().deleteAllCookies();
    }

    public static void tearDown(WebDriver driver){
        driver.close();
    }

    */}
}