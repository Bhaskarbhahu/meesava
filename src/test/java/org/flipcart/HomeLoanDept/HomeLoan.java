package org.flipcart.HomeLoanDept;

import okio.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class HomeLoan {
    @Test(priority = 1)
    public void registerInToPersonalLoan(){
        System.out.println("registerInToPersonalLoan");
    }
    @Test(priority = 2)
    public void VerifyDocuments(){
        System.out.println("VerifyDocuments");

    }
    @Test(priority = 3)
    public void approveLoan(){
        System.out.println("approveLoan");
    }
    @Test(priority = 4)
    public void creditAmount(){
        System.out.println("creditAmount");
    }
    @Parameters({"url","username","password"})
    @Test
    public void suiteLevelParamerization(String url, String username, String password){
        System.out.println("url is :" +url);
        System.out.println("username is :" +username);
        System.out.println("password is :" +password);

    }
    @Parameters({"url1","username1","password1"})
    @Test
    public void testLevelParamerization(String url, String username, String password){
        System.out.println("url is :" +url);
        System.out.println("username is :" +username);
        System.out.println("password is :" +password);

    }
   /* @Test
    public void openNewTabs() {
        System.setProperty("webdriver.chrome.driver", "F:/Automation classes/june/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hubspot.com/");

        driver.manage().window().maximize();

        WebElement bhaskarDriver = driver.findElement(By.cssSelector(".hsg-footer__nav-column.hsg-footer__nav-column-left"));
        List<WebElement> links = bhaskarDriver.findElements(By.tagName("a"));

        System.out.println("Total no of Links : " + links.size());

        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));

            String keyboardOperations = Keys.chord(Keys.CONTROL, Keys.ENTER);
            links.get(i).sendKeys(keyboardOperations);
        }
    }*/
    @Test
    public void screenshot() throws IOException {
        System.setProperty("webdriver.chrome.driver", "F:/Automation classes/june/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spicejet.com");
        driver.manage().window().maximize();

        File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destFile = new File("F:/Demo143/src/abc.png");
        FileHandler.copy(sourceFile,destFile);
    }
}
