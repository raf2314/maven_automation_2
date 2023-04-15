package Action_item1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class action_item_multiple_conditions {

    public static void main(String[] args) {

        //using multiple conditional statement verify when grade is 90 < 100 A,  80 < 90 = B, 70 < 80 = C, 70 < 60 = D, <60 = F


        int grade = 83;

        if (grade >= 90 && grade <= 100) {
            System.out.println("grade is A ");

        } else if (grade >= 80 && grade < 90) {
            System.out.println("grade is B ");

        } else if (grade >= 70 && grade < 80) {
            System.out.println("grade is C");

        } else if (grade >= 60 && grade < 70) {
            System.out.println("grade is D");

        } else if (grade <60) {
            System.out.println("grade is F");
        }




        }//end of main
}//end of main
