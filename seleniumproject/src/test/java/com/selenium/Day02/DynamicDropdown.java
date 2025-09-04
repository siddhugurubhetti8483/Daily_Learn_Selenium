package com.selenium.Day02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Selenium");

        Thread.sleep(5000);

        List <WebElement> list = driver.findElements(By.xpath("//div[@id='Alh6id']"));
        //("//ul[@role='listbox']"));

        System.out.println(list.size());
        

        for(int i=0; i<list.size(); i++){
            System.out.println(i);
            System.out.println(list.get(i).getText());
        }

        driver.quit();

    }
}
