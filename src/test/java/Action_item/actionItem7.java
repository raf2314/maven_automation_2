package Action_item;

import Reusablepackage.ReuseableAnnotations;
import Reusablepackage.ReuseableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class actionItem7 extends ReuseableAnnotations {

    @Test (priority = 1)
    public void DominosOrder() throws InterruptedException {
    driver.navigate().to("https://www.dominos.com/");
    ReuseableMethods.clickMethodByIndex(driver,"//*[@class='css-30gb1a e1jlvhcu15']",3,"on coupons ");
    Thread.sleep(1000);
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'Add Coupon')]","desired coupon");
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'See local coupons')]","find local coupon");
    ReuseableMethods.clickMethod(driver,"//*[@id='tab-Carryout']","find local coupon");
    ReuseableMethods.sendKeysMethod(driver,"//*[@name='PostalCode']","14227","find local coupon");
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'Find a Store')]","find local coupon");
    Thread.sleep(1000);
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'Future Carryout Order')]","find local store");
    ReuseableMethods.dropDownSelectByText(driver,"//*[@name='Future_Time']"," 12:00 pm","select pickup time");


    }


}//end of class
