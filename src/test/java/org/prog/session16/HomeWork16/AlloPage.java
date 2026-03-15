package org.prog.session16.HomeWork16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlloPage {

    private final WebDriver driver;
    private final WebDriverWait WebDriverWait;

    private final static String ALLO_URL = "https://allo.ua/";

    public AlloPage(WebDriver driver) {
        this.driver = driver;
        this.WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void loadPage(String path) {
        driver.get(ALLO_URL + path);
    }

    public void search(String text){
        WebElement searchInput = WebDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.name("search")));
        searchInput.sendKeys(text);
        searchInput.sendKeys(Keys.ENTER);
    }


}
