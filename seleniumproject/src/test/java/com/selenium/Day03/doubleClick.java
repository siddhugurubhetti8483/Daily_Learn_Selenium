package com.selenium.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
    public static void main(String[] args) throws InterruptedException {        
    
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        
        Thread.sleep(5000);

        WebElement db = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

        WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));

        //create action class
        Actions act = new Actions(driver);

        act.doubleClick(db).build().perform();
        Thread.sleep(5000);

        act.contextClick(rc).build().perform();

        Thread.sleep(2000);

        driver.quit();
        
    }
}
