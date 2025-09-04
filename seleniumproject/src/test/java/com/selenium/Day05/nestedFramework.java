package com.selenium.Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFramework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://v1.training-support.net/selenium/nested-iframes");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/nested-iframe1']"));

        driver.switchTo().frame(outerframe);

        Thread.sleep(3000);

        WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));

        driver.switchTo().frame(innerframe);

        Thread.sleep(3000);

        driver.findElement(By.id("actionButton")).click();

        driver.switchTo().defaultContent();

        Thread.sleep(3000);

        // driver.findElement(By.xpath("//button[@onclick='goBack()']")).click();

        driver.switchTo().frame(outerframe);

        Thread.sleep(3000);

        WebElement innerframe2 = driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));

        driver.switchTo().frame(innerframe2);

        Thread.sleep(3000);

        driver.findElement(By.id("actionButton")).click();

        driver.switchTo().defaultContent();

        Thread.sleep(3000);


        driver.quit();

        
    }
}
