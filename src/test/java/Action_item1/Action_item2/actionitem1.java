package Action_item1.Action_item2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class actionitem1 {
    public static void main(String[] args) throws InterruptedException {

        //create arraylist of zipcode
        ArrayList<String> schedule = new ArrayList<>();
        schedule.add("11433");
        schedule.add("11432");
        schedule.add("14227");

        //create the for loop
        for(int i=0; i < schedule.size(); i++) {


            //set up your driver through web driver manager
            WebDriverManager.chromedriver().setup();

            //set your chrome options arguments for your web driver
            ChromeOptions options = new ChromeOptions();
            //add maximize for windows
            // options.addArguments("start-maximized");
            //add --kiosk for mac

            //add incognito mode to option
            //options.addArguments("incognito");


            //define the chrome driver that you will use for automation test
            //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
            WebDriver driver = new ChromeDriver(options);

            //navigate to yahoo home page
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id='location-search']")).clear();

            //click on calculate
            driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys("11433");
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            driver.findElement(By.xpath("//*[@id='location-search']")).clear();

            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys("11432");
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            driver.findElement(By.xpath("//*[@id='location-search']")).clear();

            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys("14227");
            driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            driver.findElement(By.xpath("//*[@id='location-search']")).clear();



            ArrayList<WebElement> studio = new ArrayList<>(driver.findElements(By.xpath("//*[@class='workshop-distance-1w6Lb']")));
            ArrayList<WebElement> address = new ArrayList<>(driver.findElements(By.xpath("//*[@class=address-3-YC0']")));

            if (i == 0){
                System.out.println("first address" + address.get(0).getText());
                studio.get(2).click();

            }else if (i == 1){
                System.out.println("second address" + address.get(1).getText());
                studio.get(3).click();

            }else if (i == 2){
                System.out.println("third address" + address.get(2).getText());
                studio.get(0).click();
            }







        }//end of loop

        }//end of main
}//end of class
