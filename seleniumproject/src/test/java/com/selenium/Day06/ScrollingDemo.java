package com.selenium.Day06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollingDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        //Scroll Operation - by pixel, by moving to end of the page, by moving to selected Webelement

        //1. Scrolling By pixel
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // js.executeScript("window.scrollBy(0,1500)", "");

        //Moving to end of the page
        // js.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        // Thread.sleep(3000);

        //Return Moving to first of the page
        // js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");

        //3. Scrolling by moving to selected webelement
        WebElement ele = driver.findElement(By.linkText("Apple MacBook Pro"));
        js.executeScript("arguments[0].scrollIntoView()", ele);

        Thread.sleep(5000);
        driver.quit();



    }
}
