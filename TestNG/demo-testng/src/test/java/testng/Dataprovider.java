package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
    WebDriver driver;

    @BeforeMethod
    void launchbrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    void validatelogo(){
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        System.out.println(logo);
    }

    @Test(priority = 2, dataProvider = "UserData")
    void login(String username, String password){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @AfterMethod
    void teardown(){
        driver.close();
    }

    @DataProvider(name = "UserData")
    public Object[][] loginData(){
        Object[][] data = new Object[2][2];

        data[0][0]="Admin";
        data[0][1]="admin123";
        data[1][0]="Superadmin";
        data[1][1]="admin123";

        return data;
    }

    @DataProvider(name = "loginData") 
    public Object[][] loginTestData() {
         return new Object[][] { 
            { "user1", "pass1", true }, 
            { "user2", "pass2", true }, 
            { "user3", "wrongPass", false } 
        }; 
    }

}
