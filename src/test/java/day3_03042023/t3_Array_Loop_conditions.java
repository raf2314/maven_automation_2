package day3_03042023;

import java.util.ArrayList;

public class t3_Array_Loop_conditions {

    public static void main(String[] args) {

        /*
        iterate through list of fruits using arraylist but only print when fruit is grape or apple
         */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("strawberry");
        fruits.add("grape");

        for (int i = 0; i < fruits.size(); i++) {

            /*
            if (fruits.get(i) == "apple") {
               system.out.print("fruit: apple");
             } else if(fruit.get(i) == "grape") {
               system.out.println("fruit: grape");
               }//end of conditions
             */


            if (fruits.get(i) == "apple" || fruits.get(i) == "grape") {
                System.out.println("fruits: " + fruits.get(i));

            }//end of conditions

        }//end of loop

    }//end of main

}// end of class
