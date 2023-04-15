package day7_03182023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class t1_selectstatment {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        //add maximize for windows
        // options.addArguments("start-maximized");
        //add --kiosk for mac


        //options.addArguments("--kiosk");
        //add incognito mode to option
        options.addArguments("incognito");
        //add options to run your driver on the background(headless)
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to yahoo home page
        driver.navigate().to("https://www.mortgagecalculator.org.");

        Thread.sleep(2000);


        //store the start month locator as an WebElement
        WebElement strMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //call select function to store the dropdown locator
        Select startMonthDropdown = new Select(strMonth);

        //start by visible text
        startMonthDropdown.selectByVisibleText("Apr");

    }//end of main

}//end of class
