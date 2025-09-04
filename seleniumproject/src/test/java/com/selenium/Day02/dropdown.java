package com.selenium.Day02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));

        Select dro = new Select(dropdown);

        // dro.selectByContainsVisibleText("India");

        // Thread.sleep(2000);
        
        // dro.selectByIndex(4);

        // Thread.sleep(2000);

        // dro.selectByValue("canada");

        // Thread.sleep(2000);

        // dro.selectByVisibleText("China");

        List<WebElement> opt = dro.getOptions();

        System.out.println(opt.size());

        int i = 0;

        for(WebElement drop : opt){
            // System.out.println(opt.get(5));
            System.out.println(opt.get(i).getText());
            i++;
        }
        System.err.println("------");
        for(int j=0; j<opt.size(); j++){
            System.out.println(opt.get(j).getText());
        }

        driver.quit();
    }
}
