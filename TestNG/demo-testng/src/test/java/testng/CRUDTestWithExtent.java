package testng;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRUDTestWithExtent {
    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

     @BeforeClass
    void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentCRUDReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    // Helper method for screenshot
    String captureScreenshot(String name) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "./Screenshots/" + name + ".png";
        Files.createDirectories(Paths.get("./Screenshots/"));
        Files.copy(src.toPath(), Paths.get(path));
        return path;
    }

     @Test(priority = 1)
    void openHomePage() {
        test = extent.createTest("Open Home Page");
        try {
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Replace with your site
            Assert.assertEquals(driver.getTitle(), "CRUD Example");
            test.pass("Home page opened successfully");
        } catch (AssertionError e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("HomePageFail")); } catch(Exception ex){}
            test.fail("Home page title mismatch");
            Assert.fail();
        }
    }
     @Test(priority = 2)
    void createRecord() {
        test = extent.createTest("Create Record");
        try {
            driver.findElement(By.id("name")).sendKeys("Test User");
            driver.findElement(By.id("email")).sendKeys("testuser@example.com");
            driver.findElement(By.id("submit")).click();
            test.pass("Record created successfully");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("CreateFail")); } catch(Exception ex){}
            test.fail("Record creation failed");
            Assert.fail();
        }
    }

    @Test(priority = 3)
    void readRecord() {
        test = extent.createTest("Read Record");
        try {
            String name = driver.findElement(By.xpath("//td[text()='Test User']")).getText();
            Assert.assertEquals(name, "Test User");
            test.pass("Record read successfully");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("ReadFail")); } catch(Exception ex){}
            test.fail("Reading record failed");
            Assert.fail();
        }
    }

    @Test(priority = 4)
    void updateRecord() {
        test = extent.createTest("Update Record");
        try {
            driver.findElement(By.xpath("//td[text()='Test User']/following-sibling::td/button[text()='Edit']")).click();
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("Updated User");
            driver.findElement(By.id("submit")).click();
            test.pass("Record updated successfully");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("UpdateFail")); } catch(Exception ex){}
            test.fail("Updating record failed");
            Assert.fail();
        }
    }

    @Test(priority = 5)
    void deleteRecord() {
        test = extent.createTest("Delete Record");
        try {
            driver.findElement(By.xpath("//td[text()='Updated User']/following-sibling::td/button[text()='Delete']")).click();
            test.pass("Record deleted successfully");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("DeleteFail")); } catch(Exception ex){}
            test.fail("Deleting record failed");
            Assert.fail();
        }
    }

    @Test(priority = 6)
    void searchRecord() {
        test = extent.createTest("Search Record");
        try {
            driver.findElement(By.id("search")).sendKeys("Updated User");
            driver.findElement(By.id("searchBtn")).click();
            test.pass("Record search executed");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("SearchFail")); } catch(Exception ex){}
            test.fail("Searching record failed");
            Assert.fail();
        }
    }

    @Test(priority = 7)
    void validateEmptyForm() {
        test = extent.createTest("Validate Empty Form Submission");
        try {
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("submit")).click();
            test.pass("Empty form validation triggered");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("EmptyFormFail")); } catch(Exception ex){}
            test.fail("Empty form validation failed");
            Assert.fail();
        }
    }

    @Test(priority = 8)
    void navigateNextPage() {
        test = extent.createTest("Navigate Next Page");
        try {
            driver.findElement(By.id("nextPage")).click();
            test.pass("Navigated to next page");
        } catch (Exception e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("NextPageFail")); } catch(Exception ex){}
            test.fail("Navigation failed");
            Assert.fail();
        }
    }

    @Test(priority = 9)
    void checkButtonEnable() {
        test = extent.createTest("Check Button Enabled");
        try {
            Assert.assertTrue(driver.findElement(By.id("submit")).isEnabled());
            test.pass("Submit button is enabled");
        } catch (AssertionError e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("ButtonEnableFail")); } catch(Exception ex){}
            test.fail("Submit button is disabled");
            Assert.fail();
        }
    }

    @Test(priority = 10)
    void validateFooterText() {
        test = extent.createTest("Validate Footer Text");
        try {
            String footer = driver.findElement(By.id("footer")).getText();
            Assert.assertEquals(footer, "© 2025 Example Company");
            test.pass("Footer text validated");
        } catch (AssertionError e) {
            try { test.addScreenCaptureFromPath(captureScreenshot("FooterFail")); } catch(Exception ex){}
            test.fail("Footer text validation failed");
            Assert.fail();
        }
    }
     @AfterClass
    void teardown() {
        driver.quit();
        extent.flush();
    }

}
