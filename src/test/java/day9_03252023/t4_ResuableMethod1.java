package day9_03252023;

import Reusablepackage.ReuseableMethods;
import org.openqa.selenium.WebDriver;

public class t4_ResuableMethod1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = ReuseableMethods.defineChromeDriver();


        //navigate to ups website
        driver.navigate().to("http://www.ups.com/us");


        //click on shipping
        //your explicit wait condition replaces your driver.findElement(s)
        //presenceOfAllElementsLocatedBy is same as findElements
        ReuseableMethods.clickMethod(driver,"//*[@id='mainNavDropdown1']","Shipping Link");

        //click on Schedule a Pickup
        //when you see element not interactable exception then you have to use Thread.sleep for few seconds before
        Thread.sleep(2000);
        ReuseableMethods.clickMethod(driver,"//*[text()='Schedule a Pickup']","Schedule a Pickup");


        //click on Freight
        ReuseableMethods.clickMethod(driver,"//*[text()='Freight']","Freight");
        //in case code fails due to exception of click make sure to take out click

        //using command you see the clickMethod location


        driver.quit();

    }//end of main
}//end of class
