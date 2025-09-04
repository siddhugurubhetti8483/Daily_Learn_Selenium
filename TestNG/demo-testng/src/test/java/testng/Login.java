package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
    WebDriver driver;

    @BeforeMethod
    void launchbrowser() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @Test(dependsOnMethods = "launchbrowser")
    void login() throws InterruptedException{
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
        Thread.sleep(5000);
    }

    @AfterMethod
    void teardown(){
        driver.close();
    }
}
