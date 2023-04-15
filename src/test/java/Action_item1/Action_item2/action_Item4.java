package Action_item1.Action_item2;

import Reusablepackage.ReuseableMethods;
import org.openqa.selenium.WebDriver;

public class action_Item4 {

    public static void main(String[] args) throws InterruptedException {

        //calling the webdriver and chrome using reuseablemethod
        WebDriver driver = ReuseableMethods.defineChromeDriver();


        //navigate to bestbuy.com
        driver.navigate().to("https://www.bestbuy.com");

        //type on search field using sendkeys method
        ReuseableMethods.sendKeysMethod(driver,"//*[@id='gh-search-input']","iphone","search field ");

        //click on search field
        ReuseableMethods.clickMethod(driver,"//*[@class='header-search-button']","click on search");

        //sort list by best selling
        ReuseableMethods.dropDownSelectByText(driver,"//*[@id='sort-by-select']","Best-Selling", "dropdown");

        //click on the first Iphone
        Thread.sleep(2000);
        ReuseableMethods.clickMethodByIndex(driver,"//*[@class='sku-title']",0,"first Iphone");

        //scroll element to "total tech"
        ReuseableMethods.scrollingToElementofApage(driver, "//*[text()='Learn About Totaltech']", "total tech ");

        //add iphone to cart
        Thread.sleep(2000);
        ReuseableMethods.clickMethodByIndex(driver,"//*[@class='fulfillment-add-to-cart-button']",0,"add to cart");

        //capture and print price total for iphone
        Thread.sleep(3000);
        String result = ReuseableMethods.captureTextMethod(driver,"//*[@class='sub-total v-fw-medium']","Starting Price");
        System.out.println("Price Total " + result);

        //use mouse hover to continue shopping
        ReuseableMethods.mouseHover(driver,"//*[@class='c-button-link continue-shopping']", "to continue shopping");
        //click on continue shopping
        ReuseableMethods.clickMethod(driver,"//*[@class='c-button-link continue-shopping']", "continue Shopping");

        driver.quit();

    }//end of main
}//end of class
