package Action_item;

import Reusablepackage.ReusableMethods_Logger;
import Reusablepackage.ReuseableAnnotations;
import Reusablepackage.ReuseableMethods;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class actionItem7 extends ReuseableAnnotations {

    @Test (priority = 1)
    public void DominosOrder() throws InterruptedException {
        //navigate to dominos
    driver.navigate().to("https://www.dominos.com/");
    //click on coupon
    ReuseableMethods.clickMethodByIndex(driver,"//*[@class='css-30gb1a e1jlvhcu15']",3,"on coupons ");
    Thread.sleep(1000);
    //add coupon
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'Add Coupon')]","desired coupon");
    //enter address to see nearby coupon
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'See local coupons')]","find local coupon");
    //choose carryout
    ReuseableMethods.clickMethod(driver,"//*[@id='tab-Carryout']","choose carryout");
    //enter zipcode
    ReuseableMethods.sendKeysMethod(driver,"//*[@name='PostalCode']","14227","zipcode");
    //clcik on find a store
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'Find a Store')]","clicked on find a store");
    Thread.sleep(1000);
    //select store pickup
    ReuseableMethods.clickMethod(driver,"//*[contains(text(),'Store Pickup')]","find local store");
    //print out coupon
        String result = ReuseableMethods.captureTextMethod(driver,"//*[@id='coupon-1126__description']","Search Results");
        System.out.println("coupon for the area is" + result);
    }//end of test

    @Test (priority = 2)
    public void pizzahutDeals () throws InterruptedException {
        //navigate to dominos
        driver.navigate().to("https://www.pizzahut.com/");
        Thread.sleep(1000);
        //click on deals
        ReuseableMethods.clickMethodByIndex(driver, "//*[@title='Deals']", 0, "on coupons ");
        //click on 'get started'
        ReuseableMethods.clickMethod(driver, "//*[@data-testid='primary-cta-button-get-started']", "get started");
        //enter address to see nearby coupon
        ReuseableMethods.sendKeysMethod(driver,"//*[@id='carryout-city-state-zip']","11433","zipcode");
        //click on search
        ReuseableMethods.clickMethod(driver, "//*[@data-testid='search']", "search");
        //choose store
        ReuseableMethods.clickMethodByIndex(driver, "//*[contains(text(),'Continue')]", 0,"choose store");
        //print out coupon
        String result = ReuseableMethods.captureTextMethod(driver, "//*[contains(text(),'$6.99 NEW Pizza Hut Melts')]", "Search Results");
        System.out.println("coupon for the area is " + result);
    }//end of test

    @Test (priority = 3)
    public void amazonTV () throws InterruptedException {
        //navigate to dominos
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(1000);
        //click on search
        ReuseableMethods.sendKeysMethod(driver, "//*[@id='twotabsearchtextbox']","4k tv", "search field ");
        //click on ' continue'
        ReuseableMethods.clickMethod(driver, "//*[@id='nav-search-submit-button']", "continue");
        //Select the tv you want
        ReuseableMethods.clickMethodByIndex(driver,"//*[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']",0,"select tv");
        //add to cart
        ReuseableMethods.clickMethod(driver, "//*[@id='add-to-cart-button']", "add to cart");
        //choose protection
        ReuseableMethods.clickMethod(driver, "//*[@class='a-button a-button-base abb-intl-decline']" ,"choose protection");
        //print out subtotal
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@id='sw-subtotal']", "Search Results");
        System.out.println(result);
    }//end of test

    @Test (priority = 4)
    public void targetDeals () throws InterruptedException {
        //navigate to target
        driver.navigate().to("https://www.Target.com/");
        //click on dropdown
        ReuseableMethods.clickMethodByIndex(driver, "//*[@class='styles__DesktopLinkContainer-sc-srf2ow-4 bZbHjB']",1, "click on category");
        Thread.sleep(1000);
        //click on 'top deals'
        ReuseableMethods.clickMethodByIndex(driver, "//*[@class='styles__StyledLink-sc-vpsldm-0 styles__StyledLink-sc-lq2shy-0 lnixiM hdwbhM']",0, "top deals");
        //click on coupon
        ReuseableMethods.clickMethod(driver, "//*[@data-lnk='C_HomeDeals_TDNav']", "furniture coupons");
        //click on furniture
        ReuseableMethods.clickMethod(driver,"//*[@class='styles__MainCopyBlock-sc-1ealqwt-23 liqQJe']","furniture");
        //select the table
        ReuseableMethods.clickMethodByIndex(driver, "//*[@class='AspectRatio__AspectRatioChildren-sc-1c5hpa0-1 bcvgmy']",0, "furniture type");
        //pick the chair
        ReuseableMethods.clickMethodByIndex(driver,"//*[@class='styles__CarouselTileWrapper-sc-13ca9kt-0 jrxeRu']",0,"pick the chair");
        //print out coupon
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@class='Heading__StyledHeading-sc-1ihrzmk-0 jmSnUp h-text-bold h-margin-b-tight']", "Search Results");
        System.out.println("name for bath rub " + result);
        //print out price
        String result1 = ReuseableMethods.captureTextMethod(driver, "//*[@data-test='product-price']", "Search Results");
        System.out.println("price for bath rub " + result1);
    }//end of test

    @Test (priority = 5)
    public void nominal () throws InterruptedException {
        //navigate to dominos
        driver.navigate().to("https://nominalx.com/");
        Thread.sleep(1000);
        //search for rings
        ReuseableMethods.sendKeysMethod(driver, "//*[@id='search-focus']", "Ring", "search ring ");
        //select ring
        ReuseableMethods.clickMethodByIndex(driver, "//*[@class='ProductItem__Wrapper']", 2, "ring selection");
        //enter address to see nearby coupon
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@class='ProductMeta__PriceList Heading']", "Search Results");
        System.out.println("price for ring is " + result);
    }//end of test


    @Test (priority = 6)
    public void zara () throws InterruptedException {
        //navigate to dominos
        driver.navigate().to("https://www.zara.com/us/");
        Thread.sleep(1000);
        //search field
        ReuseableMethods.clickMethod(driver,"//*[@class='layout-header-search-link__link']","search field");
        //search for rings
        ReuseableMethods.sendKeysMethod(driver, "//*[@class='search-products-form__input-container']", "Perfume", "perfume ");
        //select ring
        ReuseableMethods.clickMethodByIndex(driver, "//*[@class='products-category-grid-media-container']", 4, "select perfume");
        //enter address to see nearby coupon
        String result = ReuseableMethods.captureTextMethod(driver, "//*[@class='product-detail-info__header-name']", "Search Results");
        System.out.println("name of perfume is " + result);

        String results1 = ReuseableMethods.captureTextMethod(driver,"//*[@class='price__amount']","price");
        System.out.println("price for perfume price is " + results1 );
    }//end of test

}//end of class
