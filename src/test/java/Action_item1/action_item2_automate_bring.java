package Action_item1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class action_item2_automate_bring {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver();

        //setup Arraylist for country
        ArrayList<String> hobby = new ArrayList<>();
        hobby.add("soccer");
        hobby.add("running");
        hobby.add("swimming");
        hobby.add("reading");

        for (int i = 0; i < hobby.size(); i++) {

            //navigate to google home page
            driver.navigate().to("https://www.bing.com");


            //put a second or 2 to pause the site
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id='sb_form_q']")).sendKeys(hobby.get(i));

            driver.findElement(By.xpath("//*[@class='search icon tooltip']")).submit();

            Thread.sleep(1000);

            ///capture the search results using .getText()
            String result = driver.findElement(By.xpath("//*[@data-bm='4']")).getText();

            String[] arrayResult = result.split(" ");
            System.out.println("For " + hobby.get(i) + " the search number is " + arrayResult[1]);


        }//end of loop

//outside of loop is where you quit/close the driver
        driver.quit();

    }//end of main
}//end if class
