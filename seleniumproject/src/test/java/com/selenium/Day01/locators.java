package com.selenium.Day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.manage().window().maximize();

        
        // driver.findElement(By.id("username")).sendKeys("tomsmith");
        // driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        // driver.findElement(By.className("radius")).click();

        // driver.findElement(By.linkText("Elemental Selenium")).click();


        // driver.findElement(By.partialLinkText("Element")).click();

        // driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        // driver.findElement(By.cssSelector("input[type-text]")).sendKeys("SuperSecretPassword");
        // driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword");
        // driver.findElement(By.cssSelector("button.radius")).click();

        // driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
        // driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword");
        // driver.findElement(By.xpath("//button[@type='submit']")).click();
        // //* we can use
        // //* input[@name='username' or @type='password']
        // //* input[@name='username' and @type='password']

        // Thread.sleep(5000);

         // driver.navigate().to("https://elementalselenium.com/");
        // Thread.sleep(2000);
        // driver.navigate().back();
        // Thread.sleep(2000);
        // driver.navigate().forward();
        // Thread.sleep(2000);
        // driver.navigate().refresh();


        // driver.close();
        // driver.quit();
    }
}
