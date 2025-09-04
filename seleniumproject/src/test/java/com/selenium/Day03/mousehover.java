package com.selenium.Day03;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement mousehover = driver.findElement(By.linkText("Fashion"));
        WebElement mh = driver.findElement(By.linkText("Electronics"));

        Actions act = new Actions(driver);

        act.moveToElement(mousehover, 0, 0).build().perform();

        Thread.sleep(5000);

        act.moveToElement(mh).build().perform();

        Thread.sleep(2000);

        driver.quit();
    }
}
