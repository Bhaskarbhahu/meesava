package org.flipcart.PersonalLoanDept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class PersonalLoan {
    @Test(priority = 1)
    public void registerInToPersonalLoan() {
        System.out.println("registerInToPersonalLoan");
    }

    @Test(priority = 2)
    public void VerifyDocuments() {
        System.out.println("VerifyDocuments");
    }
    @Test(priority = 3)
    public void approveLoan() {
        System.out.println("approveLoan");
    }

    @Test(priority = 4)
    public void creditAmount() {
        System.out.println("creditAmount");

    }

   /* @Test
    public void Handling() {
        System.setProperty("webdriver.chrome.driver", "F:/Automation classes/june/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[name='sudheer']"));
        // driver.switchTo().alert().accept();
    }*/

    @Test
    public void AutoSugestionDrop() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:/Automation classes/june/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        driver.findElement(By.name("q")).sendKeys("testing");

        Thread.sleep(5000);

        List<WebElement> options = driver.findElements(By.xpath("//ul[@jsname='erkvQe']/li//div[@class='pcTkSc']"));

        System.out.println(options.size());

        for (int i = 0; i < options.size(); i++) {

            System.out.println(options.get(i).getText());

            if (options.get(i).getText().equals("testing interview questions")) {
                options.get(i).click();
                break;
            }
        }
    }

/*
    @DataProvider
    public Object[][] getLoginData() {
        Object[][] date = new Object[4][2];
        date[0][0] = "uname1";
        date[0][1] = "password1";
        date[1][0] = "uname2";
        date[1][1] = "password2";
        date[2][0] = "uname3";
        date[2][1] = "password3";
        date[3][0] = "uname4";
        date[3][1] = "password4";
        return date();
    }

        @Test(dataProvider = "getLoginData()") ;
        public void loginFacebookAccount (String uname, String password){
            System.setProperty("webdriver.chrome.driver", "F:/Automation classes/june/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.facebook.com");

            driver.manage().window().maximize();

            driver.findElement(By.name("email")).sendKeys("uname");
            driver.findElement(By.name("pass")).sendKeys("password");
            driver.close();
        }
    }*/
}