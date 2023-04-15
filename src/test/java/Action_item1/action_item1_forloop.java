package Action_item1;

import java.util.ArrayList;

public class action_item1_forloop {
    public static void main(String[] args) {


        ArrayList<String> country = new ArrayList<>();
        country.add("USA");
        country.add("Bangladesh");
        country.add("Dubai");
        country.add("Mexico");

        ArrayList <Integer> areaCode = new ArrayList<>();
        areaCode.add(1);
        areaCode.add(880);
        areaCode.add(971);
        areaCode.add(52);

        for (int i = 0; i <country.size(); i++){
            System.out.println("my country is " + "" + country.get(i) + " " + "and my country code is" + " " + areaCode.get(i));
        }//end of loop

    }//end of main


}// end of class
