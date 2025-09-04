package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTestingDemo {
    @Test
    void openFlipkart(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://x.com/");
        driver.manage().window().maximize();
        System.out.println("Title is: "+driver.getTitle());
        driver.quit();
    }

    @Test
    void openFacebook(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        System.out.println("Title is: "+driver.getTitle());
        driver.quit();
    }
}
