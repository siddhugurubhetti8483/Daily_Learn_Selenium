package com.selenium.Day06;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("singleFileInput")).sendKeys("D:\\Masai School\\SDET - 25-03-25\\Unit - 3\\Selenium\\ScreenShot\\TakeShot.png");

        driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();

        String statusText = driver.findElement(By.id("singleFileStatus")).getText();//"Single file selected: "+ "logo.png";

        String[] parts = statusText.split(",");

        String fileName = parts[0].replace("Single file selected:", "").trim();
        String sizeValue = parts[1].replace("Size:", "").trim();
        String typeValue = parts[2].replace("Type:", "").trim();

        Thread.sleep(5000);

        String name = "Single file selected: "+fileName+", Size: "+sizeValue+", Type: "+typeValue;

        // System.out.println(name);
        // System.out.println(driver.findElement(By.id("singleFileStatus")).getText());

        if(driver.findElement(By.id("singleFileStatus")).getText().equals(name)){
            System.out.println("File Upload Successfully");
        }else{
            System.out.println("File not upload");
        }
        Thread.sleep(4000);

        driver.quit();
    }
}
