package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    WebDriver driver;//Browser control ke liye
    ExtentReports extent;//Extent Reports object (report setup)
    ExtentTest test;//Individual test log object (pass/fail, info store)

    @BeforeClass
    void setup(){

        //! ExtentSparkReporter → HTML report generate karne ke liye.
        //! "extentreportexample.html" → report ka file name.
        //! Spark reporter ka use → modern interactive HTML report banane ke liye.

        ExtentSparkReporter spark = new ExtentSparkReporter("extentreportexample.html");


        //! extent = new ExtentReports(); → ExtentReports object create kiya → report manager
        //! extent.attachReporter(spark); → Spark reporter attach kiya → taaki ye object HTML report file generate kar sake.

        extent = new ExtentReports();
        extent.attachReporter(spark);

        driver = new ChromeDriver();
    }

    @Test
    void test(){
        //! createTest() → ExtentReports me ek new test log create karta hai
        //! "Google opens" → test ka name
        //! "validate google page" → description

        test = extent.createTest("Google opens", "validate google page");

        driver.get("https://www.google.com/");
        test.pass("navigate to the page correctly");

        //!ExtentReports ka method → test pass log karne ke liye
        //! Console/HTML report me green status aur message show karega.
    }

    @AfterClass
    void teardown(){
        //! ExtentReports command → report file finalize karne ke liye
        //! HTML file me pass/fail logs write karta hai
        //! Agar flush nahi karenge → report empty ya incomplete aa sakta hai

        driver.close();
        extent.flush();
    }
}
