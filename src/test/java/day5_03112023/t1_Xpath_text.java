package day5_03112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1_Xpath_text {

    public static void main(String[] args) throws InterruptedException {


        //set up your driver through web driver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        //Navigate to google home
        driver.navigate().to("https://www.google.com");

        Thread.sleep(2000);

        //click on about text link using xpath text()
        driver.findElement(By.xpath("//*[text()='About']")).click();

    }//end of main
}//end of class
