package com.selenium.Day02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.manage().window().maximize();
        
        WebElement Scheck = driver.findElement(By.cssSelector("input#sunday"));

        WebElement fcheck = driver.findElement(By.cssSelector("input#friday"));

        fcheck.click();


        System.out.println(Scheck.isSelected());
        
        Scheck.click();

        System.out.println(Scheck.isSelected());

        Thread.sleep(5000);

        
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        
        System.out.println(checkboxes.size());
        
        for(WebElement box : checkboxes){
            Thread.sleep(1000);
            if(!box.isSelected()){
                box.click();
            }else{
                box.click();
            }           
        }
        driver.quit();
    }
}
