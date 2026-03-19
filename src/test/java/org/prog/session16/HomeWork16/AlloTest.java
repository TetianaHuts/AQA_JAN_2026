package org.prog.session16.HomeWork16;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

//TODO: Re-work you allo.ua tests to use page object

public class AlloTest {

        private WebDriver driver;
        private AlloPage AlloPage;


        @BeforeTest
        public void setDriver() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            AlloPage = new AlloPage(driver);
        }

        @AfterTest
        public void tearDown (){driver.quit();}

        @Test
        public void aloTest() throws InterruptedException {
            AlloPage.loadPage("/?srsltid=AfmBOoqQyPWz2MW4_4scuYaqhFus3liz7uppFJVo37Hx-WlnhBKklQSI");
            AlloPage.search("iphone");
            WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-card']")));
            java.util.List<WebElement> prices = driver.findElements(By.xpath("//*[@class='v-pb']"));
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

