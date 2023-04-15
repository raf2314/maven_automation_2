package day2_02262023;

public class t1_linerarray {
    public static void main(String[] args) {
        String[] cities = new String[]{"brooklyn", "queens","Manhattan", };
         //get the count of list of cities
        System.out.println("cities count" + cities.length);
        //print out brooklyn & bronx from the list
         System.out.println("my cities are" + " " + cities[0] + ", " + cities[2]);

         int [] zipCode = new int[]{2000,23233,39993};
         //get amount of the list of zipcodes
        System.out.println("zip code count" + zipCode.length);
        System.out.println("my zipcode are " + zipCode[0] + ", " + zipCode[1]);

    }//end of main
}//end of class
