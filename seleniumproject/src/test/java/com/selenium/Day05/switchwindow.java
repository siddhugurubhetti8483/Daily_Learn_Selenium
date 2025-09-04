package com.selenium.Day05;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.findElement(By.id("opentab")).click();

        Thread.sleep(3000);

        String parentwindow = driver.getWindowHandle();

        Thread.sleep(3000);

        Set<String> allwindow = driver.getWindowHandles();

        Thread.sleep(5000);

        for(String onewindow:allwindow){
            driver.switchTo().window(onewindow);
        }
        driver.findElement(By.linkText("Access all our Courses")).click();

        Thread.sleep(5000);

        driver.switchTo().window(parentwindow);

        driver.findElement(By.xpath("//button[text()='Home']")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
