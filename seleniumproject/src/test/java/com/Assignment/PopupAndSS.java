package com.Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAndSS {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //! Screen Shot
        TakesScreenshot ts = (TakesScreenshot)driver;
        File TakeShot = ts.getScreenshotAs(OutputType.FILE);
        File SaveFile = new File("D:\\Masai School\\SDET - 25-03-25\\Unit - 3\\Selenium\\ScreenShot\\TakeShot.png");
        FileUtils.copyFile(TakeShot, SaveFile);


        //! Handling Popups Using Alert
        driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
        Alert alertBox = driver.switchTo().alert();
        alertBox.accept();

        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
        Alert confirmBox = driver.switchTo().alert();
        confirmBox.accept();
        // confirmBox.dismiss();


        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
        Alert promptBox = driver.switchTo().alert();
        promptBox.accept();

        Thread.sleep(5000);

        driver.quit();

    }
    
}
