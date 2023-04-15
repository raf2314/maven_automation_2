package day2_02262023;

import java.util.ArrayList;

public class t3_forloop {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("india");
        countries.add("USA");
        countries.add("india");


        ArrayList <Integer> areaCode = new ArrayList<>();
        areaCode.add(777);
        areaCode.add(222);
        areaCode.add(333);
        areaCode.add(435);
        //if you are using one loop for 2 or more array list, then they all should have the same amount of count
        // if not then it needs to be in separate loop statement

        //iterate/loop through the entire list of countries using FOR-loop
        for (int i = 0; i < countries.size(); i++) {
            System.out.println("countries in " + countries.get(i) + " " + "area code is " + areaCode.get(i));
        }//end of loop


    }//end of main


}//end of class
