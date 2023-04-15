package Reusablepackage;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class ReuseableAnnotations {

    //you need to make your WebDriver driver variable static since we are calling it to our test class
    public static WebDriver driver;
    //declare the report variable here
    public ExtentReports reports;
    //delcare the logger variable here
    public ExtentTest logger;



    //set before suite annotation method
    @BeforeSuite
    public void setDriver(){
        driver = ReuseableMethods.defineChromeDriver();
        //set the path to report here
        reports = new ExtentReports("src/main/java/HTML_Report/automationReport.html",true);
    }//end of before suite

    //call before method to capture each test name dynamically
    @BeforeMethod
    public void getTestName(Method methodName){
        //set a name for the test
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterSuite
    public void quitDriver(){
        //quit the driver
        driver.quit();
        //end the logger for tests
        reports.endTest(logger);
        //write all logs back to report using flush
        reports.flush();

    }//end of after suite



}//end nof class
