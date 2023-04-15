package Action_item1.Action_item2;

import Reusablepackage.ReuseableAnnotations;
import Reusablepackage.ReuseableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Action_Item6 extends ReuseableAnnotations {

@Test (priority = 1)
    public void dentalCoverage () throws InterruptedException {
    //navigate to website
    driver.navigate().to("https://www.fideliscare.org");
    //
    ReuseableMethods.clickMethodByIndex(driver,"//*[@class='tool dropdown search']",0,"click searchfield");
    ReuseableMethods.sendKeysMethod(driver,"//*[@class='form-control search-input']","Dental Coverage","Input Dental Coverage");
    ReuseableMethods.clickMethod(driver,"//*[@class='input-group-btn']","Search field ");
    Thread.sleep(2000);
    String result = ReuseableMethods.captureTextMethod(driver,"//*[@class='gsc-result-info']","Capture Results");
    String[] arrayResult = result.split(" ");
    System.out.println("Search Results for Dental Coverage: " + arrayResult[1]);
    Thread.sleep(2000);
    ReuseableMethods.clickMethodByIndex(driver,"//*[@class='gs-title']",1,"First link");
}//end of test 1
@Test (dependsOnMethods = "dentalCoverage")
public void dentalApplication () throws InterruptedException {
    //swtich tabs to enter info
    ReuseableMethods.switchTab(driver,1,"switch tabs");
    //enter first name
    ReuseableMethods.sendKeysMethod(driver,"//*[@id='firstName']","John","first name");
    //enter first last name
    ReuseableMethods.sendKeysMethod(driver,"//*[@id='lastName']","Mike","lastName");
    //enter zipcode
    ReuseableMethods.sendKeysMethod(driver,"//*[@id='zipCode']","14227","Zipcode");
    Thread.sleep(2000);
    //enter country by using mouse hover
    ReuseableMethods.mouseHover(driver,"//*[@id='county']","country");
    //click New York from the selectdown
    ReuseableMethods.clickMethod(driver,"//*[text()='New York']","Search field ");
    //eneter Phone Number
    ReuseableMethods.sendKeysMethod(driver,"//*[@id='phoneNumber']","9293335544","phone number");
    //enter email
    ReuseableMethods.sendKeysMethod(driver,"//*[@id='email']","rafifahmid123@gmail.com","email");
    //click on check box
    ReuseableMethods.mouseHover(driver,"//*[@id='contactMe']","check box");
    //ReuseableMethods.clickMethod(driver,"//*[@id='contactMe']","checkbox");
    Thread.sleep(2000);
    //click on contact me button
    ReuseableMethods.clickMethodByIndex(driver,"//*[text()='Contact Me']",2,"Contact Me");


    Thread.sleep(2000);
    //Print out the "thank you" message bar
    String result = ReuseableMethods.captureTextMethod(driver,"//*[@class='alert alert-success']","Results");
    System.out.println("Result: " + result);
    driver.close();
}//end of test 2

    @Test (dependsOnMethods = {"dentalCoverage","dentalApplication"})
    public void dentalLogin () throws InterruptedException {

        //swtich tabs to enter info
        ReuseableMethods.switchTab(driver,0," default Tab");
        //click on Login
        ReuseableMethods.clickMethod(driver,"//*[@class='dropdown-toggle']","Login ");
        //clicked on Members Portal
        ReuseableMethods.clickMethod(driver,"//*[@class='link-external']","Members portal");
        //Switch to tab 2
        ReuseableMethods.switchTab(driver,1," 2");
        //capture helpful hints and print out

        Thread.sleep(2000);
        //Print out the "thank you" message
        String result = ReuseableMethods.captureTextMethod(driver,"//*[@class='tipsContentText']","Results");
        System.out.println("Result: " + result);

    }//end of test 3


}//end of class
