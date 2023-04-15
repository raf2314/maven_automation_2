package day2_02262023;

import java.util.ArrayList;

public class t2_arraylist {

    public static void main(String[] args) {

     //create an arraylist of countries
     ArrayList <String> countries = new ArrayList<>();
     countries.add("USA");
     countries.add("india");
     countries.add("USA");
     countries.add("india");

     //get the count of the list
        System.out.println("countries list: "+ countries.size());
        System.out.println("countries are " + countries.get(0) + ", " + countries.get(1) + " ," + countries.get(2));



        //create an Integer arrayList of area code
        ArrayList <Integer> areaCode = new ArrayList<>();
        areaCode.add(777);
        areaCode.add(222);
        areaCode.add(333);
//get the count of the list
        System.out.println("Area code list: " + areaCode.size());
//Print the first and third area code
        System.out.println("Area codes are " + areaCode.get(0) + ", " + areaCode.get(2));

    }//end of main

}//end of class
