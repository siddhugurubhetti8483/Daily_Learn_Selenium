package com.selenium.Day04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScrenShot {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File("D:\\Masai School\\SDET - 25-03-25\\Unit - 3\\Selenium\\ScreenShot\\webpagess.png");

        FileUtils.copyFile(sourcefile, targetfile);


        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File souFile = logo.getScreenshotAs(OutputType.FILE);
        File savess = new File("D:\\\\Masai School\\\\SDET - 25-03-25\\\\Unit - 3\\\\Selenium\\\\ScreenShot\\\\logo.png");
        FileUtils.copyFile(souFile, savess);

        // souFile.renameTo(savess);

        driver.quit();
    }
}
