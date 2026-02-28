package org.prog.session14.HomeWork14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlloTest {

    //TODO: write testng tests to go to allo.ua
//TODO: find seach input
//TODO: search for iphone 17 pro max

    private WebDriver driver;


@BeforeTest
public void setDriver (){driver = new ChromeDriver();}

@AfterTest
public void tearDown (){driver.quit();}

   @Test
    public void aloTest() throws InterruptedException {
    driver.get("https://allo.ua/");
       Thread.sleep(1000);
       WebElement element = driver.findElement(By.name("search"));
       Thread.sleep(1000);
       element.sendKeys("iphone 17 pro max");
       element.sendKeys(Keys.ENTER);
       Thread.sleep(1000);
       WebElement buy = driver.findElement(By.xpath("//button[@aria-label='Кошик']"));
       buy.click();
       Thread.sleep(1000);
      System.out.println("done!");

   }
}
