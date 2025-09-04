package com.selenium.Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {

    WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeClass
    void setup(){
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReportExample.html");

        extent = new ExtentReports();

        extent.attachReporter(spark);

        driver = new ChromeDriver();
    }
    @Test
    void test(){
        test = extent.createTest("Google opens", "validate google page");

        driver.get("https://www.google.com");

        test.pass("navigated to the page correctly");

    }

    @AfterClass
    void teardown(){
        driver.close();

        extent.flush();
    }


}
