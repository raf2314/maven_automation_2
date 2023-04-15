package day11_04012023;

import Reusablepackage.ReuseableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class t1_TestNGs_priorities {
    WebDriver driver;

    //test is a replacement of the main method to execute your code
    @Test (priority = 1)
    public void searchKeyWord(){
        driver.navigate().to("https://www.google.com");
        ReuseableMethods.sendKeysMethod(driver,"//*[@name='q']","bmw","search field");
        ReuseableMethods.submitMethod(driver,"//*[@name='btnK']", "Google Search");
    }//end of test 1


    @Test (dependsOnMethods = "searchKeyWord")   //(priority = 2)
    public void captureSearchNumber() {
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@id='result-stats']", " Search Results ");
        String[] arrayResult = result.split(" ");
        System.out.println("search number for bmw: " + arrayResult[1]);
    }//end of test 2


    //setup driver using before suite
    @BeforeSuite
    public void setUpDriver(){
        driver= ReuseableMethods.defineChromeDriver();
    }//end of before suite

    //quit the driver
    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite




}
