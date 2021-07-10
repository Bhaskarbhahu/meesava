package org.flipcart.CarLoanDept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CarLoan {
    @Test(priority = 1,groups = {"smoke"})
    public void registerInToCarLoan(){
        System.out.println("registerInToCarLoan");
    }
    @Test(priority = 2,groups = {"smoke", "Regression"})
    public void VerifycarLoanDocuments(){
        System.out.println("VerifycarLoanDocuments");

    }
    @Test(priority = 3,groups = {"Regression"})
    public void approvecarLoan(){
        System.out.println("approveCarLoan");
    }
    @Test(priority = 4,groups = {"smoke"})
    public void creditAmount(){
        System.out.println("creditAmount");

    }
    @Test
    public void openLinks(){
        System.setProperty("webdriver.chrome.driver", "F:/Automation classes/june/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.hubspot.com");

        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("total no of links are :" + links.size());

        for(int i =0; i<links.size(); i++) {

            System.out.println((links.get(i).getText()));
            System.out.println(links.get(i).getAttribute("href"));

        }
    }
}
