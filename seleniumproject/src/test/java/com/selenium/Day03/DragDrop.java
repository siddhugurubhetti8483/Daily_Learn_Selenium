package com.selenium.Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");

        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target1 = driver.findElement(By.id("droppable"));

        WebElement target2 = driver.findElement(By.id("dropzone2"));

        // Thread.sleep(5000);

        Actions act = new Actions(driver);

        act.dragAndDrop(source, target1).build().perform();;

        Thread.sleep(2000);

        act.dragAndDrop(source, target2).build().perform();;

        Thread.sleep(2000);

        driver.quit();
    }
}
