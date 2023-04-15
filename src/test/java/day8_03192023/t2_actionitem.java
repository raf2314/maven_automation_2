package day8_03192023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class t2_actionitem {

    public static void main(String[] args) throws InterruptedException {

        //set up Web driver manager
        WebDriverManager.chromedriver().setup();

        //set up chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        //options.addArguments("headless");

        //set up the driver with options
        WebDriver driver = new ChromeDriver(options);

        Thread.sleep(1500);
        //navigate to hotels.com
        driver.navigate().to("https://www.hotels.com/");

        //create ArrayList for States
        ArrayList<String> states = new ArrayList<>();
        states.add("New York");
        states.add("California");
        states.add("New Jersey");


        //ceate an arraylist for # of adults
        ArrayList<Integer> adultsCount = new ArrayList<Integer>();
        adultsCount.add(2);
        adultsCount.add(4);
        adultsCount.add(6);


        for (int i = 0; i < states.size(); i++) {

            try{
                WebElement stateSearch = driver.findElement(By.xpath("//*[@class='uitk-fake-input uitk-form-field-trigger']"));
                stateSearch.click();
                Thread.sleep(2000);
                stateSearch.clear();
                System.out.println("clicking state search succesfully");
            }catch (Exception e) {
                System.out.println("Unable to click search area " + e);
            }//end of exception for interest rate


            try{
                WebElement stateSearch = driver.findElement(By.xpath("//*[@id='destination_form_field']"));
                stateSearch.sendKeys(states.get(i));
                System.out.println("enter state search succesfully");
            }catch (Exception e) {
                System.out.println("Unable to enter search area " + e);
            }//end of exception for interest rate


            Thread.sleep(3000);

            //click on the newyork list to select
            driver.findElements(By.xpath("//*[@class='uitk-action-list-item-content']")).get(0).click();
            Thread.sleep(3000);


            //click on search
            driver.findElement(By.xpath("//*[@id='search_button']")).click();


            Thread.sleep(3000);


            //create a loop to click on different hotel lists
            ArrayList<WebElement> hotelopt = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid='open-hotel-information']")));

            //IF to find NewYork results
            if (i == 0){
                hotelopt.get(4).click();
                Thread.sleep(2000);


                String result = driver.findElements(By.xpath("//*[@class='uitk-heading uitk-heading-5']")).get(0).getText();
                System.out.println("hotel name for new NewYork:" + result);
                String result2 = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0).getText();
                System.out.println("hotel price for new NewYork:" + result2);
                Thread.sleep(5000);


                //call the window handles in array list and switch to the new tab
                ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
                //switch to the new tab by index of 1
                driver.switchTo().window(tabs.get(0));
                Thread.sleep(2000);


            } else if (i == 1){
                hotelopt.get(3).click();


                String result = driver.findElements(By.xpath("//*[@class='uitk-heading uitk-heading-5']")).get(0).getText();
                System.out.println("hotel name for california:" + result);

                String result2 = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0).getText();
                System.out.println("hotel price for california:" + result2);


                Thread.sleep(5000);
                //call the window handles in array list and switch to the new tab
                ArrayList<String>tabs=new ArrayList<>(driver.getWindowHandles());
                //switch to the new tab by index of 1
                driver.switchTo().window(tabs.get(0));



            } else if (i == 2){
                Thread.sleep(4000);
                hotelopt.get(3).click();

                String result = driver.findElements(By.xpath("//*[@class='uitk-heading uitk-heading-5']")).get(0).getText();
                System.out.println("hotel name New jersey:" + result);

                String result2 = driver.findElements(By.xpath("//*[@class='uitk-text uitk-type-600 uitk-type-bold uitk-text-emphasis-theme']")).get(0).getText();
                System.out.println("hotel price for New jersey:" + result2);


            }//end of for loop


        }//end of loop

        Thread.sleep(1000);
        //call the window handles in array list and switch to the new tab
        ArrayList<String>NewYork=new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab by index of 1
        driver.switchTo().window(NewYork.get(1));
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();

        driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).get(0).click();
        Thread.sleep(2000);
        //click on pay Now
        //driver.findElements(By.xpath("//*[@class='uitk-layout-flex uitk-layout-flex-justify-content-flex-end']")).get(0).click();

        //driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).get(0).click();
        Thread.sleep(2000);



        String result = driver.findElements(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-in fw-bold']")).get(0).getText();
        System.out.println("hotel check-in date for new york :" +" " + result);

        String result2 = driver.findElements(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-out fw-bold']")).get(0).getText();
        System.out.println("hotel check-out date for New york :" + " " + result2);

        driver.close();


        Thread.sleep(1000);
        //call the window handles in array list and switch to the new tab
        ArrayList<String>NewJersey = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab by index of 1
        driver.switchTo().window(NewJersey.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();


        driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).get(0).click();
        Thread.sleep(2000);

        //click on pay Now
        driver.findElements(By.xpath("//*[@class='uitk-layout-flex uitk-layout-flex-justify-content-flex-end']")).get(0).click();




        String result3 = driver.findElements(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-in fw-bold']")).get(0).getText();
        System.out.println("hotel check-in date for california :" +" " + result3);

        String result4 = driver.findElements(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-out fw-bold']")).get(0).getText();
        System.out.println("hotel check-out date for california :" + " " + result4);

        driver.close();

        Thread.sleep(1000);
        //call the window handles in array list and switch to the new tab
        ArrayList<String> califorina = new ArrayList<>(driver.getWindowHandles());
        //switch to the new tab by index of 1
        driver.switchTo().window(califorina.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']")).click();


        driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).get(0).click();
        Thread.sleep(2000);

        //click on pay Now
        //driver.findElements(By.xpath("//*[@class='uitk-layout-flex uitk-layout-flex-justify-content-flex-end']")).get(0).click();



        String result5 = driver.findElements(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-in fw-bold']")).get(0).getText();
        System.out.println("hotel check-in date for New Jersey :" +" " + result5);

        String result6 = driver.findElements(By.xpath("//*[@class='col-value va-t ta-r pv-tiny travel-dates-check-out fw-bold']")).get(0).getText();
        System.out.println("hotel check-out date for New Jersey :" + " " + result6);

        driver.close();


        driver.quit();



    }//end of main
}//end of class
