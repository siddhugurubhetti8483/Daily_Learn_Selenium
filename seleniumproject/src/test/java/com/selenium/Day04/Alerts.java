package com.selenium.Day04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        //* Alert Popup */
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        //* JS Confirm Popup*/
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(2000);

        // driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);


        //* Prompt Popup */
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Alert print = driver.switchTo().alert();
        System.out.println("The text is :"+print.getText());

        print.accept();

        Thread.sleep(3000);

        driver.quit();
    }
}
