package com.Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.redbus.com/");

        WebElement menu = driver.findElement(By.xpath("//a[text()='Help']"));

        Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
    }
}
