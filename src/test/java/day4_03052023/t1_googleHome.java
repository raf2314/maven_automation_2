package day4_03052023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1_googleHome {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //NAVIGATE to google home page
        driver.navigate().to("https://www.google.com");

        //maximize the browser
        driver.manage().window().fullscreen();//

        //wait for 2 secs
        Thread.sleep(2000);

        //enter keyword bmw to search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");

        //click on google button .submit or .click
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //driver.close();
        //driver.quit()

        Thread.sleep(2000);


        //capture the search results using .getText()
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //System.out.println("Search results: " + result);
        //print out only the number
        String[] arrayResult = result.split(" ");
        System.out.println("Search Number: " + arrayResult[2]);


        driver.quit();
    }//end of main

}//end of class
