package MyTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class rightclick {
    @Test
    public void rightclick() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement rc = driver.findElement(By.id("email"));

        Actions act = new Actions(driver);

        act.contextClick(rc).build().perform();

        Thread.sleep(5000);

        driver.quit();
    }
}
