package org.prog.session18.HomeWork18.AlloTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.session18.HomeWork18.DB.DBTests;
import org.prog.session18.HomeWork18.DB.dto.PhonesDto;

import java.time.Duration;

public class AlloTests {

    private WebDriver driver;
    private org.prog.session18.HomeWork18.AlloTest.AlloPage alloPage;


    @Before
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        alloPage = new AlloPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I open {string}")
    public void siteOpen(String path) {
        alloPage.loadPage(path);
    }

    @Given("I search for {string}")
    public void search(String text){
        alloPage.search("iphone");
    }

    @When("I save model and prices for the first 3 phones")
    public void find () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-card']")));
        java.util.List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class, 'v-pb__cur')]//span[@class='sum']"));
        java.util.List<WebElement> articles = driver.findElements(By.xpath("//span[@class='product-sku__value']"));
        java.util.List<WebElement> titles = driver.findElements(By.xpath("//a[contains(@class, 'product-card__title')]"));
        Actions action = new Actions(driver);
        for (int i = 0; i < 3; i++) {
            String price = prices.get(i).getText();
            action.moveToElement(prices.get(i)).perform();
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='product-sku__value']")));
            String article = articles.get(i).getText();
            String title = titles.get(i).getText();
            String foolModelName = title + "(Article: " + article + ")";

            PhonesDto phone = new PhonesDto();
            phone.setModelName(foolModelName);
            phone.setPrice(price);

            DBTests.phonesList.add(phone);
            System.out.println("Saves phone " + foolModelName + " " + " with price of " + price + ".");
        }
    }
}


