package org.prog.session14.HomeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AloTest {

    //TODO: write testng tests to go to allo.ua
//TODO: find seach input
//TODO: search for iphone 17 pro max

    private WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void myWebTest() {
        driver.get("https://allo.ua/");
        WebElement element = driver.findElement(By.name("search"));
        element.sendKeys("Xiaomi");
        element.sendKeys(Keys.ENTER);
        System.out.println("done!");
    }
}
