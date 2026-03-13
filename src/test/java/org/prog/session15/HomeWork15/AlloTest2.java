package org.prog.session15.HomeWork15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
public class AlloTest2 {

    //TODO: load allo.ua (done)
//TODO: search for iphone (done)
//TODO: find prices for first 3 items
//TODO: assert price not null

//TODO: * - confirm goods it not null for first 3 items
//TODO: * - if doing this, use maximize (see below)



    private WebDriver driver;


    @BeforeTest
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown (){driver.quit();}

    @Test
    public void aloTest() throws InterruptedException {
        driver.get("https://allo.ua/");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement search =
                webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("search")));
        search.sendKeys("iphone 17 pro max");
        search.sendKeys(Keys.ENTER);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-card']")));
        java.util.List<WebElement> prices = driver.findElements(By.xpath("//button[contains(@class, 'cart')]"));
        java.util.List<WebElement> goods = driver.findElements(By.xpath("//span[@class='product-sku__value']"));
        Actions action = new Actions(driver);
        for (int i = 0; i<3; i++){
            String price = prices.get(i).getText();
            action.moveToElement(prices.get(i)).perform();
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='product-sku__value']")));
            String good = goods.get(i).getText();
            System.out.println("Good: " + good + " " + "Button: " + price);
        }

        System.out.println("done!");
    }
}
