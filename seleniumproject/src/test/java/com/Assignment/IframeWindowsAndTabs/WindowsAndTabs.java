package com.Assignment.IframeWindowsAndTabs;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAndTabs {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement link = driver.findElement(By.linkText("Elemental Selenium"));
        link.click();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("test@example.com");

        WebElement dropdown = driver.findElement(By.name("language"));
        dropdown.sendKeys("Java");

        WebElement joinButton = driver.findElement(By.xpath("//button[contains(text(),'Join')]"));
        joinButton.click();

        Thread.sleep(2000);

        driver.switchTo().window(tabs.get(0));

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        driver.findElement(By.className("radius")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
