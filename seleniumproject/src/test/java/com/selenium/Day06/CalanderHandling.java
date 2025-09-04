package com.selenium.Day06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderHandling {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        driver.switchTo().frame(0);

        driver.findElement(By.id("datepicker")).click();

        while (!driver.findElement(By.className("ui-datepicker-title")).getText().equals("May 2022")) {
            driver.findElement(By.className("ui-datepicker-prev")).click();
        }

        driver.findElement(By.xpath("//a[text()=10]")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}
