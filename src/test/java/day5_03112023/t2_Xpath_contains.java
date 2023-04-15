package day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t2_Xpath_contains {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //Navigate to yahoo home
        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(2000);

        //using xpath contains click on the mail link by ignoring the white space
        driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();


    }//end of main
}//end of class
